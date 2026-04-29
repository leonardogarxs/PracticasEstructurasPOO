package mx.ipn.upiicsa.practicas;

import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.NodoArbol;
import java.util.Stack;

public class ArbolBinario<T extends Comparable<T>> extends EstructuraBase<T> {
    private NodoArbol<T> raiz;

    @Override
    public void agregar(T elemento) {
        NodoArbol<T> nuevo = new NodoArbol<>(elemento);
        if (raiz == null) {
            raiz = nuevo;
            tamanio++;
            return;
        }

        NodoArbol<T> actual = raiz;
        NodoArbol<T> padre = null;

        while (actual != null) {
            padre = actual;
            if (elemento.compareTo(actual.dato) < 0) {
                actual = actual.izquierdo;
            } else if (elemento.compareTo(actual.dato) > 0) {
                actual = actual.derecho;
            } else {
                return; // Valor duplicado, no se agrega
            }
        }

        if (elemento.compareTo(padre.dato) < 0) {
            padre.izquierdo = nuevo;
        } else {
            padre.derecho = nuevo;
        }
        tamanio++;
    }

    public boolean buscar(T elemento) {
        NodoArbol<T> actual = raiz;
        while (actual != null) {
            if (elemento.compareTo(actual.dato) == 0) return true;
            actual = (elemento.compareTo(actual.dato) < 0) ? actual.izquierdo : actual.derecho;
        }
        return false;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(">>> RECORRIDO IN-ORDER (ITERATIVO) <<<");
        if (raiz == null) return;

        Stack<NodoArbol<T>> pila = new Stack<>();
        NodoArbol<T> actual = raiz;

        while (actual != null || !pila.isEmpty()) {
            while (actual != null) {
                pila.push(actual);
                actual = actual.izquierdo;
            }
            actual = pila.pop();
            System.out.print("[" + actual.dato + "] ");
            actual = actual.derecho;
        }
        System.out.println("\nTotal de nodos: " + tamanio);
    }

    @Override public void limpiar() { raiz = null; tamanio = 0; }
    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) { for(T i : arreglo) agregar(i); }
}