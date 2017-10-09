package Clases;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sigmotoa on 24/09/17.
 */

public class Bebida implements Parcelable {

    private String tipo;
    private boolean hielo;
    private int cantidad;

    public Bebida(String tipo, boolean hielo, int cantidad) {
        this.tipo = tipo;
        this.hielo = hielo;
        this.cantidad=cantidad;

    }

    public static final Creator<Bebida> CREATOR = new Creator<Bebida>() {
        @Override
        public Bebida createFromParcel(Parcel in) {
            return new Bebida(in);
        }

        @Override
        public Bebida[] newArray(int size) {
            return new Bebida[size];
        }
    };

    public String getTipo() {
        return tipo;
    }

    public boolean getHielo() {
        return hielo;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(tipo);
        parcel.writeInt(hielo?1:0);
        parcel.writeInt(cantidad);
    }

    public Bebida(Parcel parcel) {
        tipo=parcel.readString();
        hielo=(parcel.readInt()==0)?false:true;
        cantidad=parcel.readInt();
    }


}
