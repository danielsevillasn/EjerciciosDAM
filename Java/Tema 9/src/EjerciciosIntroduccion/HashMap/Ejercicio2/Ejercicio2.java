package EjerciciosIntroduccion.HashMap.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashMap<String,Integer> existencias = new HashMap<String, Integer>();
        
        existencias.put("Manzanas", 10);
        existencias.put("Peras", 5);
        existencias.put("Plátanos",8);

        Scanner s = new Scanner(System.in);
        String fruta;

        System.out.print("Dime una fruta que quieras saber su significado: ");
        fruta = s.nextLine();

        if(existencias.containsKey(fruta)){
            System.out.println(existencias.get(fruta));
            if(existencias.get(fruta) > 0){
                existencias.put(fruta, existencias.get(fruta)-1);
            }
            System.out.println("Venta realizada. Quedan "+existencias.get(fruta)+"kilos de "+fruta);
        }else{
            System.out.println("Lo siento, esa fruta no está en mis existencias");
        }

        System.out.println();

        for(Map.Entry<String,Integer> m : existencias.entrySet()){
            System.out.println("Clave: "+m.getKey() +"\tValor: "+m.getValue());
        }

        s.close();
    }
}
