/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAula.HerenciaInterfaces.ConcursoImplemem;

import EjemploAula.HerenciaInterfaces.ConcursoImplemem.Concursante;

/**
 *
 * @author inma
 */
public class PruebasConcursantes {
    public static void main(String[] args) {
        Concursante [] concursantes = new Concursante[5];
        
        concursantes[0]=new Concursante("Antonio", 20);
        concursantes[1]=new Concursante("Carmen", 21);
        concursantes[2]=new Concursante("Laura", 22);
        concursantes[3]=new Concursante("Adela", 23);
        concursantes[4]=new Concursante("Luis", 26);
        
        System.out.println("La media de edad de los concursantes es: "+Concursante.getMediaEdadParticipantes(concursantes));
        
        Concursante.ganadorConcurso(concursantes);
        
    }
    
}
