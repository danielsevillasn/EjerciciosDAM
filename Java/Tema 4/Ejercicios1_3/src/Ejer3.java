/*
Ejemplo_3 Completar el ejercicio anterior añadiendo otro filtro con la terminaci�n del nombre. 
Si se introduce el texto vac�o ignorar el filtro.
 */
package tema.cadenas.boletin1;

import tema.cadenas.boletin1.gestionaBoletin1.*;


/**
 *
 * @author Inma
 */
public class Ejer3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String[] nombre = {"Paco Córdoba", "Bernardino Abascal Díaz", "René Ezequiel Carrión Borrás", "Joan de Torralba",
      "Silvestre Colom Lasa", "Purificación Rodrigo-Cámara", "Fabio Heras-Plaza", "Quirino Mas-Garriga", "Griselda Estrada Querol",
      "Patricio Arturo Cervera Manso", "Encarnación Sabater Aramburu", "Beatriz Mercedes Cabanillas Vizcaíno", "Mariana Castelló Roma",
      "Iván Salinas Rico", "Antonia Bárbara Poza Tamayo", "Felisa Jiménez Rivero", "Virgilio Gelabert Amorás", "Rufina Tejera Casal",
      "Valero Frías Casals", "Mohamed Pedrosa", "Maricruz Sosa Gil", "Ana Sofía Escobar Domingo", "Nacho Camacho Abella",
      "Olga Teresa Gomila Sosa", "Dionisia Alsina Salcedo", "Roberta Morante Carvajal", "Brunilda Fernández Castañeda", "Manola Ortega Bosch",
      "Obdulia Santiago Manso", "Rolando Basilio Soria Guitart", "Prudencia Herrero Sola", "Inocencio Bermádez Rosellá", "Hernán Jaume Zapata",
      "Mayara Rovira-Pinedo", "Olivia Clavero Briones", "Odalis Mármol-Niño", "Aroa Gomis-Quesada", "Emelina Pareja Pérez", "Isidro de Borrego",
      "Coral Alberola Valentín", "Francisca Pulido Prado", "Amor Arnal Sosa", "Ricarda Domingo Manjón", "Flavia de Bermúdez",
      "Caridad Ariel Sanjuan Escalona", "Gloria Talavera Blanco", "Quique Escolano Tamayo", "Ezequiel Puerta Ramón",
      "Ester Angélica Montesinos Rodrigo", "Encarnita Vilaplana Larrea"};
    
    String filtroInicio=Pide.cadena("Dime por qué deben empezar los nombres que buscas ");
    String filtroFin = Pide.cadena("Dime por qué deben terminar los nombres que buscas ");
    //recorro linea alinea
    for (int i = 0; i < nombre.length; i++)  {
      //filtroInicio esta lleno y filtroFin esta lleno
      if ((!filtroInicio.isEmpty() ) && ((!filtroFin.isEmpty() )) ) {// pregunta si el filtro no es una cadena vacía
        // compara filtro en minúsculas con final de nombres en minúscula
        if ( Varios.filtrar(nombre[i], filtroInicio, "star") &&  Varios.filtrar(nombre[i], filtroFin, "end") ) {
          System.out.println(nombre[i]);
        }
      }else if (!filtroInicio.isEmpty() ){
         if ( Varios.filtrar(nombre[i], filtroInicio, "star") ) {
          System.out.println(nombre[i]);
        }
      }else if (!filtroFin.isEmpty() ){
         if ( Varios.filtrar(nombre[i], filtroFin, "end") ) {
          System.out.println(nombre[i]);
        }
      }
    }
    

  }
}
