package ClaseGenerica.Ejercicio1;


public class Ejercicio1 {
    public static void main(String[] args) {
        Almacen<String> mensaje = new Almacen<String>("Hola pepe");

        Almacen<Integer> numero = new Almacen<Integer>(12);

        mensaje.mostrarTipo();

        numero.mostrarTipo();
    }
}
