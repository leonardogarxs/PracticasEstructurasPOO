package mx.ipn.upiicsa.core;

public abstract class EstructuraBase<T extends Comparable<T>> implements IEstructuraDatos<T> {
    protected int tamanio;

    public EstructuraBase() {
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }

    // Este método lo llenaremos cuando hagamos Pilas y Colas
    public abstract void limpiar();
}