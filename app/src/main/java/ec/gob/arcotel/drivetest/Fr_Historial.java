package ec.gob.arcotel.drivetest;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Supertel on 11/5/15.
 */
public class Fr_Historial extends Fragment implements View.OnClickListener {

    private TextView btnNuevo;
    private ArrayList<Medicion> mediciones;
    private LinearLayout list;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_historial, container, false);
        if (v!=null){
            list = (LinearLayout)v.findViewById(R.id.list);
            list.setOnClickListener(this);
            btnNuevo = (TextView)v.findViewById(R.id.btnNew);
            btnNuevo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivityForResult(new Intent(getActivity(), PopupActivity.class), Helper.INTENT_REQUEST_MEDICION_NUEVA);
                }
            });
        }
        return v;
    }


    @Override
    public void onResume() {
        super.onResume();
        //Cargar Historial
        list.removeAllViews();
        new loadMedicionesFromDB(getActivity()).execute();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==Helper.INTENT_REQUEST_MEDICION_NUEVA && resultCode==getActivity().RESULT_OK && data.getExtras()!=null){
            //Se creo un nuevo drivetest, se cierra este fragment y se carga el fragment de configuracion de DriveTest

        }
    }

    @Override
    public void onClick(View v) {
        //Si una medicion tiene datos, entonces se deben cargar los datos en el mapa (Siempre y cuando no hayan mediciones en curso)
        //y se debe abrir la ventana de drive test (?)

        if (v.getClass()==MedicionLayout.class){
            MedicionLayout layout = (MedicionLayout)v;
            ((MainActivity)getActivity()).openDriveTestForMedicion(layout.getMedicion());
        }
    }

    private void showMessage(String s) {
        Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
    }

    class loadMedicionesFromDB extends AsyncTask<Void,Void,Void> {

        private Context ctx;

        public loadMedicionesFromDB(Context context){
            this.ctx = context;
        }

        @Override
        protected Void doInBackground(Void... params) {

            DBHelper dbh = new DBHelper(ctx);
            mediciones = dbh.getAllMediciones();
            dbh.close();
            for (final Medicion m : mediciones) {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        addMedicionToList(ctx, m);

                    }
                });
            }
            return null;
        }
    }

    private void addMedicionToList(Context ctx, Medicion med_){
        MedicionLayout med = new MedicionLayout(ctx,med_);
        med.setOnClickListener(this);
        list.addView(med);
    }

}
