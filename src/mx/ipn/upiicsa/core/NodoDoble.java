package mx.ipn.upiicsa.core;

public class NodoDoble<T> {
    public T dato;
    public NodoDoble<T> siguiente;
    public NodoDoble<T> anterior; // El nuevo gancho para la reversa

    public NodoDoble(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}