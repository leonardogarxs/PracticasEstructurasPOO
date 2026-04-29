package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Heapsort {

    public void ordenar(Persona[] arr) {
        int n = arr.length;

        // 1. Construir el montículo inicial (reordenar el arreglo)
        // Se hace de forma iterativa desde el último nodo padre
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyIterativo(arr, n, i);
        }

        // 2. Extraer elementos del montículo uno a uno
        for (int i = n - 1; i > 0; i--) {
            // Movemos la raíz actual (el más grande) al final del arreglo
            Persona temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Volvemos a ajustar el montículo reducido
            heapifyIterativo(arr, i, 0);
        }
    }

    // Ajusta el subárbol con raíz en el índice i (Versión Iterativa)
    private void heapifyIterativo(Persona[] arr, int n, int i) {
        int mayor = i;
        while (true) {
            int izquierdo = 2 * mayor + 1;
            int derecho = 2 * mayor + 2;
            int actual = mayor;

            if (izquierdo < n && arr[izquierdo].compareTo(arr[actual]) > 0) {
                actual = izquierdo;
            }
            if (derecho < n && arr[derecho].compareTo(arr[actual]) > 0) {
                actual = derecho;
            }

            if (actual != mayor) {
                // Intercambio (Swap)
                Persona temp = arr[mayor];
                arr[mayor] = arr[actual];
                arr[actual] = temp;
                
                // Continuamos hacia abajo en el árbol
                mayor = actual;
            } else {
                break; // El subárbol ya está en orden
            }
        }
    }
}