package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.Nodo;

public class PilaDinamica<T extends Comparable<T>> extends EstructuraBase<T> {
    private Nodo<T> tope;

    @Override
    public void agregar(T elemento) { // Este es el PUSH
        Nodo<T> nuevo = new Nodo<>(elemento);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public T pop() {
        if (tope == null) return null;
        T dato = tope.dato;
        tope = tope.siguiente;
        tamanio--;
        return dato;
    }

    @Override
    public void mostrarDatos() {
        Nodo<T> temp = tope;
        System.out.println("=== PILA DINÁMICA ===");
        while (temp != null) {
            System.out.println("| " + temp.dato + " |");
            temp = temp.siguiente;
        }
    }

    @Override public void limpiar() { tope = null; tamanio = 0; }
    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) {}
}