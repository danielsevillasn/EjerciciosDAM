import java.io.*;

public class EjemploDataInputStream {
    public static void main(String[] args) throws IOException {
        DataInputStream ds = new DataInputStream(new FileInputStream("datos.mbd"));
        try {
            while(true){
                System.out.println(ds.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Lectura terminada");
            ds.close(); // cierra el stream
        }
    }
}