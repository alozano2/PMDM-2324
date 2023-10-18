package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a1bLanzada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a1b_lanzada);

        Bundle info = getIntent().getExtras();
        String sINfo = info.getString(u3a1aLanza.INFO_NOMBRE);

        TextView tv = findViewById(R.id.u3a1tvHola);

    }
}