package EjerciciosRepaso.Genericos.Caja;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja<Integer> numero = new Caja<Integer>(5);
        Caja<String> nombre = new Caja<String>("Pepe");

        numero.nombreClase();

        nombre.nombreClase();
    }
}
