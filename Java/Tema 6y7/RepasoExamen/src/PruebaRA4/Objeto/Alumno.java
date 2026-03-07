package SevillaNavarreteDaniel.Objeto;
import SevillaNavarreteDaniel.Secundaria.*;
public class Alumno extends Persona{
    private int calificacionActual;

    public Alumno() {
        super();
        setEdad(Auxiliar.aleatorio(12, 15));
        disponibilidad();
    }

    public int getCalificacionActual() {
        return calificacionActual;
    }

    public void setCalificacionActual(int calificacionActual) {
        this.calificacionActual = calificacionActual;
    }
    
    @Override
    public void disponibilidad(){
        boolean disponible;
        int aleatorio = Auxiliar.aleatorio(0, 100);
        if(aleatorio>50){
            disponible = true;
        }else{
            disponible = false;
        }
        asistencia = disponible;
    }
}
