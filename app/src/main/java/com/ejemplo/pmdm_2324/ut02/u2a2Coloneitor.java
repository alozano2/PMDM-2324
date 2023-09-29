package com.ejemplo.pmdm_2324.ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u2a2Coloneitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u2a2_coloneitor);

        SeekBar sbColor;
        Button btnGenerar;
        TextView dimeColor;

        sbColor = findViewById(R.id.u2a2idsbRojo);
        btnGenerar = findViewById(R.id.u2a2idbtGenerar);
        dimeColor = findViewById(R.id.u2a2idtvDimeColor);

        btnGenerar.setOnClickListener((View v) -> {
            int potenciaColor = sbColor.getProgress();
            dimeColor.setText(String.valueOf(potenciaColor));
        });
    }
}