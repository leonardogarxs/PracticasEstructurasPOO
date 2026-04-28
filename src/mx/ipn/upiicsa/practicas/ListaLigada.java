package mx.ipn.upiicsa.practicas;

import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.Nodo;

public class ListaLigada<T extends Comparable<T>> extends EstructuraBase<T> {
    private Nodo<T> cabeza;

    public ListaLigada() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    @Override
    public void agregar(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> temp = cabeza;
            // Recorrido iterativo para llegar al final del tren
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
        tamanio++;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(">>> LISTA LIGADA (DINÁMICA) <<<");
        Nodo<T> temp = cabeza;
        while (temp != null) {
            System.out.print("[" + temp.dato + "] -> ");
            temp = temp.siguiente;
        }
        System.out.println("NULL");
        System.out.println("Elementos totales: " + tamanio + "\n");
    }

    @Override
    public void limpiar() {
        cabeza = null;
        tamanio = 0;
    }

    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) {
        for(T item : arreglo) agregar(item);
    }
}