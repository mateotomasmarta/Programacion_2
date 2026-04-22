
package Implementaciones;
import Interfaces.PilaTDA;

public class BalanceoParentesis implements PilaTDA<String> {

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

    public boolean estaBalanceado(String expresion) {

        InicializarPila();

        for (int i = 0; i < expresion.length(); i++) { //esto recorre caracter por caracter
            char c = expresion.charAt(i); //obtiene caracter por caracter o lo guarda y su valor se va actualizando cada vez que recorre

            if (c == '(') {
                Apilar("("); //abrir un parentesis
            }

            if (c == ')') {
                if (PilaVacia()) {
                    return false;
                } else {
                    Desapilar(); //cerrar un parentesis
                }
            }
        }

        return PilaVacia();
    }
}