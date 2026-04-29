package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P10_ArbolBusqueda {
    public static void main(String[] args) {
        ArbolBusqueda<Persona> arbol = new ArbolBusqueda<>();
        
        // Poblamos el árbol
        arbol.agregar(new Persona("Sosa", 19));
        arbol.agregar(new Persona("Leo", 23));
        arbol.agregar(new Persona("Regis", 21));
        arbol.agregar(new Persona("Miranda", 18));
        arbol.agregar(new Persona("Alexa", 25));

        // 1. Mostrar estructura por niveles
        arbol.mostrarDatos();

        // 2. Probar la lógica de búsqueda
        System.out.println("\n--- Realizando Búsqueda ---");
        Persona buscada = new Persona("Cualquiera", 21);
        Persona resultado = arbol.buscar(buscada);

        if (resultado != null) {
            System.out.println("Resultado: Se encontró a la persona con edad " + resultado);
        } else {
            System.out.println("Resultado: No se encontró a nadie con esa edad.");
        }
    }
}