package ec.gob.arcotel.drivetest;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v4.content.LocalBroadcastManager;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by Supertel on 23/4/15.
 */
public class DataService extends Service {
    private LocalBroadcastManager broadcaster;
    private TelephonyManager tm;
    private LocationManager lm;
    private int currentMode, currentIntervalo;
    private boolean currentSeñal=false;
    private String currentProvider,mcc_mnc ="0", operadora="default";
    private LocationListener locationListener;
    private MyPhoneListener phoneListener;
    private Location currentLocation;
    private int lac, cid, network_type=0, level=0;
    private boolean isReverseGeocodingActive =false;
    private Timer currentTimer;
    private boolean isServiceStarted=false;
    private Medicion medicion;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent!=null && intent.getExtras()!=null && intent.getAction()!=null){
            if (intent.getAction().equals(Helper.INTENT_ACTION_START)){
                isServiceStarted=true;
                currentMode = intent.getIntExtra("mode", -1);
                currentIntervalo = intent.getIntExtra("intervalo", 1);
                currentSeñal = intent.getBooleanExtra("senal", false);
                //medicionId = intent.getIntExtra("medicion", -1);
                medicion = intent.getParcelableExtra("medicion");
                requestTelephonyUpdates();
                requestLocationUpdates();
                isReverseGeocodingActive = intent.getBooleanExtra("reversegeocoding", false);
                if (currentMode==Helper.MODE_TIEMPO) {
                    startTimer(currentIntervalo);
                }
                try {
                    //Poner fecha de Inicio en BD
                    DBHelper dbh = new DBHelper(getBaseContext());
                    dbh.updateMedicion(medicion);
                    dbh.close();
                } catch (Exception e){
                    Log.e("BD", "Error:"+e.getMessage());
                }
                setBooleanPref("serviceStarted",true);
            } else if (intent.getAction().equals(Helper.INTENT_ACTION_PAUSE)){
                pauseService();
                isServiceStarted=false;
                medicion = intent.getParcelableExtra("medicion");
                try{
                    DBHelper dbh = new DBHelper(getBaseContext());
                    dbh.updateMedicion(medicion);
                    dbh.close();
                } catch (Exception e){
                    Log.e("BD", "Error:"+e.getMessage());
                }
                setBooleanPref("serviceStarted",false);
            } else if (intent.getAction().equals(Helper.INTENT_ACTION_RESUME)){
                isServiceStarted=true;
                currentMode = intent.getIntExtra("mode", -1);
                currentIntervalo = intent.getIntExtra("intervalo", 1);
                currentSeñal = intent.getBooleanExtra("senal", false);
                //medicionId = intent.getIntExtra("medicion", -1);
                medicion = intent.getParcelableExtra("medicion");
                isReverseGeocodingActive = intent.getBooleanExtra("reversegeocoding", false);
                restartService();
                if (currentMode==Helper.MODE_TIEMPO) {
                    startTimer(currentIntervalo);
                } else if (currentMode==Helper.MODE_DISTANCIA && currentTimer!=null){
                    stopTimer();
                    requestLocationUpdates();
                }
                setBooleanPref("serviceStarted",true);
            } else if (intent.getAction().equals(Helper.INTENT_ACTION_UPDATE)){
                currentMode = intent.getIntExtra("mode", -1);
                currentIntervalo = intent.getIntExtra("intervalo", 1);
                currentSeñal = intent.getBooleanExtra("senal", false);
                //medicionId = intent.getIntExtra("medicion", -1);
                //medicion = intent.getParcelableExtra("medicion");
                isReverseGeocodingActive = intent.getBooleanExtra("reversegeocoding", false);
                updateService();
                if (currentMode==Helper.MODE_TIEMPO) {
                    startTimer(currentIntervalo);
                } else if (currentMode==Helper.MODE_DISTANCIA && currentTimer!=null){
                    stopTimer();
                    //configurar nuevo modo de adquisicion de datos
                    requestLocationUpdates();
                }
            } else if (intent.getAction().equals(Helper.INTENT_ACTION_STOP)){
                terminateService();
                isServiceStarted=false;
                medicion = intent.getParcelableExtra("medicion");
                try {
                    DBHelper dbh = new DBHelper(getBaseContext());
                    dbh.updateMedicion(medicion);
                    dbh.close();
                } catch (Exception e){
                    Log.e("BD", "Error:"+e.getMessage());
                }
                setBooleanPref("serviceStarted",false);
            }

        }
        return super.onStartCommand(intent, flags, startId);
    }


    private void startTimer(int currentIntervalo) {
        if (isServiceStarted) {
            currentTimer = new Timer();
            currentTimer.schedule(new MyTimerTask(), 0, currentIntervalo*1000);
        }
    }

    private void stopTimer() {
        if (currentTimer!=null){
            currentTimer.cancel();
        }

    }

    private void restartService() {
        requestTelephonyUpdates();
        requestLocationUpdates();
    }

    private void pauseService() {
        if (lm!=null) {
            lm.removeUpdates(locationListener);
        }
        if (tm!=null){
            tm.listen(null,0);
        }
        this.stopSelf();
    }

    private void updateService(){
        requestTelephonyUpdates();
        requestLocationUpdates();
    }

    private void terminateService() {
        //Guardar el ultimo dato
        //Guardar fecha fin
        lm.removeUpdates(locationListener);
        tm.listen(null, 0);
        this.stopSelf();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        broadcaster = LocalBroadcastManager.getInstance(this);
        //requestTelephonyUpdates();
        //requestLocationUpdates();
    }

    private String getBestLocationProvider(LocationManager lm) {
        if (lm.isProviderEnabled(LocationManager.GPS_PROVIDER)){
            return LocationManager.GPS_PROVIDER;
        } else if (lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            return  LocationManager.NETWORK_PROVIDER;
        } else if (lm.isProviderEnabled(LocationManager.PASSIVE_PROVIDER)){
            return LocationManager.PASSIVE_PROVIDER;
        }
        return null;
    }

    private void requestLocationUpdates() {
        if (lm!=null){
            lm.removeUpdates(locationListener);
        }
        lm = (LocationManager)getSystemService(LOCATION_SERVICE);
        currentProvider = getBestLocationProvider(lm);
        locationListener = new MyLocationListener();
        long minTime = currentIntervalo*1000;
        float minDistance = currentIntervalo;
        if (currentMode==Helper.MODE_DISTANCIA){
            minTime = 1000;
        }
        if (currentProvider!=null) {
            lm.requestLocationUpdates(currentProvider, minTime, minDistance, locationListener);
        }
        currentLocation = lm.getLastKnownLocation("gps");
    }

    private void requestTelephonyUpdates() {
        if (currentSeñal && tm==null) {
            tm = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
            phoneListener = new MyPhoneListener();
            tm.listen(phoneListener,
                    PhoneStateListener.LISTEN_SIGNAL_STRENGTHS
                            | PhoneStateListener.LISTEN_CELL_LOCATION
                            | PhoneStateListener.LISTEN_SERVICE_STATE
                            | PhoneStateListener.LISTEN_DATA_CONNECTION_STATE);
            network_type = tm.getNetworkType();
            mcc_mnc = tm.getNetworkOperator();
            operadora = tm.getNetworkOperatorName();
        }

    }

    private class MyLocationListener implements LocationListener {

        @Override
        public void onLocationChanged(Location location) {
            if (currentLocation==null || currentMode==Helper.MODE_TIEMPO){
                currentLocation = location;
            }
            if (currentMode==Helper.MODE_DISTANCIA){
                if (location.distanceTo(currentLocation)>=currentIntervalo){
                    //Guardar Dato
                    (new doReverseGeolocationAndSave(getBaseContext(),location, getCurrentDato())).execute();
                    sendDataBroadcast();
                }
            }

        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            if (provider.equals(LocationManager.GPS_PROVIDER) && (status== LocationProvider.OUT_OF_SERVICE || status==LocationProvider.TEMPORARILY_UNAVAILABLE)){
                stopTimer();
             } else if (provider.equals(LocationManager.GPS_PROVIDER) && status== LocationProvider.AVAILABLE) {
                if (currentMode == Helper.MODE_TIEMPO && currentTimer == null) {
                    startTimer(currentIntervalo);
                } else if (currentMode == Helper.MODE_DISTANCIA && currentTimer != null) {
                    stopTimer();
                }
            }
        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {
            if (provider.equals(LocationManager.GPS_PROVIDER)){
                //El usuario ha deshabilitado las actualizaciones de GPS
                //Se informa al usuario y se detienen las actualizaciones
                //Se debe cambiar el estado de los botones y poner fecha de fin a la medicion
                isServiceStarted = false;
                pauseService();
                showMessage("El GPS se ha deshabilitado. El DriveTest se ha detenido.");
            }
        }
    }

    private void showMessage(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    private Dato getCurrentDato() {
        //MEDICION_ID, NETWORK_TYPE, DATE_TIME, LEVEL, MCCMNC, OPERADORA, CELL_ID," +
        //"LAC, LATITUDE, LONGITUDE, PROVINCIA, CIUDAD, DIRECCION, STATUS
        Dato d = null;
        if (currentLocation!=null) {
            d = new Dato();
            d.setMedicionId(medicion.getId());
            d.setNetworkType(network_type);
            d.setDateTime(System.currentTimeMillis());
            d.setLevel(level);
            d.setMccMnc(Integer.valueOf(mcc_mnc));
            d.setOperadora(operadora);
            d.setCellId(cid);
            d.setLac(lac);
            d.setLatitude(currentLocation.getLatitude());
            d.setLongitude(currentLocation.getLongitude());
        }
        return d;
    }

    private void sendDataBroadcast() {
        if (isActivityActive()) {
            Intent intent = new Intent();
            intent.setAction(Helper.INTENT_ACTION_SEND);
            intent.putExtra(Helper.INTENT_PARAM_DATOS, getCurrentDato());
            broadcaster.sendBroadcast(intent);
        }
    }

    private boolean isActivityActive()
    {
        android.content.SharedPreferences settings = getSharedPreferences("SETTINGS", 0);
        return settings.getBoolean(Helper.IS_ACTIVITY_ACTIVE, false);
    }

    class doReverseGeolocationAndSave extends AsyncTask<Void,Void,Void>{

        private Context context;
        private Dato dato;
        private Location location;

        public doReverseGeolocationAndSave(Context context, Location location, Dato currentDato){
            this.location = location;
            this.dato = currentDato;
            this.context = context;
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                if (dato!=null){
                    if (isReverseGeocodingActive && location!=null) {
                        Geocoder geocoder = new Geocoder(context);
                        List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (addresses != null && addresses.size() > 0) {
                            Address result = addresses.get(0);
                            try {
                                String admin = result.getAdminArea();
                                String locality = result.getLocality();
                                String feature = result.getFeatureName();
                                String thor = result.getThoroughfare();
                                if (thor != null) {
                                    //CALLE
                                    dato.setDireccion(thor.toUpperCase());
                                }
                                if (feature != null) {
                                    //ZONA O DIRECCION
                                    dato.setDireccion(feature.toUpperCase());
                                }
                                if (locality != null) {
                                    //CIUDAD
                                    dato.setCiudad(locality.toUpperCase());
                                }
                                if (admin != null) {
                                    dato.setProvincia(admin.toUpperCase());
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    DBHelper dbHelper = new DBHelper(context);
                    dbHelper.insertDato(dato);
                    dbHelper.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLiteException e){
                e.printStackTrace();
            } catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }


    }

    private class MyPhoneListener extends PhoneStateListener{

        @Override
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (tm.getPhoneType()==TelephonyManager.PHONE_TYPE_GSM){
                level = signalStrength.getGsmSignalStrength()*2-113;
            } else if (tm.getPhoneType()==TelephonyManager.PHONE_TYPE_CDMA){
                level = signalStrength.getCdmaDbm();
            }
            sendDataBroadcast();
            super.onSignalStrengthsChanged(signalStrength);
        }

        @Override
        public void onServiceStateChanged(ServiceState serviceState) {
            switch (serviceState.getState()){
                case ServiceState.STATE_IN_SERVICE:{

                    break;
                }
                case ServiceState.STATE_EMERGENCY_ONLY:{

                    break;
                }
                case ServiceState.STATE_OUT_OF_SERVICE:{

                    break;
                }
                case ServiceState.STATE_POWER_OFF:{

                    break;
                }
            }
            sendDataBroadcast();
            super.onServiceStateChanged(serviceState);
        }

        @Override
        public void onCellLocationChanged(CellLocation location) {
            if (tm.getPhoneType()==TelephonyManager.PHONE_TYPE_GSM){
                lac = ((GsmCellLocation)location).getLac();
                cid = ((GsmCellLocation)location).getCid();
            } else if (tm.getPhoneType()==TelephonyManager.PHONE_TYPE_CDMA){
                lac = ((CdmaCellLocation)location).getSystemId();
                cid = ((CdmaCellLocation)location).getBaseStationId();
            }
            sendDataBroadcast();

            super.onCellLocationChanged(location);
        }

        @Override
        public void onDataConnectionStateChanged(int state, int networkType) {
            network_type = networkType;
            sendDataBroadcast();
            super.onDataConnectionStateChanged(state, networkType);
        }
    }

    private class MyTimerTask extends TimerTask{

        @Override
        public void run() {
            (new doReverseGeolocationAndSave(getBaseContext(),currentLocation, getCurrentDato())).execute();
            sendDataBroadcast();
        }
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        setBooleanPref("serviceStarted",false);
    }

    protected void setBooleanPref(String name, boolean value)
    {
        android.content.SharedPreferences settings = getSharedPreferences("SETTINGS",0);
        android.content.SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(name, value);
        editor.commit();
    }

    protected boolean getBooleanPref(String name)
    {
        android.content.SharedPreferences settings = getSharedPreferences("SETTINGS", 0);
        return settings.getBoolean(name, false);
    }

}
