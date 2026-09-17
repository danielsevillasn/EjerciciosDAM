import java.io.File;

public class Ejercicio3 {
    public static void main(String[] args) {
        File f = new File("/home/alumnom/Documentos/Acceso datos/Ficheros");
        String[] contenidoDirectorio = f.list();
        
        for (String s: contenidoDirectorio){
            if (new File(s).isFile()){
                System.out.print("Fichero:");
            }
            else{
                System.out.print("Directorio:");
            }
            System.out.println(new File(s).getName());
        }

    }
}
