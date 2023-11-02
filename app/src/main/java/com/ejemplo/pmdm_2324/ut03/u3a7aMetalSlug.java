package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.ejemplo.pmdm_2324.R;

public class u3a7aMetalSlug extends AppCompatActivity {
    ImageView usuJ1, usuJ2, armaJ1, armaJ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a7a_metal_slug);

        usuJ1 = findViewById(R.id.u3a7aimgVJ1);
        usuJ2 = findViewById(R.id.u3a7aimgVJ2);
        armaJ1 = findViewById(R.id.u3a7aimgVArmJ1);
        armaJ2 = findViewById(R.id.u3a7aimgVArmJ2);


    }
}