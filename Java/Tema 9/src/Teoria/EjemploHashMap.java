package Teoria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemploHashMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Se crea un hash map que guardara claves integer con valores tipo string
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        //Se introducen valores específicos con sus respectivas claves 
        m.put(924, "Amalia Núñez");
        m.put(921,"Cindy Nero");
        m.put(219, "Victor Tilla");
        m.put(605, "Esteban Quito");

        //Ejemplo 1
        //Se recoge los valores de las llaves impuestas en el get y luego se imprime por pantalla el hash map
        System.out.println(m.get(924));
        System.out.println(m.get(921));
        System.out.println(m.get(219));
        System.out.println(m);

        System.out.println();
        //Ejemplo 2
        //Entry set es otra manera de imprimir por pantalla muy parecida a la anterior con tostring
        System.out.println("Todas las entradas del diccionario extraídas con entrySet: ");
        System.out.println(m.entrySet());

        //El map entry es para sacar esa clave-valor de una forma individual y específica
        System.out.println("\nEntradas del diccionario extraídas una a una: ");
        for(Map.Entry<Integer, String> pareja: m.entrySet()){
            System.out.println(pareja);
        }

        System.out.println();
        //Ejemplo 3
        //Lo mismo que lo anterior pero en vez de tostring empleando métodos específicos
        System.out.println("Código\tNombre\n-----\t-----------");
        for(Map.Entry<Integer, String> pareja: m.entrySet()){
            System.out.print(pareja.getKey()+ "\t");
            System.out.println(pareja.getValue());
        }

        System.out.println();
        //Ejemplo 4
        //Buscador de valores mediante la pedida de una clave
        System.out.print("Por favor, introduzca un codigo: ");
        int codigoIntroducido = Integer.parseInt(s.nextLine());
        if(m.containsKey(codigoIntroducido)){
            System.out.print("El codigo "+codigoIntroducido+" corresponde a ");
            System.out.println(m.get(codigoIntroducido));
        }else{
            System.out.println("El código introducido no existe.");
        }
        System.out.println();

        s.close();

    }
}
