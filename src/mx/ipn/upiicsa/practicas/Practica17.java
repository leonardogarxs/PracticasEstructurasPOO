package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Practica17 {
    public static void main(String[] args) {
        Seleccion s = new Seleccion();
        Persona[] lista = {new Persona("Juan", 40), new Persona("Ana", 18), new Persona("Luis", 25)};
        s.ordenar(lista);
        for(Persona p : lista) System.out.println(p);
    }
}