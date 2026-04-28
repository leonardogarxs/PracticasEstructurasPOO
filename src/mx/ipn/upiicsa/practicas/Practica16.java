package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Practica16 {
    public static void main(String[] args) {
        Burbuja burbuja = new Burbuja();
        
        // Creamos un arreglo de personas desordenadas
        Persona[] lista = {
            new Persona("Leonardo", 23),
            new Persona("Regina", 21),
            new Persona("Juan", 45),
            new Persona("Sosa", 19)
        };

        System.out.println("=== LISTA ORIGINAL ===");
        burbuja.mostrar(lista);

        System.out.println("\nOrdenando por edad...");
        burbuja.ordenar(lista);

        System.out.println("\n=== LISTA ORDENADA (BURBUJA) ===");
        burbuja.mostrar(lista);
    }
}