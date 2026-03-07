//Escribe un programa que pida tres notas de un alumno y calcule su media.
import java.util.Scanner;
public class Ejercicio7 {
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
        scanner.close();
    }
}
