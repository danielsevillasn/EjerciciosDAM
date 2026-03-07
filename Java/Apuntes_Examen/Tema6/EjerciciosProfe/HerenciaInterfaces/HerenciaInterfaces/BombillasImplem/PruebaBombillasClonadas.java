/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAula.HerenciaInterfaces.BombillasImplem;

/**
 *
 * @author inma
 */
public class PruebaBombillasClonadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BombillaClonable b1 = new BombillaClonable("Baño", false);
        BombillaClonable b2 = new BombillaClonable("Comedor", true);
        BombillaClonable b3 = new BombillaClonable("Salón", false);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        BombillaClonable b4 = (BombillaClonable) b1.clone();
        BombillaClonable b5 = (BombillaClonable) b2.clone();
        System.out.println("Clonaciones:");
        System.out.println(b4);
        System.out.println(b5);

        b1.setEstado(true);
        b2.setEstado(false);

        System.out.println("ESTADOS FINALES:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

    }
}
