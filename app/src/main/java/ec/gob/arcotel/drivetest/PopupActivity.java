package ec.gob.arcotel.drivetest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Supertel on 11/5/15.
 */
public class PopupActivity extends Activity {

    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.ctx = this;
        setContentView(R.layout.activity_popup);
        ((TextView)findViewById(R.id.btnCrear)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbh = new DBHelper(ctx);
                String name = ((EditText)findViewById(R.id.drivetestName)).getText().toString();
                Medicion m = new Medicion(name);
                long id = dbh.insertMedicion(m);
                dbh.close();
                m.setId((int)id);
                Intent i = new Intent();
                i.putExtra(Helper.INTENT_EXTRA_MEDICION, m);
                setResult(id>0?RESULT_OK:RESULT_CANCELED, i);
                finish();
            }
        });

        ((TextView)findViewById(R.id.btnCancelar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });


    }
}
