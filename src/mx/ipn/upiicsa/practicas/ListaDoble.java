package mx.ipn.upiicsa.practicas;

import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.NodoDoble;

public class ListaDoble<T extends Comparable<T>> extends EstructuraBase<T> {
    private NodoDoble<T> inicio;
    private NodoDoble<T> fin;

    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
        this.tamanio = 0;
    }

    @Override
    public void agregar(T elemento) {
        NodoDoble<T> nuevo = new NodoDoble<>(elemento);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            // El nuevo se conecta al final actual
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo; // El nuevo ahora es el fin
        }
        tamanio++;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(">>> LISTA DOBLE (ADELANTE) <<<");
        NodoDoble<T> temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.dato + "] <-> ");
            temp = temp.siguiente;
        }
        System.out.println("NULL");
    }

    public void mostrarReversa() {
        System.out.println("<<< LISTA DOBLE (REVERSA) >>>");
        NodoDoble<T> temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.dato + "] <-> ");
            temp = temp.anterior;
        }
        System.out.println("NULL");
    }

    @Override
    public void limpiar() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }

    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) {
        for(T item : arreglo) agregar(item);
    }
}