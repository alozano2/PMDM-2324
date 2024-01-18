package com.ejemplo.pmdm_2324.ut05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.ejemplo.pmdm_2324.R;

public class u5a2MainDulces extends AppCompatActivity {
    RecyclerView reyclerViewUser;
    DulcesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u5a2_dulces_navidad);

        reyclerViewUser = (RecyclerView) findViewById(R.id.ut05ListaContenedor);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
        reyclerViewUser.setLayoutManager(layoutManager);

        adapter = new DulcesAdapter(u5a2DulceNavidad.generarDulces(u5a2DulceNavidad.DULCES_INICIALES));
        reyclerViewUser.setAdapter(adapter);
    }
}