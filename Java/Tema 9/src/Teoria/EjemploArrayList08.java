package Teoria;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList08 {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();

        g.add(new Gato("Garfield","naranja","mestizo"));
        g.add(new Gato("Pepe","gris","angora"));
        g.add(new Gato("Mauri","blanco","manx"));
        g.add(new Gato("Ulises","marr","mestizo"));

        System.out.println("\n Datos de los gatos: \n");

        for(Gato gatoAux : g){
            System.out.println(gatoAux+"\n");
        }

        Collections.sort(g);

        System.out.println("\nDatos de los gatos ordenados por nombre: ");

        for(Gato gatoAux : g){
            System.out.println(gatoAux+"\n");
        }
    }
}
