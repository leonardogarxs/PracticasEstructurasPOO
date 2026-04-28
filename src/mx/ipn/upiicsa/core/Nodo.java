package mx.ipn.upiicsa.core;

/**
 * El Nodo es la unidad básica de las estructuras dinámicas.
 * Contiene el dato y una referencia al siguiente nodo.
 */
public class Nodo<T> {
    public T dato;
    public Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}