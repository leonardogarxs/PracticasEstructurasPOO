package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P04_Mergesort {
    public static void main(String[] args) {
        Mergesort ms = new Mergesort();
        Persona[] lista = {
            new Persona("Alexa", 25),
            new Persona("Pulpo", 22),
            new Persona("Raquel", 30),
            new Persona("Gaby", 20)
        };

        System.out.println("=== MERGESORT ITERATIVO ===");
        ms.ordenar(lista);
        for (Persona p : lista) System.out.println(p);
    }
}