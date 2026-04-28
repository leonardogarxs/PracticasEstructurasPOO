package mx.ipn.upiicsa.core;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Esto sirve para que el programa sepa cómo comparar a dos personas (por edad)
    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }

    // Esto sirve para que al imprimir no salga un código raro, sino el nombre y edad
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}