package implementaciones;

import interfaces.Pila;

//datos a tener en cuenta
//--> tengo una variable x fuera que me controla la cantidad x ende dentro del array no guardo la cantidad sino solo los elementos

public class PilaEstatica1 implements Pila {
    private int[] datos; //aca damos comienzo al array
    private int cantidad; // seria el auxiliar
    private static final int MAX = 100; //aca indicamos el maximo de la pila

    @Override //objetivo inicializar la pila
    public void inicializarPila() {
        datos = new int[MAX]; //aca inicializamos el arreglo
        cantidad = 0; //definimos la cantidad inicial
    }

    @Override // objetivo  agregar un elemento arriba de la pila
    public void apilar(int x) {
        datos[cantidad] = x; //guardo el elemento en la posicion que me marca cantidad
        cantidad++; //incremento la cantidad
    }

    @Override
    public int tope() {
        return datos[cantidad -1]; //como la cantidad siempre va a ir uno mas que los index entonces le resto 1 y devuelve el ultimo elemento agregado
    }

    @Override
    public void desapilar() {
        if (!pilaVacia()) { //aca lo que nos dice es que si lo que hay dentros es diferente a pilavacia
            cantidad--; // sacale uno cantidad y al contador como lo bajo el ultimo elemento deja de existir logicamente osea lo reemplaza el numero siguiente
        }
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }
}

// ================================
// 🧪 CUESTIONARIO PILAS ESTÁTICAS
// Estrategia 1 (arreglo + cantidad)
// ================================

// -------- NIVEL 1: CONCEPTUAL --------

// 1. ¿Qué representa exactamente la variable "cantidad"?
// Representa la cantidad de elementos en la pila y también la primera posición libre del arreglo.

// 2. ¿Cuál es la diferencia entre:
//    - cantidad
//    - el índice del tope?
// cantidad indica la próxima posición libre.
// el tope está en la posición cantidad - 1.

// 3. ¿Por qué el tope se accede con:
//    datos[cantidad - 1]
//    y no con datos[cantidad]?
// Porque cantidad apunta a la primera posición libre,
// entonces el último elemento cargado está en cantidad - 1.


// -------- NIVEL 2: SIMULACIÓN --------

// Partiendo de:
// cantidad = 0
// datos = [_, _, _, _, _]

// Ejecutar mentalmente:
// apilar(5)
// apilar(8)
// desapilar()
// apilar(3)
// apilar(9)

// 4. ¿Cómo queda el arreglo final?
// [5, 3, 9, _, _]

// 5. ¿Cuánto vale "cantidad"?
// 3

// 6. ¿Qué devuelve tope()?
// 9


// -------- NIVEL 3: ERRORES --------

// 7. ¿Qué pasa si implementás apilar así?
//    cantidad++;
//    datos[cantidad] = x;
// Se incrementa primero cantidad, por lo que se saltea la posición 0.
// El primer elemento se guarda mal y toda la pila queda desfasada.

// 8. ¿Qué pasa si llamás tope() cuando la pila está vacía?
//    ¿Qué tipo de error ocurre?
//    ¿Cómo lo evitarías?
// Ocurre un ArrayIndexOutOfBoundsException porque intenta acceder a datos[-1].
// Se evita verificando si la pila está vacía antes de acceder,
// por ejemplo con if (!pilaVacia()).


// -------- NIVEL 4: DISEÑO --------

// 9. ¿Por qué en desapilar() no hace falta borrar el dato del arreglo?
// Porque la lógica de la pila depende de "cantidad".
// Al disminuir cantidad, el elemento deja de pertenecer a la pila,
// aunque siga físicamente en el arreglo.

// 10. ¿Cómo detectarías que la pila está llena?
// if (cantidad == MAX)


// -------- BONUS (nivel alto) --------

// 11. Si cantidad = MAX, ¿en qué índice está el tope?
// En MAX - 1 (por ejemplo, si MAX = 100, el índice es 99)


// -------- PREGUNTA FINAL --------

// Ejecutar:
// apilar(10)
// apilar(20)
// desapilar()
// desapilar()

// 12. ¿Cuánto vale "cantidad"?
// 0

// 13. ¿Qué pasa si ahora llamás tope()?
// Da error (ArrayIndexOutOfBoundsException) porque intenta acceder a datos[-1]
// ya que la pila está vacía.