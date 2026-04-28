package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Practica20 {
    public static void main(String[] args) {
        Pila<Persona> stack = new Pila<>(5);
        stack.agregar(new Persona("Base", 20));
        stack.agregar(new Persona("Tope", 25));
        stack.mostrarDatos();
        System.out.println("Sacando de pila: " + stack.pop());
    }
}