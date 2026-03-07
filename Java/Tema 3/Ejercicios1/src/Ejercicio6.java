//Escribe un programa que calcule el tiempo que tarda un objeto en caer desde una altura h.
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Porfavor, introduzca la altura de donde cae el objeto para calcular el tiempo que tarda en caer: ");
        final double h = s.nextDouble();
        final double g = 9.81; // Constante de gravedad en m/s^2
        final double t = Math.sqrt((2*h)/g); //El Math.sqrt es la raiz cuadrada y esta basado en unos parametros que si no se cumplen no funciona (un ejemplo seria q debe de ser double)
        if (h>=0){ //Si a es distinto de 0, la ecuación tiene solución única
            System.out.println("Tardara= " +t+" segundos" );
        }
        else {
            System.out.println("La altura no puede ser negativa" );
        }
        s.close();
}
}
