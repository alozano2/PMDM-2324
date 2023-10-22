package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class u3a3aSeleccion extends AppCompatActivity {
    public static final int HELADOS_MAX = 3;
    public static final String STRING_ERROR = "No se pueden ingresar más de tres copas.";
    public static final String STRING_ERROR_TIPO = "Debes indicar si quieres tarrina o cucurucho.";
    public static final String NUM_VAINILLA = "VAINILLA";
    public static final String NUM_FRESA = "FRESA";
    public static final String NUM_CHOCOLATE = "CHOCOLATE";
    public static final String TIPO_HELADO = "TIPO";
    TextView tvVainilla, tvFresa, tvChocolate, tvTipo, tvError;
    EditText cantVainilla, cantFresa, cantChocolate;
    Button btnGenerar;
    String selectedItem = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a3a_seleccion);

        //TextViews
        tvVainilla = findViewById(R.id.u3a3atvVainilla);
        tvFresa = findViewById(R.id.u3a3atvFresa);
        tvChocolate = findViewById(R.id.u3a3atvChocolate);
        tvTipo = findViewById(R.id.u3a3atvTipo);
        tvError = findViewById(R.id.u3a3atvError);
        //EditText
        cantVainilla = findViewById(R.id.u3a3aetCantVainilla);
        cantFresa = findViewById(R.id.u3a3aetCantFresa);
        cantChocolate = findViewById(R.id.u3a3aetCantChoco);
        //Button
        btnGenerar = findViewById(R.id.u3a3abtnGenerar);
        //Spinner
        Spinner spnTipo = findViewById(R.id.u3a3aSpEleccionTipo);


        spnTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Aquí obtienes la posición del elemento seleccionado
                int selectedPosition = position;

                // También puedes obtener el valor del elemento seleccionado
                selectedItem = parentView.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(u3a3aSeleccion.this);
                alerta.setTitle("Error");
                alerta.setMessage(STRING_ERROR_TIPO);
                alerta.show();
            }
        });

        btnGenerar.setOnClickListener(view -> {
            //Creo variables int para meter la cantidad de helados elegidos
            Integer numVainilla, numFresa, numChocolate;
            numVainilla = Integer.valueOf(cantVainilla.getText().toString());
            numFresa = Integer.parseInt(cantFresa.getText().toString());
            numChocolate = Integer.parseInt(cantChocolate.getText().toString());

            if(numVainilla <= HELADOS_MAX && numFresa <= HELADOS_MAX && numChocolate <= HELADOS_MAX) {
                Intent i = new Intent(this, u3a3bPintaSeleccion.class);

                //Paso esos numeros a la otra activity
                i.putExtra(NUM_VAINILLA, cantVainilla.getText().toString());
                i.putExtra(NUM_FRESA, cantFresa.getText().toString());
                i.putExtra(NUM_CHOCOLATE, cantChocolate.getText().toString());
                i.putExtra(TIPO_HELADO, selectedItem);
                startActivity(i);
            }else{
                AlertDialog.Builder alerta = new AlertDialog.Builder(this);
                alerta.setTitle("Error");
                alerta.setMessage(STRING_ERROR);
                alerta.show();
            }
        });
    }
}