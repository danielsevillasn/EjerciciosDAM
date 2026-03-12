package MetodosSecundarios;

/**
 * Formateo visual y control de consola.
 * Contiene metodos como:
 * menu, pausar y limpiarPantalla
 * 
 * @author Dani S
 */
public class Salida {

    /**
     * Muestra al usuario un menú de opciones con su titulo, con sus diferentes
     * opciones y luego pide que teclee una de ellas y
     * devuelve la Opción introducida
     * 
     * @param titulo   cadena de texto que sirve de titulo para el menu
     * @param opciones cadenas de texto que puedes incluir cuantas quieras que se
     *                 almacenan en el array opciones
     * @return Opción introducida por teclado tipo entero
     */
    public static int menu(String titulo, String... opciones) {
        int opcion = -1;
        boolean valido = false;

        do {
            System.out.println("\n--- " + titulo.toUpperCase() + " ---");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + "- " + opciones[i]);
            }
            System.out.println("0- Salir");

            opcion = Entrada.pedirEntero("Elija una opción (0-" + opciones.length + "): ");

            if (opcion >= 0 && opcion <= opciones.length) {
                valido = true;
            } else {
                System.out.println("Opción incorrecta. Inténtelo de nuevo.");
            }
        } while (!valido);

        return opcion;
    }

    /**
     * Pausa el programa hasta que le de a intro para continuar
     */
    public static void pausar() {
        System.out.println("\nPulse INTRO para continuar...");
        Entrada.s.nextLine();
    }

    /**
     * "Limpia" la consola imprimiendo líneas en blanco.
     */
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
