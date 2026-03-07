package ModularPrueba.Clases;

import java.util.Scanner;

//Todos los parametros de esta clase son por valor, es decir, se copian y no modifican su valor en la clase principal
/**
 * Clase para todos los metodos o funcionalidades propias de la Entrada/Salida
 *
 */
public class Datos {
    //Scanner (Objeto) estatico que se podra utilizar en todos los metodos de la clase
    static Scanner sc = new Scanner(System.in);

    //Documentacion del metodo y ha de ir siempre
    /**
     * Muestra al usuario un menú de opciones; pide que teclee una de ellas y
     * devuelve la Opción introducida
     * 
     * @param ninguno
     * @return Opción introducida por teclado tipo String
     */
    //Como no tiene el void entonces si devuelve un valor
    public static String menu() {
        String menu = "";
        System.out.println();
        System.out.println("MENU");
        System.out.println("0- Salir");
        System.out.println("1- Matriz Mágica");
        System.out.println("2- Traductor Javalandia");
        System.out.print("Elija opción: ");
        menu = sc.nextLine();

        //Devuelve el valor de la variable
        return (menu);
    }
    /**
     * Pide una cadena de carateres y la devuelve
     * 
     * 
     * @param mensaje de peticion de datos tipo String
     * @return Dato introducido por teclado tipo string
     */
    //Los parametros pueden ser variables o objetos y estos se diferencian en:
    //Los parametros se copian y no se modifican en el codigo principal
    //Y los objetos se copian y si se modifican en el codigo principal
    public static String pedirCadena(String mensaje){
        System.out.print("Dame "+mensaje);
        String dato = sc.nextLine();
        return(dato);
    }

    /**
     * Pide un entero y lo devuelve
     * 
     * 
     * @param mensaje de peticion de datos tipo entero
     * @return Dato introducido por teclado tipo entero
     */
    public static int pedirEntero(String mensaje){
        System.out.print("Dame "+mensaje);
        int dato = sc.nextInt();
        return dato;
    }
}
