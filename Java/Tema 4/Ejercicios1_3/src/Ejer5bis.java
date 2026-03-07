/*Ejemplo_5 
Mostrar un parrafo de varias lineas y pedir una palabra, mostrar el parrafo de nuevo sin esa la palabra. 
Posteriormente completar el ejercicio haciendo que pida palabras que se ir�n eliminando hasta que se introduzca la palabra salir.
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.*;

/**
 *
 * @author Inma
 */
public class Ejer5bis {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String parrafo[] = { "Y, viéndole don Quijote de aquella manera, con muestras de tanta tristeza, le dijo:",
        "Sábete, Sancho, que no es un hombre más que otro si no hace más que otro.",
        "Todas estas borrascas que nos suceden son señales de que presto ha de serenar el tiempo",
        "y han de sucedernos bien las cosas; porque no es posible que el mal venza" };

    // muestro líneas del párrafo
    Varios.muestra(parrafo);
    // palabra a eliminar le añado un espacio en blanco antes y después
    String palabraBuscada = Pide.cadena("Dame palabra a eliminar");
    String palabraArreglada = "";

    // bucle para repetir hasta que se teclee salir
    while (!((palabraBuscada).trim()).equalsIgnoreCase("salir")) {

      // recorro línea a línea del párrafo
      for (int i = 0; i < parrafo.length; i++) {

        palabraArreglada = Varios.arreglaCadena(parrafo[i], palabraBuscada);
        while (parrafo[i].indexOf(palabraArreglada) != -1) {

          if ((parrafo[i].indexOf(palabraArreglada) == 0)) {// caso de ser la primera palabra
            parrafo[i] = parrafo[i].substring(0, parrafo[i].indexOf(palabraArreglada)) +
                (parrafo[i].substring(parrafo[i].indexOf(palabraArreglada) + palabraArreglada.length())).trim();

          } else {
            parrafo[i] = parrafo[i].substring(0, parrafo[i].indexOf(palabraArreglada.trim()))
                + parrafo[i].substring(parrafo[i].indexOf(palabraArreglada) + palabraArreglada.length());

          }
          palabraArreglada = Varios.arreglaCadena(parrafo[i], palabraBuscada); // vuelvo a crear la palabra arreglada
        } // fin una línea
      } // fin parrafo
      Varios.muestra(parrafo); // muestro parrafo modificado
      palabraBuscada = Pide.cadena("Dame palabra a eliminar");// pido nueva palabra
    } // fin bucle salir
  }
}
