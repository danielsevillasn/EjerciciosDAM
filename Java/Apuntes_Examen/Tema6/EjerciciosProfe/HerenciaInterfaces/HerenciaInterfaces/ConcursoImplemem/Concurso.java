/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAula.HerenciaInterfaces.ConcursoImplemem;

/**
 *
 * @author inma
 */
public interface Concurso {
    double getpremio();
    String getNombreParticipante();
    void setEdadParticipante(int edad);
    int getEdadParticipante();
    public static double getMediaEdadParticipantes(Concursante concursantes[]){return 0;}
    public static void ganadorConcurso(Concursante concursantes[]){}
}
