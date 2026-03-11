package Teoria;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList07 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(20);
        a.add(7);
        a.add(14);
        a.add(32);
        a.add(3);

        System.out.println("Contenido de la lista: ");
        System.out.println(a);

        Collections.sort(a);
        System.out.println("Contenido de la lista: ");
        System.out.println(a);

        a.removeIf(numero -> numero < 10);
        System.out.println("\nContenido de la lista: ");
        System.out.println(a);
    }
}
