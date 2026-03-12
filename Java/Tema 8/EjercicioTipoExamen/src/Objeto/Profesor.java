package Objeto;

import Enumerado.Materia;
import Interfaz.DarMateria;
import MetodosSecundarios.Calculos;

/**
 * Clase que instancia objetos tipo Profesor
 * 
 * @author Dani S
 */
public class Profesor extends Persona implements DarMateria {
    // Atributos/////////////////////
    private Materia materiaProfesor;

    // Metodos////////////////////////

    // Constructor por defecto
    public Profesor() {
        super();
        super.setEdad(Calculos.aleatorio(25, 50));
        disponibilidad();
        eligeMateria();
    }

    // Getter
    public Materia getMateriaProfesor() {
        return materiaProfesor;
    }

    // Setter
    public void setMateriaProfesor(Materia materiaProfesor) {
        this.materiaProfesor = materiaProfesor;
    }

    // Otros metodos
    /**
     * Calcula si el alumno asiste o no a clase
     */
    public void disponibilidad() {
        int aleatorio = Calculos.aleatorio(0, 100);
        if (aleatorio > 20) {
            setAsistencia(true);
        } else {
            setAsistencia(false);
        }
    }

    /**
     * Establece aleatoriamente la materia del profesor
     */
    public void eligeMateria() {
        int aleatorio = Calculos.aleatorio(0, 2);
        setMateriaProfesor(Materia.values()[aleatorio]);
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "Profesor [materiaProfesor=" + materiaProfesor + "]";
    }

}
