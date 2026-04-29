package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P06_CircularDoble {
    public static void main(String[] args) {
        ListaCircularDoble<Persona> lista = new ListaCircularDoble<>();
        
        lista.agregar(new Persona("Leonardo", 23));
        lista.agregar(new Persona("Regina", 21));
        lista.agregar(new Persona("Miranda", 18));
        
        lista.mostrarDatos();
    }
}