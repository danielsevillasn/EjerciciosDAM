/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAula.HerenciaInterfaces.Ej6libroImplem;

import java.time.LocalDate;

/**
 *
 * @author Inma
 */
public class PruebaPubli {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //Publicacion miPubli= new Publicacion();

    Libro[] misLibros = new Libro[3];
    //creo libros
    misLibros[0] = new Libro(1, "Primer Libro", LocalDate.of(2023, 8, 12));
    misLibros[1] = new Libro(2, "Segundo Libro", LocalDate.now());
    misLibros[2] = new Libro(3, "Tercer Libro", LocalDate.of(2023, 8, 12));
    Revista[] misRevistas = new Revista[3];
    misRevistas[0] = new Revista(4, "Primera Revista", LocalDate.of(2023, 8, 12), 1);
    misRevistas[1] = new Revista(4, "Segunda Revista", LocalDate.of(2023, 8, 12), 2);
    misRevistas[2] = new Revista(6, "Tercera Revista", LocalDate.of(2023, 8, 12), 3);
    // prestar el libro 1
    misLibros[0].setPrestado(true);
     for (Libro miLib:misLibros){
       System.out.println(miLib);
     }
    
  }

}
