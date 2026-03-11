import java.util.Scanner;
import java.util.Random;

public class PruebaVotacion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        // 1. Crear un array de 5 candidatos
        Votacion[] candidatos = new Votacion[5];

        // 2. Bucle para generar objetos pidiendo nombre por teclado
        System.out.println("--- Registro de Candidatos ---");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.print("Introduce el nombre del candidato " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            candidatos[i] = new Votacion(nombre);
        }

        // 3. Bucle para generar 100 votos aleatorios
        System.out.println("\n--- Iniciando votación aleatoria (100 votos) ---");
        for (int i = 0; i < 100; i++) {
            int indiceAleatorio = rd.nextInt(candidatos.length); // Genera un número de 0 a 4
            candidatos[indiceAleatorio].votar();
        }

        // 4. Recorrer el array para mostrar resultados y buscar al ganador
        System.out.println("\n--- RESULTADOS FINALES ---");
        Votacion ganador = candidatos[0]; // Suponemos que el primero va ganando

        for (Votacion c : candidatos) {
            System.out.println(c.toString());
            
            // Lógica para encontrar al ganador
            if (c.getnVotos() > ganador.getnVotos()) {
                ganador = c;
            }
        }

        // 5. Mostrar ganador y votos totales
        System.out.println("\n==============================");
        System.out.println("EL GANADOR ES: " + ganador.getNombre() + " con " + ganador.getnVotos() + " votos.");
        Votacion.getnVotosTotales(); // Llamada al método estático
        System.out.println("==============================");
        
        sc.close();
    }
}