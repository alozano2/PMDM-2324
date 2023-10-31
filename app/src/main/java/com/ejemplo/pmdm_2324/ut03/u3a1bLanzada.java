package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ejemplo.pmdm_2324.R;

import java.util.Calendar;

public class u3a1bLanzada extends AppCompatActivity {
    public static final String CLAVE_NUMERO = "DAIGUAL";
    Button btAceptar, btCancelar;
    EditText etNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a1b_lanzada);

        btAceptar = findViewById(R.id.u3a1btnAceptar);
        btCancelar = findViewById(R.id.u3a1btnCancelar);
        etNumero = findViewById(R.id.u3a1etIngresarNumero);

        btAceptar.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CLAVE_NUMERO, etNumero.getText().toString());
            setResult(Activity.RESULT_OK,data);
            finish();
        });

        btCancelar.setOnClickListener(view -> {
            setResult(Activity.RESULT_CANCELED);
            finish();
        });
    }
}