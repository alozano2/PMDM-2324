package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.ejemplo.pmdm_2324.R;

import java.util.LinkedHashMap;
import java.util.List;

public class u3a6bLetrasDeTexto extends AppCompatActivity {
    Button btnFinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a6b_letras_de_texto2);

        btnFinalizar = findViewById(R.id.u3a6bbtnFinalizar);
    }
}