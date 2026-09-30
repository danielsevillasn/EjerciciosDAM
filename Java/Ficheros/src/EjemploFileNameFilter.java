import java.io.File;
import java.io.FilenameFilter;

public class EjemploFileNameFilter implements FilenameFilter {
    String extension;

    EjemploFileNameFilter(String extension) { // constructor
        this.extension = extension;
    }

    public boolean accept(File dir, String name) {
        return name.contains(extension);
    }

    public static void main(String[] args) {
        try {
            File fichero = new File("./src");
            String[] listadeArchivos = fichero.list();
            listadeArchivos = fichero.list(new EjemploFileNameFilter("Ejemplo"));
            int numarchivos = listadeArchivos.length;
            if (numarchivos < 1)
                System.out.println("No hay archivos que listar");
            else {
                for (int conta = 0; conta < listadeArchivos.length; conta++)
                    System.out.println(listadeArchivos[conta]);
            }
        } catch (Exception ex) {
            System.out.println("Error al buscar en la ruta indicada");
        }
    }
}