package com.ejemplo.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

public class ut08a2SumaNumeros extends AppCompatActivity {
    EditText txtNum1, txtNum2;
    TextView tvsumaNums, tvChar;
    Button btnSumar, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut08a2_suma_numeros);

        txtNum1 = findViewById(R.id.ut08a2ptxtNum1);
        txtNum2 = findViewById(R.id.ut08a2ptxtNum2);
        btnSumar = findViewById(R.id.ut08a2btnSumar);
        tvsumaNums = findViewById(R.id.ut08a2tvMuestraNumeros);
        tvChar = findViewById(R.id.ut08a2tvChar);
        btnVolver = findViewById(R.id.ut08a2btnVolver);

        ut08a2SumaNumerosViewModel vm = new ViewModelProvider(this).get(ut08a2SumaNumerosViewModel.class);

        vm.getNumero().observe(this, integer -> {
            tvsumaNums.setText("" + integer);
            tvsumaNums.setVisibility(View.VISIBLE);
            txtNum1.setVisibility(View.INVISIBLE);
            txtNum2.setVisibility(View.INVISIBLE);
            tvChar.setVisibility(View.INVISIBLE);
            btnSumar.setEnabled(true);
            btnVolver.setVisibility(View.VISIBLE);
        });

        btnSumar.setOnClickListener((v) -> {
            //tvsumaNums.setVisibility(View.INVISIBLE);
            btnSumar.setEnabled(true);
            int valorTxtNum1 = Integer.parseInt(txtNum1.getText().toString());
            int valorTxtNum2 = Integer.parseInt(txtNum2.getText().toString());
            vm.suma(valorTxtNum1, valorTxtNum2);
        });

        btnVolver.setOnClickListener((v) -> {
            tvsumaNums.setVisibility(View.INVISIBLE);
            txtNum1.setVisibility(View.VISIBLE);
            txtNum2.setVisibility(View.VISIBLE);
            tvChar.setVisibility(View.VISIBLE);
            //btnSumar.setEnabled(false);
            btnVolver.setVisibility(View.INVISIBLE);
        });
    }
}