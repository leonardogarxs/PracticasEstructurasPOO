package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P07_PilaDinamica {
    public static void main(String[] args) {
        PilaDinamica<Persona> pila = new PilaDinamica<>();
        
        pila.agregar(new Persona("Primero", 30));
        pila.agregar(new Persona("Segundo", 25));
        pila.agregar(new Persona("Tercero (Tope)", 20));
        
        pila.mostrarDatos();
        
        System.out.println("\nExtrayendo: " + pila.pop());
        System.out.println("Nueva Pila:");
        pila.mostrarDatos();
    }
}