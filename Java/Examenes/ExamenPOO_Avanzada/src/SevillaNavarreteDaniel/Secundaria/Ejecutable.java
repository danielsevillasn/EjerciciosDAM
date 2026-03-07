package SevillaNavarreteDaniel.Secundaria;

import java.util.Scanner;

import SevillaNavarreteDaniel.Objeto.*;

public class Ejecutable {

    public static void ejecutarMenu(){
        Scanner s = new Scanner(System.in);
        String opcion = "";
        while(!(opcion.equals("0"))){
            System.out.println("MENU");
            System.out.println("0- Salir");
            System.out.println("1- Crea una clase");

            opcion = s.nextLine();

            if(opcion.equals("1")){
                Aula aula = new Aula();
                System.out.println("\nHay "+aula.getListaAlumnos().length+" alumnos");
                System.out.println("Aula "+aula.getId()+" Materia: "+aula.getMateriasAula());
                if(aula.darClase()){
                    System.out.println("Se da la clase");
                    aula.notas();
                }
            }
        }
        s.close();
    }

}
