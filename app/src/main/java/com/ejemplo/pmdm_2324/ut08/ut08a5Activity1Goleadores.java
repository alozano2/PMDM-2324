package com.ejemplo.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Button;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut06.u6a1Libros;

public class ut08a5Activity1Goleadores extends AppCompatActivity {
    RecyclerView viewJugadores;
    ImageView imgEscudo;
    Button btnAñadir;
    ProgressBar pgrCargando;
    ut08a5AdapterGoleadores adapterGoleadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut08a5_activity1_goleadores);

        viewJugadores = findViewById(R.id.ut08a5viewJugadores);
        viewJugadores.setLayoutManager(new LinearLayoutManager(this));
        imgEscudo = findViewById(R.id.ut08a5imgEscudo);
        btnAñadir = findViewById(R.id.ut08a5btnAñadir);
        pgrCargando = findViewById(R.id.ut08a5pgrBarCargando);
        adapterGoleadores = new ut08a5AdapterGoleadores(ut08a5ClaseGoleadores.generador());
        viewJugadores.setAdapter(adapterGoleadores);

        ut08a5ViewModelGoleadores vm = new ViewModelProvider(this).get(ut08a5ViewModelGoleadores.class);

        vm.getGoleadores().observe(this, goleadoresMadrid -> {
            adapterGoleadores.add(goleadoresMadrid);
            btnAñadir.setVisibility(View.VISIBLE);
            pgrCargando.setVisibility(View.INVISIBLE);
        });

        btnAñadir.setOnClickListener((v) -> {
            pgrCargando.setVisibility(View.VISIBLE);
            btnAñadir.setVisibility(View.INVISIBLE);
            vm.generoGoleadores();
        });

        adapterGoleadores.setClickListener(new ut08a5AdapterGoleadores.ItemClickListener() {
            public void onClick(View view, int position, ut08a5ClaseGoleadores producto) {
                ut08a5ClaseGoleadores miJugador = new ut08a5ClaseGoleadores(producto.getNombre(), producto.getApellido(), producto.getPartidosJugados(), producto.getGoles());
                Intent i = new Intent(ut08a5Activity1Goleadores.this, ut08a5Activity2Goleadores.class);
                i.putExtra(ut08a5ClaseGoleadores.CLAVE_GOLEADOR, miJugador);
                startActivity(i);
            }
        });
    }
}