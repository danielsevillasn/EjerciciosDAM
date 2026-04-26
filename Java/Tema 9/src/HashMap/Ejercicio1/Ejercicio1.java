package HashMap.Ejercicio1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashMap<String,String> diccionario = new HashMap<String,String>();

        diccionario.put("ArrayList", "Lista dinamica");
        diccionario.put("HashMap", "Diccionario");
        diccionario.put("Iterable", "Recorrido simple");
        diccionario.put("Generic", "Tipo generico");
        diccionario.put("Byte", "Unidad minima de memoria");

        Scanner s = new Scanner(System.in);
        String palabra;

        System.out.print("Dime una palabra que quieras saber su significado: ");
        palabra = s.nextLine();

        if(diccionario.containsKey(palabra)){
            System.out.println(diccionario.get(palabra));
        }else{
            System.out.println("Lo siento, esa palabra no está en mi base de datos");
        }

        System.out.println("\n--Listado de palabras--");
        for(String c: diccionario.keySet()){
            System.out.println(c);
        }

        s.close();
    }
}
