package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.Nodo;

public class ListaCircular<T extends Comparable<T>> extends EstructuraBase<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;

    @Override
    public void agregar(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza; // Se apunta a sí mismo
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza; // El último siempre apunta al primero
        }
        tamanio++;
    }

    @Override
    public void mostrarDatos() {
        if (cabeza == null) return;
        System.out.println(">>> LISTA CIRCULAR SIMPLE <<<");
        Nodo<T> temp = cabeza;
        do {
            System.out.print("[" + temp.dato + "] -> ");
            temp = temp.siguiente;
        } while (temp != cabeza); // Condición iterativa circular
        System.out.println("(Vuelve a Inicio)");
    }

    @Override public void limpiar() { cabeza = null; cola = null; tamanio = 0; }
    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) { for(T i : arreglo) agregar(i); }
}