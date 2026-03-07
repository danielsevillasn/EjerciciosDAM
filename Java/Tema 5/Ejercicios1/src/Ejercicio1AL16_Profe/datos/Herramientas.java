
package Ejercicio1AL16_Profe.datos;

import java.util.Scanner;

/**
 * Herramientas:
 * 1. menu: devuelve el menú a mostrar en el programa principal.
 * 2. entero: almacena el valor del número entero pedido al usuario a través de
 * un mensaje.
 * 3. opcion: almacena el valor de la opción (tipo String) seleccionada
 * por el usuario, empleando un mensaje para pedir al usuario la introducción de
 * datos.
 * 4. muestraVectorSimple: recorre y muestra los valores almacenados en un
 * vector.
 * 5. muestraVectorTexto: recorre y muestra los valores almacenados en un
 * vector, encabezado por el texto especificado en el programa principal.
 * 6. muestraMatrizTexto: recorre y muestra los valores almacenados en una
 * matriz,
 * encabezada por el texto especificado en el programa principal.
 * 
 * @author Inma
 */
public class Herramientas {

  /**
   * Devuelve el menú a mostrar en el programa principal.
   * 
   * @throws InterruptedException
   */
  public static void menu1Al16() throws InterruptedException {
    System.out.println("\nMENU");
    Thread.sleep(50);
    System.out.println("0 - Salir.");
    Thread.sleep(50);
    System.out.println("1 - Es Capicúa.");
    Thread.sleep(50);
    System.out.println("2 - Es Primo.");
    Thread.sleep(50);
    System.out.println("3 - Siguiente primo de un número.");
    Thread.sleep(50);
    System.out.println("4 - Potencia.");
    Thread.sleep(50);
    System.out.println("5 - Cuenta digitos de un número.");
    Thread.sleep(50);
    System.out.println("6 - Voltea un número.");
    Thread.sleep(50);
    System.out.println("7 - Dígito en una posición de un número.");
    Thread.sleep(50);
    System.out.println("8 - Posición de un dígito en un número.");
    Thread.sleep(50);
    System.out.println("9 - Quitar dígitos por detrás a un número.");
    Thread.sleep(50);
    System.out.println("10- Quitar dígitos por delante a un número.");
    Thread.sleep(50);
    System.out.println("11- Pegar dígitos por detrás a un número");
    Thread.sleep(50);
    System.out.println("12- Pegar un dígitos por delante a un número.");
    Thread.sleep(50);
    System.out.println("13- Obtener un trozo de un número.");
    Thread.sleep(50);
    System.out.println("14- Une dos números.");
    Thread.sleep(50);
    System.out.println("15- Muestra los primos entre dos números");
    Thread.sleep(50);
    System.out.println("16- Muestra los números capicúa entre dos números");
    Thread.sleep(50);
  }

  /**
   * Almacena el valor del número entero pedido al usuario a través de un mensaje.
   * 
   * @param mensaje Mensaje que se muestra al usuario para pedir la introducción
   *                de un valor entero.
   * @return Valor entero introducido por el usuario.
   */
  public static int entero(String mensaje) {
    Scanner s = new Scanner(System.in);
    System.out.println("");
    System.out.println(mensaje);
    return s.nextInt();
  }

  /**
   * Almacena el valor del número entero pedido al usuario a través de un mensaje.
   * 
   * @param mensaje Mensaje que se muestra al usuario para pedir la introducción
   *                de un valor entero.
   * @return Valor entero introducido por el usuario.
   */
  public static double real(String mensaje) {
    Scanner s = new Scanner(System.in);
    System.out.println("");
    System.out.println(mensaje);
    return s.nextDouble();
  }

  /**
   * Almacena el valor de la opción (tipo String) seleccionada por el usuario,
   * empleando un mensaje para pedir al usuario la introducción de datos.
   * 
   * @param mensaje Mensaje que se muestra al usuario para pedir la introducción
   *                de la opción que desea ejecutar.
   * @return opción seleccionada por el usuario.
   */
  public static String opcion(String mensaje) {
    Scanner s = new Scanner(System.in);
    System.out.println("");
    System.out.print(mensaje);
    return s.nextLine();
  }

}
