package Teoria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inma
 */
public class EjemploHashMap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        int contador = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Escriba una palabra: ");
            m.put(i, s.next());
        }

        // Devuelve el listado completo <clave,valor>
        System.out.println("\n\nDevuelve el listado completo <clave,valor>");
        System.out.println(m.entrySet());

        // keySet(): Devuelve un conjunto (set) con todas las claves.
        System.out.println("\n\nkeySet(): Devuelve un conjunto (set) con todas las claves.");
        System.out.println(m.keySet());

        /*
         * values(): Devuelve una colección con todos los valores (los valores
         * pueden estar duplicados a diferencia de las claves).
         */
        System.out.println("\n\nvalues():");
        System.out.println(m.values());

        // Devuelve la clave de 1 entrada.
        System.out.println("\n\nDevuelve 1 clave");
        for (Map.Entry pareja : m.entrySet()) {
            System.out.print(pareja.getKey() + " ");
        }

        // Devuelve el contenido de 1 entrada.
        System.out.println("\n\nDevuelve 1 valor");
        for (Map.Entry pareja : m.entrySet()) {
            System.out.print(pareja.getValue() + " ");
        }

        System.out.println("");
        /*
         * get(clave): Obtiene el valor correspondiente a una clave.
         * Devuelve null si no existe esa clave en el diccionario.
         */

        /*
         * get(clave): Obtiene el valor correspondiente a una clave.
         * Devuelve null si no existe esa clave en el diccionario.
         */

        // ¿Qué saldrá por pantalla para el siguiente método get?
        System.out.println(m.get("Hola"));

        System.out.println(m.get(3));

        /*
         * put(clave, valor): Añade un par (clave, valor) al
         * diccionario.
         * Si ya había un valor para esa clave, se machaca.
         */
        m.put(10, "movil");
        m.put(3, "boli");

        // Devuelve el listado completo <clave,valor>
        System.out.println("\n\nDevuelve el listado completo <clave,valor>");
        System.out.println(m.entrySet());

    }
}