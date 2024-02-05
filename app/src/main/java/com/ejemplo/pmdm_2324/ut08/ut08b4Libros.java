package com.ejemplo.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut06.u6a1Libros;

public class ut08b4Libros extends AppCompatActivity {
    TextView tvLibros;
    Button btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut08b4_libros);

        tvLibros = findViewById(R.id.ut08b4tvLibros);
        btnVolver = findViewById(R.id.ut08b4btnVolver);

        Intent intent = getIntent();
        u6a1Libros libro = (u6a1Libros) intent.getSerializableExtra(u6a1Libros.CLAVE_LIBRO);
        tvLibros.setText(libro.toString());

        btnVolver.setOnClickListener((View v) -> finish());
    }
}