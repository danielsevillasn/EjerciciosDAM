package EjerciciosIntroduccion.ClaseGenerica.Ejercicio2;


public class Ejercicio2 {
    public static void main(String[] args) {
        Pareja<Integer,String> ejemplo1 = new Pareja<Integer,String>(1,"Pepe");

        Pareja<String, Usuario> ejemplo2 = new Pareja<String,Usuario>("2",new Usuario("Juan","juan@gmail.com",18));

        ejemplo1.mostrarPareja();

        ejemplo2.mostrarPareja();
    }
}
