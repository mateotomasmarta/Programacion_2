import interfaces.Pila;
import implementaciones.PilaEstatica1;
import implementaciones.PilaEstatica2;
import implementaciones.PilaEstatica3;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== PRUEBA PILAS =====\n");

        // =========================
        // ESTRATEGIA 1
        // =========================
        System.out.println(">>> Estrategia 1");

        Pila p1 = new PilaEstatica1();
        p1.inicializarPila();

        p1.apilar(10);
        p1.apilar(20);
        p1.apilar(30);

        System.out.println("Tope: " + p1.tope());

        p1.desapilar();

        System.out.println("Tope después de desapilar: " + p1.tope());

        System.out.println();


        // =========================
        // ESTRATEGIA 2
        // =========================
        System.out.println(">>> Estrategia 2");

        Pila p2 = new PilaEstatica2();
        p2.inicializarPila();

        p2.apilar(10);
        p2.apilar(20);
        p2.apilar(30);

        System.out.println("Tope: " + p2.tope());

        p2.desapilar();

        System.out.println("Tope después de desapilar: " + p2.tope());

        System.out.println();


        // =========================
        // ESTRATEGIA 3
        // =========================
        System.out.println(">>> Estrategia 3");

        Pila p3 = new PilaEstatica3();
        p3.inicializarPila();

        p3.apilar(10);
        p3.apilar(20);
        p3.apilar(30);

        System.out.println("Tope: " + p3.tope());

        p3.desapilar();

        System.out.println("Tope después de desapilar: " + p3.tope());
    }
}