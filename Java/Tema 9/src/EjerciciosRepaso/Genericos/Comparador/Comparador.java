package EjerciciosRepaso.Genericos.Comparador;

public class Comparador {

    /**
     * Método estático genérico que devuelve el mayor de dos objetos.
     * El "Bound" <T extends Comparable<T>> asegura que los objetos
     * tengan el método compareTo disponible.
     */
    public static <T extends Comparable<T>> T obtenerMayor(T objeto1, T objeto2) {
        // compareTo devuelve > 0 si objeto1 es mayor que objeto2
        if (objeto1.compareTo(objeto2) > 0) {
            return objeto1;
        } else {
            return objeto2;
        }
    }
}