package Implementaciones;
import Interfaces.PilaTDA;

public class PilaLlamadas implements PilaTDA<Integer>{
    private static final int MAX = 100;
    private Integer[] pila;
    private int cantidad = 0;

    @Override
    public void InicializarPila() {
        pila = new Integer[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(Integer c) {
        if (cantidad < MAX) {
            pila[cantidad] = c;
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
    public Integer Tope() {
        return pila[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }

    public static int Sumar (PilaTDA<Integer> pila) {
        int suma = 0;

        while (!pila.PilaVacia()){
            suma += pila.Tope(); //el tope me marca siempre la posicion inicial
            pila.Desapilar(); // desapilo para pasar por todos
        }
        return suma;

    }

    public static int CalcularPormedio(PilaTDA<Integer> pila){
        int suma = 0;
        int cantidad = 0;

        while (!pila.PilaVacia()){
            suma += pila.Tope();
            cantidad++;
            pila.Desapilar();
        }

        return suma/cantidad;
    }


}
