package com.ejemplo.pmdm_2324.ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u2a3Propinatron2000 extends AppCompatActivity {

    Button btn0,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnFlecha, btnC;
    TextView tvmuestraNumeros;
    View.OnClickListener controlador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u2a3_propinatron2000);

        btn0 = findViewById(R.id.u2a3btCero);
        btn1 = findViewById(R.id.u2a3btUno);
        btn2 = findViewById(R.id.u2a3btDos);
        btn3 = findViewById(R.id.u2a3btTres);
        btn4 = findViewById(R.id.u2a3btCuatro);
        btn5 = findViewById(R.id.u2a3btCinco);
        btn6 = findViewById(R.id.u2a3btSeis);
        btn7 = findViewById(R.id.u2a3btSiete);
        btn8 = findViewById(R.id.u2a3btOcho);
        btn9 = findViewById(R.id.u2a3btNueve);
        btnFlecha = findViewById(R.id.u2a3btFlecha);
        btnC = findViewById(R.id.u2a3btC);
        tvmuestraNumeros = findViewById(R.id.u2a3tvControlador);

        controlador = (View v) -> {
            Button botonPulsado = (Button) v;
            String textoActual = tvmuestraNumeros.getText().toString();
            String nuevoTexto = " ";

            if(v == btnC){
                tvmuestraNumeros.setText("");
            }/*else if(v == btnFlecha){
                tvmuestraNumeros.setText(nuevoTexto.substring(0, nuevoTexto.length() - 1));
            }*/else{
                nuevoTexto = textoActual + botonPulsado.getText().toString();
                tvmuestraNumeros.setText(nuevoTexto);
            }

        };

        btn0.setOnClickListener(controlador);
        btn1.setOnClickListener(controlador);
        btn2.setOnClickListener(controlador);
        btn3.setOnClickListener(controlador);
        btn4.setOnClickListener(controlador);
        btn5.setOnClickListener(controlador);
        btn6.setOnClickListener(controlador);
        btn7.setOnClickListener(controlador);
        btn8.setOnClickListener(controlador);
        btn9.setOnClickListener(controlador);
        //btnFlecha.setOnClickListener(controlador);
        btnC.setOnClickListener(controlador);
    }
}