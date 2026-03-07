/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eva2.HerenciaInterfaces.ConcursoImplemem;

/**
 *
 * @author inma
 */
public class Concursante implements Concurso {

  private int premio = 50;
  private int edad;
  private String nombre;

  public Concursante(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  @Override
  public double getpremio() {
    return premio;
  }

  @Override
  public String getNombreParticipante() {
    return nombre;
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void setEdadParticipante(int edad) {
    this.edad = edad;
  }

  @Override
  public int getEdadParticipante() {
    return edad;
  }
  @Override
  public String toString(){
    return "Nombre: "+ nombre+ " Edad: "+ edad;
  }

  public static double getMediaEdadParticipantes(Concursante concursantes[]) {
    double media = 0;
    for (int i = 0; i < concursantes.length; i++) {
      media += concursantes[i].edad;
    }
    return media / (double) concursantes.length;
  }

  public static void ganadorConcurso(Concursante concursantes[]) {
    int ganador = (int) (Math.random() * concursantes.length);
    for (int i = 0; i < concursantes.length; i++) {
      if (i == ganador) {
        System.out.println("\n.... El/la ganador/a de esta edición ha sido: " + concursantes[i]);
      }
    }
  }

}
