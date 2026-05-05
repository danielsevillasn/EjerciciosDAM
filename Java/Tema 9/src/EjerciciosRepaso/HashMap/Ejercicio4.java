package EjerciciosRepaso.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner s = new Scanner(System.in);

        diccionario.put("hola","Hhello");
        diccionario.put("adios","bye");
        diccionario.put("pelota","ball");
        diccionario.put("blanco","white");
        diccionario.put("negro","black");
        
        diccionario.put("escuela","school");
        diccionario.put("jardin","garden");
        diccionario.put("teclado","keyboard");
        diccionario.put("botella","bottle");
        diccionario.put("pagina","page");

        System.out.print("Dame una palabra que quieras buscar en el diccionario: ");
        String palabra = s.nextLine();

        if(diccionario.containsKey(palabra)){
            System.out.println("El significado de la palabra es: "+diccionario.get(palabra));
        }else{
            System.out.println("No conozco esa palabra");
        }

        s.close();
    }
}
