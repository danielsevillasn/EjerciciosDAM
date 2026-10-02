import EjemploSerialización.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Escribe objetos Persona en un fichero. Puedes tener los nombres y edades
 * almacenados en
 * arrays o bien solicitarlos por teclado.
 * 
 * Ejercicio29
 */
public class Ejercicio29 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        MiObjectOutputStream os = new MiObjectOutputStream(new FileOutputStream("datos.obj",true));
        String nombre;
        int edad;

        for (int i = 0;i<2;i++){
            System.out.print("Dame un nombre de una persona: ");
            nombre = s.nextLine();
            System.out.print("Dame la edad de esa persona: ");
            edad = s.nextInt();
            s.nextLine();

            personas.add(new Persona(nombre, edad));

        }

        for(Persona p :personas){
            os.writeObject(p);
        }

        os.writeObject(personas);
        
        os.close();
        s.close();
    }
}
