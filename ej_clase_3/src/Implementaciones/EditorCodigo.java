package Implementaciones;
import Interfaces.PilaTDA;

public class EditorCodigo implements PilaTDA<String> {

    private static final int MAX = 100;
    private String[] pila;
    private int cantidad = 0;

    @Override
    public void InicializarPila() {
        pila = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String c) {
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
    public String Tope() {
        return pila[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}
