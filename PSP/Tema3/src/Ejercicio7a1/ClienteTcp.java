package Ejercicio7a1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTcp {

	public static void main(String[] args) {
		String mensaje = "";
		
		try {
			Socket cliente = new Socket("127.0.0.1", 1111);
			BufferedReader br = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cliente.getOutputStream()));
			
			while (!(mensaje = pedirMensaje()).equalsIgnoreCase("fin")) {
				bw.write(mensaje);
				bw.newLine();
				bw.flush();
				System.out.println(br.readLine());
				System.out.println(br.readLine());
			}
			bw.write("fin");
			bw.newLine();
			bw.flush();
			cliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String pedirMensaje() {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese un mensaje para enviarlo al servidor: ");
		String resultado = s.nextLine().trim();
		return resultado;
	}

}
