/**
 *
 * @author Inma
 */
import java.util.Scanner;

public class Pide {
  static Scanner sc = new Scanner(System.in);// mi escaner es visible a todos los métodos

  /**
   * Pide al usuario un número entero y devuelve el número introducido
   *
   * @param mensaje el mensaje mostrado en la petición del dato al usuario
   * @return numero entero introducido por teclado
   */
  public static int numero(String mensaje) {
    //Scanner sc = new Scanner(System.in);
    System.out.print("\n"+ mensaje + ": ");
    return sc.nextInt();
  }

  /**
   * Pide al usuario un número entero y devuelve el número introducido
   *
   * @param mensaje el mensaje mostrado en la petición del dato al usuario
   * @return cadena introducida por teclado
   */
  public static String cadena(String mensaje) {

    //Scanner sc = new Scanner(System.in);
    System.out.print( "\n"+mensaje + ": ");
    return sc.nextLine();
  }
  
  
  /**
   * Pide al usuario un número entero y devuelve el número introducido
   *
   * @param mensaje el mensaje mostrado en la petición del dato al usuario
   * @return cadena introducida por teclado
   */
  public static char caracter(String mensaje) {

    //Scanner sc = new Scanner(System.in);
    System.out.print( "\n"+mensaje + ": ");
    return sc.nextLine().charAt(0);
  }
  
  
  

  /**
   * Muestra al usuario un menú de opciones; pide que teclee una de ellas y
   * devuelve la opción introducida
   *
   * @return opción introducida por teclado tipo String
   */
  public static String menu() {
    //Scanner sc = new Scanner(System.in);
    String opcion;

    System.out.println("\nMENU");
    System.out.println("0- Salir");
    System.out.println("1- Sumar");
    System.out.println("2- Restar");
    System.out.println("3- Multiplicar");
    System.out.println("4- Dividir");
    System.out.print("Elija opcion: ");
    opcion = sc.nextLine();
    return (opcion);
  }



}
