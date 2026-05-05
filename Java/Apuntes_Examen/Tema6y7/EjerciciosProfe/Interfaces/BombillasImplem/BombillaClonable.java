/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Defina una clase que sirva para representar el estado de una bombilla 
(encendido o apagado). Defina, asimismo, dosm�todos que permitan encender (on) 
y apagar (off) la luz de la bombilla.
Para probarlo, cree unm�todo main que cree un objeto de la clase definida, 
que haga uso de losm�todos previamente definidos y vaya mostrando el estado 
de la bombilla.*/

public class BombillaClonable implements Clonable{
    String nombre;
    boolean estado;

    public BombillaClonable(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Bombilla{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }
    @Override
    public Object clone(){
        Object obj=null;
        System.out.println("¡¡CLONANDO!!");
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }
    
}
