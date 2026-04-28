package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Busqueda {
    public int binaria(Persona[] personas, int edadBuscada) {
        int inicio = 0, fin = personas.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            // Como Persona no es un int, comparamos contra un objeto temporal
            if (personas[medio].compareTo(new Persona("", edadBuscada)) == 0) return medio;
            if (personas[medio].compareTo(new Persona("", edadBuscada)) < 0) inicio = medio + 1;
            else fin = medio - 1;
        }
        return -1; // No se encontró
    }
}