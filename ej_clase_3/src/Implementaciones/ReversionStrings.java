package Implementaciones;
import Interfaces.PilaTDA;

public class ReversionStrings implements PilaTDA<Character> {

    private static final int MAX = 100;
    private char[] pila;
    private int cantidad = 0;

    @Override
    public void InicializarPila() {
        pila = new char[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(Character c) {
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
    public Character Tope() {
        return pila[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }

    public String revertirstring(String palabra) {

        InicializarPila();

        // Apilar
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            Apilar(c);
        }

        // Desapilar
        String invertido = "";

        while (!PilaVacia()) {
            invertido += Tope();
            Desapilar();
        }

        return invertido;
    }
}