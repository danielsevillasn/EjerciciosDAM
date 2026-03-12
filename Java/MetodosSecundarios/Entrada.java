package MetodosSecundarios;

import java.util.Scanner;

/**
 * Lectura de datos y validación de teclado.
 * Contiene metodos como:
 * pedirEntero, pedirDouble y pedirCadena
 * 
 * @author Dani S
 */
public class Entrada {
    //Scanner estatico que se puede utilizar en todos los métodos de la clase
    static Scanner s = new Scanner(System.in);

    /**
     * Pide al usuario un número entero y devuelve el número introducido,
     * si el usuario mete algo que no sea un numero entero el catch atrapa la
     * excepcion
     * manda un mensaje y hasta que no sea un numero entero lo introducido no para
     * el bucle
     * 
     * @param mensaje es el texto que aparecera a la hora de pedir el entero
     * @return numero entero introducido por teclado
     */
    public static int pedirEntero(String mensaje) {
        boolean datoValido = false;
        int numero = 0;
        do {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(s.nextLine());
                datoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Lo introducido no es un numero entero, prueba de nuevo");
            }
        } while (!datoValido);

        return numero;
    }

    /**
     * Pide al usuario una cadena y devuelve la cadena introducida
     * 
     * @param mensaje es el texto que aparecera a la hora de pedir el entero
     * @return cadena introducida por teclado
     */
    public static String pedirCadena(String mensaje) {
        System.out.print(mensaje);
        return s.nextLine();
    }

    /**
     * Pide al usuario un número con formato double y devuelve el número
     * introducido,
     * si el usuario mete algo que no sea un numero con formato double el catch
     * atrapa la
     * excepcion
     * manda un mensaje y hasta que no sea un numero entero lo introducido no para
     * el bucle
     * 
     * @param mensaje es el texto que aparecera a la hora de pedir el entero
     * @return numero con formato double introducido por teclado
     */
    public static double pedirDouble(String mensaje) {
        boolean datoValido = false;
        double numero = 0;
        do {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(s.nextLine());
                datoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Lo introducido no es un número decimal, prueba de nuevo");
            }
        } while (!datoValido);

        return numero;
    }
}
