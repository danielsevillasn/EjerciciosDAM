import java.io.File;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        File usr1 = new File("/home/alumnom/usr1");
        usr1.mkdir();
        
        File f1 = new File("/home/alumnom/usr1/", "f1");
        f1.createNewFile();
        
        File usr2 = new File("/home/alumnom/usr2");
        usr2.mkdir();

        File d1 = new File("/home/alumnom/d1");
        d1.mkdir();

        File f2 = new File("/home/alumnom/d1/", "f2");
        f2.createNewFile();

        File d2 = new File("/home/alumnom/d2");
        d2.mkdir();

        File f3 = new File("/home/alumnom/d2/", "f3");
        f3.createNewFile();

        File f4 = new File("/home/alumnom/d2/", "f4");
        f4.createNewFile();

        File d3 = new File("/home/alumnom/d3");
        d3.mkdir();
    }
}
