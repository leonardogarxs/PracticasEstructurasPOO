package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Insercion {
    public void ordenar(Persona[] personas) {
        int n = personas.length;
        for (int i = 1; i < n; ++i) {
            Persona clave = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].compareTo(clave) > 0) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = clave;
        }
    }
}