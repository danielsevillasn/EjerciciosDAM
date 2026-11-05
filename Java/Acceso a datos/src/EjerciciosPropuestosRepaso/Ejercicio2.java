import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args) {
        File directorio = new File("C:\\Users\\proaz\\Downloads\\Apuntes Ficheros\\File");
        String[] lista = directorio.list();
    
        for(String l : lista){
            File fichero = new File(directorio,l);

            System.out.println("Nombre: "+l);
            
            System.out.println("Se puede leer: "+fichero.canRead());
            System.out.println("Se puede escribir: "+fichero.canRead());
            System.out.println("Tamaño: "+fichero.length());
            System.out.println("Ruta absoluta: "+fichero.getAbsolutePath());
        }
        
    }
}
