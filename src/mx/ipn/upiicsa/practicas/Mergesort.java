package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Mergesort {
    public void ordenar(Persona[] arr) {
        int n = arr.length;
        for (int tam = 1; tam < n; tam = 2 * tam) {
            for (int izq = 0; izq < n - 1; izq += 2 * tam) {
                int mid = Math.min(izq + tam - 1, n - 1);
                int der = Math.min(izq + 2 * tam - 1, n - 1);
                merge(arr, izq, mid, der);
            }
        }
    }

    private void merge(Persona[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        Persona[] L = new Persona[n1];
        Persona[] R = new Persona[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}