package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.EstructuraBase;

public class Pila<T extends Comparable<T>> extends EstructuraBase<T> {
    private T[] elementos;
    private int tope;

    @SuppressWarnings("unchecked")
    public Pila(int capacidad) {
        elementos = (T[]) new Comparable[capacidad];
        tope = -1;
    }

    @Override
    public void agregar(T elemento) {
        if (tope < elementos.length - 1) {
            elementos[++tope] = elemento;
            tamanio++;
        }
    }

    public T pop() {
        if (estaVacia()) return null;
        tamanio--;
        return elementos[tope--];
    }

    @Override
    public void mostrarDatos() {
        for (int i = tope; i >= 0; i--) System.out.println("| " + elementos[i] + " |");
        System.out.println(" --- ");
    }

    @Override public void limpiar() { tope = -1; tamanio = 0; }
    @Override public T[] aArreglo() { return elementos; }
    @Override public void desdeArreglo(T[] arreglo) { this.elementos = arreglo; }
}