package SevillaNavarreteDaniel.Objeto;

import SevillaNavarreteDaniel.Enumerado.Materias;
import SevillaNavarreteDaniel.Interfaz.DarMateria;

/**
 * (Enunciado)
 * 
 * @author daniS
 */
public class Aula implements DarMateria {
    // Atributos/////////////////////
    private int nMaxAlumnos;
    private static int idTotal = 1;
    private Materias MateriasAula;
    private Profesor profesor;
    private Alumno[] listaAlumnos;

    private final int max_alumnos = 20;
    private int id;

    // Metodos////////////////////////

    // Constructor por defecto
    public Aula() {
        this.id = idTotal++;
        eligeMateria();
        profesor = new Profesor();

        int minAlumnos = 5;
        int cantidadAlumnos = (int) (Math.random() * (max_alumnos+1-minAlumnos)+minAlumnos);
        listaAlumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            listaAlumnos[i] = new Alumno();
        }
    }

    // Getter
    public Alumno[] getListaAlumnos() {
        return listaAlumnos;
    }

    public int getnMaxAlumnos() {
        return nMaxAlumnos;
    }

    public int getId() {
        return id;
    }

    public static int getIdTotal() {
        return idTotal;
    }

    public int getMax_alumnos() {
        return max_alumnos;
    }

    public Materias getMateriasAula() {
        return MateriasAula;
    }

    // Setter
    public void setnMaxAlumnos(int nMaxAlumnos) {
        this.nMaxAlumnos = nMaxAlumnos;
    }

    public void setMateriasAula(Materias materiasAula) {
        MateriasAula = materiasAula;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Otros metodos
    /**
     * Elige la materia aleatoriamente del aula
     * 
     * @param nada
     * @return nada
     */
    public void eligeMateria() {
        int aleatorio = (int) (Math.random() * 3);
        switch (aleatorio) {
            case 0:
                MateriasAula = Materias.values()[aleatorio];
                break;
            case 1:
                MateriasAula = Materias.values()[aleatorio];
                break;
            case 2:
                MateriasAula = Materias.values()[aleatorio];
                break;
            default:
                break;
        }
    }

    /**
     * Mira la probabilidad de que el profesor asista a clase y devuelve el booleano
     * 
     * 
     * @param nada
     * @return Boolean basado en si el alumno asiste o no
     */
    public boolean AsistenciaAlumnos() {
        int asistentes = 0;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.disponibilidad()) {
                asistentes++;
            }
        }
        return asistentes >= (listaAlumnos.length / 2);
    }

    /**
     * Mira la probabilidad de que el profesor asista a clase y setea el booleano 
     * impuesto en la clase padre
     * 
     * @param nada
     * @return Boolean basado en si el alumno asiste o no
     */
    public Boolean darClase(){
        if(!AsistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente, no se puede dar clase");
            return false;
        }

        if(!profesor.disponibilidad()){
            System.out.println("El profesor no esta, no se puede dar la clase");
            return false;
        }

        if(profesor.getMateriasDisponibles() != MateriasAula){
            System.out.println("La materia del profesor y del aula no es la misma");
            System.out.println("Materia del profesor: "+profesor.getMateriasDisponibles());
            System.out.println("Materia del aula: "+MateriasAula);
            return false;
        }
        return true;
    }

    /**
     * Calcula la cantidad de aprobados
     * 
     * 
     * @param nada
     * @return nada
     */
    public void notas() {
        int aprobados = 0;
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Nombre: " + alumno.getNombre() + ".......\tnota: " + alumno.calificacionActual);
            if(alumno.getCalificacionActual() >=5){
                aprobados++;
            }
        }
        System.out.println("Hay "+aprobados+" aprobados/as");

    }
}