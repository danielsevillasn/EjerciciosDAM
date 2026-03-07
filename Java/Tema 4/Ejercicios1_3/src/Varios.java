/*
 * clase con varios métodos utilizados
 */
package tema.cadenas.boletin1.gestionaBoletin1;

/**
 *
 * @author Inma
 */
public class Varios {

  /**
   * Muestra un array de String
   *
   * @param parrafo array de String que se mostrará
   *
   */
  public static void muestra(String[] parrafo) {
    //muestro líneas del párrafo
    for (String linea : parrafo) {
      System.out.println(linea);
    }
  }

  /**
   * Cifra un texto según un código
   *
   * @param texto String que quiero cifrar
   * @param codigo número entero con el que cifro
   * @return texto cifrado
   */
  public static String cifradoCesar(String texto, int codigo) {

//ejemplo hecho con clase StringBuilder que permite modificar objetos String
    /* StringBuilder cifrado = new StringBuilder(texto.length());
    for (int i = 0; i < texto.length(); i++) {
      char carNumero=  (char)(texto.charAt(i)+codigo);
       cifrado.append(carNumero);
    }
// return cifrado.toString();*/
    char[] cifrado = texto.toCharArray();
    for (int i = 0; i < texto.length(); i++) {
      cifrado[i] = (char) (cifrado[i] + codigo);
    }
    return String.valueOf(cifrado);
  }

  /**
   * Comprueba si una cadena empieza o termina por una subcadena
   *
   * @param cadena String en la que busco
   * @param subcadena String que quiero encontrar en la cadena
   * @param tipo donde la quiero encontrar al principio(star) o al final(end)
   * @return verdadero si la encuentro y falso en caso contrario
   */
  public static boolean filtrar(String cadena, String subcadena, String tipo) {
    boolean puedoFiltrar = false;

    if (tipo.equalsIgnoreCase("star")) {
//      String cadenaMin= cadena.toLowerCase();
//      String subcadenaMin= subcadena.toLowerCase();
//      puedoFiltrar=cadenaMin.startsWith(subcadenaMin);

      puedoFiltrar = (cadena.toLowerCase()).startsWith(subcadena.toLowerCase());
    }
    if (tipo.equalsIgnoreCase("end")) {
      puedoFiltrar = (cadena.toLowerCase()).endsWith(subcadena.toLowerCase());
    }

    return puedoFiltrar;
  }

  /*Comprueba si una cadena empieza o termina por una  subcadena y la devuelve añadiendo en espacio en blanco por delante o por detrás
   *
   * @param cadena  String en la que busco
   * @param subcadena  String que quiero encontrar en la cadena
   * @return una nueva cadena igual a la cadena original más un espacio dependiendo de si empieza o termina por subcadena. 
   * Añade espacios delante y detrás en otro caso
   */
  public static String arreglaCadena(String cadena, String subcadena) {
    String espacio = " ";
    if (Varios.filtrar(cadena, subcadena, "star")) {
      return subcadena.concat(espacio);
    } else if (Varios.filtrar(cadena, subcadena, "end")) {
      return espacio.concat(subcadena);
    } else {
      return (espacio.concat(subcadena)).concat(espacio);
    }
  }

  /*busca una subcadena en una cadena
   *
   * @param cadena  String en la que busco
   * @param subcadena  String que quiero encontrar en la cadena
   * @return verdadero o falso dependiendo de si la encuentra o no
   */
  public static boolean busca(String cadena, String subcadena) {
    return cadena.indexOf(subcadena) != -1;
  }

}
