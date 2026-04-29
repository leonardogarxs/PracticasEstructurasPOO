package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.EstructuraBase;
import mx.ipn.upiicsa.core.NodoDoble;

public class ListaCircularDoble<T extends Comparable<T>> extends EstructuraBase<T> {
    private NodoDoble<T> inicio;

    @Override
    public void agregar(T elemento) {
        NodoDoble<T> nuevo = new NodoDoble<>(elemento);
        if (inicio == null) {
            inicio = nuevo;
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
        } else {
            NodoDoble<T> ultimo = inicio.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
        }
        tamanio++;
    }

    @Override
    public void mostrarDatos() {
        if (inicio == null) return;
        NodoDoble<T> temp = inicio;
        System.out.println(">>> LISTA CIRCULAR DOBLE <<<");
        do {
            System.out.print("[" + temp.dato + "] <-> ");
            temp = temp.siguiente;
        } while (temp != inicio);
        System.out.println("(Círculo)");
    }

    @Override public void limpiar() { inicio = null; tamanio = 0; }
    @Override public T[] aArreglo() { return null; }
    @Override public void desdeArreglo(T[] arreglo) {}
}