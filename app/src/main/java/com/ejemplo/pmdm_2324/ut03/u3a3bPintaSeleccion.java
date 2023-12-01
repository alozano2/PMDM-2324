package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a3bPintaSeleccion extends AppCompatActivity {
    public static String UN_CONO = "O";
    public static String DOS_CONOS = "OO";
    public static String TRES_CONOS = "OOO";
    public static String cadenaCucurucho = "UVV";
    public static String cadenaTarrina = "VUV";
    public static String cadenaCucuruchoChocolate = "VVU";

    TextView eleccionVainilla, eleccionFresa, eleccionChocolate, eleccionTipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a3b_pinta_seleccion);

        //IGUALO VARIABLES
        eleccionVainilla = findViewById(R.id.u3a3btvEleccionVainilla);
        eleccionFresa = findViewById(R.id.u3a3btvEleccionFresa);
        eleccionChocolate = findViewById(R.id.u3a3btvEleccionChocolate);
        eleccionTipo = findViewById(R.id.u3a3btvEleccionTipo);

        //PASO LA INFO DE LA OTRA ACTIVITY
        Bundle info = getIntent().getExtras();
        String numVainilla = info.getString(u3a3aSeleccion.NUM_VAINILLA);
        String numFresa = info.getString(u3a3aSeleccion.NUM_FRESA);
        String numChocolate = info.getString(u3a3aSeleccion.NUM_CHOCOLATE);
        String tipo = info.getString(u3a3aSeleccion.TIPO_HELADO);

        if(numVainilla.equals("1")){
            eleccionVainilla.setText(UN_CONO);
            eleccionVainilla.setTextColor(getResources().getColor(R.color.yellow));
        } else if (numVainilla.equals("2")) {
            eleccionVainilla.setText(DOS_CONOS);
            eleccionVainilla.setTextColor(getResources().getColor(R.color.yellow));
        } else if (numVainilla.equals("3")) {
            eleccionVainilla.setText(TRES_CONOS);
            eleccionVainilla.setTextColor(getResources().getColor(R.color.yellow));
        }

        if(numFresa.equals("1")){
            eleccionFresa.setText(UN_CONO);
            eleccionFresa.setTextColor(getResources().getColor(R.color.pink));
        } else if (numFresa.equals("2")) {
            eleccionFresa.setText(DOS_CONOS);
            eleccionFresa.setTextColor(getResources().getColor(R.color.pink));
        } else if (numFresa.equals("3")) {
            eleccionFresa.setText(TRES_CONOS);
            eleccionFresa.setTextColor(getResources().getColor(R.color.pink));
        }

        if(numChocolate.equals("1")){
            eleccionChocolate.setText(UN_CONO);
            eleccionChocolate.setTextColor(getResources().getColor(R.color.brown));
        } else if (numChocolate.equals("2")) {
            eleccionChocolate.setText(DOS_CONOS);
            eleccionChocolate.setTextColor(getResources().getColor(R.color.brown));
        } else if (numChocolate.equals("3")) {
            eleccionChocolate.setText(TRES_CONOS);
            eleccionChocolate.setTextColor(getResources().getColor(R.color.brown));
        }

        if(tipo.equals("Cucurucho")){
            eleccionTipo.setText(cadenaCucurucho);
            eleccionTipo.setTextColor(getResources().getColor(R.color.lightbrown));
        } else if (tipo.equals("Tarrina")) {
            eleccionTipo.setText(cadenaTarrina);
            eleccionTipo.setTextColor(getResources().getColor(R.color.brown));
        }
    }
}