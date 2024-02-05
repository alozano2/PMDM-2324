package com.ejemplo.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut06.u6a1Libros;

public class ut08a5Activity2Goleadores extends AppCompatActivity {
    TextView tvJugadores;
    Button btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut08a5_activity2_goleadores);

        tvJugadores = findViewById(R.id.ut08a5bviewJugadores);
        btnVolver = findViewById(R.id.ut08a5bbtnVolver);

        Intent intent = getIntent();
        ut08a5ClaseGoleadores goleador = (ut08a5ClaseGoleadores) intent.getSerializableExtra(ut08a5ClaseGoleadores.CLAVE_GOLEADOR);
        tvJugadores.setText(goleador.toString());

        btnVolver.setOnClickListener((View v) -> finish());
    }
}