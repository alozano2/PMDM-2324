package com.ejemplo.pmdm_2324.ut06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u6a1bMainLibros extends AppCompatActivity {
    TextView tvLibros;
    Button btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u6a1b_main_libros);

        tvLibros = findViewById(R.id.u6a1btvLibro);
        btnVolver = findViewById(R.id.u6a1bbtnVolver);

        Intent intent = getIntent();
        u6a1Libros libro = (u6a1Libros) intent.getSerializableExtra(u6a1Libros.CLAVE_LIBRO);
        tvLibros.setText(libro.toString());

        btnVolver.setOnClickListener((View v) -> finish());
    }
}