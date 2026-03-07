package Ejercicio1AL19_Alumno.metodos;

import java.util.Scanner;

//Todos los parametros de esta clase son por valor, es decir, se copian y no modifican su valor en la clase principal
/**
 * Clase para todos los metodos o funcionalidades propias de la Entrada/Salida
 *
 * @author dani
 */
public class Datos {
    // Scanner (Objeto) estatico que se podra utilizar en todos los metodos de la
    // clase
    static Scanner sc = new Scanner(System.in);

    // Documentacion del metodo y ha de ir siempre
    /**
     * Muestra al usuario un menú de opciones; pide que teclee una de ellas y
     * devuelve la Opción introducida
     * 
     * @param ninguno
     * @return Opción introducida por teclado tipo String
     */
    // Como no tiene el void entonces si devuelve un valor
    public static String menu() {
        String menu = "";
        System.out.println();
        System.out.println("MENU");
        System.out.println("0- Salir");
        System.out.println("1- esCapicua");
        System.out.println("2- esPrimo");
        System.out.println("3- siguientePrimo");
        System.out.println("4- potencia");
        System.out.println("5- digitos");
        System.out.println("6- voltea");
        System.out.println("7- digitoN");
        System.out.println("8- posicionDeDigito");
        System.out.println("9- quitaPorDetras");
        System.out.println("10- quitaPorDelante");
        System.out.println("11- pegaPorDetras");
        System.out.println("12- pegaPorDelante");
        System.out.println("13- trozoDeNumero");
        System.out.println("14- juntaNumeros");
        System.out.print("Elija opción: ");
        menu = sc.next();
        sc.nextLine(); // Consumir el salto de línea
        // Devuelve el valor de la variable
        return (menu);
    }

    /**
     * Pide una cadena de carateres y la devuelve
     * 
     * 
     * @param mensaje de peticion de datos tipo String
     * @return Dato introducido por teclado tipo string
     */
    // Los parametros pueden ser variables o objetos y estos se diferencian en:
    // Los parametros se copian y no se modifican en el codigo principal
    // Y los objetos se copian y si se modifican en el codigo principal
    public static String pedirCadena(String mensaje) {
        System.out.print("Dame " + mensaje);
        String dato = sc.nextLine();
        return (dato);
    }

    /**
     * Pide un entero y lo devuelve
     * 
     * 
     * @param mensaje de peticion de datos tipo entero
     * @return Dato introducido por teclado tipo entero
     */
    public static int pedirEntero(String mensaje) {
        System.out.print("Dame " + mensaje);
        int dato = sc.nextInt();
        return dato;
    }

    /**
     * Pide un entero y lo devuelve
     * 
     * 
     * @param mensaje de peticion de datos tipo entero
     * @return Dato introducido por teclado tipo entero
     */
    public static void compararBoolean(String tipo, boolean resultado) {
        if (resultado) {
            System.out.println("Es " + tipo);
        } else {
            System.out.println("No es " + tipo);
        }
    }

    /**
     * Muestra al usuario un menú de opciones; pide que teclee una de ellas y
     * devuelve la Opción introducida
     * 
     * @param ninguno
     * @return Opción introducida por teclado tipo String
     */
    public static String menu19() {
        String menu = "";
        System.out.println("MENU");
        System.out.println("0- Salir");
        System.out.println("1- Binario-Decimal");
        System.out.println("2- Decimal-Binario");
        System.out.println("3- Binario-Octal");
        System.out.println("4- Octal-Binario");
        System.out.println("5- Hexadecimal-Binario");
        System.out.println("6- Binario-Hexadecimal");
        System.out.print("Elija opción: ");
        menu = sc.next();
        sc.nextLine(); // Consumir el salto de línea
        // Devuelve el valor de la variable
        return (menu);
    }
}
