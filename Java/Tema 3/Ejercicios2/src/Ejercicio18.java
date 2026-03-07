import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero1 = s.nextInt();
        System.out.print("Introduce otro número entero positivo: ");
        int numero2 = s.nextInt();
        if (numero1 == numero2) {
            System.out.println("Ambos números son iguales.");
        } else {
            for (int i = Math.min(numero1, numero2); i < Math.max(numero1, numero2); i=i+7) { //Los metodos Math.min y Math.max devuelven el menor y mayor de dos números respectivamente
                System.out.print(i + " ");
            }
            System.out.println();
        }
        s.close();
    }

}
