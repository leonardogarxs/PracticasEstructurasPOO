package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P05_CircularSimple {
    public static void main(String[] args) {
        ListaCircular<Persona> lista = new ListaCircular<>();
        lista.agregar(new Persona("Leo", 23));
        lista.agregar(new Persona("Regis", 21));
        lista.mostrarDatos();
    }
}