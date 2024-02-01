package com.ejemplo.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class ut08a1NumeroAleatorio extends AppCompatActivity {
    TextView tvNumero;
    ProgressBar pgbCargando;
    Button btnGenerar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut08_numero_aleatorio);

        tvNumero = findViewById(R.id.u8a1tvNumero);
        pgbCargando = findViewById(R.id.u8a1pgrCargando);
        btnGenerar = findViewById(R.id.u8a1btnGen);

        ut08a1NumeroAleatorioViewModel vm = new ViewModelProvider(this).get(ut08a1NumeroAleatorioViewModel.class);

        vm.getNumero().observe(this, integer -> {
            //Actualizar la interfaz
            tvNumero.setText("" + integer);
            pgbCargando.setVisibility(View.INVISIBLE);
            tvNumero.setVisibility(View.VISIBLE);
            btnGenerar.setEnabled(true);
        });

        btnGenerar.setOnClickListener((v) -> {
            pgbCargando.setVisibility(View.VISIBLE);
            tvNumero.setVisibility(View.INVISIBLE);
            btnGenerar.setEnabled(false);
            vm.cargaNumero();
        });
    }
}