package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P07_bis_ShellSort {
    public static void main(String[] args) {
        ShellSort ss = new ShellSort();
        
        // Lista desordenada para la prueba
        Persona[] lista = {
            new Persona("Raquel", 30),
            new Persona("Leonardo", 23),
            new Persona("Alexa", 25),
            new Persona("Sosa", 19),
            new Persona("Regis", 21)
        };

        System.out.println("=== ORDENAMIENTO SHELL (D2_P07_BIS) ===");
        System.out.println("Ordenando lista de personas...");
        
        ss.ordenar(lista);
        
        for (Persona p : lista) {
            System.out.println(" - " + p);
        }
    }
}