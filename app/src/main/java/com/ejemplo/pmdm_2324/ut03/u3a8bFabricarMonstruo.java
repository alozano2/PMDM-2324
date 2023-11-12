package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a8bFabricarMonstruo extends AppCompatActivity {
    TextView tvMuestraMonstruo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a8b_fabricar_monstruo);
        tvMuestraMonstruo = findViewById(R.id.u3a8btvMuestraMonstruo);

        u3a8aFabricarMonstruo monstruo;
        monstruo = (u3a8aFabricarMonstruo) getIntent().getSerializableExtra(u3a8aFabricarMonstruo.CLAVE_MONSTRUO);
        tvMuestraMonstruo.setText(monstruo.toString());

    }
}