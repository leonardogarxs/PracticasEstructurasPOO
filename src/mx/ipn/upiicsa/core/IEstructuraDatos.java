package mx.ipn.upiicsa.core;

/**
 * Interfaz base para todas las prácticas de Estructuras de Datos.
 */
public interface IEstructuraDatos<T extends Comparable<T>> {
    void agregar(T elemento);
    void mostrarDatos();
    T[] aArreglo(); 
    void desdeArreglo(T[] arreglo);
}