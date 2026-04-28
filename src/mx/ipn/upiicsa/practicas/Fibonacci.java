package mx.ipn.upiicsa.practicas;

/**
 * Clase que calcula la serie de Fibonacci de forma iterativa.
 * Cumple con la regla de NO usar recursividad.
 */
public class Fibonacci {

    public void ejecutar(int n) {
        System.out.println("==========================================");
        System.out.println("   SERIE DE FIBONACCI (MÉTODO ITERATIVO)  ");
        System.out.println("==========================================");
        
        if (n <= 0) {
            System.out.println("Error: Ingresa un número mayor a 0.");
            return;
        }

        long a = 0, b = 1; 
        System.out.print("Serie para " + n + " términos: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? ", " : ""));
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println("\n------------------------------------------\n");
    }
}