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
public class Gato extends Mascota{
    private String hablar="Miau";

    public Gato(String comer, String nombre) {
        super(comer, nombre);        
    }

    public void getHablar() {
        System.out.println("Miau Miau Miau");
    }

    @Override
    public String toString() {
        return super.toString()+"Gato{" + "hablar=" + hablar + '}';
    }

  
    
    
}
