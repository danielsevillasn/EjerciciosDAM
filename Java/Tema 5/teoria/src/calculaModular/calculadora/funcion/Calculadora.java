/*
  Crear una calculadora (sin usar los operadores "*", "/" ni "%")  para calcular dado dos números enteros:
  - la suma, 
  - la resta, 
  - la multiplicación y 
  - la división (cociente y resto) . 
   
No se permite usar "en caso de que existan" funciones de la clase Math para calcular la multiplicación y la división. 
Se admiten valores escritos por el usuario que sean negativos pero los resultados deben coincidir con los de los ejemplos
        (Se pueden usar en este caso funciones de la clase Math). 
 */
package calculadora.funcion;

import java.util.Scanner;

/**
 *
 * @author Inma
 */

public class Calculadora {
   static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    // defino variables
    String opcion;
    int n1 = 0;
    int n2 = 0;
    boolean salir = false;

    do {// salimos de MÉTODOS sólo si elegimos la Opción 0
      // llamo a función menu() que devuelve la Opción elegida
      opcion = menu();
      // pido los números si la Opción es válida
      if (opcion.compareTo("0") > 0 && opcion.compareTo("5") < 0) {
        // llamo a la función numero() que devuelve el número pedido
        n1 = Math.abs(numero("primer numero: "));
        n2 = Math.abs(numero("segundo numero: "));
      }
      // según el valor de la Opción realizo una operación u otra
      switch (opcion) {
        case "0": // termina MÉTODOS
          System.out.println("Saliendo");
          salir = true;
          break;
        case "1": // sumar
          System.out.printf("La suma de %d+%d es %d\n", n1, n2, suma(n1, n2));
          break;
        case "2": // restar
          System.out.printf("La resta de %d-%d es %d\n", n1, n2, resta(n1, n2));
          break;
        case "3": // multiplicar
          System.out.printf("La multiplicación de %dX%d es %d\n", n1, n2, multiplica(n1, n2));
          break;
        case "4": // dividir
          System.out.printf("El cociente de %d:%d es %d\t", n1, n2, divide(n1, n2, "cociente"));
          System.out.printf("el resto es %d\n", divide(n1, n2, "resto"));
          break;
        default: // Opción no válida
          System.out.println("Error. Opción no válida");
      }
    } while (!salir);
    sc.close();
  }

  /*****************************************************************************************************************
   * FUNCIONES O MÉTODOS
   * ***************************************************************************************************************
   */

  /**
   * Devuelve un el número entero resultado de sumar los números enteros que se
   * pasan como número parámetros.
   * 
   * @param a número entero a sumar
   * @param b número entero a sumar
   * @return numero entero resultado de sumar a y b
   */
  public static int suma(int a, int b) {

    return (a + b);
  }

  /**
   * Devuelve un el número entero resultado de restar los números enteros que se
   * pasan como número parámetros.
   * 
   * @param a número entero a restar
   * @param b número entero a restar
   * @return numero entero resultado de restar a y b
   */
  public static int resta(int a, int b) {
    return (a - b);
  }

  /**
   * Devuelve un el número entero resultado de multiplicar los números enteros que
   * se pasan como número parámetros.
   * 
   * @param a número entero a multiplicar
   * @param b número entero a multiplicar
   * @return numero entero resultado de multiplicar a y b
   */
  public static int multiplica(int a, int b) {

    int multi = 0;
    while (b > 0) { // bucle para multiplicar usando sumas
      multi += a;
      b--;
    }
    return (multi);
  }

  /**
   * Devuelve un el número entero resultado de sumar los números enteros que se
   * pasan como número parámetros.
   * 
   * @param a    número entero a sumar
   * @param b    número entero a sumar
   * @param tipo para saber si queremos el cociente o el resto
   * @return numero entero resultado de dividir a y b (cociente o resto)
   */
  public static int divide(int a, int b, String tipo) {
    int cociente = 0;
    int resto = 0;
    int divide = 0;
    if (a < b) { // para dividir si el primer número es menos al segundo ya sé cociente y resto
      resto = a;
    } else {

      while (a >= b) { // bucle para dividir usando restas
        a -= b;
        cociente++;
      }
      resto = a;
    }

    if (tipo.equals("cociente")) {
      divide = cociente;
    } else {
      divide = resto;
    }
    return (divide);

  }

  /**
   * Pide al usuario un número entero y devuelve el número introducido
   * 
   * @param mensaje número entero a sumar
   * @return numero entero introducido por teclado
   */
  public static int numero(String mensaje) {

    System.out.print("Dame " + mensaje);
    int numero = sc.nextInt();
    sc.nextLine();
    return (numero);
  }

  /**
   * Muestra al usuario un menú de opciones; pide que teclee una de ellas y
   * devuelve la Opción introducida
   * 
   * @return Opción introducida por teclado tipo String
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
    return (opcion);
  }

}
