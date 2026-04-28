package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.EstructuraBase;

public class Cola<T extends Comparable<T>> extends EstructuraBase<T> {
    private T[] elementos;
    private int frente;
    private int fin;

    @SuppressWarnings("unchecked")
    public Cola(int capacidad) {
        elementos = (T[]) new Comparable[capacidad];
        frente = 0;
        fin = -1;
    }

    @Override
    public void agregar(T elemento) {
        if (fin < elementos.length - 1) {
            elementos[++fin] = elemento;
            tamanio++;
        }
    }

    public T atender() {
        if (estaVacia()) return null;
        T aux = elementos[frente++];
        tamanio--;
        return aux;
    }

    @Override
    public void mostrarDatos() {
        System.out.print("FRENTE -> ");
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + elementos[i] + "] ");
        }
        System.out.println("<- FIN");
    }

    @Override public void limpiar() { frente = 0; fin = -1; tamanio = 0; }
    @Override public T[] aArreglo() { return elementos; }
    @Override public void desdeArreglo(T[] arreglo) { this.elementos = arreglo; }
}