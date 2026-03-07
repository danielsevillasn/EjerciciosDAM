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

public class Bombilla {
    String nombre;
    boolean estado;

    public Bombilla(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bombilla{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }

    
}
