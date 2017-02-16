package ec.gob.arcotel.drivetest;

import android.database.Cursor;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Supertel on 23/4/15.
 */

public class Dato implements Parcelable
{
    private long datosId;
    private int medicionId;
    private int networkType;
    private int dataState;
    private long dateTime;
    private int level;
    private int mcc_mnc;
    private String operadora;
    private long cellId;
    private long lac;
    private Location location;
    private double latitude;
    private double longitude;
    private int status;
    private String provincia;
    private String ciudad;
    private String direccion;

    public Dato()
    {
        setDatosId(-1);
        setMedicionId(-1);
        setNetworkType(-1);
        setDataState(-1);
        setDateTime(System.currentTimeMillis());
        setLevel(-1);
        setMccMnc(-1);
        setOperadora("default");
        setCellId(-1);
        setLac(-1);
        setLocation(new Location("gps"));
        setLatitude(900);
        setLongitude(900);
        setStatus(0);
        setProvincia("default");
        setCiudad("default");
        setDireccion("default");

    }
    public Dato(Parcel source)
    {
        setDatosId(source.readLong());
        setMedicionId(source.readInt());
        setNetworkType(source.readInt());
        setDataState(source.readInt());
        setDateTime(source.readLong());
        setLevel(source.readInt());
        setMccMnc(source.readInt());
        setOperadora(source.readString());
        setCellId(source.readLong());
        setLac(source.readLong());
        setLocation((Location)source.readParcelable(Location.class.getClassLoader()));
        setLatitude(source.readDouble());
        setLongitude(source.readDouble());
        setStatus(source.readInt());
        setProvincia((source.readString()));
        setCiudad((source.readString()));
        setDireccion((source.readString()));
    }

    public Dato(Cursor c) throws Exception{
        //DATOS_ID, MEDICION_ID INT, NETWORK_TYPE, DATE_TIME, LEVEL, MCC_MNC, OPERADORA,, CELL_ID
        //LAC, LATITUDE, LONGITUDE, PROVINCIA, CIUDAD, DIRECCION, STATUS
        setDatosId(c.getInt(0));
        setMedicionId(c.getInt(1));
        setNetworkType(c.getInt(2));
        setDateTime(c.getLong(3));
        setLevel(c.getInt(4));
        setMccMnc(c.getInt(5));
        setOperadora(c.getString(6));
        setCellId(c.getLong(7));
        setLac(c.getLong(8));
        setLatitude(c.getDouble(9));
        setLongitude(c.getDouble(10));
        setProvincia(c.getString(11));
        setCiudad(c.getString(12));
        setDireccion(c.getString(13));
        setStatus(c.getInt(14));
    }

    public static Creator<Dato> getCreator() {
        return CREATOR;
    }


    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeLong(getDatosId());
        dest.writeInt(getMedicionId());
        dest.writeInt(getNetworkType());
        dest.writeInt(getDataState());
        dest.writeLong(getDateTime());
        dest.writeInt(getLevel());
        dest.writeInt(getMccMnc());
        dest.writeString(getOperadora());
        dest.writeLong(getCellId());
        dest.writeLong(getLac());
        dest.writeParcelable(getLocation(), flags);
        dest.writeDouble(getLatitude());
        dest.writeDouble(getLongitude());
        dest.writeInt(getStatus());
        dest.writeString(getCiudad());
        dest.writeString(getProvincia());
        dest.writeString(getDireccion());
    }
    private static final Parcelable.Creator<Dato> CREATOR =
            new Creator<Dato>()
            {
                @Override
                public Dato createFromParcel(Parcel source)
                {
                    return new Dato(source);
                }
                @Override
                public Dato[] newArray(int size)
                {
                    return new Dato[size];
                }
            };

    @Override
    public String toString()
    {
        StringBuffer texto = new StringBuffer();
        String Mnc_mcc = String.valueOf(getMccMnc());
        texto.append(getDateTime()+";");
        texto.append(getNetworkType()+";");
        texto.append(getLevel()+";");
        if(Mnc_mcc.length()>4)
        {
            texto.append(Mnc_mcc.substring(0,3)+";");
            texto.append(Mnc_mcc.substring(3)+";");
        }
        else
        {
            texto.append(getMccMnc()+";");
            texto.append("-1;");
        }
        texto.append(getOperadora()+";");
        texto.append(getCellId()+";");
        texto.append(getLac()+";");
        texto.append(getLatitude()+";");
        texto.append(getLongitude()+";");
        texto.append(getProvincia()+";");
        texto.append(getCiudad()+";");
        texto.append(getDireccion());
        return texto.toString();
    }
    public String toStringFile()
    {
        return toString()+"@";
    }

    public long getDatosId() {
        return datosId;
    }

    public void setDatosId(long datosId) {
        this.datosId = datosId;
    }

    public int getMedicionId() {
        return medicionId;
    }

    public void setMedicionId(int medicionId) {
        this.medicionId = medicionId;
    }

    public int getNetworkType() {
        return networkType;
    }

    public void setNetworkType(int networkType) {
        this.networkType = networkType;
    }

    public int getDataState() {
        return dataState;
    }

    public void setDataState(int dataState) {
        this.dataState = dataState;
    }

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public long getCellId() {
        return cellId;
    }

    public void setCellId(long cellId) {
        this.cellId = cellId;
    }

    public long getLac() {
        return lac;
    }

    public void setLac(long lac) {
        this.lac = lac;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getStringForDB() {
        //MEDICION_ID, NETWORK_TYPE, DATE_TIME, LEVEL, MCC_MNC, OPERADORA, CELL_ID," +
        //LAC, LATITUDE, LONGITUDE, PROVINCIA, CIUDAD, DIRECCION, STATUS
        StringBuilder sb = new StringBuilder();
        sb.append(medicionId).append(",");
        sb.append(networkType).append(",");
        sb.append(dateTime).append(",");
        sb.append(level).append(",");
        sb.append(getMccMnc()).append(",'");
        sb.append(operadora).append("',");
        sb.append(cellId).append(",");
        sb.append(lac).append(",");
        sb.append(latitude).append(",");
        sb.append(longitude).append(",'");
        sb.append(provincia).append("','");
        sb.append(ciudad).append("','");
        sb.append(direccion).append("',");
        sb.append(status);
        return sb.toString();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getMccMnc() {
        return mcc_mnc;
    }

    public void setMccMnc(int mcc_mnc) {
        this.mcc_mnc = mcc_mnc;
    }

    public LatLng getLatLng() {
        return new LatLng(latitude, longitude);
    }

    public int getImageResourceId() {
        int out = R.drawable.hexagon_blue;
        if (level>=-85){
            out = R.drawable.hexagon_green;
        } else if (level<-85||level>=-98){
            out = R.drawable.hexagon_yellow;
        } else if (level<-98||level>=-113){
            out = R.drawable.hexagon_red;
        }
        return out;
    }
}

