package mx.ipn.upiicsa.practicas;

import mx.ipn.upiicsa.core.Persona;

public class D2_P02_ListaDoble {
    public static void main(String[] args) {
        ListaDoble<Persona> lista = new ListaDoble<>();

        lista.agregar(new Persona("Leonardo", 23));
        lista.agregar(new Persona("Regina", 21));
        lista.agregar(new Persona("Alexa", 25));

        // Mostramos en ambos sentidos
        lista.mostrarDatos();
        System.out.println("");
        lista.mostrarReversa();
    }
}