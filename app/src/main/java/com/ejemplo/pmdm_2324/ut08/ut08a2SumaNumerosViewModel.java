package com.ejemplo.pmdm_2324.ut08;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ut08a2SumaNumerosViewModel extends ViewModel {

    public static final double DELAY = 500;
    private MutableLiveData<Integer> sumaNumeros;

    public LiveData<Integer> getNumero() {
        if(sumaNumeros == null){
            sumaNumeros = new MutableLiveData<Integer>();
        }

        return sumaNumeros;
    }

    public void suma(int num1, int num2){
        new Thread(
                () -> {
                        try{
                            Thread.sleep((long)((Math.random() * DELAY) + DELAY));
                            int numeroSumado = num1 + num2;
                            sumaNumeros.postValue(numeroSumado);
                        }catch(InterruptedException e){
                            throw new RuntimeException(e);
                        }
                    }
                ).start();
    }
}
