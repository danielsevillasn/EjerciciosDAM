package Objeto;

import Enumerado.Materia;
import Excepciones.ExcepcionAlumnoNoAsiste;
import Interfaz.DarMateria;
import MetodosSecundarios.Calculos;

/**
 * (Enunciado clase)
 * 
 * @author Dani S
 */
public class Aula implements DarMateria {
    // Atributos/////////////////////
    private final int MAX_ALUMNOS = 20;
    private static int idIncrementado = 0;
    private int id;
    private Materia materiaAula;
    private Profesor profesor;
    private Alumno[] alumnos;

    // Metodos////////////////////////

    // Constructor por defecto
    public Aula() throws ExcepcionAlumnoNoAsiste{
        profesor = new Profesor();

        id = idIncrementado++;

        alumnos = new Alumno[MAX_ALUMNOS];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
        }

        eligeMateria();
    }

    // Getter
    public int getMAX_ALUMNOS() {
        return MAX_ALUMNOS;
    }

    public static int getIdIncrementado() {
        return idIncrementado;
    }

    public int getId() {
        return id;
    }

    public Materia getMateriaAula() {
        return materiaAula;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    // Setter
    public static void setIdIncrementado(int idIncrementado) {
        Aula.idIncrementado = idIncrementado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMateriaAula(Materia materiaAula) {
        this.materiaAula = materiaAula;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    // Otros metodos
    /**
     * Establece aleatoriamente la materia del profesor
     */
    public void eligeMateria() {
        int aleatorio = Calculos.aleatorio(0, 2);
        setMateriaAula(Materia.values()[aleatorio]);
    }

    /**
     * Mide la asistencia general del alumnado
     * 
     * @return boolean
     */
    public boolean asistenciaAlumnos() {
        int asistentes = 0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].isAsistencia()) {
                asistentes++;
            }
        }

        if (asistentes >= MAX_ALUMNOS / 2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Mira si se puede dar la clase
     * 
     * @return boolean
     */
    public boolean darClase() {
        if (!asistenciaAlumnos()) {
            System.out.println("La asistencia general del alumnado no es suficiente");
            return false;
        }
        if (!profesor.isAsistencia()) {
            System.out.println("El profesor no asiste a clase");
            return false;
        }
        if (!(profesor.getMateriaProfesor() == materiaAula)) {
            System.out.println("La materia del profesor y del aula no son iguales");
            return false;
        }
        System.out.println("Se da la clase!");
        return true;
    }

    /**
     * muestra los datos del alumnado que han asistido a clase, así como el
     * número de aprobados de la clase.
     */
    public void notas() {
        int aprobados = 0;
        System.out.println("Datos del alumnado que ha asistido a clase: ");
        for (Alumno a : alumnos) {
            if(a.isAsistencia()){
                System.out.println(a);
                if (a.getCalificacionActual() >= 5) {
                    aprobados++;
                }
            }
        }
        System.out.println("Ha habido un total de: " + aprobados + " alumnos aprobados");
    }
    // toString
}
