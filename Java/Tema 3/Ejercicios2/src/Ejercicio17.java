import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para entero positivo: ");
        int numero = s.nextInt();
        int suma=0;
        if (numero < 0) { //Si el número es negativo, lo convierte en positivo
            numero = -numero;
        }
        for (int i = 1; i <= 100; i++) { //Bucle que suma los 100 números siguientes
            suma += numero;
            numero++;
        }
        System.out.println("La suma de los 100 números enteros positivos siguientes es: " + suma);
        s.close();
    }

}
