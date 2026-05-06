package EdadLaboral.Implementaciones;

public class EdadLaboral {
    public static boolean esEdadLaboral(int edadEnAños) {
        // Simplemente comprobamos que esté en el rango [16, 65]
        return edadEnAños >= 16 && edadEnAños <= 65;
    }
}
