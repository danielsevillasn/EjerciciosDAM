package EjemploSerialización;

import java.io.*;

public class Almacenamiento {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = new FileOutputStream("datos.obj");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(new Persona("paco", 40));
        MiObjectOutputStream mos = new MiObjectOutputStream(fs);
        mos.writeObject(new Persona("Juan",30));
        os.close(); // cierra el stream
    }
}