package EjerciciosTema;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        HashMap<String,String> habitat = new HashMap<>();
        HashMap<String,String> alimentación = new HashMap<>();
        Scanner s = new Scanner(System.in);

        habitat.put("rana","En los trópicos y cerca de las zonas húmedas y acuáticas");
        alimentación.put("rana","Larvas e insectos");

        habitat.put("salamandra","Ecosistemas húmedos");
        alimentación.put("salamandra","Pequeños crustáceos e insectos");

        habitat.put("sapo","En cualquier sitio salvo el desierto y la Antártida");
        alimentación.put("sapo","Insectos, lombrices y pequeños roedores");

        habitat.put("triton","América y África");
        alimentación.put("triton","Insectos");

        System.out.print("Introduzca el tipo de anfibio: ");
        String tipoAnfibio = s.nextLine().toLowerCase();

        if(habitat.containsKey(tipoAnfibio)){
            System.out.println("Hábitat: "+habitat.get(tipoAnfibio));
            System.out.println("Alimentación: "+alimentación.get(tipoAnfibio));
        }else{
            System.out.println("Este tipo de anfibio no existe.");
        }

        s.close();
    }
}
