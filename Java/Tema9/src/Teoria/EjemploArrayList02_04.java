package Teoria;

import java.util.ArrayList;

public class EjemploArrayList02_04 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");
        System.out.println("Contenido de la lista: ");
        for(int i = 0;i<a.size()+1;i++){
            System.out.println(a.get(i));
        }
        System.out.println("Contenido de la lista: ");
        for(String b : a){
            System.out.println(b);
        }
        
        if(a.contains("blanco")){
            System.out.println("\nEl blanco está en la lista de colores");
        }
        a.remove("blanco");

        System.out.println("\nContenido de la lista: ");
        for(String b : a){
            System.out.println(b);
        }

    }
}
