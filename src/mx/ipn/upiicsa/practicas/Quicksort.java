package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;
import java.util.Stack;

public class Quicksort {
    public void ordenar(Persona[] arr) {
        if (arr == null || arr.length == 0) return;

        // Pila para guardar los índices de las particiones (simula la recursión)
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int low = range[0];
            int high = range[1];

            if (low < high) {
                int p = particion(arr, low, high);
                // Metemos los rangos de las sub-listas a la pila
                stack.push(new int[]{low, p - 1});
                stack.push(new int[]{p + 1, high});
            }
        }
    }

    private int particion(Persona[] arr, int low, int high) {
        Persona pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                Persona temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Persona temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}