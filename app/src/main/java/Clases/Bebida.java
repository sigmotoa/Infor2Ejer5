package Clases;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sigmotoa on 24/09/17.
 */

public class Bebida implements Parcelable {

    private String tipo;
    private boolean hielo;

    public Bebida(String tipo, boolean hielo) {
        this.tipo = tipo;
        this.hielo = hielo;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(tipo);
        parcel.writeInt(hielo?1:0);
    }

    public Bebida(Parcel parcel) {
        tipo=parcel.readString();
        hielo=(parcel.readInt()==0)?false:true;
    }

/*
    public static final Parcelable.Creator<Bebida> CREATOR=new Parcelable.Creator<Bebida>()
    {
        @Override
        public Bebida createFormParcel(Parcel parcel)
        {
            return new Bebida(parcel);
        }

        public Bebida[] newArray(int size)
        {
            return new Bebida[size];
        }
    };
*/
}
