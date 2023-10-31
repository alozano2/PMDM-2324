package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ejemplo.pmdm_2324.R;

public class u3a4bCalentamiento extends AppCompatActivity {
    public static final String CLAVE_NOMBRE = "CLAVEDELNOMBRE";
    public static final String CADENA_VACIA = "";
    EditText etNombre;
    Button btnAceptar, btnCancelar, btnLimpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a4b_calentamiento);

        etNombre = findViewById(R.id.u3a4betNombre);
        btnAceptar = findViewById(R.id.u3a4bbtnAceptar);
        btnCancelar = findViewById(R.id.u3a4bbtnCancelar);
        btnLimpiar = findViewById(R.id.u3a4bbtnLimpiar);

        btnAceptar.setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra(CLAVE_NOMBRE, etNombre.getText().toString());
            setResult(Activity.RESULT_OK, data);
            finish();
        });

        btnCancelar.setOnClickListener(view ->{
            setResult(Activity.RESULT_CANCELED);
            finish();
        });

        btnLimpiar.setOnClickListener(view -> {
            setResult(Activity.RESULT_FIRST_USER);
            etNombre.setText(CADENA_VACIA);
        });
    }
}