package com.ejemplo.pmdm_2324.ut08;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ut08a1NumeroAleatorioViewModel extends ViewModel {
    public static final double DELAY = 500;
    public static final double MAX_NUM= 1000;
    private MutableLiveData<Integer> misDatos;
    public LiveData<Integer> getNumero() {
        if(misDatos == null){
            misDatos = new MutableLiveData<Integer>();
            cargaNumero();
        }

        return misDatos;
    }

    public void cargaNumero() {
        //Metemos la magia de los Threads
        new Thread(
                () ->{
                    try{
                        Thread.sleep((long)((Math.random() * DELAY) + DELAY));
                        int i = (int) (Math.random() * MAX_NUM);
                        misDatos.postValue(i);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
        ).start();

    }

}
