package EjemploSerialización;

import java.io.*;

public class Recuperacion {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fs = new FileInputStream("datos.obj");
        ObjectInputStream os = new ObjectInputStream(fs);
        Persona p = null;
        // se debe realizar un casting al tipo original
        while((p = (Persona)os.readObject()) != null){
            System.out.println(p.getName());
            System.out.println(p.getEdad());
            System.out.println(p);
        }
        os.close();
    }
}