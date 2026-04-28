package mx.ipn.upiicsa.practicas;

import mx.ipn.upiicsa.core.Persona;

public class D2_P01_ListaLigada {
    public static void main(String[] args) {
        ListaLigada<Persona> lista = new ListaLigada<>();

        // Agregamos personas (nodos dinámicos)
        lista.agregar(new Persona("Leonardo", 23));
        lista.agregar(new Persona("Regina", 21));
        lista.agregar(new Persona("Pulpo", 22));
        lista.agregar(new Persona("Sosa", 19));

        // Mostramos la lista
        lista.mostrarDatos();
        
        // Probamos limpiar y verificar
        System.out.println("Vaciando lista...");
        lista.limpiar();
        lista.mostrarDatos();
    }
}