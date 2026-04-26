package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<Libro>();

        libros.add(new Libro("Pepe", 50));
        libros.add(new Libro("Juan", 100));
        libros.add(new Libro("Mario", 200));

        int sumaPaginas = 0;

        if(!libros.isEmpty()){
            for(Libro l : libros){
                System.out.println(l);
                sumaPaginas += l.getPaginas();
            }
    
            System.out.println("La suma total de páginas es de: "+sumaPaginas);
        }else{
            System.out.println("La lista esta vacía");
        }
    }
}
