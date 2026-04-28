package mx.ipn.upiicsa.practicas;

public class Factorial {

    public void ejecutar(int n) {
        System.out.println("==========================================");
        System.out.println("    CÁLCULO DE FACTORIAL (ITERATIVO)      ");
        System.out.println("==========================================");
        
        if (n < 0) {
            System.out.println("Error: No existe factorial de negativos.");
            return;
        }

        long resultado = 1;
        System.out.print(n + "! = ");
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
            System.out.print(i + (i < n ? " * " : ""));
        }
        
        System.out.println("\nResultado final: " + resultado);
        System.out.println("------------------------------------------\n");
    }
}