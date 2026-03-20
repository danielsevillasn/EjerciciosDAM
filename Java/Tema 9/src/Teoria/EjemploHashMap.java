package Teoria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemploHashMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(924, "Amalia Núñez");
        m.put(921,"Cindy Nero");
        m.put(219, "Victor Tilla");
        m.put(605, "Esteban Quito");

        //Ejemplo 1
        System.out.println(m.get(924));
        System.out.println(m.get(921));
        System.out.println(m.get(219));
        System.out.println(m);

        System.out.println();
        //Ejemplo 2
        System.out.println("Todas las entradas del diccionario extraídas con entrySet: ");
        System.out.println(m.entrySet());

        System.out.println("\nEntradas del diccionario extraídas una a una: ");
        for(Map.Entry pareja: m.entrySet()){
            System.out.println(pareja);
        }

        System.out.println();
        //Ejemplo 3
        System.out.println("Código\tNombre\n-----\t-----------");
        for(Map.Entry pareja: m.entrySet()){
            System.out.print(pareja.getKey()+ "\t");
            System.out.println(pareja.getValue());
        }

        System.out.println();
        //Ejemplo 4
        System.out.print("Por favor, introduzca un codigo: ");
        int codigoIntroducido = Integer.parseInt(s.nextLine());
        if(m.containsKey(codigoIntroducido)){
            System.out.print("El codigo "+codigoIntroducido+" corresponde a ");
            System.out.println(m.get(codigoIntroducido));
        }else{
            System.out.println("El código introducido no existe.");
        }
        System.out.println();

    }
}
