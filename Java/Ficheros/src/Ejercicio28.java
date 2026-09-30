import java.io.File;
import java.io.FilenameFilter;

public class Ejercicio28 implements  FilenameFilter{
    String filtro;

    public Ejercicio28(String filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(filtro);
    }

    public static void main(String[] args) {
        File fichero = new File("./src");
        String[] listadeArchivos = fichero.list(new Ejercicio28(".java"));
        for (String s : listadeArchivos) {
            System.out.println(s);
        }
    }

}
