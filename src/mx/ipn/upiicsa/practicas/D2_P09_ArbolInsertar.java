package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P09_ArbolInsertar {
    public static void main(String[] args) {
        ArbolBinario<Persona> arbol = new ArbolBinario<>();
        
        // Al insertar en un ABB, el orden importa para la estructura
        arbol.agregar(new Persona("Leonardo", 23));
        arbol.agregar(new Persona("Regina", 21));
        arbol.agregar(new Persona("Alexa", 25));
        arbol.agregar(new Persona("Sosa", 19));
        
        arbol.mostrarDatos();
    }
}