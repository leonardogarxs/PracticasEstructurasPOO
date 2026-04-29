package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.Nodo;

public class ColaDinamica<T extends Comparable<T>> extends EstructuraBase<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;

    @Override
    public void agregar(T elemento) { // Este es el ENQUEUE
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }

    public T atender() { // Este es el DEQUEUE
        if (estaVacia()) return null;
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        tamanio--;
        return dato;
    }

    @Override
    public void mostrarDatos() {
        Nodo<T> temp = frente;
        System.out.print("FRENTE -> ");
        while (temp != null) {
            System.out.print("[" + temp.dato + "] ");
            temp = temp.siguiente;
        }
        System.out.println("<- FIN");
    }

    @Override public void limpiar() { frente = null; fin = null; tamanio = 0; }
    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) { for(T i : arreglo) agregar(i); }
}