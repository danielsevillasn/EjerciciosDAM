import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        File usr1 = new File("/home/alumnom/usr1");
        while(true){
            System.out.print("Deseas borrar el directorio usr1?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                System.out.println(usr1.delete());
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }


        File f1 = new File("/home/alumnom/usr1","f1");
                while(true){
            System.out.print("Deseas borrar el directorio f1?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                System.out.println(f1.delete());
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }
        
        File usr2 = new File("/home/alumnom/usr2");
                while(true){
            System.out.print("Deseas borrar el directorio usr2?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                usr2.delete();
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }

        File d1 = new File("/home/alumnom/usr2","d1");
            while(true){
            System.out.print("Deseas borrar el directorio d1?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                d1.delete();
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }

        File f2 = new File("/home/alumnom/", "f2");
        while(true){
            System.out.print("Deseas borrar el directorio f2?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                f2.delete();
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }

        File d2 = new File("/home/alumnom/d2");
        while(true){
            System.out.print("Deseas borrar el directorio d2?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                d2.delete();
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }

        File f3 = new File("/home/alumnom/", "f3");
        while(true){
            System.out.print("Deseas borrar el directorio f3?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                f3.delete();
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }

        File f4 = new File("/home/alumnom/", "f4");
        while(true){
            System.out.print("Deseas borrar el directorio f4?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                f4.delete();
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }

        File d3 = new File("/home/alumnom/d3");
        while(true){
            System.out.print("Deseas borrar el directorio d3?(s/n): ");
            String respuesta = s.nextLine();
            
            if (respuesta.equals("s")){
                d3.delete();
                break;
            }

            if (respuesta.equals("n")){
                break;
            }
        }
        s.close();

    }
}
