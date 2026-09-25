import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String respuesta;
        boolean valido = false;
        while(!valido){
            System.out.print("Dame un si o un no(S/N): ");
            respuesta = s.nextLine();
            if(respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N")){
                System.out.println("true");
                valido = true;
            }else{
                System.out.println("No has ingresado un 's' o un 'n'");
            }
            
        }
        s.close();
    }
}
