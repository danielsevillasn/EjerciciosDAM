package Ejercicio4;
import java.util.Scanner;

public class Datos {
    static Scanner s = new Scanner(System.in);
    public static String menu(){
        String menu = "";
        System.out.println("Dime que quieres hacer: ");
        System.out.println("1-- invierte");
        System.out.println("2-- simplifica");
        System.out.println("3-- multiplica");
        System.out.println("4-- divide");
        System.out.println("5-- salir");
        System.out.print("Ingrese un numero: ");
        menu = s.nextLine();
        return menu;
    }
}
