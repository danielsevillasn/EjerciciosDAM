package Ejercicios1;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> compañeros= new ArrayList<String>();
        compañeros.add("pepe");
        compañeros.add("Juan");
        compañeros.add("Mario");
        compañeros.add("Fede");
        compañeros.add("perro");
        compañeros.add("Dani");

        for(String c : compañeros){
            System.out.println(c);
        }
    }
}
