/*
 Ejemplo_5 
Mostrar un parrafo de varias lineas y pedir una palabra, mostrar el parrafo de nuevo sin esa la palabra. 
Posteriormente completar el ejercicio haciendo que pida palabras que se irán eliminando hasta que se introduzca la palabra salir.
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.*;

/**
 *
 *
 * @author Inma
 */
public class Ejer5 {

  public static void main(String[] args) {
    String parrafo[] = { "Y, viéndole don Quijote de aquella manera, con muestras de tanta tristeza, le dijo:",
        "Sábete, Sancho, que no es un hombre más que otro si no hace más que otro.",
        "Todas estas borrascas que nos suceden son señales de que presto ha de serenar el tiempo",
        "y han de sucedernos bien las cosas; porque no es posible que el mal venza" };
    // muestro líneas del párrafo
    Varios.muestra(parrafo);
    // palabra a eliminar le añado un espacio en blanco antes y después
    String palabraVacia = "";
    String palabraBuscada = Pide.cadena("Dame palabra a eliminar");
    String espacio = " ";

    // palabraBuscada = (Pide.cadena("Dame palabra a eliminar")).concat(espacio);

    while (!((palabraBuscada).trim()).equalsIgnoreCase("salir")) {
      for (int i = 0; i < parrafo.length; i++) {
        parrafo[i] = parrafo[i].replace(palabraBuscada, palabraVacia);
      }
      // muestro parrafo modificado
      Varios.muestra(parrafo);
      palabraBuscada = Pide.cadena("Dame palabra a sustituir. Para terminar escribe salir");
    }

  }

}
