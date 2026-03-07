package SevillaNavarreteDaniel.Objeto;

import SevillaNavarreteDaniel.Enumerado.*;
import SevillaNavarreteDaniel.Interfaz.DarMateria;
import SevillaNavarreteDaniel.Secundaria.*;

public class Profesor extends Persona implements DarMateria{
    private Materias materiaProfesor;

    public Profesor() {
        super();
        setEdad(Auxiliar.aleatorio(25, 50));
        disponibilidad();
        eligeMateria();
    }

    public Materias getMateriaProfesor() {
        return materiaProfesor;
    }

    public void setMateriaProfesor(Materias materiaProfesor) {
        this.materiaProfesor = materiaProfesor;
    }

    @Override
    public void disponibilidad(){
        boolean disponible;
        int aleatorio = Auxiliar.aleatorio(0, 100);
        if(aleatorio>20){
            disponible = true;
        }else{
            disponible = false;
        }
        asistencia = disponible;
    }

    @Override
    public void eligeMateria(){
        int aleatorio = Auxiliar.aleatorio(0, 3);
        materiaProfesor = Materias.values()[aleatorio];
    }
}
