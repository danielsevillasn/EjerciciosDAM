//Escribe un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Porfavor, introduzca el valor de a: ");
        final double a = s.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        final double b = s.nextDouble();
        final double x = (-b)/a;
        if (a !=0){ //Si a es distinto de 0, la ecuación tiene solución única
            System.out.println("x = " +x);
        }
        else {
            System.out.println("Esta ecuacion no tiene solucion real");
        }
        s.close();
}
}
