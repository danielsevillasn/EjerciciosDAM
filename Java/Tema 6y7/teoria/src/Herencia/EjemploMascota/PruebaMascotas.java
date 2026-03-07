/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema10.tema.Ejemplo;

/**
 *
 * @author inma
 */
public class PruebaMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato g1 = new Gato("Sardinas", "Tom");
        Mascota mascotaDeGuillermo = new Mascota("Pienso", "Jerry");
        
        System.out.println(g1.toString());
    }
    
}
