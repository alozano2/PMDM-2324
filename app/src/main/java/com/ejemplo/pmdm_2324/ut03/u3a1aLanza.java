package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ejemplo.pmdm_2324.R;

public class u3a1aLanza extends AppCompatActivity {
    public static final String INFO_NOMBRE = "CLAVE_NOMBRE";
    Button tvLanza;
    EditText etNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a1a_lanza);

        tvLanza = findViewById(R.id.u3a1btnLanza);
        etNombre = findViewById(R.id.u3a1txtName);

        tvLanza.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a1bLanzada.class);
            i.putExtra(INFO_NOMBRE, etNombre.getText().toString()); //Importantisimo convertir en toString al coger info de un text o similar
            startActivity(i);
        });
    }
}