package com.ejemplo.pmdm_2324.ut08;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ejemplo.pmdm_2324.ut06.u6a1Libros;

import java.util.ArrayList;

public class ut08a5ViewModelGoleadores extends ViewModel {
    public static final double DELAY = 500;
    private MutableLiveData<ArrayList<ut08a5ClaseGoleadores>> goleadores;

    public LiveData<ArrayList<ut08a5ClaseGoleadores>> getGoleadores() {
        if(goleadores == null){
            goleadores = new MutableLiveData<ArrayList<ut08a5ClaseGoleadores>>();
        }
        return goleadores;
    }

    public void generoGoleadores() {
        new Thread(() -> {
            try{
                Thread.sleep((long)((Math.random() * DELAY) + DELAY));
                ArrayList<ut08a5ClaseGoleadores> listaGoleadores = ut08a5ClaseGoleadores.generador();
                goleadores.postValue(listaGoleadores);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        ).start();
    }
}
