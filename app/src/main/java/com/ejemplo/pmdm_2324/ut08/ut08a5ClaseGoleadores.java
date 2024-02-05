package com.ejemplo.pmdm_2324.ut08;

import com.ejemplo.pmdm_2324.ut06.u6a1Libros;

import java.io.Serializable;
import java.util.ArrayList;

public class ut08a5ClaseGoleadores implements Serializable {
    public static final String CLAVE_GOLEADOR = "CLAVE";
    String nombre, apellido;
    int partidosJugados, goles;

    public ut08a5ClaseGoleadores (String nombre, String apellido, int partidosJugados, int goles){
        this.nombre = nombre;
        this.apellido = apellido;
        this.partidosJugados = partidosJugados;
        this.goles = goles;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public static ArrayList<ut08a5ClaseGoleadores> generador() {
        ArrayList<ut08a5ClaseGoleadores> goleadores = new ArrayList<ut08a5ClaseGoleadores>();
        goleadores.add(new ut08a5ClaseGoleadores("Cristiano", "Ronaldo", 438, 450));
        goleadores.add(new ut08a5ClaseGoleadores("Karim", "Benzema", 648, 354));
        goleadores.add(new ut08a5ClaseGoleadores("Raúl", "Gonzalez", 741, 323));
        goleadores.add(new ut08a5ClaseGoleadores("Alfredo", "Di Stefano", 396, 308));
        goleadores.add(new ut08a5ClaseGoleadores("Carlos", "Santillana", 645, 290));
        goleadores.add(new ut08a5ClaseGoleadores("Ferenc", "Puskás", 262, 242));
        goleadores.add(new ut08a5ClaseGoleadores("Hugo", "Sanchez", 438, 208));
        goleadores.add(new ut08a5ClaseGoleadores("Paco", "Gento", 283, 208));
        goleadores.add(new ut08a5ClaseGoleadores("Jose", "Martinez", 561, 172));
        goleadores.add(new ut08a5ClaseGoleadores("Emilio", "Butrageño", 463, 171));
        return goleadores;
    }

    public String toString () {
        StringBuilder jugadores = new StringBuilder();
        jugadores.append("Nombre: " + nombre + " " + apellido + "\n");
        jugadores.append("Partidos Jugados: " + partidosJugados + "\n");
        jugadores.append("Goles Marcados: " + goles + "\n");
        return jugadores.toString();
    }
}
