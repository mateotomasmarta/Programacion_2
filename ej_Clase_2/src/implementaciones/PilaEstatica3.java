package implementaciones;
import interfaces.Pila;

//MEJOR DE TODAS
public class PilaEstatica3 implements Pila {

    //en esta estrategia no ponemos cantidad ya q este vive adentro del arreglo
    private int[] datos;
    private static final int MAX = 100;

    @Override
    public void inicializarPila() {
        datos = new int[MAX];
        datos[0] = 0; //aca guardamos que la pila esta vacia
    }

    @Override
    public void apilar(int x) {
        //datos[0] es la cantidad
        //datos[1] hasta datos[datos[0]] elementos validos
        if (datos[0] < MAX - 1) { //aca nos dice que la primer posicion (que es nuestra cantidad) tiene que ser menor al maximo menos 1 osea que hay disponible 99 elementos
            datos[0]++; //aca almaceno la cantidad
            datos[datos[0]] = x; //guarda el nuevo elemento en la posicion que coincide con la cantidad
        }
    }

    @Override
    public void desapilar() {
        //logicamente el dato deja de existir pero fisicamente sigue presente
        //en el proximo apilar se sobreescribira la posicion
        if (!pilaVacia()) {
            datos[0]--; //elimina una cantidad
        }
    }

    @Override
    public int tope() {
        return datos[datos[0]];
    }

    @Override
    public boolean pilaVacia() {
        return datos[0] == 0;
    }
}