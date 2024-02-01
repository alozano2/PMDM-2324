package com.ejemplo.pmdm_2324.ut08;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class ut08a3ParesNonesViewModel extends ViewModel{
    public static final double DELAY = 500;
    private MutableLiveData<String> cadena;
    String cadenaEnvio = "";

    public LiveData<String> getString() {
        if(cadena == null){
            cadena = new MutableLiveData<String>();
        }
        return cadena;
    }

    public void resultadoMaquina(boolean jugadorEligePares, int numero) {
        new Thread(
                () -> {
                    try{
                        Thread.sleep((long)((Math.random() * DELAY) + DELAY));
                        int numeroMaquina = (int) (Math.random() * 5) + 1;
                        int resultado = numeroMaquina + numero;

                        if(esPar(resultado) == true){
                            if(jugadorEligePares == true){
                                cadenaEnvio += "La maquina ha sacado: " + numeroMaquina + "\n";
                                cadenaEnvio += "Gana el jugador 1.";
                            }else{
                                cadenaEnvio +="La maquina ha sacado: " + numeroMaquina + "\n";
                                cadenaEnvio += "Gana la máquina.";
                            }
                        }else{
                            if(jugadorEligePares == true){
                                cadenaEnvio += "La maquina ha sacado: " + numeroMaquina + "\n";
                                cadenaEnvio +="Gana la máquina.";
                            }else{
                                cadenaEnvio += "La maquina ha sacado: " + numeroMaquina + "\n";
                                cadenaEnvio += "Gana el jugador 1.";
                            }
                        }

                        cadena.postValue(cadenaEnvio);
                        cadenaEnvio = "";

                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
                ).start();
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
