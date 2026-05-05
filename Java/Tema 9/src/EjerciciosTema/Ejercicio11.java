package EjerciciosTema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("silla", "chair");
        diccionario.put("mesa", "table");
        diccionario.put("manzana", "apple");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("coche", "car");
        diccionario.put("ciudad", "city");
        diccionario.put("camino", "road");
        diccionario.put("tiempo", "time");
        diccionario.put("leche", "milk");
        diccionario.put("pan", "bread");

        ArrayList<String> palabrasEspañol = new ArrayList<String>();

        for(String palabraEspañol : diccionario.keySet()){
            palabrasEspañol.add(palabraEspañol);
        }
        
        int aleatorio = (int) (Math.random()*(palabrasEspañol.size()-4));
        int acierto = 0;
        String palabraEscrita;
        Scanner s = new Scanner(System.in);

        for(int i = aleatorio;i<aleatorio+5;i++){
            String palabraSeleccionada = palabrasEspañol.get(i);
            System.out.println("Dame el significado de esta palabra \""+palabraSeleccionada+"\" en ingles: ");
            palabraEscrita = s.nextLine();

            if(diccionario.get(palabraSeleccionada).equalsIgnoreCase(palabraEscrita)){
                acierto++;
            }
        }

        System.out.println("Has acertado "+acierto+"/5");

        s.close();
    }
}
