package mx.ipn.upiicsa.practicas;
import mx.ipn.upiicsa.core.Persona;

public class D2_P08_ColaDinamica {
    public static void main(String[] args) {
        ColaDinamica<Persona> fila = new ColaDinamica<>();
        
        fila.agregar(new Persona("Sosa", 19));
        fila.agregar(new Persona("Alexa", 25));
        fila.agregar(new Persona("Raquel", 30));
        
        fila.mostrarDatos();
        System.out.println("Atendiendo a: " + fila.atender());
        fila.mostrarDatos();
    }
}