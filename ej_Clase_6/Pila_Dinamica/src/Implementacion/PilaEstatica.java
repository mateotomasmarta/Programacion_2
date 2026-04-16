package Implementacion;

import Interfaces.PilaTDA;

//datos a tener en cuenta
//--> tengo una variable x fuera que me controla la cantidad x ende dentro del array no guardo la cantidad sino solo los elementos

public class PilaEstatica implements PilaTDA {
    private int[] datos; //aca damos comienzo al array
    private int cantidad; // seria el auxiliar
    private static final int MAX = 100; //aca indicamos el maximo de la pila

    @Override //objetivo inicializar la pila
    public void InicializarPila() {
        datos = new int[MAX]; //aca inicializamos el arreglo
        cantidad = 0; //definimos la cantidad inicial
    }

    @Override // objetivo  agregar un elemento arriba de la pila
    public void Apilar(int x) {
        datos[cantidad] = x; //guardo el elemento en la posicion que me marca cantidad
        cantidad++; //incremento la cantidad
    }

    @Override
    public int Tope() {
        return datos[cantidad -1]; //como la cantidad siempre va a ir uno mas que los index entonces le resto 1 y devuelve el ultimo elemento agregado
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) { //aca lo que nos dice es que si lo que hay dentros es diferente a pilavacia
            cantidad--; // sacale uno cantidad y al contador como lo bajo el ultimo elemento deja de existir logicamente osea lo reemplaza el numero siguiente
        }
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }

    /*
    public void pasarPila(PilaTDA origen, PilaTDA destino){
        PilaTDA aux = new PilaEstatica();
        aux.InicializarPila();

        while (!origen.PilaVacia()) {
            aux.Apilar(origen.Tope());
            origen.Desapilar();
        }

        while (!aux.PilaVacia()) {
            destino.Apilar(aux.Tope());
            aux.Desapilar();
        }
    } */
}

