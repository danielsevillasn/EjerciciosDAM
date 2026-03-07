//Escribe un programa que pida tres notas de un alumno y calcule su media y la calificación según la nota media:
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3; //Calculo del promedio
        System.out.printf("El promedio es: %.2f%n", promedio); // %.2f es para que muestre 2 decimales
        if (promedio >= 9){ //Si el promedio es mayor o igual a 9
            System.out.println("Sobresaliente");
        } else if (promedio >= 7){ //Si el promedio es mayor o igual a 7
            System.out.println("Notable");
        } else if (promedio >= 6){ //Si el promedio es mayor o igual a 6
            System.out.println("Bien");
        } else if (promedio >= 5){ //Si el promedio es mayor o igual a 5
            System.out.println("Suficiente");
        } else { //Si el promedio es menor a 5
            System.out.println("Insuficiente");
        }
        //El else if son los if anidados
        scanner.close();
    }
}
