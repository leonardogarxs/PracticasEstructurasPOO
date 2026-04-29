package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P03_Quicksort {
    public static void main(String[] args) {
        Quicksort qs = new Quicksort();
        Persona[] lista = {
            new Persona("Zosa", 19),
            new Persona("Leo", 23),
            new Persona("Regis", 21),
            new Persona("Miranda", 18)
        };

        System.out.println("=== QUICKSORT ITERATIVO ===");
        qs.ordenar(lista);
        for (Persona p : lista) System.out.println(p);
    }
}