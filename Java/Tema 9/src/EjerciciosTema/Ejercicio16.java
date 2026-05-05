package EjerciciosTema;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        HashMap<String, String> capitales = new HashMap<String, String>();

        capitales.put("españa","Madrid");
        capitales.put("portugal","Lisboa");
        capitales.put("francia","París");

        String país = "";
        String capital = "";
        Scanner s = new Scanner(System.in, "UTF-8");

        while(true){
            System.out.print("Escribe el nombre de un país y de diré su capital: ");
            país = s.nextLine();
            if(país.equalsIgnoreCase("salir")){
                System.out.println("Saliendo...");
                break;
            }
            if(capitales.containsKey(país.toLowerCase())){
                System.out.println("La capital de "+país+" es "+capitales.get(país.toLowerCase()));
            }else{
                System.out.print("No conozco la respuesta ¿cuál es la capital de "+país+"?: ");
                capital = s.nextLine();
                capitales.put(país.toLowerCase(), capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }
        s.close();
    }
}
