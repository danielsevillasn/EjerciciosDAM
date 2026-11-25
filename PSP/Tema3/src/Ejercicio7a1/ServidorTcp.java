package Ejercicio7a1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTcp {

	public static void main(String[] args) {
		ServerSocket servidor = null;
		Socket conexion = null;
		try {
			servidor = new ServerSocket(1111);

			System.out.println("Esperando conexion con el cliente");
			conexion = servidor.accept();

			System.out.println("Cliente conectado, " + conexion.getChannel() + ", " + conexion.getPort() + ", "
					+ conexion.toString());

			String mensajeRecibido = "";
			BufferedReader br = null;
			BufferedWriter bw = null;
			br = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(conexion.getOutputStream()));
			while ((mensajeRecibido = br.readLine()) != null && !mensajeRecibido.equalsIgnoreCase("fin")) {
				if (!mensajeRecibido.equalsIgnoreCase("fin")) {
					bw.write("El mensaje recibido tiene" + mensajeRecibido.length() + " letras");
					bw.newLine();
					bw.flush();
					bw.write("El mensaje en mayúsculas es: " + mensajeRecibido.toUpperCase());
					bw.newLine();
					bw.flush();

				}
			}
			conexion.close();
			servidor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
