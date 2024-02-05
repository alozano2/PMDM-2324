package com.ejemplo.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class ut08a3ParesNones extends AppCompatActivity {
    CheckBox chkPares, chkNones;
    TextView txtNumero, txtInfoPartida, tvError;
    Button btnJugar, btnReintentar;
    boolean eligePar = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut08a3_pares_nones);

        chkPares = findViewById(R.id.ut08a3chkPares);
        chkNones = findViewById(R.id.ut08a3chkNones);
        txtNumero = findViewById(R.id.ut08a3txtNumero);
        btnJugar = findViewById(R.id.ut08a3btnJugar);
        txtInfoPartida = findViewById(R.id.ut08a3tvInfoPartida);
        btnReintentar = findViewById(R.id.ut08a3btnReintentar);
        tvError = findViewById(R.id.ut08a3tvError);

        ut08a3ParesNonesViewModel vm = new ViewModelProvider(this).get(ut08a3ParesNonesViewModel.class);

        validoCheck();

        vm.getString().observe(this, String -> {
            txtInfoPartida.setText("" + String);
            txtInfoPartida.setVisibility(View.VISIBLE);
            btnReintentar.setVisibility(View.VISIBLE);
            chkPares.setVisibility(View.INVISIBLE);
            chkNones.setVisibility(View.INVISIBLE);
            txtNumero.setVisibility(View.INVISIBLE);
            btnJugar.setVisibility(View.INVISIBLE);
            btnJugar.setEnabled(false);
        });


        btnJugar.setOnClickListener((v) -> {

            if(txtNumero.getText().toString().isEmpty()){
                tvError.setVisibility(View.VISIBLE);
                tvError.setText("Error al ingresar un numero.");
                return;
            }

            if(chkPares.isChecked()){
                int valorJugador = Integer.parseInt(txtNumero.getText().toString());
                vm.resultadoMaquina(eligePar, valorJugador);
            }else{
                int valorJugador = Integer.parseInt(txtNumero.getText().toString());

                eligePar = false;
                vm.resultadoMaquina(eligePar, valorJugador);
            }

        });

        btnReintentar.setOnClickListener((v) -> {
            txtInfoPartida.setVisibility(View.INVISIBLE);
            btnReintentar.setVisibility(View.INVISIBLE);
            chkPares.setVisibility(View.VISIBLE);
            chkNones.setVisibility(View.VISIBLE);
            txtNumero.setVisibility(View.VISIBLE);
            btnJugar.setVisibility(View.VISIBLE);
            btnJugar.setEnabled(true);
            btnReintentar.setVisibility(View.INVISIBLE);
            tvError.setVisibility(View.INVISIBLE);
        });
    }

    public void validoCheck() {
        if(chkPares.isChecked()){
            chkNones.setEnabled(true);
        }

        if(chkNones.isChecked()){
            chkPares.setEnabled(true);
        }
    }
}