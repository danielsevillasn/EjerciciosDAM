package HashMap.Ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dame una frase a analizar: ");
        String frase = s.nextLine();

        String[] palabras = frase.split(" ");

        HashMap<String, Integer> contador = new HashMap<String, Integer>();

        for(String palabra : palabras){
            if(!contador.containsKey(palabra)){
                contador.put(palabra,1);
            }else{
                contador.put(palabra,contador.get(palabra)+1);
            }
        }

        for(Map.Entry<String, Integer> c : contador.entrySet()){
            System.out.println("La palabra "+c.getKey()+" aparece "+c.getValue()+" veces");
        }

        s.close();
    }
}
