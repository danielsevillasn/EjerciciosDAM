
/*
import java.io.File;
import java.io.IOException;
*/
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class EjemploConNio {
    
    public static void main(String[] args) {    
            
        // ejemplo información fichero (tiene extensión)
        Path fichero = Paths.get("miFichero.txt");
        
        try{
            if(Files.exists(fichero)) {
                System.out.println("El fichero existe");
                System.out.println("Nombre: " + fichero.getFileName());
                System.out.println("Longitud: " +  Files.size(fichero));
                System.out.println("Ruta: " + fichero.toAbsolutePath());
            } 
            else {
                System.out.println("El fichero no existe");
            }
        }
        catch(IOException e){
            System.out.println("Error al leer fichero: " + e.getMessage());
        }
        
        
        // ejemplo información carpeta (no tiene extensión)
        Path carpeta = Paths.get("miCarpeta");
        try{
            if(Files.exists(carpeta)){
                System.out.println("La carpeta existe");
                System.out.println("Nombre: " + carpeta.getFileName());
                System.out.println("Longitud: " + Files.size(carpeta));
                System.out.println("Ruta: " + carpeta.toAbsolutePath());
            } else {
                System.out.println("La carpeta no existe");
            }
        }
        catch(IOException e){
            System.out.println("Error al leer carpeta: " + e.getMessage());
        }
        
                
        // crear un nuevo archivo        
        try {
            Path fichero2 = Files.createFile(Paths.get("miFichero2.txt"));
            System.out.println("Fichero creado.");         
        } 
        catch (FileAlreadyExistsException e) {
            System.out.println("El fichero ya existe.");            
        }
        catch(IOException e){
            System.out.println("Error al crear el fichero " + e.getMessage());
        }
        

        // crear una carpeta
        Path carpeta2 = Paths.get("miCarpeta2");
        try{
            Files.createDirectory(carpeta2);
            System.out.println("Carpeta creada.");
        }
        catch(FileAlreadyExistsException e){
            System.out.println("La carpeta ya existe.");
        }            
        catch(IOException e) {
            System.out.println("No se ha podido crear la carpeta: " + e.getMessage());        
        }
        
        // borrar un archivo                
        try{
            Path fichero3 = Paths.get("miFichero2.txt");
            Files.delete(fichero3);
            System.out.println("Fichero eliminado");
        } 
        catch (NoSuchFileException e) {
            System.out.println("No existe el fichero.");
        }
        catch (IOException e){
            System.out.println("No se ha podido crear o borrar el fichero: " + e.getMessage());     
        }
        
        // lista de archivos en una carpeta
        Path carpeta3 = Paths.get(".");//ruta del directorio de trabajo actual, no del archivo                
        System.out.println("Lista de archivos/carpetas en " + carpeta3.toAbsolutePath());
        try{
            DirectoryStream<Path> stream = Files.newDirectoryStream(carpeta3);
            for( Path file : stream){
                System.out.println("  - " + file.getFileName());
            }
            stream.close();
        }
        catch(IOException e){
            System.out.println("No se ha podido leer el contenido de la carpeta: " + e.getMessage());
        }              
        
    }        

}
