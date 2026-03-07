/*
 Ejemplo_1 Leer dos cadenas de texto e imprimir la mayor de ellas y su longitud.
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.Pide;

public class Ejer1bis {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //pido las palabras usando método de clase Pide
    String cadena1 = Pide.cadena("Dame una palabra");
    String cadena2 = Pide.cadena("Dame otra palabra");
    System.out.println("Según el tamaño de las palabras:");
    //uso método length de String
    if (cadena1.length() > cadena2.length()) {
      System.out.println(cadena1 + " es mayor que " + cadena2 + " y su longitud es. " + cadena1.length());
    } else if (cadena1.length() < cadena2.length()) {
      System.out.println(cadena2 + " es mayor que " + cadena1 + " y su longitud es. " + cadena2.length());
    } else {
      System.out.println(cadena1 + " y " + cadena2 + " son iguales y sus longitudes son. " + cadena2.length());
    }

    // mayor o menor según léxico
    System.out.println("según orden alfabético:");
    //uso método compareTo de String
    if (cadena1.compareToIgnoreCase(cadena2) > 0) {
      System.out.println(cadena1 + " es mayor que " + cadena2 + " y su longitud es. " + cadena1.length());
    } else if (cadena1.compareToIgnoreCase(cadena2) < 0) {
      System.out.println(cadena2 + " es mayor que " + cadena1 + " y su longitud es. " + cadena2.length());
    } else if (cadena1.compareToIgnoreCase(cadena2) == 0) {
      System.out.println(cadena1 + " y " + cadena2 + " son iguales y sus longitudes son. " + cadena2.length());
    }
   
  }

}
