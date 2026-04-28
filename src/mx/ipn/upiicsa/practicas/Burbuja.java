package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Burbuja {
    public void ordenar(Persona[] personas) {
        int n = personas.length;
        // Algoritmo de la burbuja clásico
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparamos usando el método compareTo que pusimos en Persona
                if (personas[j].compareTo(personas[j + 1]) > 0) {
                    // Intercambio (swap)
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public void mostrar(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println(" - " + p);
        }
    }
}