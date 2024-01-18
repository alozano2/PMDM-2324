package com.ejemplo.pmdm_2324.ut05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class u5a2DulceNavidad {

    public String nombre;
    public String frutosSecos;
    public String caloria;
    private static final double MAX_CALORIAS = 200;
    private static final double MIN_CALORIAS = 5;
    public static final int DULCES_INICIALES = 10;
    private static ArrayList<String> dulces = new ArrayList<String>(Arrays.asList(new String[]{"Ferrero Rocher", "Polvorones", "Mazapán", "Turrón", "Roscón de Reyes", "Papá Noel de Chocolate", "Trufas", "Castañas Glaseadas"}));
    private static ArrayList<String> opciones = new ArrayList<String>(Arrays.asList(new String[]{"Frutos secos: Sí", "Frutos secos: No"}));
    private static ArrayList<String> calorias = new ArrayList<String>(Arrays.asList(new String[]{"100", "150", "80", "200", "120", "90"}));



    public static u5a2DulceNavidad generarDulces(){
        Collections.shuffle(dulces);
        Collections.shuffle(opciones);
        Collections.shuffle(calorias);
        u5a2DulceNavidad p = new u5a2DulceNavidad();
        p.nombre = dulces.get(0);
        p.frutosSecos = opciones.get(0);
        p.caloria = calorias.get(0);
        return p;
    }
    public static u5a2DulceNavidad[] generarDulces(int n) {
        u5a2DulceNavidad[] dulces = new u5a2DulceNavidad[n];
        for(int i = 0; i < n; i++){
            dulces[i] = u5a2DulceNavidad.generarDulces();
        }
        return dulces;
    }
}
