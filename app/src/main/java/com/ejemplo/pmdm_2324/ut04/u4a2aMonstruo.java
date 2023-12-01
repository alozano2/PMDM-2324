package com.ejemplo.pmdm_2324.ut04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut03.Monstruo;
import com.ejemplo.pmdm_2324.ut03.u3a8aFabricarMonstruo;

public class u4a2aMonstruo extends AppCompatActivity {
    EditText etNombre, etManos, etPiernas, etColor;
    Button btnContruir;
    u4a2fMonstruo fragment;
    Spinner spnEleccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u4a2a_monstruo);

        etNombre = findViewById(R.id.u4a2aetNombre);
        etManos = findViewById(R.id.u4a2aetBrazos);
        etPiernas = findViewById(R.id.u4a2aetPiernas);
        etColor = findViewById(R.id.u4a2aetColor);
        btnContruir = findViewById(R.id.u4a2abtnConstruir);
        fragment = (u4a2fMonstruo) getSupportFragmentManager().findFragmentById(R.id.u4a2fMonstruo);
        spnEleccion = findViewById(R.id.u4a2aspEleccion);

        btnContruir.setOnClickListener((View) -> {
            String manos = etNombre.getText().toString();
            int numeroManos = Integer.valueOf(etManos.getText().toString());
            int numeroPiernas = Integer.valueOf(etPiernas.getText().toString());
            String Color = etColor.getText().toString();

            Monstruo monstruo = new Monstruo(manos, numeroManos, numeroPiernas, Color);

            if(spnEleccion.equals("Monstruo 1")){
                
            }

        });
    }
}