import Implementaciones.*;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Ejercicio ReversionString*************");

        ReversionStrings reversor = new ReversionStrings();

        String palabra = "ALGORITMOS";

        System.out.println("Palabra a invertir: " + palabra);

        String resultado = reversor.revertirstring(palabra);

        System.out.println("Invertida: " + resultado);

        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");

        System.out.println("********Ejercicio Historial de Navegacion*************");
        HistorialNavegacion historialNavegacion = new HistorialNavegacion();

        historialNavegacion.InicializarPila();

        historialNavegacion.Apilar("www.fi.uba.ar"); // Cargo las paginas de busqueda
        historialNavegacion.Apilar("www.campus.utn.edu.ar");
        historialNavegacion.Apilar("www.stackoverflow.com");

        System.out.println("URL actual: " + historialNavegacion.Tope());
        System.out.println(historialNavegacion.Atras());
        System.out.println(historialNavegacion.Atras());
        System.out.println(historialNavegacion.Atras()); //Las retiro una a una

        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");

        System.out.println("********Ejercicio Balanceo de Parentesis*************");
        BalanceoParentesis bp = new BalanceoParentesis();

        String expresion = "( ( a + b ) * c )";

        boolean resultadoParentesis = bp.estaBalanceado(expresion);

        if (resultadoParentesis) {
            System.out.println("La expresión está bien balanceada");
        } else {
            System.out.println("La expresión está mal balanceada");
        }

        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");

        System.out.println("********Editor de Codigo*************");

        EditorCodigo historial = new EditorCodigo();
        EditorCodigo rehacer = new EditorCodigo();
        rehacer.InicializarPila();
        historial.InicializarPila();

        String estadoActual = "Hola";

        historial.Apilar(estadoActual);
        estadoActual = "Hola mundo";

        historial.Apilar(estadoActual);
        estadoActual = "Hola mundo!";

        estadoActual = historial.Tope();
        historial.Desapilar();

        rehacer.Apilar(historial.Tope());
        estadoActual = historial.Tope();
        historial.Desapilar();

        historial.Apilar(estadoActual);

        estadoActual = rehacer.Tope();
        rehacer.Desapilar();

        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");

        System.out.println("********PilaLlamadas*************");

        PilaLlamadas pilasuma = new PilaLlamadas();
        System.out.println("la suma de todo es " + PilaLlamadas.Sumar(pilasuma));
        pilasuma.InicializarPila();
        pilasuma.Apilar(10);
        pilasuma.Apilar(20);
        pilasuma.Apilar(30);


        System.out.println("el promedio es " +  PilaLlamadas.CalcularPormedio(pilasuma));
    }
}