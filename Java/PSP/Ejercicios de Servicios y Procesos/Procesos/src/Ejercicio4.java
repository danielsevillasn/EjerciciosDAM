import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la URL de la página web (ej: https://www.ejemplo.com): ");
        String direccionWeb = scanner.nextLine();
        scanner.close();

        try {
            URL url = new URL(direccionWeb);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            }

        } catch (MalformedURLException e) {
            System.err.println("La URL introducida no tiene un formato válido. Asegúrate de incluir 'http://' o 'https://'.");
        } catch (IOException e) {
            System.err.println("Error de E/S al intentar conectar o leer la página web: " + e.getMessage());
        }
    }
}
