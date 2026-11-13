package modeloExamen1Evaluacion;

import java.util.ArrayList;

/**
 * Clase que monitorea todos los procesos añadidos y los devuelve
 * 
 * MonitorProcesos
 */
public class MonitorProcesos{
    ArrayList<Process> procesos = new ArrayList<Process>();

    public synchronized void registrarProceso(Process p){
        procesos.add(p);
    }

    public ArrayList<Process> getProcesos() {
        return procesos;
    }
}
