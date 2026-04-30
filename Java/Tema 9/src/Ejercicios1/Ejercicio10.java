package Ejercicios1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
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

        String palabraBuscada;
        Scanner s = new Scanner(System.in);

        System.out.println("Lista palabras:");
        for(String d : diccionario.keySet()){
            System.out.print(d+" ");
        }

        System.out.println();
        System.out.print("Dame una palabra en español que quieras buscar en el diccionario: ");
        palabraBuscada = s.nextLine();

        if (diccionario.containsKey(palabraBuscada)) {
            System.out.println("El significado de esa palabra es: " + diccionario.get(palabraBuscada));
        } else {
            System.out.println("Esa palabra no esta en el diccionario");
        }

        s.close();
    }

}
