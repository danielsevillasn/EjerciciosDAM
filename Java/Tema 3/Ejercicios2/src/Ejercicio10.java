import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double numero;
        int contador=0;
        double suma=0;
        do {
            System.out.print("Introduce un número entero positivo y si quieres terminar uno negativo: ");
            numero= s.nextInt();
            if (numero>0){
                contador++;
                suma+=numero;
            }
        } while (numero>0);
        System.out.printf("La media de los números introducidos es: %.2f", (suma/contador));
        s.close();
    }
}
