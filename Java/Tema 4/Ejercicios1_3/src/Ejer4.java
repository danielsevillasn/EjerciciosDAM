/* 
Ejemplo_4 Mostrar un parrafo de varias lineas y pedir una palabra, mostrar todas las posiciones en las que aparece dicha palabra
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.Pide;
import tema.cadenas.boletin1.gestionaBoletin1.Varios;

/**
 *
 * @author Inma
 */
public class Ejer4 {

  public static void main(String[] args) {

    String parrafo[] = { "Y, viéndole don Quijote de aquella manera, con muestras de tanta tristeza, le dijo:",
        "Sábete, Sancho, que no es un hombre más que otro si no hace más que otro.",
        "Todas estas borrascas que nos suceden son señales de que presto ha de serenar el tiempo",
        "y han de sucedernos bien las cosas; porque no es posible que el mal venza" };
    // muestro líneas del párrafo
    Varios.muestra(parrafo);
    // pido la palabra buscada en cada línea
    String palabra = Pide.cadena("qué palabra buscas??");
    // busco la palabra en cada línea y doy su posición
    int cont = 0;
    int posicion = 0;
    for (String linea : parrafo) {
      cont++;
      posicion = linea.indexOf(palabra);
      if (posicion == -1) {
        System.out.print("\nNo se encuentra en la linea " + cont);
      } else {
        System.out.print(" \nEn la línea  " + cont + " se encuentra en posición/nes " + (posicion + 1));
        while (posicion != -1) {
          System.out.print(", " + posicion);
          posicion = linea.indexOf(palabra, posicion + 1);// recoge la posición de la siguiente vez que aparece
        }
      }

    }
    System.out.println("\nBy");
  }

}
