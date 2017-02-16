package ec.gob.arcotel.drivetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.location.Location;
import android.os.AsyncTask;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

import java.util.ArrayList;

import ec.gob.arcotel.drivetest.zonas.Zonas;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMyLocationChangeListener, GoogleMap.OnCameraChangeListener, View.OnClickListener{


    private SupportMapFragment mMapFragment; // Might be null if Google Play services APK is not available.
    private GoogleMap map;
    private float currentZoom=15;
    private boolean locationObtained=false;
    private int currentMode;
    private SeekBar intervaloBar;
    private TextView btnEmpezar, btnPausar, btnTerminar;
    private boolean isPaused=false;
    private int currentProgress;
    private boolean currentSenal=false;

    private BroadcastReceiver receiver;
    private ArrayList<Dato> datos;
    private MapView mapView;
    private IMapController mapController;
    private TextView btnDrive, btnHistory;
    private boolean isHistoryFragmentActive;
    private Context ctx;
    private TextView mapTitle;
    private Polygon polygon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.ctx = this;
        btnDrive = (TextView)findViewById(R.id.btnDrive);
        btnHistory = (TextView)findViewById(R.id.btnHistory);
        mapTitle = (TextView)findViewById(R.id.mapTitle);

        btnDrive.setOnClickListener(this);
        btnHistory.setOnClickListener(this);
        btnHistory.setSelected(true);

        if (findViewById(R.id.menu) != null) {

            if (savedInstanceState != null) {
                return;
            }

            //Fr_DriveTest fragment = new Fr_DriveTest();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.menu, new Fr_Historial()).commit();
            isHistoryFragmentActive = true;
            setSelectedButton(btnHistory);
        }


/*
  */      setUpMapIfNeeded();
        createReceiver();
        if (savedInstanceState!=null){
            currentZoom = savedInstanceState.getInt("zoom");
            currentMode = savedInstanceState.getInt("mode");
            currentProgress = savedInstanceState.getInt("intervalo");
            currentSenal = savedInstanceState.getBoolean("senal");
            isPaused = savedInstanceState.getBoolean("isPaused");
            datos = savedInstanceState.getParcelableArrayList("datos");
            (new loadDatosToMap(datos)).execute();
        }

        /*mapView = (MapView) this.findViewById(R.id.openmap);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapController = this.mapView.getController();
        mapController.setZoom(2);*/
    }

    private void setSelectedButton(View btn) {
        if (btn==btnDrive){
            btnDrive.setSelected(true);
            btnHistory.setSelected(false);
        } else if (btn==btnHistory){
            btnHistory.setSelected(true);
            btnDrive.setSelected(false);
        }
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        LocalBroadcastManager.getInstance(this).registerReceiver((receiver),
                new IntentFilter(Helper.INTENT_ACTION_SEND));
    }


    @Override
    protected void onStop()
    {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(receiver);
        super.onStop();
    }

    @Override
    public void onClick(View v) {
        setSelectedButton(v);
    }

    private void createReceiver()
    {
        receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent)
            {
                if (intent.getAction().equals(Helper.INTENT_ACTION_SEND))
                {
                    if (intent.hasExtra(Helper.INTENT_PARAM_DATOS))
                    {
                        Dato d =(Dato) intent.getParcelableExtra(Helper.INTENT_PARAM_DATOS);
                        addDatoToMap(d);
//                        datos.add(d);
                    }
                }
            }
        };
    }

    private void addDatoToMap(Dato d) {
        if (map!=null && d!=null) {
            map.addMarker(new MarkerOptions().
                    position(d.getLatLng()).
                    title(d.toString()).
                    icon(BitmapDescriptorFactory.fromResource(d.getImageResourceId())));
            locationObtained=true;

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
        setBooleanPref(Helper.IS_ACTIVITY_ACTIVE, true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        setBooleanPref(Helper.IS_ACTIVITY_ACTIVE, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        outState.putParcelableArrayList("datos", datos);
        outState.putFloat("zoom", currentZoom);
        outState.putInt("mode",currentMode);
        outState.putInt("intervalo", currentProgress);
        outState.putBoolean("senal",currentSenal);
        outState.putBoolean("isPaused",isPaused);
        super.onSaveInstanceState(outState, outPersistentState);

    }


    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMapFragment == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMapFragment = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map));
            mMapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.setMyLocationEnabled(true);
        map.setOnMyLocationChangeListener(this);
        map.setOnCameraChangeListener(this);
        map.getUiSettings().setZoomControlsEnabled(true);
        map.getUiSettings().setMapToolbarEnabled(true);
        map.getUiSettings().setRotateGesturesEnabled(false);
        //loadDatosForMedicionId(0);

    }

    @Override
    public void onMyLocationChange(Location location) {
        if (!locationObtained) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), currentZoom), 1500, null);
            locationObtained = true;

        }
    }

    @Override
    public void onCameraChange(CameraPosition cameraPosition) {
        if (locationObtained) {
            currentZoom = cameraPosition.zoom;
        }
    }



    public void loadDatosForMedicionId(int id) {
        (new loadDatosFromDB(id)).execute();
    }

    public void openDriveTestForMedicion(Medicion medicion) {
        map.clear();
        if (datos!=null) {
            datos.clear();
        }
        mapTitle.setVisibility(View.VISIBLE);
        mapTitle.setText(medicion.getNombre());
        loadDatosForMedicionId(medicion.getId());
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        Fr_DriveTest fr = new Fr_DriveTest();
        fr.setMedicion(medicion);
        tr.replace(R.id.menu, fr);
        tr.addToBackStack(null);
        tr.commit();
        isHistoryFragmentActive = false;
    }

    public void loadZonaToMap(int position) {
        PolygonOptions opt = Zonas.getZonaForPosition(position);
        if (polygon!=null){
            polygon.remove();
        }
        if (opt!=null) {
            polygon = map.addPolygon(opt);
        }
    }


    class loadDatosFromDB extends AsyncTask<Void,Void,Void>{

        private int id;

        public loadDatosFromDB(int id){

            this.id = id;
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                DBHelper dbh = new DBHelper(ctx);
                //datos = dbh.getAllDatosForMedicionId(id);
                final Cursor c = dbh.getAllDatosCursorForMedicionId(id);
                if (c!=null && c.getCount()>0) {
                    c.moveToFirst();
                    while (!c.isAfterLast()) {

                        final Dato d = new Dato(c);
                        /*if (datos==null){
                            datos = new ArrayList<>();
                        }
                        datos.add(d);
*/
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                addDatoToMap(d);
                            /*    try {
                                    addDatoToMap(new Dato(c));
                                } catch (Exception e)
                                {
                                    Log.i("Mapa","DatoToMap:"+e.getMessage());
                                }
                                */
                            }
                        });
                        c.moveToNext();
                    }
                }
                c.close();
                dbh.close();
            } catch (Exception e) {
                Log.e("Cursor","Error:"+e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (datos!=null) {
                if (datos.size()<=0){
                    showMessage("La medición no tiene datos");
                } else {
                    (new loadDatosToMap(datos)).execute();
                }
            }
        }
    }

    private void showMessage(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    class loadDatosToMap extends AsyncTask<Void,Void,Void>{

        private ArrayList<Dato> data;

        public loadDatosToMap(ArrayList<Dato> datosList){
            this.data = datosList;
        }

        @Override
        protected Void doInBackground(Void... params) {

            if (datos!=null) {
                for (final Dato d : datos) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            addDatoToMap(d);
                        }
                    });
                }
            }
            return null;
        }
    }

    @Override
    public void onBackPressed() {
        if (!isHistoryFragmentActive && getBooleanPref("serviceStarted")){
            showMessage("Drive Test en curso. Pausar para regresar al historial.");
        } else {
            super.onBackPressed();
        }
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
