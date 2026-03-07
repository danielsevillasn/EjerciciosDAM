package calculadora.modular.datos;


/**
 *
 * @author Inma
 */
import java.util.Scanner;

public class Pide {
  static Scanner sc = new Scanner(System.in);
  /**
   * Pide al usuario un número entero y devuelve el número introducido
   * 
   * @param mensaje es el texto que apareerá en el mensaje
   * @return  numero entero introducido por teclado
   */

  public static int numero(String mensaje) {

    System.out.print("Dame " + mensaje);
    int numero = sc.nextInt();
    sc.nextLine();
    return (numero);
  }

   /**
   * Muestra al usuario un menú de opciones; pide que teclee una de ellas  y devuelve la Opción introducida
   * 
   * @return  Opción   introducida por teclado tipo String
   */
  public static String menu() {

    String opcion;
         
    System.out.println("\nMENU");
    System.out.println("0- Salir");
    System.out.println("1- Sumar");
    System.out.println("2- Restar");
    System.out.println("3- Multiplicar");
    System.out.println("4- Dividir");
    System.out.print("Elija opcion: ");
    opcion = sc.nextLine();
    return(opcion);
  }
     

   
  



  }
