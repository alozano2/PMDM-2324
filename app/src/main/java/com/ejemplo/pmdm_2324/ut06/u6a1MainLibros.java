package com.ejemplo.pmdm_2324.ut06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ejemplo.pmdm_2324.R;

public class u6a1MainLibros extends AppCompatActivity {
    RecyclerView recyclerLibros;
    u6a1LibrosAdapter adapterLibros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u6a1_main_libros);

        recyclerLibros = findViewById(R.id.ut06a1ListaContenedor);
        recyclerLibros.setLayoutManager(new LinearLayoutManager(this));
        adapterLibros = new u6a1LibrosAdapter(u6a1Libros.generador());
        recyclerLibros.setAdapter(adapterLibros);

        adapterLibros.setClickListener(new u6a1LibrosAdapter.ItemClickListener() {
            @Override
            public void onClick(View view, int position, u6a1Libros producto) {
                u6a1Libros miLibro = new u6a1Libros(producto.getTitulo(), producto.getAutor(), producto.getEditorial(), producto.getDescripcion());
                Intent i = new Intent(u6a1MainLibros.this, u6a1bMainLibros.class);
                i.putExtra(u6a1Libros.CLAVE_LIBRO, miLibro);
                startActivity(i);
            }
        });
    }
}