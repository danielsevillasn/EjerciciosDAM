import java.io.*;

public class EjemploDataOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fw = new FileOutputStream("datos.mbd", false);
        DataOutputStream ds = new DataOutputStream(fw);
        int[] m = { 5, 10, 3, 6 }; // array de enteros
        for (int i = 0; i < m.length; i++) {
            ds.writeInt(m[i]);
        }
        System.out.println("Escritura terminada");
        ds.close(); // cierra el stream
    }
}