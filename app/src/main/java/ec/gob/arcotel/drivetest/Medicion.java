package ec.gob.arcotel.drivetest;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Supertel on 11/5/15.
 */
public class Medicion implements Parcelable {

    private int id;
    private String nombre;
    private long datetimeInicio;
    private long datetimeFin;
    private String zona;
    private int version;

    public  Medicion (Cursor c) throws Exception{
        this.id = c.getInt(0);
        this.nombre = c.getString(1);
        this.datetimeInicio = c.getLong(2);
        this.datetimeFin = c.getLong(3);
        this.zona = c.getString(4);
        this.version = c.getInt(5);
    }

    public Medicion (){
        this.id = -1;
        this.nombre = "default";
        this.datetimeInicio = 0;
        this.datetimeFin = 0;
        this.zona = "default";
        this.version = 0;
    }

    public Medicion (String nombre){
        this.id = -1;
        this.nombre = nombre;
        this.datetimeInicio = 0;
        this.datetimeFin = 0;
        this.zona = "default";
        this.version = 0;
    }

    public Medicion (Parcel source){
        this.id = source.readInt();
        this.nombre = source.readString();
        this.datetimeInicio = source.readLong();
        this.datetimeFin = source.readLong();
        this.zona = source.readString();
        this.version = source.readInt();
    }

    public static Creator<Medicion> getCreator() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(id);
        dest.writeString(nombre);
        dest.writeLong(datetimeInicio);
        dest.writeLong(datetimeFin);
        dest.writeString(zona);
        dest.writeInt(version);
    }

    public static final Parcelable.Creator<Medicion> CREATOR = new Creator<Medicion>()
            {
                @Override
                public Medicion createFromParcel(Parcel source)
                {
                    return new Medicion(source);
                }
                @Override
                public Medicion[] newArray(int size)
                {
                    return new Medicion[size];
                }
            };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDatetimeInicio() {
        return datetimeInicio;
    }

    public void setDatetimeInicio(long datetimeInicio) {
        this.datetimeInicio = datetimeInicio;
    }

    public long getDatetimeFin() {
        return datetimeFin;
    }

    public void setDatetimeFin(long datetimeFin) {
        this.datetimeFin = datetimeFin;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getStringForDB() {
        //NOMBRE, DATETIME_INICIO, DATETIME_FIN, ZONA, VERSION
        StringBuilder sb = new StringBuilder("'");
        sb.append(nombre).append("',");
        sb.append(datetimeInicio).append(",");
        sb.append(datetimeFin).append(",'");
        sb.append(zona).append("',");
        sb.append(version);
        return sb.toString();
    }

    public ContentValues getContenValues(){
        ContentValues cv = new ContentValues();
        cv.put("NOMBRE",nombre);
        cv.put("DATETIME_INICIO", datetimeInicio);
        cv.put("DATETIME_FIN", datetimeFin);
        cv.put("ZONA", zona);
        cv.put("VERSION", version);
        return cv;
    }

    public String getFechaInicioString() {
        return "Inicio: "+getFechaString(datetimeInicio);
    }

    public String getFechaFinString() {
        return "Fin:"+getFechaString(datetimeFin);
    }

    public String getFechaString(long longDate) {
        if (longDate>0) {
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(longDate);
            StringBuilder sb = new StringBuilder();
            sb.append(c.get(Calendar.DAY_OF_MONTH)).append("-");
            sb.append(c.get(Calendar.MONTH)+1<10?"0"+(c.get(Calendar.MONTH)+1):(c.get(Calendar.MONTH)+1)).append(" ");
            sb.append(c.get(Calendar.HOUR_OF_DAY)<10?"0"+c.get(Calendar.HOUR_OF_DAY):c.get(Calendar.HOUR_OF_DAY)).append("h");
            sb.append(c.get(Calendar.MINUTE)<10?"0"+c.get(Calendar.MINUTE):c.get(Calendar.MINUTE));
            return sb.toString();
        } else {
            return "-";
        }
    }
}
