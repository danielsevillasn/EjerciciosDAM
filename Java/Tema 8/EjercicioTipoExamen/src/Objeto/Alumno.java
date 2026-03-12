package Objeto;

import Excepciones.ExcepcionAlumnoNoAsiste;
import MetodosSecundarios.Calculos;

/**
 * Clase que instancia objetos tipo alumno
 * 
 * @author Dani S
 */
public class Alumno extends Persona {
    // Atributos/////////////////////
    private int calificacionActual;

    // Metodos////////////////////////

    // Constructor por defecto
    public Alumno() throws ExcepcionAlumnoNoAsiste{
        super();
        super.setEdad(Calculos.aleatorio(12, 15));
        try{
            disponibilidad();
        }catch(ExcepcionAlumnoNoAsiste e){
            System.out.println(e.getMessage());
        }
        calificacionActual = Calculos.aleatorio(0, 10);
    }

    // Getter
    public int getCalificacionActual() {
        return calificacionActual;
    }

    // Setter
    public void setCalificacionActual(int calificacionActual) {
        this.calificacionActual = calificacionActual;
    }

    // Otros metodos
    /**
     * Calcula si el alumno asiste o no a clase
     */
    public void disponibilidad() throws ExcepcionAlumnoNoAsiste{
        int aleatorio = Calculos.aleatorio(0, 100);
        if (aleatorio > 50) {
            setAsistencia(true);
        } else {
            setAsistencia(false);
            throw new ExcepcionAlumnoNoAsiste("El alumno: "+getNombre()+" no asiste a clase");
        }
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "Alumno [calificacionActual=" + calificacionActual + "]";
    }
}
