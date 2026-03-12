package Objeto;

import Excepciones.ExcepcionAlumnoNoAsiste;
import MetodosSecundarios.Calculos;

/**
 * Clase abstracta que representa las personas
 * 
 * @author Dani S
 */
public abstract class Persona {
    // Atributos/////////////////////
    private String nombre;
    private int edad;
    private boolean asistencia;

    // Metodos////////////////////////

    // Constructor por defecto
    public Persona() {
        String[] nombres = { "Pepe", "Juan", "Mario", "Raul", "Dani",
                "Pepe", "Juan", "Mario", "Raul", "Dani",
                "Pepe", "Juan", "Mario", "Raul", "Dani",
                "Pepe", "Juan", "Mario", "Raul", "Dani" };
        nombre = nombres[Calculos.aleatorio(0, nombres.length-1)];
    }
    
    // Getter
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public boolean isAsistencia() {
        return asistencia;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    // Otros metodos
    abstract void disponibilidad() throws ExcepcionAlumnoNoAsiste;

    // toString
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", asistencia=" + asistencia + "]";
    }
}
