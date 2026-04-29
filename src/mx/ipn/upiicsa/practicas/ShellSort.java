package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class ShellSort {
    public void ordenar(Persona[] arr) {
        int n = arr.length;
        
        // Empezamos con un intervalo (gap) grande y lo reducimos
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Hacemos una inserción para este tamaño de intervalo
            for (int i = gap; i < n; i += 1) {
                Persona temp = arr[i];
                int j;
                // Comparamos usando nuestro compareTo de la clase Persona
                for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}