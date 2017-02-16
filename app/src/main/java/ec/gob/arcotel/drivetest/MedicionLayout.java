package ec.gob.arcotel.drivetest;

import android.content.Context;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

/**
 * Created by Supertel on 18/5/15.
 */
public class MedicionLayout extends LinearLayout implements View.OnLongClickListener {

    private Medicion medicion;
    private Context ctx;

    public MedicionLayout(Context context, Medicion med) {
        super(context);
        this.medicion = med;
        this.ctx = context;
        LayoutInflater.from(context).inflate(R.layout.ui_medicion, this, true);
        setOnLongClickListener(this);
        if (medicion!=null){
            ((TextView)findViewById(R.id.nombre)).setText(medicion.getNombre());
            TextView fechaI = ((TextView) findViewById(R.id.fechaInicio));
            TextView fechaF = ((TextView) findViewById(R.id.fechaFin));
            if (medicion.getDatetimeInicio()>0) {
                fechaI.setText(medicion.getFechaInicioString());
            } else {
                fechaI.setText("Inicio: -");
            }

            if (medicion.getDatetimeFin()>0) {
                fechaF.setText(medicion.getFechaFinString());
            } else {
                fechaF.setText("Fin: -");
            }
        }
    }

    /*

    public MedicionLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public MedicionLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MedicionLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MedicionLayout(Context context) {
        super(context);
    }

    */

    public String toString(){
        if (medicion!=null){
            return medicion.getId()+"-"+medicion.getNombre();
        }
        return "";
    }

    @Override
    public int getId() {
        if (medicion!=null) {
            return medicion.getId();
        }
        return -1;
    }

    public Medicion getMedicion(){
        return this.medicion;
    }

    @Override
    public boolean onLongClick(View v) {
        ((ImageView)findViewById(R.id.btnBorrar)).setVisibility(View.VISIBLE);
        ((ImageView)findViewById(R.id.btnBorrar)).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new borrarMedicionYDatos().execute();
            }
        });
        return false;
    }

    private class borrarMedicionYDatos extends AsyncTask<Void, Void, Boolean>{

        @Override
        protected Boolean doInBackground(Void... params) {

            boolean result = false;
            try {
                DBHelper dbh = new DBHelper(ctx);
                dbh.deleteMedicionAndDatosForId(medicion.getId());
                dbh.close();
                result = true;
            } catch (Exception e){
                Log.e("BORRAR", "ERROR: "+e.getMessage());
            }
            return result;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            if (aBoolean){
                removeView();

            }
            showMessage(aBoolean?"Medición Borrada":"Medición no pudo ser borrada");


        }
    }

    private void removeView() {


        ((ViewGroup)getParent()).removeView(this);
    }

    private void showMessage(String s) {
        Toast.makeText(ctx,s,Toast.LENGTH_SHORT).show();
    }
}
