/*
Ejemplo_1 Leer dos cadenas de texto e imprimir la mayor de ellas y su longitud.
 */

public class Ejer1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String cadena1 = Pide.cadena("primera palabra");
    String cadena2 = Pide.cadena("segunda palabra");
    
    int lon1 = cadena1.length();
    int lon2 = cadena2.length();
    System.out.println("La longitud de " + cadena1 + " es " + lon1);
    System.out.println("La longitud de " + cadena2 + " es " + lon2);
    if (lon1 > lon2) {
      System.out.println("La cadena de mayor longitud es: " + cadena1);
    } else if (lon2 > lon1) {
      System.out.println("La cadena de mayor longitud es: " + cadena2);
    } else {
      System.out.println("Las cadenas tienen la misma longitud");
    }
  }

}
