import Implementacion.PilaDinamica;
import Implementacion.PilaEstatica;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {

        PilaTDA pilaest = new PilaEstatica();
        PilaTDA auxmostrar = new PilaDinamica();
        PilaTDA pilaaux = new PilaEstatica();
        PilaTDA piladin = new PilaDinamica();

        pilaest.InicializarPila();
        pilaaux.InicializarPila();
        piladin.InicializarPila();
        auxmostrar.InicializarPila();


        pilaest.Apilar(10);
        pilaest.Apilar(20);
        pilaest.Apilar(30);

        while (!pilaest.PilaVacia()){
            pilaaux.Apilar(pilaest.Tope());
            pilaest.Desapilar();
        }
        while (!pilaaux.PilaVacia()){
            piladin.Apilar(pilaaux.Tope());
            pilaaux.Desapilar();
        }


        while (!piladin.PilaVacia()){
            System.out.println(piladin.Tope());
            piladin.Desapilar();
        }



    }
}