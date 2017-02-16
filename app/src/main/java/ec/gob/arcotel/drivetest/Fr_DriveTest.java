package ec.gob.arcotel.drivetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import ec.gob.arcotel.drivetest.zonas.Zonas;

/**
 * Created by Supertel on 11/5/15.
 */
public class Fr_DriveTest extends Fragment implements SeekBar.OnSeekBarChangeListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener, AdapterView.OnItemSelectedListener {

    private SeekBar intervaloBar;
    private TextView btnEmpezar;
    private TextView btnPausar;
    //private TextView btnTerminar;
    private ArrayList<Object> datos;
    private Switch btnSenal;
    private boolean currentSenal=false;
    private TextView intervaloTxt;
    private int currentMode;
    private int currentProgress;
    private boolean isPaused=false;
    private int medicionId=0;
    private Medicion medicion;
    private TextView fechaInicio;
    private TextView fechaFin;
    private Spinner zonas;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_drivetest, container, false);
        if (v!=null){
            ((RadioGroup)v.findViewById(R.id.intervalo)).setOnCheckedChangeListener(this);
            fechaInicio = (TextView)v.findViewById(R.id.fechaInicio);
            fechaFin = (TextView)v.findViewById(R.id.fechaFin);
            intervaloBar = (SeekBar)v.findViewById(R.id.intervaloBar);
            btnEmpezar = (TextView)v.findViewById(R.id.btnStart);
            btnPausar = (TextView)v.findViewById(R.id.btnPause);
            //btnTerminar = (TextView)v.findViewById(R.id.btnStop);
            btnSenal = (Switch)v.findViewById(R.id.btnSenal);
            intervaloTxt = (TextView)v.findViewById(R.id.intervaloCantidad);
            zonas = (Spinner)v.findViewById(R.id.zona);
            datos = new ArrayList<>();

            intervaloBar.setOnSeekBarChangeListener(this);
            intervaloBar.setMax(10);
            intervaloBar.setProgress(2);
            btnEmpezar.setOnClickListener(this);
            btnPausar.setOnClickListener(this);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item, Zonas.getAllZonas());
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            zonas.setAdapter(adapter);
            zonas.setOnItemSelectedListener(this);
           // btnTerminar.setOnClickListener(this);

            enableSenalButton();
            if (medicion!=null){
                ((TextView)v.findViewById(R.id.nombre)).setText(medicion.getNombre());
                fechaInicio.setText(medicion.getFechaInicioString());
                fechaFin.setText(medicion.getFechaFinString());
                if (medicion.getVersion()>0){
                    btnEmpezar.setVisibility(View.GONE);
                    btnPausar.setVisibility(View.VISIBLE);
                    btnPausar.setText("Continuar");
                    isPaused = true;
                    //btnTerminar.setVisibility(View.VISIBLE);
                }
            }
        }
        return v;
    }


    @Override
    public void onClick(View v) {
        if (v==btnEmpezar){
            empezarTest();
        } else if (v==btnPausar){
            if (isPaused)
            {
                reiniciarServicio();
                btnPausar.setText("Pausa");
                isPaused = false;
                showMessage("Continuando DriveTest");
            } else {
                pausarServicio();
                btnPausar.setText("Continuar");
                isPaused=true;
                showMessage("Pausando DriveTest");
            }
        } /*else if (v==btnTerminar){
            finalizarServicio();
            showMessage("Terminando Test");
            btnEmpezar.setVisibility(View.VISIBLE);
            btnPausar.setVisibility(View.GONE);
            btnPausar.setText("Pausa");
            isPaused=false;
            btnTerminar.setVisibility(View.GONE);
        }*/
    }

    private void enableSenalButton() {
        TelephonyManager tm = (TelephonyManager)getActivity().getSystemService(getActivity().TELEPHONY_SERVICE);
        if (tm.getPhoneType()==TelephonyManager.PHONE_TYPE_NONE
                || tm.getSimState()==TelephonyManager.SIM_STATE_ABSENT) {
            btnSenal.setVisibility(View.GONE);
            currentSenal=false;
        } else {
            btnSenal.setOnCheckedChangeListener(this);
            currentSenal=true;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        enableSenalButton();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        String out="";
        currentProgress = progress;
        if (progress==0){
            currentProgress = 1;
            seekBar.setProgress(1);
        }
        if (currentMode==Helper.MODE_DISTANCIA) {
            out=progress+" metros";
            if (progress==1){
                out=progress+" metro";
            }
            intervaloTxt.setText(out);
        } else if (currentMode==Helper.MODE_TIEMPO){
            out=progress+" segundos";
            if (progress==1){
                out=progress+" segundo";
            }
            intervaloTxt.setText(out);
        }
        actualizarServicio();
    }

    private void empezarTest() {
        TelephonyManager tm = (TelephonyManager)getActivity().getSystemService(getActivity().TELEPHONY_SERVICE);
        /*if (tm.getPhoneType()==TelephonyManager.PHONE_TYPE_NONE
                || tm.getSimState()==TelephonyManager.SIM_STATE_ABSENT) {
            showMessage("Necesita contar con un dispositivo con chip para red móvil");
        } else {*/
        if (currentProgress == 0) {
            String out = currentMode == Helper.MODE_TIEMPO ? "tiempo" : "distancia";
            showMessage("Escoja un valor de " + out + " válido");
        } else {
            showMessage("Empezando Test");
            btnEmpezar.setVisibility(View.GONE);
            btnPausar.setVisibility(View.VISIBLE);
            //btnTerminar.setVisibility(View.VISIBLE);
            crearServicio();
        }
        //}
    }

    private void crearServicio() {
        Intent i = new Intent(getActivity(), DataService.class);
        i.setAction(Helper.INTENT_ACTION_START);
        i.putExtra("mode", currentMode);
        i.putExtra("intervalo", currentProgress);
        i.putExtra("senal", currentSenal);
        //i.putExtra("medicion", medicionId);
        //Setear Fecha de Inicio
        if (medicion==null) {
            medicion = new Medicion();
        }
        medicion.setDatetimeInicio(System.currentTimeMillis());
        medicion.setVersion(1);
        i.putExtra("medicion", medicion);
        getActivity().startService(i);
        fechaInicio.setText(medicion.getFechaInicioString());
    }

    private void actualizarServicio() {
        Intent i = new Intent(getActivity(), DataService.class);
        i.setAction(Helper.INTENT_ACTION_UPDATE);
        i.putExtra("mode", currentMode);
        i.putExtra("intervalo", currentProgress);
        i.putExtra("senal", currentSenal);
        //i.putExtra("medicion", medicionId);
        //i.putExtra("medicion",medicion);
        getActivity().startService(i);
    }

    private void pausarServicio() {
        Intent i = new Intent(getActivity(), DataService.class);
        i.setAction(Helper.INTENT_ACTION_PAUSE);
        medicion.setDatetimeFin(System.currentTimeMillis());
        i.putExtra("medicion",medicion);
        getActivity().startService(i);
        fechaFin.setText(medicion.getFechaFinString());
    }

    private void reiniciarServicio() {
        Intent i = new Intent(getActivity(), DataService.class);
        i.setAction(Helper.INTENT_ACTION_RESUME);
        i.putExtra("mode", currentMode);
        i.putExtra("intervalo", currentProgress);
        i.putExtra("senal", currentSenal);
        //i.putExtra("medicion", medicionId);
        i.putExtra("medicion",medicion);
        getActivity().startService(i);
        fechaFin.setText("Fin: Midiendo...");
    }

    private void finalizarServicio() {
        Intent i = new Intent(getActivity(), DataService.class);
        i.setAction(Helper.INTENT_ACTION_STOP);
        medicion.setDatetimeFin(System.currentTimeMillis());
        i.putExtra("medicion",medicion);
        getActivity().startService(i);
        fechaFin.setText(medicion.getFechaFinString());
    }

    private void showMessage(String s) {
        Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        currentSenal = isChecked;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId==R.id.btnDistancia){
            currentMode = Helper.MODE_DISTANCIA;
            intervaloBar.setMax(20);
            intervaloBar.setProgress(5);
        } else if (checkedId==R.id.btnTiempo){
            currentMode = Helper.MODE_TIEMPO;
            intervaloBar.setMax(10);
            intervaloBar.setProgress(2);
        }
    }

    public void setMedicionId (int id){
        medicionId = id;
    }

    public void setMedicion (Medicion med){
        medicion = med;
        medicionId = med.getId();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ((MainActivity)getActivity()).loadZonaToMap(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
