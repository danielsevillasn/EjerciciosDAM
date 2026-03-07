//Escribe un programa que resuelva una ecuación de segundo grado (del tipo ax^2 + bx + c = 0).
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la variable a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de la variable b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de la variable c: ");
        double c = scanner.nextDouble();
        double formula1 = (a*a - 4*b*c); //La formula que esta dentro de la raiz cuadrada y sirve para ver si tiene solucion o no
        double formula2 = (-a + Math.sqrt(formula1)) / (2*b); //La formula con el + de la raiz cuadrada
        double formula3 = (-a - Math.sqrt(formula1)) / (2*b); //La formula con el - de la raiz cuadrada
        double formula4 = (-a) / (2*b); //La formula cuando la raiz cuadrada es 0
        if (formula1 > 0){ //Si la formula1 es mayor que 0, la ecuacion tiene dos soluciones reales
            System.out.printf("El resultado de la ecuacion de segundo grado es: %.3f y %.3f\n", formula2, formula3);
        }
        if (b == 0){ //Si b es 0, la ecuacion no tiene solucion en los numeros reales
            System.out.println("La ecuacion no tiene solucion en los numeros reales");
        }
        if (formula1 == 0){ //Si la formula1 es igual a 0, la ecuacion tiene una solucion real
            System.out.printf("El resultado de la ecuacion de segundo grado es: %.3f\n", formula4);
        }
        if (formula1 < 0){ //Si la formula1 es menor que 0, la ecuacion no tiene solucion en los numeros reales
            System.out.println("La ecuacion no tiene solucion en los numeros reales");
        }
        scanner.close();
    }
}
