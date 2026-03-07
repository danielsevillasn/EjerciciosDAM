/*
 Ejemplo_7 Formatear un string leído por teclado, poner todo en minúscula y el primer caracter en mayúscula
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.Pide;

/**
 *
 * @author Inma
 */
public class Ejer7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String cadenaMay = "";
    String cadenaMin = "";
    //pido frase
    String cadena = Pide.cadena("Dame una palabra o frase");
    System.out.println("Ha escrito " + cadena);
    //divido en partes la frase
    cadenaMin = cadena.substring(1).toLowerCase();
    cadenaMay = (cadena.substring(0, 1)).toUpperCase();
    //uno las dos partes
    //cadena = cadenaMay.concat(cadenaMin);
    cadena=((cadena.substring(0, 1)).toUpperCase()).concat(cadena.substring(1).toLowerCase());
 

    System.out.println("La frase queda como: "+cadena);
  }

}
