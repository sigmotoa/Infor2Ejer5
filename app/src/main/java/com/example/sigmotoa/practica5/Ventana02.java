package com.example.sigmotoa.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import Clases.Bebida;
import Clases.Hamburguesa;

public class Ventana02 extends AppCompatActivity {

    private TextView logtextview;
    private ScrollView scrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana02);
        logtextview=(TextView)findViewById(R.id.textView10);
        scrollview=(ScrollView)findViewById(R.id.scrollView);

        Bundle bundle=this.getIntent().getExtras();
        log("Cliente: "+bundle.getString("CLIENTE"));
        log("");
        Hamburguesa pedidoham = (Hamburguesa) bundle.get("HAMBURGUESA");

        Bebida pedidobeb=(Bebida) bundle.get("BEBIDA");
        log("Hamburguesa");
        log(pedidoham.getTipo());

        if(pedidoham.getCebolla())
        {
            log("con cebolla");
        }
        else
        {
            log("sin cebolla");
        }
        log("");
        log("Bebida");
        log(pedidobeb.getTipo());

        if (pedidobeb.getHielo())
        {
            log("con hielo");
        }
        else
        {
            log("sin hielo");
        }



    }
    private void log(String s)
    {
        logtextview.append("\n"+s);
        scrollview.post(new Runnable() {
            @Override
            public void run() {
                scrollview.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });


    }


}
