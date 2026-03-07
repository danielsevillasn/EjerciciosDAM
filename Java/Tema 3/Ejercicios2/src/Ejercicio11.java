import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero cualquiera: ");
        int numero = s.nextInt();
        int contador =0;
        System.out.println("n   n2    n3");
        do{
            System.out.println(numero+"  "+(Math.pow(numero,2))+"  "+(Math.pow(numero,3)));
            numero++;
            contador++;
        }while (contador<=5);
        s.close();
    }

}
