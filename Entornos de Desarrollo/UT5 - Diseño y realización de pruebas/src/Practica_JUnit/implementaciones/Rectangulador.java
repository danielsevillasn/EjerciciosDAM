package Practica_JUnit.implementaciones;

public class Rectangulador {

    /**
     * Calcula el número de rectangulos distintos que se pueden
     * formar con varios elementos. Se considera que el rectángulo
     * 5x7 y el rectangulo 7x5 son iguales. No se considera rectángulos
     * a los que tienen algún lado 1.
     *
     * @param i número de elementos
     * @return el número de rectángulos diferentes que se pueden
     * formar con este número de elementos
     * @throws IllegalArgumentException Si la longitud es 0 o negativa
     */
    public static long rectangulosDiferentes(long i) {
        if (i <= 0) {
            throw new IllegalArgumentException("La longitud es 0 o negativa");
        }
        long contadorRectangulos = 0;
        //Este límite calcula el punto en el que la base pasa a ser mayor que la altura
        //por lo cual como bien pone en el enunciado serían iguales
        long limite = (long) Math.sqrt(i);

        for (long base = 2; base <= limite; base++) {
            //Ya que la altura es i/base si el módulo de esto da exacto entonces significa que se puede formar un rectángulo
            if (i % base == 0) {
                contadorRectangulos++;
            }
        }
        return contadorRectangulos;

    }

}
