import java.io.*;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        String archivo = "pokemon.bin";
        Random rnd = new Random();

        // 1. Generar y escribir 50 Pokémon aleatorios
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo))) {
            for (int i = 0; i < 50; i++) {
                dos.writeShort(rnd.nextInt(1025) + 1); // Número 
                dos.writeBoolean(rnd.nextBoolean());   // Género 
                for (int j = 0; j < 6; j++) {          // 6 Estadísticas 
                    dos.writeShort(rnd.nextInt(241) + 20); 
                }
            }
        } catch (IOException e) { e.printStackTrace(); }

        // 2. Leer y volcar a texto con formato de barras [cite: 47, 48]
        try (DataInputStream dis = new DataInputStream(new FileInputStream(archivo));
             PrintWriter pw = new PrintWriter(new FileWriter("pokemon.txt"))) {
            
            while (dis.available() > 0) {
                int num = dis.readShort();
                String genero = dis.readBoolean() ? "Macho" : "Hembra";
                pw.println("Número: " + num);
                pw.println("* Género: " + genero + " *");
                pw.println("Estadísticas:");
                
                String[] nombresEt = {"HP", "Ataque", "Defensa", "At. Esp", "Def. Esp", "Velocidad"};
                for (String et : nombresEt) {
                    int valor = dis.readShort();
                    pw.printf("%-12s (%03d) [%s]%n", et, valor, dibujarBarra(valor));
                }
                pw.println("**************\n");
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    private static String dibujarBarra(int valor) {
        // Normalización: 20 -> 1 guion, 260 -> 20 guiones [cite: 48]
        int numGuiones = 1 + (int)((valor - 20) * 19.0 / 240.0);
        return "-".repeat(numGuiones);
    }
}