/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.modular.principal;

/**
 *
 * @author Inma
 */
import java.util.Scanner;
import  calculadora.modular.calculo.Operacion;
import  calculadora.modular.datos.Pide;

public class CalculadoraModular {

  public static void main(String[] args) {
    // defino variables
    Scanner sc = new Scanner(System.in);
    String opcion;
    int n1 = 0;
    int n2 = 0;
    boolean salir = false;

    do {// salimos de aplicación sólo si elegimos la Opción 0
      opcion = Pide.menu(); //llamo a función menu() que devuelve la Opción elegida
      //pido los números si la Opción es válida
      if (opcion.compareTo("0") > 0 && opcion.compareTo("5") < 0) {
        n1 = Math.abs(Pide.numero("primer numero: "));  // llamo a la función numero() que devuelve el número pedido
        n2 = Math.abs(Pide.numero("segundo numero: "));
      }
      
      // según el valor de la Opción realizo una operación u otra
      switch (opcion) {
        case "0": //termina aplicación
          System.out.println("Saliendo");
          salir = true;
          break;
        case "1": //sumar
          System.out.printf("La suma de %d+%d es %d\n", n1, n2, Operacion.suma(n1, n2));
          break;
        case "2": //restar
          System.out.printf("La resta de %d-%d es %d\n", n1, n2, Operacion.resta(n1, n2));
          break;
        case "3": //multiplicar
          System.out.printf("La multiplicación de %dX%d es %d\n", n1, n2, Operacion.multiplica(n1, n2));
          break;
        case "4": //dividir
          System.out.printf("El cociente de %d:%d es %d\t", n1, n2, Operacion.divide(n1, n2,"cociente"));
          System.out.printf("el resto es %d\n",Operacion.divide(n1, n2,"resto"));
          break;
        default: //Opción no válida
          System.out.println("Error. Opción no válida");
      }
    } while (!salir);
    sc.close();

  }

}
