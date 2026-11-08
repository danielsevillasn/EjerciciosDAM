package EjercicioTemporizador;

import java.util.TimerTask;

public class TareaEscritor extends TimerTask {
    Monitor mon;
    int iNumPub = 1;

    public TareaEscritor(Monitor mon) {
        this.mon = mon;
    }

    /**
     * Método que se ejecuta cuando se inica la tarea del timer en el schedule
     */
    @Override
    public void run() {
        mon.actualizaInfo(iNumPub); //Actualiza el numero de la publicacion
        System.out.println("Escritor, actualiza a: " + mon.devuelveInfo()); // Mensaje de comprobación
        iNumPub++;
    }
}
