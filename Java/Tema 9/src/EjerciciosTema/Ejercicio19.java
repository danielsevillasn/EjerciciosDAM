package EjerciciosTema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        Scanner s = new Scanner(System.in);
        String palabraIntroducida = "";

        while (true) {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            palabraIntroducida = s.nextLine().toLowerCase();

            if (palabraIntroducida.equals("salir")) {
                break;
            }

            if (!diccionario.containsKey(palabraIntroducida)) {
                System.out.println("No conozco esa palabra");
            } else {
                String significadoIngles = diccionario.get(palabraIntroducida);
                ArrayList<String> sinonimos = new ArrayList<>();

                for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
                    if (entrada.getValue().equals(significadoIngles) && !entrada.getKey().equals(palabraIntroducida)) {
                        sinonimos.add(entrada.getKey());
                    }
                }

                if (sinonimos.isEmpty()) {
                    System.out.println("No conozco sinónimos de esa palabra");
                } else {
                    System.out.print("Sinónimos de " + palabraIntroducida + ": ");
                    System.out.println(String.join(", ", sinonimos));
                }
            }
        }
        s.close();
    }
}
