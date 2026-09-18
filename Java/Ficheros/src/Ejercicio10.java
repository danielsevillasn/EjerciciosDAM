import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        File usr1 = new File("/home/alumnom/usr1");
        borrado(usr1);

        File f1 = new File("/home/alumnom/usr1","f1");
        borrado(f1);
        
        File usr2 = new File("/home/alumnom/usr2");
        borrado(usr2);

        File d1 = new File("/home/alumnom/usr2","d1");
        borrado(d1);

        File f2 = new File("/home/alumnom/", "f2");
        borrado(f2);

        File d2 = new File("/home/alumnom/d2");
        borrado(d2);

        File f3 = new File("/home/alumnom/", "f3");
        borrado(f3);

        File f4 = new File("/home/alumnom/", "f4");
        borrado(f4);

        File d3 = new File("/home/alumnom/d3");
        borrado(d3);
    }

    /**
     * Método que pide si desea eliminar el fichero
     * 
     * @param fichero objeto file que se pasa por parametro
     * @return 'nada'
     */
    private static void borrado(File fichero) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Deseas borrar"+fichero.getName()+" ?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                if(fichero.delete()){
                    System.out.println("Fichero eliminado");
                }else{
                    System.out.println("No se ha podido eliminar el fichero ya que es un directorio que contiene más ficheros");
                }
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }
        s.close();
    }
}
