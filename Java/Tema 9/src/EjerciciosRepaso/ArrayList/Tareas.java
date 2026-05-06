package EjerciciosRepaso.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tareas {
    public static void main(String[] args) {
        // Creamos la lista de tareas
        ArrayList<String> tareas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        // 1. Añadir tareas al final
        tareas.add("Estudiar Programación");
        tareas.add("Ir al gimnasio");
        tareas.add("Comprar pan");
        
        // 2. Insertar una tarea en una posición específica (ejemplo: posición 1)
        // Recordar que los índices empiezan en 0. 
        // El método .add(índice, objeto) desplaza el resto.
        System.out.println("Insertando tarea 'Llamar a mamá' en la posición 1...");
        tareas.add(1, "Llamar a mamá");
        
        // 3. Eliminar una tarea por su nombre
        System.out.println("Eliminando la tarea 'Ir al gimnasio'...");
        tareas.remove("Ir al gimnasio");
        
        // 4. Recorrer la lista completa utilizando un Iterator
        System.out.println("\n--- LISTA DE TAREAS PENDIENTES ---");
        
        // Obtenemos el iterador de la lista
        Iterator<String> it = tareas.iterator();
        int contador = 1;
        
        // Mientras el iterador tenga un elemento siguiente...
        while (it.hasNext()) {
            String tarea = it.next(); // Extraemos el elemento
            System.out.println(contador + ". " + tarea);
            contador++;
        }
        
        s.close();
    }
}
