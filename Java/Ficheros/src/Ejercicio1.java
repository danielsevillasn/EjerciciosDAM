import java.io.File;

public class Ejercicio1 {
    public static void main(String[] args) {
        File f = new File("/home/alumnom");
        String[] lista = f.list();

        for(String s : lista){
            System.out.println(s);
        }
    }
}
