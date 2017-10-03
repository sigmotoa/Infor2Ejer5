package com.example.sigmotoa.practica5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Clases.Bebida;
import Clases.Hamburguesa;

public class Ventana01 extends AppCompatActivity {

    private EditText cliente;
    private Spinner lista01;//Hamburquesa
    private Spinner lista02;//cebolla
    private Spinner lista03;//bebida
    private CheckBox hielo;//con hielo
    private Button enviar;

    List<String> tipoh;
    List<String> sino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana01);

        cliente=(EditText)findViewById(R.id.editText);
        lista01=(Spinner)findViewById(R.id.spinner);
        lista02=(Spinner)findViewById(R.id.spinner2);
        lista03=(Spinner)findViewById(R.id.spinner3);
        hielo=(CheckBox)findViewById(R.id.checkBox);
        enviar=(Button)findViewById(R.id.button);
        datosInicio();



    }

    public void datosInicio()
    {
        List<String> tipoh=new ArrayList<String>();
        List<String> tipob=new ArrayList<String>();
        List<String> sino=new ArrayList<String>();

        tipoh.add("");
        tipoh.add("Carne");
        tipoh.add("Pollo");
        tipoh.add("Pescado");

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, tipoh);

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        lista01.setAdapter(adaptador);


        sino.add("SI");
        sino.add("NO");

        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,sino);

        adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lista02.setAdapter(adaptador2);
        cliente =(EditText)findViewById(R.id.editText);

    }

public void llamaractividad(View v)
{

    boolean tomate=false;
    if (lista02.getSelectedItem().toString().equals("SI"))tomate=true;
    Hamburguesa miham = new Hamburguesa(lista01.getSelectedItem().toString(),tomate);

    boolean hielo=this.hielo.isChecked();
    Bebida mibeb=new Bebida(lista03.getSelectedItem().toString(),hielo);

    Intent int01=new Intent(this, Ventana02.class);

    if(cliente.getText().toString().equals(""))
    {
        Toast.makeText(getApplicationContext(),"Cliente incorrecto",Toast.LENGTH_SHORT).show();
    }
else
    {
        int01.putExtra("CLIENTE", cliente.getText().toString());
        int01.putExtra("HAMBURGUESA", miham);
        int01.putExtra("BEBIDA", mibeb);

        startActivity(int01);
    }


}

}
