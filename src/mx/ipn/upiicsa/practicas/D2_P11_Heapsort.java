package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P11_Heapsort {
    public static void main(String[] args) {
        Heapsort hs = new Heapsort();
        
        // Creamos un arreglo de personas desordenadas
        Persona[] lista = {
            new Persona("Raquel", 30),
            new Persona("Leonardo", 23),
            new Persona("Sosa", 19),
            new Persona("Miranda", 18),
            new Persona("Regis", 21)
        };

        System.out.println("=== ORDENAMIENTO HEAPSORT (ITERATIVO) ===");
        System.out.println("Lista antes de ordenar:");
        for (Persona p : lista) System.out.println(" - " + p);

        hs.ordenar(lista);

        System.out.println("\nLista después de Heapsort:");
        for (Persona p : lista) System.out.println(" - " + p);
    }
}