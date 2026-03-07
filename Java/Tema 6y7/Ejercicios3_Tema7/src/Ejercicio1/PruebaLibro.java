package Ejercicio1;

public class PruebaLibro {
    public static void main(String[] args) {

        // Creo una instancia de Libro
        Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel Garcia Marquez", false);

        System.out.println(libro1);

        // Presto el libro
        libro1.prestar();

        // Muestro la informacion del libro
        System.out.println(libro1);

        // Devolvemos el libro
        libro1.devolver();

        // Devolvemos el libro de nuevo, no nos deja
        libro1.devolver();

        // Muestro la informacion del libro
        System.out.println(libro1);

        // Obtengo el coste de la impresión
        double costeImpresion = libro1.imprimir(0.05);

        System.out.println("El coste ha sido de " + costeImpresion + "€");

        // Creo una instancia de Libro
        Libro libro2 = new Libro("12345678", "Cinco años de soledad", 500, "Gabriel Garcia Marquez", false);

        // Indico si los libros son iguales
        if (libro1.equals(libro2)) {
            System.out.println("Los libros son iguales");
        } else {
            System.out.println("Los libros no son iguales");
        }

    }
}
