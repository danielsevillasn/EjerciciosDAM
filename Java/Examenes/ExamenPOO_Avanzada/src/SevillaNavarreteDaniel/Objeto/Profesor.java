package SevillaNavarreteDaniel.Objeto;

import SevillaNavarreteDaniel.Enumerado.Materias;
import SevillaNavarreteDaniel.Interfaz.DarMateria;

/**
 * (Enunciado)
 * 
 * @author daniS
 */
public class Profesor extends Persona implements DarMateria{
    // Atributos/////////////////////
    private Materias MateriasDisponibles;

    // Metodos////////////////////////

    // Constructor por defecto
    public Profesor() {
        super.setEdad((int)(Math.random()*(51-25)+25));
        eligeMateria();
    }

    // Constructor para instanciar objeto con dos parametros
    public Profesor(String nombre, int edad, Materias materiasDisponibles) {
        super(nombre, edad);
        MateriasDisponibles = materiasDisponibles;
    }
    

    // Getter
    public Materias getMateriasDisponibles() {
        return MateriasDisponibles;
    }
    
    // Setter
    public void setMateriasDisponibles(Materias materiasDisponibles) {
        MateriasDisponibles = materiasDisponibles;
    }
    
    // Otros metodos
    /**
     * Mira la probabilidad de que el profesor asista a clase y setea el booleano 
     * impuesto en la clase padre
     * 
     * @param nada
     * @return booleano
     */
    public boolean disponibilidad(){
        int aleatorio = (int)(Math.random()*101);
        if(aleatorio > 20){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Elige la materia aleatoriamente del profesor
     * 
     * @param nada
     * @return nada
     */
    public void eligeMateria(){
        int aleatorio = (int)(Math.random()*3);
        switch (aleatorio) {
            case 0:
                MateriasDisponibles = Materias.values()[aleatorio];
                break;
            case 1:
                MateriasDisponibles = Materias.values()[aleatorio];
                break;
            case 2:
                MateriasDisponibles = Materias.values()[aleatorio];
                break;
            default:
                break;
        }
    }
}
