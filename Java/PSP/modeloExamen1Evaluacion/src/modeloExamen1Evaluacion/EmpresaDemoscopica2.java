package modeloExamen1Evaluacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Procesos ejecutados de forma simultanea
 * 
 * EmpresaDemoscopica2
 */
public class EmpresaDemoscopica2 {

	public static void main(String[] args) {
		int nEncuestados = pedirNumeroEncuestados();

		System.out.println("\n** Participan " + nEncuestados + " encuestados con nombres **\n");

		List<String> coleccionNombres = new ArrayList<>();
		ejecucion_Lectura_Procesos(nEncuestados, coleccionNombres);

		System.out.println("\n** Todos los encuestados han terminado **\n");

		System.out.println("** Procesando los resultados **");
		MonitorEncuestas monitorEncuestas = new MonitorEncuestas();
		List<Thread> hilosLectores = new ArrayList<>();

		ejecucionHilos(coleccionNombres, monitorEncuestas, hilosLectores);

		// Implementa la espera de cada hilo respectivamente
		for (Thread hiloLector : hilosLectores) {
			try {
				hiloLector.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("El hilo principal ha sido interrumpido");
				return;
			}
		}

		getResultadosEncuesta(monitorEncuestas);

	}

	/**
	 * Método que pide el numero de los encuestados
	 * 
	 * @param 'nada'
	 * @return numero entero que representa el numero de encuestados
	 */
	private static int pedirNumeroEncuestados() {
		Scanner s = new Scanner(System.in);
		int nEncuestados = 5;
		try {
			System.out.print("Indica el numero de encuestados que participan: ");
			nEncuestados = Integer.parseInt(s.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("El mensaje ingresado no es un número, se ejecutan 5 procesos");
		}
		s.close();
		return nEncuestados;
	}

	/**
	 * Ejecuta un numero determinado de procesos y los almacena en una coleccion
	 * 
	 * @param nEncuestados numero de procesos a ejecutas
	 * @param procesos     coleccion de procesos
	 */
	private static void ejecucion_Lectura_Procesos(int nEncuestados, List<String> coleccionNombres) {
		MonitorProcesos monitorProcesos = new MonitorProcesos();
		List<Thread> hilosProcesos = new ArrayList<>();

		for (int i = 0; i < nEncuestados; i++) {
			Thread hiloProceso = new Thread(new HiloProcesos(monitorProcesos));
			hiloProceso.start();

			hilosProcesos.add(hiloProceso);
		}

		for (Thread hiloProceso : hilosProcesos) {
			try {
				hiloProceso.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}

		for (Process p : monitorProcesos.getProcesos()) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
				String linea = "";
				while ((linea = br.readLine()) != null) {
					coleccionNombres.add(linea.trim());
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		Collections.sort(coleccionNombres);
		for (String n : coleccionNombres) {
			System.out.println(n);
		}
	}

	/**
	 * Metodo que inicializa todos los hilos
	 * 
	 * @param coleccionNombres nombres de los ficheros
	 * @param monitor          clase monitor que recolecta los resultados
	 * @param hilosLectores    coleccion de hilos a instanciar
	 */
	private static void ejecucionHilos(List<String> coleccionNombres, MonitorEncuestas monitor,
			List<Thread> hilosLectores) {
		for (String nombreProceso : coleccionNombres) {
			Thread hiloLector = new Thread(new HiloLector(nombreProceso, monitor));
			hilosLectores.add(hiloLector);
			hiloLector.start();
		}
	}

	/**
	 * Imprime por pantalla los resultados de la encuesta
	 * 
	 * @param monitor clase monitor que recolecta los resultados
	 */
	private static void getResultadosEncuesta(MonitorEncuestas monitor) {
		System.out.println("\n** El resultado de la encuesta es **");
		int[] resultados = monitor.getResultados();
		for (int i = 0; i < resultados.length; i++) {
			if (resultados[i] > 0) {
				System.out.println(monitor.getColor(i) + ": " + resultados[i]);
			}
		}
		System.out.println(monitor.getSinRespuesta() + " encuestados no han participado en la encuesta");
	}
}
