/*
 Ejemplo_7 Formatear un string leído por teclado, poner todo en minúscula y el primer caracter en mayúscula
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.Pide;

/**
 *
 * @author Inma
 */
public class Ejer7bis {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  
    //pido frase
    String cadena = Pide.cadena("Dame una palabra o frase");
    System.out.println("Ha escrito " + cadena);
    cadena=cadena.toLowerCase();
    cadena=cadena.replaceFirst((cadena.substring(0, 1)), (cadena.substring(0, 1)).toUpperCase());

    System.out.println("La frase queda como: "+cadena);
  }

}
