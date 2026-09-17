import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {

        File f1 = new File("/home/alumnom/d1");
        File f2 = new File("/home/alumnom/d2");

        f1.mkdirs();
        f2.mkdirs();

        File f3 = new File(f1, "f11.txt");
        File f4 = new File(f2, "f21.txt");

        try {
            f3.createNewFile();
            f4.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}