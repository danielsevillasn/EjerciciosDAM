package Teoria;

import java.util.ArrayList;

public class EjemploArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        System.out.println("Nª de elementos: "+ a.size());

        a.add("rojo");
        a.add("verde");
        a.add("azul");

        System.out.println("Nª de elementos: "+ a.size());

        a.add("blanco");

        System.out.println("Nª de elementos: "+ a.size());

        System.out.println("El elemento que hay en la posicion 0 es "+a.get(0));
        System.out.println("El elemento que hay en la posicion 3 es "+a.get(3));

    }
}
