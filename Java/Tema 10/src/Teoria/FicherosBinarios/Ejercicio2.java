import java.io.*;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        long semilla = 12345L; // La "llave" compartida 
        String mensajeOriginal = "Hola Mundo Informatica";
        String archivoCifrado = "mensaje.bin";

        codificar(mensajeOriginal, archivoCifrado, semilla);
        decodificar(archivoCifrado, semilla);
    }

    public static void codificar(String texto, String ruta, long semilla) {
        Random generador = new Random(semilla); // Uso de semilla [cite: 59]
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta))) {
            for (char c : texto.toCharArray()) {
                short aleatorio = (short) generador.nextInt(); // Genera short [cite: 59]
                dos.writeInt(c + aleatorio); // Guarda como int [cite: 60]
            }
            System.out.println("Mensaje cifrado guardado.");
        } catch (IOException e) { e.printStackTrace(); }
    }

    public static void decodificar(String ruta, long semilla) {
        Random generador = new Random(semilla);
        StringBuilder mensaje = new StringBuilder();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
            while (dis.available() > 0) {
                int datoCifrado = dis.readInt(); // Lee int [cite: 61]
                short aleatorio = (short) generador.nextInt();
                mensaje.append((char) (datoCifrado - aleatorio)); // Resta y transforma a char [cite: 61]
            }
            System.out.println("Mensaje descifrado: " + mensaje.toString());
        } catch (IOException e) { e.printStackTrace(); }
    }
}