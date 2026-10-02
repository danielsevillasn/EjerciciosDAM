import EjemploSerialización.Persona;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio30 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Persona persona;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datos.obj"));
        int i = 1;
        try{
            while (true){
                persona = (Persona)ois.readObject();
                System.out.println(i+"=>");
                i++;
                System.out.println("Nombre: "+persona.getName()+" edad: "+persona.getEdad());
            }
        }catch(EOFException e){
            System.out.println("El flujo ha terminado");
        }catch(ClassCastException e){
            System.out.println("El objeto no se puede castear a persona");
        }

        ois.close();
    }
}
