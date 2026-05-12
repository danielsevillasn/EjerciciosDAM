package Teoria.Serialización.Ejercicio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaPuntoLienzo {
    private static ArrayList<Trazo> puntos = new ArrayList<>();
    private static final String PATH = "lienzo.dat";

    public static void main(String[] args) {
        cargarLienzo(); // Solo se hace una vez al arrancar
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // Un menú simple que no ocupe toda la pantalla
            System.out.print("\n[Puntos: " + puntos.size() + "] 1:Añadir, 2:Ver, 3:Reset, 0:Salir -> ");
            String op = sc.next();

            if (op.equals("1")) {
                // Captura rápida de datos
                puntos.add(new Trazo(sc.nextInt(), sc.nextInt(), '*'));
                // ¡IMPORTANTE!: No imprimas nada aquí, solo vuelve al menú
            } 
            else if (op.equals("2")) {
                // Solo aquí recorremos la lista (que es cuando el usuario quiere esperar)
                for (Trazo t : puntos) System.out.println(t);
            } 
            else if (op.equals("3")) {
                puntos.clear();
                new File(PATH).delete();
            } 
            else if (op.equals("0")) {
                guardarLienzo(); // Solo se accede al disco al final
                break;
            }
        }
    }

    private static void guardarLienzo() {
        // Envolvemos el FileOutputStream en un BufferedOutputStream para ganar velocidad
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(PATH)))) {
            oos.writeObject(puntos);
        } catch (IOException e) {
            System.out.println("Error al guardar.");
        }
    }

    private static void cargarLienzo() {
        File f = new File(PATH);
        if (!f.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(f)))) {
            puntos = (ArrayList<Trazo>) ois.readObject();
        } catch (Exception e) {
            puntos = new ArrayList<>();
        }
    }
}