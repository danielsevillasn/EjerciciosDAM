package modeloExamen1Evaluacion;

import java.io.File;
import java.io.IOException;

/**
 * Hilo que ejecuta los diferentes procesos hijos
 * 
 * HiloProcesos
 */
public class HiloProcesos implements Runnable{
    private ProcessBuilder pb;
	private Process proceso;
    private MonitorProcesos monitor;

    public HiloProcesos(MonitorProcesos m){
        this.monitor = m;
    }

    @Override
    public void run() {
		try {
            pb = new ProcessBuilder(
                    "java",
                    "-cp", ".",
                    "modeloExamen1Evaluacion.Encuestado");
            pb.directory(new File("./bin"));
            proceso = pb.start();

            monitor.registrarProceso(proceso);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
    }

}
