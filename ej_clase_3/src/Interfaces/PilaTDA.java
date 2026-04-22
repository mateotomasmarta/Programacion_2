package Interfaces;

public interface PilaTDA<T> {

    void InicializarPila();

    void Apilar(T valorAApilar);

    void Desapilar();

    T Tope();

    boolean PilaVacia();
}