package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a6aLetrasDeTexto extends AppCompatActivity {
    EditText etEscribeTexto;
    TextView tvInfo;
    Button btnAnalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a5a_letras_de_texto);

        etEscribeTexto = findViewById(R.id.u3a6aetTextoLargo);
        tvInfo = findViewById(R.id.u3a6atvInfo);
        btnAnalizar = findViewById(R.id.u3a6abtnAnalizar);


    }
}