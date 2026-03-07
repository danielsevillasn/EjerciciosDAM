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
public  class Mascota {
    protected String comer,nombre;

    public Mascota(String comer, String nombre) {
        System.out.println("Soy una mascota");
        this.comer = comer;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    @Override
    public String toString() {
        return "Mascota{" + "comer=" + comer + ", nombre=" + nombre + '}';
    }
    
    
}
