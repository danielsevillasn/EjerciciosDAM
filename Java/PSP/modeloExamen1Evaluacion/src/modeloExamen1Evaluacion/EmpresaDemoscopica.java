package modeloExamen1Evaluacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpresaDemoscopica {

	public static void main(String[] args) {
		int nEncuestados = pedirNumeroEncuestados();
		
		ProcessBuilder pb = null;
		Process proceso = null;
		ArrayList<Process> procesos = new ArrayList<Process>();
		
		try {
			for (int i = 0;i < nEncuestados;i++) {
				pb = new ProcessBuilder("/usr/java/jdk-24.0.2/bin/java", "Encuestado");
	            pb.directory(new File("./bin"));
	            proceso = pb.start();
	            
	            procesos.add(proceso);
			}
		} catch (IOException e) {
			System.out.println("El archivo del proceso hijo no ha sido encontrado");
		}
		/**
		 * for(Process p : procesos) {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))){
				String linea = "";
				while((linea = br.readLine()) != null) {
					coleccionNombres.add(linea.trim());
				}
				p.waitFor();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}catch (InterruptedException e) {
				System.out.println("El thread ha sido interrumpido");
			}
		}
		Collections.sort(coleccionNombres);
		for(String n : coleccionNombres) {
			System.out.println(n);
		}
		 * 
		 */

		
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
	
	

}
