import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        File f = new File("Fichero.txt");
        f.createNewFile();
        File f2 = new File("nuevo_nombre.txt");
        Thread.sleep(2000);
        f.renameTo(f2);
    }
}
