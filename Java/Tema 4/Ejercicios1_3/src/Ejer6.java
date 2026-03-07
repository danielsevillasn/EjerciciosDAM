/*
 Ejemplo_6
Mostrar un parrafo de varias lineas y pedir una palabra del mismo y otra por la que se quiera sustituir. 
Imprimir el parrafo con la palabra cambiada.
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.*;

public class Ejer6 {

  public static void main(String[] args) {

    String parrafo[] = { "Y, viéndole don Quijote de aquella manera, con muestras de tanta tristeza, le dijo:",
        "Sábete, Sancho, que no es un hombre más que otro si no hace más que otro.",
        "Todas estas borrascas que nos suceden son señales de que presto ha de serenar el tiempo",
        "y han de sucedernos bien las cosas; porque no es posible que el mal venza" };
    String palabraReemplazo = "";
    String palabraReemplazoArreglada = "";
    String palabraBuscar = "";
    String palabraBuscarAreglada = "";
    boolean encontrado = false;
    String todasPalabras = "";
    // muestro líneas del párrafo
    Varios.muestra(parrafo);

    do {// busco la palabra en el párrafo y si no encuentra pido otra
      palabraBuscar = Pide.cadena("Dame palabra que quieres sustituir");
      for (int i = 0; i < parrafo.length; i++) {
        if ((parrafo[i].indexOf(palabraBuscar)) != -1) {
          encontrado = true;
          break;
        }
      }
      if (!encontrado) {
        System.out.println("No encuentro esa palabra ");
      }

    } while (!encontrado);// fin pedir palabra buscada
    // pido palabra para sustituir
    palabraReemplazo = Pide.cadena("Dame la palabra por la que  quieres sustituir ");
    // valido respuesta para eliminar todas las encontradas o sólo la primera
    do {
      todasPalabras = Pide.cadena("Quieres sustituir todas las palabras?? (S/N) ");

    } while (!todasPalabras.equalsIgnoreCase("S") && !todasPalabras.equalsIgnoreCase("N"));

    // línea a línea sustituyo todas o la primera encontrada
    for (int i = 0; i < parrafo.length; i++) {
      palabraBuscarAreglada = Varios.arreglaCadena(parrafo[i], palabraBuscar);
      palabraReemplazoArreglada = Varios.arreglaCadena(palabraBuscarAreglada, palabraReemplazo);

      if (todasPalabras.equalsIgnoreCase("S")) {
        parrafo[i] = parrafo[i].replaceAll(palabraBuscarAreglada, palabraReemplazoArreglada);
      } else {
        parrafo[i] = parrafo[i].replaceFirst(palabraBuscarAreglada, palabraReemplazoArreglada);
      }

    }
    Varios.muestra(parrafo);

  }

}
