package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Seleccion {
    public void ordenar(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].compareTo(personas[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            Persona temp = personas[minIdx];
            personas[minIdx] = personas[i];
            personas[i] = temp;
        }
    }
}