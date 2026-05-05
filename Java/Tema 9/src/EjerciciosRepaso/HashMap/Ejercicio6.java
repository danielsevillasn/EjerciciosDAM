package EjerciciosRepaso.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, Integer> valoresPiezas = new HashMap<>();

        valoresPiezas.put("dama", 9);
        valoresPiezas.put("torre", 5);
        valoresPiezas.put("alfil", 3);
        valoresPiezas.put("caballo", 2);
        valoresPiezas.put("peón", 1);

        Random random = new Random();
        int cantidadCapturas = random.nextInt(16); // Genera un número entre 0 y 15
        
        // Convertimos las claves del mapa a una lista para poder elegir al azar
        ArrayList<String> nombresPiezas = new ArrayList<>(valoresPiezas.keySet());
        ArrayList<String> capturasRealizadas = new ArrayList<>();

        for (int i = 0; i < cantidadCapturas; i++) {
            int indiceAzar = random.nextInt(nombresPiezas.size());
            capturasRealizadas.add(nombresPiezas.get(indiceAzar));
        }

        // 3. Mostrar la lista de piezas y calcular la puntuación total
        System.out.println("Piezas capturadas por el jugador:");
        int puntuacionTotal = 0;

        if (capturasRealizadas.isEmpty()) {
            System.out.println("- Ninguna pieza capturada.");
        } else {
            for (String pieza : capturasRealizadas) {
                int valor = valoresPiezas.get(pieza);
                System.out.println("- " + pieza + " (" + valor + " puntos)");
                puntuacionTotal += valor;
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Puntuación total: " + puntuacionTotal + " puntos.");
    }
}
