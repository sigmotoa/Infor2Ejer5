package Clases;

import java.io.Serializable;

/**
 * Created by sigmotoa on 24/09/17.
 */

public class Hamburguesa implements Serializable{

    private String tipo;
    private boolean cebolla;

    public Hamburguesa(String tipo,boolean cebolla)
    {
        this.tipo=tipo;
        this.cebolla=cebolla;

    }

    public String getTipo()
    {
        return tipo;
    }
    public boolean getCebolla()
    {
        return cebolla;
    }

}
