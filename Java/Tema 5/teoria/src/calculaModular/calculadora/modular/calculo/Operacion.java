package calculadora.modular.calculo;
/*
 La clase Operación consta de los métodos que realizan las operaciones sumar, restar, ...
 */


/**
 *
 * @author Inma
 */
public class Operacion {

  /**
   * Devuelve un el número entero resultado de sumar los números enteros que se pasan como parámetros.
   * 
   * @param a número entero a sumar
   * @param b número entero a sumar
   * @return  numero entero resultado de sumar a y b
   */
  public static int suma(int a, int b) {
 
    return (a + b);
  }

  /**
   * Devuelve un el número entero resultado de restar los números enteros que se pasan como parámetros.
   * 
   * @param a número entero a restar
   * @param b número entero a restar
   * @return  numero entero resultado de restar a y b
   */
  public static int resta(int a, int b) {
    return (a - b);
  }

  /**
   * Devuelve un el número entero resultado de multiplicar los números enteros que se pasan como parámetros.
   * 
   * @param a número entero a multiplicar
   * @param b número entero a multiplicar
   * @return  numero entero resultado de multipliacr a y b
   */
  public static int multiplica(int a, int b) {
    int multi = 0;
    while (b > 0) {  //bucle para multiplicar usando sumas
      multi += a;
      b--;
    }
    return (multi);
  }

  
/**
   * Devuelve un el número entero resultado de sumar los números enteros que se pasan como parámetros.
   * 
   * @param a número entero a sumar
   * @param b número entero a sumar
   * @param tipo para saber si queremos el cociente o el resto
   * @return  numero entero resultado de dividir a y b (cociente o resto)
   */
  public static int divide(int a, int b, String tipo) {
    int cociente = 0;
    int resto = 0;
    int divide=0;
    if (a < b) { //para dividir si el primer número es menos al segundo ya s� cociente y resto
      resto = a;
    } else {

      while (a >= b) { //bucle para dividir usando restas
        a -= b;
        cociente++;
      }
      resto = a;
    }

    if (tipo.equals("cociente")) {
      divide=cociente;
    } else  {
      divide=resto;
    }
    return(divide);

  }

}
