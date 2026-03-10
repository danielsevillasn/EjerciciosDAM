package Teoria;

import java.util.ArrayList;

public class EjemploArrayList05y06 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");

        System.out.println("Contenido del vector: ");
        System.out.println(a);

        a.set(2, "turquesa");
        System.out.println("\nContenido del vector: ");
        System.out.println(a);

        a.add(2, "azul");
        System.out.println("\nContenido del vector: ");
        System.out.println(a);

        a.removeIf(palabra -> palabra.contains("a"));
        System.out.println("\nContenido del vector: ");
        System.out.println(a);

    }
}
