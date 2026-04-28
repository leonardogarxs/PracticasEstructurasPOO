package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Practica21 {
    public static void main(String[] args) {
        Cola<Persona> fila = new Cola<>(5);
        fila.agregar(new Persona("Leonardo", 23));
        fila.agregar(new Persona("Regina", 21));
        fila.agregar(new Persona("Miranda", 18));

        fila.mostrarDatos();
        System.out.println("Atendiendo a: " + fila.atender());
        fila.mostrarDatos();
    }
}