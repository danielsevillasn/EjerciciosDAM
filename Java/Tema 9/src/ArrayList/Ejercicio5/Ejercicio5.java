package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String descripcion;
        int prioridad;
        boolean salir = false;
        String opcion = "";
        ArrayList<Tarea> tareas = new ArrayList<Tarea>();
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("1-Añadir tarea");
            System.out.println("2-Mostrar todas");
            System.out.println("3-Eliminar por descripción");
            System.out.println("4-Salir");
            System.out.print("Eliga una opcion(1-4): ");
            opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    System.out.print("Dime la descripcion de la tarea" + tareas.size() + ": ");
                    descripcion = s.nextLine();
                    System.out.print("Dime la prioridad de la tarea" + tareas.size() + ": ");
                    prioridad = Integer.parseInt(s.nextLine());

                    tareas.add(new Tarea(descripcion, prioridad));
                    break;
                case "2":
                    System.out.println("\n"+tareas+"\n");
                    break;
                case "3":
                    System.out.print("Dime la descripcion de la tarea a eliminar: ");
                    descripcion = s.nextLine();
                    for(Tarea t : tareas){
                        if(descripcion.equalsIgnoreCase(t.getDescripcion())){
                            System.out.println("La tarea ha sido eliminada");
                        }
                    }
                    tareas.remove(new Tarea(descripcion, 1));
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            System.out.println();
        } while (!salir);
        System.out.println("Has salido.");
        s.close();
    }
}
