package Clases;

import java.io.Serializable;

/**
 * Created by sigmotoa on 24/09/17.
 */

public class Hamburguesa implements Serializable{

    private String tipo;
    private boolean cebolla;
    private int cantidad;

    public Hamburguesa(String tipo,boolean cebolla, int cantidad)
    {
        this.tipo=tipo;
        this.cebolla=cebolla;
        this.cantidad=cantidad;

    }

    public String getTipo()
    {
        return tipo;
    }
    public boolean getCebolla()
    {
        return cebolla;
    }
    public int getCantidad() {
        return cantidad;
    }
}
