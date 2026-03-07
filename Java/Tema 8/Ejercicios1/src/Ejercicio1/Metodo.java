package Ejercicio1;
import java.util.Scanner;
public class Metodo {

    public static int pideEntero(String mensaje){
        Scanner s = new Scanner(System.in);
        System.out.print(mensaje);
        int dato = s.nextInt();
        return dato;
    }
}
