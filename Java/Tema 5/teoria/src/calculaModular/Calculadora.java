/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Inma
 */


public class Calculadora {

  public static void main(String[] args) {
    // defino variables
    Scanner sc = new Scanner(System.in);
    String opcion;
    int n1 = 0;
    int n2 = 0;
    boolean salir = false;

    do {// salimos de aplicación sólo si elegimos la Opción 0
      // mostramos el menú
      System.out.println("\nMENU");
      System.out.println("0- Salir");
      System.out.println("1- Sumar");
      System.out.println("2- Restar");
      System.out.println("3- Multiplicar");
      System.out.println("4- Dividir");
      System.out.print("Elija opcion: ");
      opcion = sc.nextLine();
      //pido los números si la Opción es válida
      if (opcion.compareTo("0") > 0 && opcion.compareTo("5") < 0) {
        System.out.print("Dame  primer número: ");
        n1 = Math.abs(sc.nextInt());
        System.out.print("Dame  segundo número: ");
        n2 = Math.abs(sc.nextInt());
        sc.nextLine();
      }
      // según el valor de la Opción realizo una operación u otra
      switch (opcion) {
        //termina aplicación
        case "0": 
          System.out.println("Saliendo");
          salir = true;
          break;
        //sumar
        case "1": 
          System.out.printf("La suma de %d+%d es %d\n", n1, n2, n1 + n2);
          break;
        case "2": //restar
          System.out.printf("La resta de %d-%d es %d\n", n1, n2, n1 - n2);
          break;
        //multiplicar
        case "3":
          int multi = 0;
          int veces = n2;
          //bucle para multiplicar usando sumas
          while (veces > 0) {
            multi += n1;
            veces--;
          }
          System.out.printf("La multiplicación de %dX%d es %d\n", n1, n2, multi);
          break; 
        //dividir
        case "4": 
          int cociente = 0;
          int resto = 0;
          int dividendo = n1;
          int divisor = n2;
          if (dividendo < divisor) { //para dividir si el primer número es menor al segundo ya sé cociente y resto
            resto = dividendo;
          } else {
            while (dividendo >= divisor) { //bucle para dividir usando restas
              dividendo -= divisor;
              cociente++;
            }
            resto = dividendo;
          }
          System.out.printf("El cociente de %d:%d es %d\t", n1, n2, cociente);
          System.out.printf("el resto es %d\n", resto);
          break;
        //Opción no válida
        default:
          System.out.println("Error. Opción no válida");
      }
    } while (!salir);
    sc.close();

  }

}
