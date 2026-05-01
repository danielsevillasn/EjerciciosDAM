package Ejercicios1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Diccionario base del ejercicio anterior
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        Scanner s = new Scanner(System.in);
        String palabra;

        while (true) {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            palabra = s.nextLine().toLowerCase();

            if (palabra.equals("salir")) {
                break;
            }

            if (diccionario.containsKey(palabra)) {
                String ingles = diccionario.get(palabra);
                ArrayList<String> sinonimos = obtenerSinonimos(palabra, ingles, diccionario);

                if (!sinonimos.isEmpty()) {
                    System.out.println("Sinónimos de " + palabra + ": " + String.join(", ", sinonimos));
                } else {
                    System.out.print("No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n): ");
                    if (s.nextLine().equalsIgnoreCase("s")) {
                        System.out.print("Introduzca un sinónimo de " + palabra + ": ");
                        String nuevoSinonimo = s.nextLine().toLowerCase();
                        diccionario.put(nuevoSinonimo, ingles);
                        System.out.println("Gracias por enseñarme nuevos sinónimos.");
                    }
                }
            } else {
                System.out.print("No conozco esa palabra ¿quiere añadirla al diccionario? (s/n): ");
                if (s.nextLine().equalsIgnoreCase("s")) {
                    System.out.print("Introduzca la traducción de " + palabra + " en inglés: ");
                    String traduccion = s.nextLine().toLowerCase();
                    diccionario.put(palabra, traduccion);
                }
            }
        }
        s.close();
    }

    private static ArrayList<String> obtenerSinonimos(String palabra, String ingles, HashMap<String, String> d) {
        ArrayList<String> lista = new ArrayList<>();
        for (Map.Entry<String, String> entrada : d.entrySet()) {
            if (entrada.getValue().equals(ingles) && !entrada.getKey().equals(palabra)) {
                lista.add(entrada.getKey());
            }
        }
        return lista;
    }
}
