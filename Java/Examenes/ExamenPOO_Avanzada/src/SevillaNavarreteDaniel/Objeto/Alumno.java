package SevillaNavarreteDaniel.Objeto;

/**
 * (Enunciado)
 * 
 * @author daniS
 */
public class Alumno extends Persona {
    // Atributos/////////////////////
    int calificacionActual;

    // Metodos////////////////////////

    // Constructor por defecto
    public Alumno() {
        super.setEdad((int)(Math.random()*(16-12)+12));
        calificacionActual = (int)(Math.random()*10);
    }

    // Constructor para instanciar objeto con dos parametros
    public Alumno(String nombre, int edad, int calificacionActual) {
        super(nombre, edad);
        this.calificacionActual = calificacionActual;
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
     * Mira la probabilidad de que el alumno asista a clase y setea el booleano 
     * impuesto en la clase padre
     * 
     * @param nada
     * @return booleano
     */
    public boolean disponibilidad(){
        int aleatorio = (int)(Math.random()*101);
        if(aleatorio > 50){
            return true;
        }else{
            return false;
        }
    }
}
