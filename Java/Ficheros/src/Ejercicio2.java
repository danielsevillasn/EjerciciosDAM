import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args) {
        File f = new File("");
        String directorioActual = f.getAbsolutePath();
        
        System.out.println("\n"+directorioActual);
    }
}
