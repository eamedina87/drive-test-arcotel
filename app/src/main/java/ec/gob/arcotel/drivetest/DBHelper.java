package ec.gob.arcotel.drivetest;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Supertel on 23/4/15.
 */
public class DBHelper extends SQLiteOpenHelper {
    private final static String dbname = "drivetest.db";
    private final static int dbversion = 1;
    private static final String DATOS_FIELDS = "MEDICION_ID, NETWORK_TYPE, DATE_TIME, LEVEL, MCCMNC, OPERADORA, CELL_ID," +
            "LAC, LATITUDE, LONGITUDE, PROVINCIA, CIUDAD, DIRECCION, STATUS";
    private static final String MEDICIONES_FIELDS = "NOMBRE, DATETIME_INICIO, DATETIME_FIN, ZONA, VERSION";
    private SQLiteDatabase db;
    private Context context;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context = context;
    }

    public DBHelper (Context context){
        super(context, dbname, null, dbversion);
        this.context = context;
        db=getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL("CREATE TABLE DATOS("
                    + "DATOS_ID 		INTEGER PRIMARY KEY,"
                    + "MEDICION_ID INT,"
                    + "NETWORK_TYPE 	INT,"
                    + "DATE_TIME 	LONG,"
                    + "LEVEL			INT,"
                    + "MCCMNC			INT,"
                    + "OPERADORA		VARCHAR2,"
                    + "CELL_ID		LONG,"
                    + "LAC			LONG,"
                    + "LATITUDE		DOUBLE,"
                    + "LONGITUDE		DOUBLE,"
                    + "PROVINCIA     VARCHAR2,"
                    + "CIUDAD     	VARCHAR2,"
                    + "DIRECCION     VARCHAR2,"
                    + "STATUS		INT)");
            db.execSQL("CREATE TABLE MEDICIONES("
                    + "MEDICION_ID 		INTEGER PRIMARY KEY,"
                    + "NOMBRE		VARCHAR2,"
                    + "DATETIME_INICIO		LONG,"
                    + "DATETIME_FIN			LONG,"
                    + "ZONA     VARCHAR2,"
                    + "VERSION		INT, UNIQUE(NOMBRE))");
        } catch (Exception e){
            Log.e("DB","Error:"+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertDato(Dato dato) throws SQLiteException{
        db = getWritableDatabase();
        db.execSQL("INSERT INTO DATOS ("+DATOS_FIELDS+") VALUES ("+dato.getStringForDB()+")");
    }

    public ArrayList<Dato> getAllDatosForMedicionId(int id) throws SQLiteException{
        ArrayList<Dato> datos = new ArrayList<>();
        db = getReadableDatabase();
        long twenty4 = System.currentTimeMillis()- (12*60*60*1000);
        Cursor c = db.rawQuery("SELECT * FROM DATOS WHERE MEDICION_ID="+id+" AND DATE_TIME>"+twenty4+" ORDER BY DATE_TIME DESC", null);
        if (c!=null && c.getCount()>0)
        {
            c.moveToFirst();
            while (!c.isAfterLast()){
                try {
                    datos.add(new Dato(c));
                } catch (Exception e){}
                c.moveToNext();
            }
        }
        c.close();
        return  datos;
    }

    public Cursor getAllDatosCursorForMedicionId(int id) throws SQLiteException{
        ArrayList<Dato> datos = new ArrayList<>();
        db = getReadableDatabase();
        long twenty4 = System.currentTimeMillis()- (12*60*60*1000);
        Cursor c = db.rawQuery("SELECT * FROM DATOS WHERE MEDICION_ID="+id+" AND DATE_TIME>1473984000 ORDER BY DATE_TIME DESC", null);
        /*if (c!=null && c.getCount()>0)
        {
            c.moveToFirst();
            while (!c.isAfterLast()){
                try {
                    datos.add(new Dato(c));
                } catch (Exception e){}
                c.moveToNext();
            }
        }*/
        return  c;
    }

    public long insertMedicion(Medicion med) throws SQLiteException{
        db = getWritableDatabase();
        //db.execSQL("INSERT INTO MEDICIONES ("+MEDICIONES_FIELDS+") VALUES ("+med.getStringForDB()+")");
        return db.insert("MEDICIONES", null, med.getContenValues());
    }

    public void updateMedicion(Medicion med) throws SQLiteException{
        db = getWritableDatabase();
        db.execSQL("UPDATE MEDICIONES SET DATETIME_INICIO="+med.getDatetimeInicio()+", DATETIME_FIN="+med.getDatetimeFin()+", VERSION="+med.getVersion()+" WHERE MEDICION_ID="+med.getId());
    }

    public ArrayList<Medicion> getAllMediciones() throws SQLiteException{
        ArrayList<Medicion> mediciones = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM MEDICIONES ORDER BY DATETIME_FIN DESC", null);
        if (c!=null && c.getCount()>0)
        {
            c.moveToFirst();
            while (!c.isAfterLast()){
                try {
                    mediciones.add(new Medicion(c));
                } catch (Exception e){}
                c.moveToNext();
            }
        }
        c.close();
        return  mediciones;
    }

    @Override
    public synchronized void close() {
        super.close();
        db.close();
    }

    public void deleteMedicionAndDatosForId(int id) throws SQLiteException{
        db = getWritableDatabase();
        db.execSQL("DELETE FROM MEDICIONES WHERE MEDICION_ID="+id);
        db.execSQL("DELETE FROM DATOS WHERE MEDICION_ID="+id);
    }
}
