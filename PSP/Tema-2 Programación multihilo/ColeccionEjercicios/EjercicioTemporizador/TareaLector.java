package EjercicioTemporizador;

import java.util.TimerTask;

public class TareaLector extends TimerTask {
    Monitor monitor;
    String ultimaLectura = "";
    boolean estaVivo = true;

    public TareaLector(Monitor mon) {
        this.monitor = mon;
    }

    /**
     * Método que se ejecuta cuando se inica la tarea del timer en el schedule
     */
    @Override
    public void run() {
        String lectura = monitor.devuelveInfo(); //Recoge el string del monitor
        System.out.println("Lector: " + lectura); //Lo imprime

        if (lectura.equals(ultimaLectura)) { //Si ambas lecturas son iguales, muere
            System.out.println("Muere el Lector porque la publicacion no cambia");
            estaVivo = false;
        } else {
            ultimaLectura = lectura;
        }
    }
}
