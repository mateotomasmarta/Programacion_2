package Implementaciones;

import Interfaces.PilaTDA;


public class HistorialNavegacion implements PilaTDA<String> { //cuando hay character se la puedo cambiar al tipo ue yo queira
    private static final int Max = 100;
    private int cantidad = 0;
    private String [] urls; //almaceno las urls



    @Override
    public void InicializarPila() {
        urls = new String[Max];
    }

    @Override
    public void Apilar(String valorAApilar) {
        if (cantidad < Max) {
            urls[cantidad] = valorAApilar;
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        return urls[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }

    public String Atras(){
        if (cantidad > 1) {
            Desapilar();
            return "Se volvio a la pagina " + Tope();
        }else {
            return "No hay urls anteriores";
        }
    }
}

