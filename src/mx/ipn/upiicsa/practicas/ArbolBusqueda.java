package mx.ipn.upiicsa.practicas;

import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.NodoArbol;
import java.util.LinkedList;
import java.util.Queue;

public class ArbolBusqueda<T extends Comparable<T>> extends EstructuraBase<T> {
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
        NodoArbol<T> padre;
        while (true) {
            padre = actual;
            if (elemento.compareTo(actual.dato) < 0) {
                actual = actual.izquierdo;
                if (actual == null) {
                    padre.izquierdo = nuevo;
                    break;
                }
            } else {
                actual = actual.derecho;
                if (actual == null) {
                    padre.derecho = nuevo;
                    break;
                }
            }
        }
        tamanio++;
    }

    // LÓGICA DE BÚSQUEDA ITERATIVA (PUNTO CLAVE DE LA PRÁCTICA 10)
    public T buscar(T objetivo) {
        NodoArbol<T> actual = raiz;
        while (actual != null) {
            int comparacion = objetivo.compareTo(actual.dato);
            if (comparacion == 0) return actual.dato; // Encontrado
            actual = (comparacion < 0) ? actual.izquierdo : actual.derecho;
        }
        return null; // No existe
    }

    // RECORRIDO POR NIVELES (Amplitud - Iterativo con Cola)
    @Override
    public void mostrarDatos() {
        if (raiz == null) return;
        System.out.println(">>> RECORRIDO POR NIVELES (BFS) <<<");
        Queue<NodoArbol<T>> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            NodoArbol<T> temp = cola.poll();
            System.out.print("[" + temp.dato + "] ");
            
            if (temp.izquierdo != null) cola.add(temp.izquierdo);
            if (temp.derecho != null) cola.add(temp.derecho);
        }
        System.out.println("\nTotal de nodos: " + tamanio);
    }

    @Override public void limpiar() { raiz = null; tamanio = 0; }
    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) { for(T i : arreglo) agregar(i); }
}