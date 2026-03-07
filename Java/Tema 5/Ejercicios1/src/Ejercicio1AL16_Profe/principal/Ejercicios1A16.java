package Ejercicio1AL16_Profe.principal;

/*
 *
 */

/**
 * Ejercicios 1 a 14
 *
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y La función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 *
 *
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
 * capicúa y falso en caso contrario 
 * 2. esPrimo: Devuelve verdadero si el número
 * que se pasa como parámetro es primo y falso en caso contrario. 
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
 * como parámetro. 
 * 4. potencia: Dada una base y un exponente devuelve la potencia. 
 * 5. digitos: Cuenta el número de dígitos de un número entero. 
 * 6. voltea: Le da la vuelta a un número. 
 * 7. digitoN: Devuelve el dígito que esté en la posición n de un número entero. 
 * Se empieza contando por el 0 y de  izquierda a derecha. 
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. 
 * Si no se encuentra, devuelve -1. 
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por laderecha). 
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda). 
 * 11. pegaPorDetras: Añade un dígito a un número por detrás. 
 * 12. pegaPorDelante: Añade un dígito a un número por delante. 
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de
 * un número y devuelve el trozo correspondiente. 
 * 14. juntaNumeros: Pega dos  números para formar uno
 *
 *
 * @author inma
 */
import Ejercicio1AL16_Profe.datos.Herramientas;
import Ejercicio1AL16_Profe.metodos.Ejer;
import Ejercicio1AL16_Profe.metodos.SolEjer15;

public class Ejercicios1A16 {

  public static void main(String[] args) throws InterruptedException {

    // Definición de las variables necesarias para la correcta ejecución del
    // programa
    // String opcion;
    boolean salir = false;
    int numero = 0;
    int otroNumero = 0;
    int posicion = 0;
    int otraPosicion = 0;
    int digito = 0;
    int base;
    int exponente;

    // Estructura de iteración que asegura la presentación del menú al usuario
    // salvo que decida salir (opción 0).
    do {
      String opcion;
      Herramientas.menu1Al16();
      opcion = Herramientas.opcion("Elige opción: ");
      // Estructura de selección que asegura la ejecución de distintas tareas
      // en base a la opción escogida por el usuario
      switch (opcion) {
        case "0": // SALIR
          System.out.println("\nGracias por utilizar la aplicación.");
          Thread.sleep(2000);
          salir = true;
          break;
        case "1": // es capicúa
          numero = Herramientas.entero("Introduce un número: ");
          if (Ejer.escapicua(numero)) {
            System.out.println("\nEl número " + numero + " es capicúa");
          } else {
            System.out.println("\nEl número " + numero + " NO es capicúa");
          }
          Thread.sleep(5000);
          break;
        case "2":// es Primo
          numero = Herramientas.entero("Introduce un número: ");
          if (Ejer.esPrimo(numero)) {
            System.out.println("\nEl número " + numero + " es primo");
          } else {
            System.out.println("\nEl número " + numero + " NO es primo");
          }
          Thread.sleep(5000);
          break;
        case "3":// siguiente primo de un número
          numero = Herramientas.entero("Introduce un número: ");
          System.out.println("El número primo siguiente a " + numero + " es " + Ejer.siguientePrimo(numero));
          Thread.sleep(5000);
          break;
        case "4":// potencia
          base = Herramientas.entero("Introduce la base: ");
          exponente = Herramientas.entero("Introduce el exponente: ");
          System.out.println(base + " elevado a  " + exponente + " es " + Ejer.potencia(base, exponente));
          Thread.sleep(5000);
          break;
        case "5": // cuenta digitos de un número
          numero = Herramientas.entero("Introduce un número: ");
          System.out.println("El número  de dígitos de " + numero + " es " + Ejer.digitos(numero));
          Thread.sleep(5000);
          break;
        case "6": // Voltea un número
          numero = Herramientas.entero("Introduce un número: ");
          System.out.println("El número  " + numero + " volteado es " + Ejer.voltea(numero));
          Thread.sleep(5000);
          break;
        case "7": // Dígito en una posición de un número.
          numero = Herramientas.entero("Introduce un número: ");
          do {
            posicion = Herramientas
                .entero("Introduce la posición del dígito a obtener empezando por 0, de izquierda a a derecha: ");
            if (posicion < Ejer.digitos(numero)) {
              break;
            } else {
              System.out.println("Error, posición no correcta");
            }
          } while (true);

          System.out.println("El dígito que ocupa la posición " + posicion + " dentro del numero  " + numero + " es "
              + Ejer.digitoN(numero, posicion));
          Thread.sleep(5000);
          break;
        case "8":// Posición de un dígito en un número
          numero = Herramientas.entero("Introduce un número: ");
          digito = Herramientas.entero("Introduce qué dígito del número  buscas  ");
          posicion = Ejer.posicionDeDigito(numero, digito);
          if (posicion == 1) {
            System.out.println("no se ha encontrado el dígito " + digito + " en el número " + numero);
          } else {
            System.out
                .println("Se ha encontrado la primera ocurrencia del dígito " + digito + " en la posición " + posicion);
          }
          Thread.sleep(5000);
          break;
        case "9": // Quitar dígitos por detrás a un número
          numero = Herramientas.entero("Introduce un número: ");
          do {
            digito = Herramientas.entero("Introduce cuántos dígitos le vas a quitar por la derecha  ");
            if (digito == Ejer.digitos(numero)) {
              System.out.println("Si le quitas " + digito + " dígitos por delante al número " + numero
                  + " no nos quedan dígitos en el número ");
            }
            if (digito < Ejer.digitos(numero)) {
              break;
            }
          } while (true);

          System.out
              .println("Si le quitas " + digito + " dígitos por detrás al número " + numero + " nos queda el número "
                  + Ejer.quitaPorDetras(numero, digito));
          Thread.sleep(5000);
          break;
        case "10": // Quitar dígitos por delante a un número.
          numero = Herramientas.entero("Introduce un número: ");
          do {
            digito = Herramientas.entero("Introduce cuántos dígitos le vas a quitar por la izquierda  ");
            if (digito == Ejer.digitos(numero)) {
              System.out.println("Si le quitas " + digito + " dígitos por delante al número " + numero
                  + " no nos quedan dígitos en el número ");
            }
            if (digito < Ejer.digitos(numero)) {
              break;
            }
          } while (true);
          System.out
              .println("Si le quitas " + digito + " dígitos por delante al número " + numero + " nos queda el número "
                  + Ejer.quitaPorDelante(numero, digito));
          Thread.sleep(5000);
          break;
        case "11": // Pegar dígitos por detrás a un número
          numero = Herramientas.entero("Introduce un número: ");
          otroNumero = Herramientas.entero("Introduce el número a pegar por la derecha: ");
          System.out.println("El número " + numero + " unido por la derecha al número " + otroNumero + " es "
              + Ejer.pegaPorDetras(numero, otroNumero));
          Thread.sleep(5000);
          break;
        case "12": // Pegar un dígitos por delante a un número.
          numero = Herramientas.entero("Introduce un número: ");
          otroNumero = Herramientas.entero("Introduce el número a pegar por la izquierda: ");
          System.out.println("El número " + numero + " unido por la izquierda al número " + otroNumero + " es "
              + Ejer.pegaPorDelante(numero, otroNumero));
          Thread.sleep(5000);
          break;
        case "13": // Obtener un trozo de un número.
          numero = Herramientas.entero("Introduce un número: ");
          System.out.println(
              "Vas a indicar las posiciones del trozo del número. Las posiciones se cuentan de izquierda a derecha comenzando por el cero");
          do {
            posicion = Herramientas.entero("Introduce la posición inicial del trozo: ");
            if (posicion >= 0 && posicion < Ejer.digitos(numero)) {
              break;
            } else {
              System.out.println("Posición inicial no correcta");
            }
          } while (true);
          do {
            otraPosicion = Herramientas.entero("Introduce la posición final del trozo: ");
            if (otraPosicion >= 0 && otraPosicion < Ejer.digitos(numero) && posicion <= otraPosicion) {
              break;
            } else {
              System.out.println("Posición final se sale del número");
            }
          } while (true);
          System.out.println("El trozo del número " + numero + " desde la posición inicial " + posicion
              + " y posición final " + otraPosicion + " es " + Ejer.trozoDeNumero(numero, posicion, otraPosicion));
          Thread.sleep(5000);
          break;
        case "14": // Une dos números
          numero = Herramientas.entero("Introduce un número: ");
          otroNumero = Herramientas.entero("Introduce otro número: ");
          System.out.println("La unión de los números " + numero + " y " + otroNumero + " es "
              + Ejer.juntaNumeros(numero, otroNumero));
          Thread.sleep(5000);
          break;
        case "15": // Muestra los primos entre dos números
          SolEjer15.Caso15(numero,otroNumero);
          Thread.sleep(5000);
          break;
        case "16": // Muestra los números capicúa entre dos números
          numero = Herramientas.entero("Introduce un número: ");
          do {
            otroNumero = Herramientas.entero("Introduce otro número: ");
            if (otroNumero < numero) {
              System.out.println("Debes introducir un número mayor a " + numero);
            }
          } while (otroNumero < numero);
          System.out.println("Los capicúos entre " + numero + " y " + otroNumero + " son ");
          Ejer.escapicuaEntre(numero, otroNumero);
          Thread.sleep(5000);
          break;
        default:
          System.out.println("\nopción inválida (1-16)");
          Thread.sleep(5000);
      }
    } while (!salir);
  }
}
