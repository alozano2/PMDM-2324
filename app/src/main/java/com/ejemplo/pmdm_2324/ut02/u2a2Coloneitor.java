package com.ejemplo.pmdm_2324.ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u2a2Coloneitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u2a2_coloneitor);

        SeekBar sbRojo;
        Button btnGenerar;
        TextView muestraColor;
        Switch cambiarColor;
        EditText dimeColor;
        SeekBar sbVerde;
        SeekBar sbAzul;

        sbRojo = findViewById(R.id.u2a2idsbRojo);
        btnGenerar = findViewById(R.id.u2a2idbtGenerar);
        muestraColor = findViewById(R.id.u2a2idtvDimeColor);
        dimeColor = findViewById(R.id.u2a2idetColor);
        cambiarColor = findViewById((R.id.u2a1idswContraste));
        sbVerde = findViewById(R.id.u2a2idsbVerde);
        sbAzul = findViewById(R.id.u2a2idsbAzul);

        btnGenerar.setOnClickListener((View v) -> {
            if(dimeColor.getText().toString().equalsIgnoreCase("Rojo") || dimeColor.getText().toString().equalsIgnoreCase("Verde")
            || dimeColor.getText().toString().equalsIgnoreCase("Azul")){
                muestraColor.setText(dimeColor.getText());
            }else{
                muestraColor.setText("Color ingresado incorrecto.");
            }

            int potenciaColorRojo = sbRojo.getProgress();
            int potenciaColorVerde = sbVerde.getProgress();
            int potenciaColorAzul = sbAzul.getProgress();

            int colorElegido = Color.rgb(potenciaColorRojo, potenciaColorVerde, potenciaColorAzul);
            muestraColor.setBackgroundColor(colorElegido);

            if(cambiarColor.isChecked()){
                int colorBlanco = Color.WHITE;
                muestraColor.setBackgroundColor(colorBlanco);
            }
        });
    }
}