package EjerciciosPropuestosRepaso;

import java.io.File;
import java.io.FilenameFilter;

public class Ejercicio3 implements  FilenameFilter{
    String filtro;

    public Ejercicio3(String filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(filtro);
    }

    public static void main(String[] args) {
        File fichero = new File("EjerciciosRepaso\\src");
        String[] listadeArchivos = fichero.list(new Ejercicio3(".txt"));
        for (String s : listadeArchivos) {
            System.out.println(s);
        }
    }
}
