//Escribe un programa que diga si un numero introducido por teclado es par o impar.
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Crea el objeto scanner
        System.out.print("Dime un numero: ");
        final int y = s.nextInt(); //Lee el numero introducido
        int par = y % 2; //Divide el numero entre 2 y guarda el resto
        int divisible = y % 5; //Divide el numero entre 5 y guarda el resto
        if (par == 0){ //Si el resto es 0, el numero es par
            System.out.println("El numero es par");
        }
        else { //Si el resto no es 0, el numero es impar
            System.out.println("El numero es impar");
        }
        if (divisible == 0){ //Si el resto es 0, el numero es divisible entre 5
            System.out.println("El numero es divisible entre 5");
        }
        else { //Si el resto no es 0, el numero no es divisible entre 5
            System.out.println("El numero no es divisible entre 5");
        }
        s.close(); //Cierra el objeto scanner
    }
}