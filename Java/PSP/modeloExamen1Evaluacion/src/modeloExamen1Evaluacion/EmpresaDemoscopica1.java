package modeloExamen1Evaluacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Procesos ejecutados de forma secuencial
 * 
 * EmpresaDemoscopica1
 */
public class EmpresaDemoscopica1 {

	public static void main(String[] args) {
		int nEncuestados = pedirNumeroEncuestados();

		ArrayList<Process> procesos = new ArrayList<Process>();

		System.out.println("\n** Participan " + nEncuestados + " encuestados con nombres **\n");

		ejecucionProcesos(nEncuestados, procesos);

		List<String> coleccionNombres = new ArrayList<>();
		lecturaNombres(procesos, coleccionNombres);

		System.out.println("\n** Todos los encuestados han terminado **\n");

		System.out.println("** Procesando los resultados **");
		MonitorEncuestas monitor = new MonitorEncuestas();
		List<Thread> hilosLectores = new ArrayList<>();

		ejecucionHilos(coleccionNombres, monitor, hilosLectores);

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

		getResultadosEncuesta(monitor);

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
	private static void ejecucionProcesos(int nEncuestados, ArrayList<Process> procesos) {
		ProcessBuilder pb;
		Process proceso;
		try {
			for (int i = 0; i < nEncuestados; i++) {
				pb = new ProcessBuilder(
						"java",
						"-cp", ".",
						"modeloExamen1Evaluacion.Encuestado");
				pb.directory(new File("./bin"));
				proceso = pb.start();

				procesos.add(proceso);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Lee y espera proceso por proceso a que termine y envie su respectivo nombre
	 * 
	 * @param procesos         coleccion de procesos instanciados
	 * @param coleccionNombres coleccion de los nombres de los procesos
	 */
	private static void lecturaNombres(ArrayList<Process> procesos, List<String> coleccionNombres) {
		for (Process p : procesos) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
				String linea = "";
				while ((linea = br.readLine()) != null) {
					coleccionNombres.add(linea.trim());
				}
				p.waitFor();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (InterruptedException e) {
				System.out.println("El thread ha sido interrumpido");
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
