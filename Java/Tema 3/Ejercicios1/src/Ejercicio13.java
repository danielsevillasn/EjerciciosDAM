//Escribe un programa que solicite tres numeros enteros y los ordene
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Crea el objeto scanner
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt(); //Lee el primer numero
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt(); //Lee el segundo numero
        System.out.print("Ingrese el tercer numero entero: ");
        int numero3 = scanner.nextInt(); //Lee el tercer numero
        if((numero1==numero2) && (numero1==numero3)){ //Comprueba si los tres numeros son iguales
            System.out.print("Los tres numeros son iguales: " + numero1 + numero2 + numero3);
        }
        else{ //Si no son iguales, los ordena de mayor a menor
            if((numero1>=numero2) && (numero1>=numero3)){ //Comprueba si el primer numero es el mayor
                System.out.print(numero1);
                if(numero2>=numero3){
                    System.out.print(numero2);
                    System.out.print(numero3);
                }
                if(numero3>=numero2) {
                    System.out.print(numero3);
                    System.out.print(numero2);
                }
            }
            if((numero2>=numero1) && (numero2>=numero3)){ //Comprueba si el segundo numero es el mayor
                System.out.print(numero2);
                if(numero1>=numero3){
                    System.out.print(numero1);
                    System.out.print(numero3);
                }
                if(numero3>=numero1){
                    System.out.print(numero3);
                    System.out.print(numero1);
                }
            }
            if((numero3>=numero2) && (numero3>=numero1)){ //Comprueba si el tercer numero es el mayor
                System.out.print(numero3);
                if(numero2>=numero1){
                    System.out.print(numero2);
                    System.out.print(numero1);
                }
                if(numero1>=numero2) {
                    System.out.print(numero1);
                    System.out.print(numero2);
                }
            }
        }
        scanner.close(); //Cierra el objeto scanner
    }
}
