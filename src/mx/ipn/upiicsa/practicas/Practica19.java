package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Practica19 {
    public static void main(String[] args) {
        // Primero ordenamos
        Persona[] lista = {new Persona("A", 10), new Persona("B", 20), new Persona("C", 30)};
        Busqueda b = new Busqueda();
        int pos = b.binaria(lista, 20);
        System.out.println(pos != -1 ? "Encontrado en pos: " + pos : "No encontrado");
    }
}