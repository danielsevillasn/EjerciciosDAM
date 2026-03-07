/*
Ejemplo_8 Leer dos cadenas de textos y decir si son equivalentes 
(si son iguales ignorando las mayúsculas y los espacios del principio y del final).
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.Pide;

public class Ejer8 {

  public static void main(String[] args) {
//    String cadena1 = (Pide.cadena("Cadena1")).trim();
//    String cadena2 = (Pide.cadena("Cadena2")).trim();
//    
//    if(cadena1.equalsIgnoreCase(cadena2)){
//      System.out.println("Las cadenas son iguales");
//    }else{
//      System.out.println("Las cadenas NO son iguales");
//    }

String cadena1 = Pide.cadena("Cadena1");
    String cadena2 = Pide.cadena("Cadena2");
    
    if((cadena1.trim()).equalsIgnoreCase(cadena2.trim())){
      System.out.println("Las cadenas son iguales");
    }else{
      System.out.println("Las cadenas NO son iguales");
    }

  }

}
