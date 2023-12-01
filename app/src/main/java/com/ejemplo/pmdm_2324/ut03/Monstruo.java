package com.ejemplo.pmdm_2324.ut03;

import android.text.SpannableStringBuilder;

import java.io.Serializable;
import java.util.Random;

public class Monstruo implements Serializable {
    String nombre, color;
    public static final char BARRA_INCLINADA = 92;
    public static final int NUMERO_DIVISION = 2;
    int numeroManos, numeroPiernas;
    public Monstruo (String nombre, int numeroManos, int numeroPiernas, String color){
        this.nombre = nombre;
        this.color = color;
        this.numeroManos = numeroManos;
        this.numeroPiernas = numeroPiernas;
        Random random = new Random();
        numeroManos = random.nextInt(5) + 1;
        numeroPiernas = random.nextInt(5) + 1;
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
                if(i == 0){
                    cadena.append(" ");
                }
                cadena.append(BARRA_INCLINADA);
            }else{
                if(i == 0){
                    cadena.append(" ");
                }
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
}
