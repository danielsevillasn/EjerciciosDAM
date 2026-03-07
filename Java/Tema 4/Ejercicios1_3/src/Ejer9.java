/*
 Ejemplo_9 
Leer una cadena de texto por teclado y pedir un numero entre 1 y 25 para encriptarla.
La encriptación consiste en cambiar cada caracter de la cadena por el correspondiente a su codigo ascii más el numero leído. 
Mostrar la frase encriptada
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.*;

/**
 *
 * @author Inma
 */
public class Ejer9 {

  public static void main(String[] args) {

    String texto;
    int codigo;
    char opcion;
//Introducir un texto
    do {
      texto=Pide.cadena("Dame un texto para cifrar");
    } while (texto.isEmpty());
//Introducir el valor del desplazamiento
    do {     
      codigo = Pide.numero("Dame un número entre 1 y 25");
    } while (codigo < 1 || codigo>25);

      System.out.println("Texto cifrado: " + Varios.cifradoCesar(texto, codigo));

  }
}
