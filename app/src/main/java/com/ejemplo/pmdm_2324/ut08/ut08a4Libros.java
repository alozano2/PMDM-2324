package com.ejemplo.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut06.u6a1Libros;
import com.ejemplo.pmdm_2324.ut06.u6a1LibrosAdapter;

public class ut08a4Libros extends AppCompatActivity {
    RecyclerView tvLibros;
    Button btnAñadir;
    ProgressBar pgrCargando;
    ut08a4LibrosAdapter adapterLibros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut08a4_libros);

        tvLibros = findViewById(R.id.ut08a4viewLibros);
        tvLibros.setLayoutManager(new LinearLayoutManager(this));
        btnAñadir = findViewById(R.id.ut08a4btnAñadir);
        pgrCargando = findViewById(R.id.ut08a4pgrbBarra);
        adapterLibros = new ut08a4LibrosAdapter(u6a1Libros.generador());
        tvLibros.setAdapter(adapterLibros);

        ut08a4LibrosViewModel vm = new ViewModelProvider(this).get(ut08a4LibrosViewModel.class);

        vm.getLibros().observe(this, libros -> {
            adapterLibros.add(libros);
            btnAñadir.setVisibility(View.VISIBLE);
            pgrCargando.setVisibility(View.INVISIBLE);
        });

        btnAñadir.setOnClickListener((v) -> {
            pgrCargando.setVisibility(View.VISIBLE);
            btnAñadir.setVisibility(View.INVISIBLE);
            vm.generoLibros();
        });

        adapterLibros.setClickListener(new ut08a4LibrosAdapter.ItemClickListener() {
            public void onClick(View view, int position, u6a1Libros producto) {
                u6a1Libros miLibro = new u6a1Libros(producto.getTitulo(), producto.getAutor(), producto.getEditorial(), producto.getDescripcion());
                Intent i = new Intent(ut08a4Libros.this, ut08b4Libros.class);
                i.putExtra(u6a1Libros.CLAVE_LIBRO, miLibro);
                startActivity(i);
            }
        });
    }
}