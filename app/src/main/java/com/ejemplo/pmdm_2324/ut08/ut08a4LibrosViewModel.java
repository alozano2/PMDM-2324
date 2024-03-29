package com.ejemplo.pmdm_2324.ut08;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ejemplo.pmdm_2324.ut06.u6a1Libros;

import java.util.ArrayList;

public class ut08a4LibrosViewModel extends ViewModel {
    public static final double DELAY = 500;
    private MutableLiveData<ArrayList<u6a1Libros>> libros;

    public LiveData<ArrayList<u6a1Libros>> getLibros() {
        if(libros == null){
            libros = new MutableLiveData<ArrayList<u6a1Libros>>();
        }
        return libros;
    }

    public void generoLibros() {
        new Thread(() -> {
            try{
                Thread.sleep((long)((Math.random() * DELAY) + DELAY));
                ArrayList<u6a1Libros> listaLibros = u6a1Libros.generador();
                libros.postValue(listaLibros);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        ).start();
    }
}
