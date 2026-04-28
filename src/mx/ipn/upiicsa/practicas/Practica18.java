package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class Practica18 {
    public static void main(String[] args) {
        Insercion ins = new Insercion();
        Persona[] lista = {new Persona("Zoe", 30), new Persona("Beto", 20), new Persona("Ada", 22)};
        ins.ordenar(lista);
        for(Persona p : lista) System.out.println(p);
    }
}