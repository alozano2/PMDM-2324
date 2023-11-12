package com.ejemplo.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

import java.io.Serializable;
import java.util.Random;

public class u3a8aFabricarMonstruo extends AppCompatActivity implements Serializable {
    Button btnConstruir;
    private String nombre;
    private int numeroManos, numeroPiernas;
    private int color;
    public static final String CLAVE_MONSTRUO = "CLAVEDELMONS";
    public static final char BARRA_INCLINADA = 92;
    public static final double NUMERO_MAXIMO_CUERPO = 0.8;
    public static final int NUMERO_DIVISION = 2;
    public u3a8aFabricarMonstruo (String nombre, int color){
        this.nombre = nombre;
        this.color = color;
        Random random = new Random();
        numeroManos = random.nextInt(5) + 1;
        numeroPiernas = random.nextInt(5) + 1;
    }

    public u3a8aFabricarMonstruo() {

    }

    public String toString () {
        SpannableStringBuilder cadena = new SpannableStringBuilder();
        cadena.append("Nombre: ").append(nombre).append("\n");
        /*cadena.append("Numero de manos: ").append(numeroManos).append("\n");
        cadena.append("Numero de piernas: ").append(numeroPiernas).append("\n");
        cadena.append("Color: ").append(color).append("\n");*/
        cadena.append("*");
        cadena.append(System.lineSeparator());

        for (int i = 0; i <= numeroManos; i++){
            double resto = (i + 1 % numeroManos);
            if(resto > numeroManos / NUMERO_DIVISION){
                cadena.append(BARRA_INCLINADA);
            }else{
                cadena.append("/");
            }
            if(resto == numeroManos / NUMERO_DIVISION){
                cadena.append("o");
            }
        }

        cadena.append(System.lineSeparator());

        for(int i = 0; i <= numeroPiernas; i++){
            double resto = (i + 1 % numeroPiernas);

            if(resto > numeroPiernas / NUMERO_DIVISION){
                cadena.append(BARRA_INCLINADA);
            }else{
                cadena.append("/");
            }
            if(resto == numeroPiernas / NUMERO_DIVISION){
                cadena.append(" ");
            }
        }

        return cadena.toString();
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3a8a_fabricar_monstruo);

        btnConstruir = findViewById(R.id.u3a8abtnConstruirMonstruo);
        u3a8aFabricarMonstruo monstruo = new u3a8aFabricarMonstruo("Pedro", R.color.green);

        btnConstruir.setOnClickListener(view -> {
            Intent i = new Intent(this, u3a8bFabricarMonstruo.class);
            i.putExtra(u3a8aFabricarMonstruo.CLAVE_MONSTRUO, monstruo);
            startActivity(i);
        });
    }
}