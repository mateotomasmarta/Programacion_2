package implementaciones;
import interfaces.Pila;

//SI O SI siempre necesito un FOR
public class PilaEstatica2 implements Pila {

    private int[] datos;
    private int cantidad;
    private static final int MAX = 100;

    @Override //objetivo inicializar la pila
    public void inicializarPila() {
        datos = new int[MAX]; //aca inicializamos el arreglo
        cantidad = 0; //definimos la cantidad inicial
    }


    //entender que lo nuevo siempre esta adelante (despues de la posicion 0 que es cantidad) y lo viejo se va corriendo a la derecha
    //este metodo corre todos los elementos una posicion a la derecha
    @Override
    public void apilar(int x) {
        if (cantidad < MAX) {

            // 1. correr elementos
            for (int i = cantidad; i > 0; i--) { // i empieza valiendo cantidad // i > 0 el ciclo sigue mientras i sea mayor a 0 //i-- para saber cuando dejar de cprrer
                datos[i]= datos[i - 1]; //mueve todos los elementos a la derecha
            }
            // 2. insertar en 0
            datos[0]=x; //metes el nuevo valor en la posicion cero pensa que x es un elemento
            // 3. aumentar cantidad
            cantidad++;
        }
    }


    //este metodo elimina el elemento que esta en el tope
    @Override
    public void desapilar() {
        if (!pilaVacia()) { //chequear que la pila nmo esta vacia

            for (int i = 0; i < cantidad - 1; i++) {  // i empieza valiendo cantidad // i < cantidad el ciclo sigue mientras i sea menor a cantidad //i++ para saber cuando dejar de cprrer
                datos[i] = datos[i + 1]; //copio el elemento de la derecha hacia la izquierda sobreescribiendo logicamente el primer elemento de la izquierda
            }

            cantidad--;
        }
    }

    @Override
    public int tope() {
        return datos[0]; //el tope siempre sera el primer elemento
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }
}

// ================================
// CUESTIONARIO PILA ESTATICA
// ESTRATEGIA 2
// ================================

// 1. ¿Dónde está el tope?
// El tope está en datos[0].

// 2. ¿Qué representa cantidad?
// Representa la cantidad de elementos actuales de la pila.

// 3. ¿Por qué apilar es costoso?
// Porque para insertar en la posición 0 hay que desplazar
// todos los elementos una posición a la derecha.

// 4. Si datos = [10, 20, 30, _, _] y cantidad = 3,
//    después de apilar(5), ¿cómo queda?
// [5, 10, 20, 30, _] y cantidad = 4

// 5. Si luego hago desapilar(), ¿cómo queda?
// [10, 20, 30, 30, _] y cantidad = 3
// El tope pasa a ser 10.

// 6. ¿Qué pasa si en apilar recorro de izquierda a derecha?
// Se pisan los valores antes de copiarlos y se pierde información.

// 7. ¿Qué pasa si en desapilar solo hago cantidad--?
// El tope real no se elimina, porque datos[0] sigue teniendo
// el mismo valor. En esta estrategia hay que desplazar a la izquierda.

// 8. ¿Qué operación es más costosa?
// Tanto apilar como desapilar son costosas,
// porque ambas requieren desplazar elementos.

// 9. ¿Qué pasa si la pila está vacía y llamo desapilar()?
// No debe hacer nada.
// Se controla con if (!pilaVacia()).