import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double numero;
        int contador=0;
        double suma=0;
        do { //Bucle que se repite hasta que el usuario introduce su suma sea mayor o igual a 10000
            System.out.print("Introduce un número: ");
            numero= s.nextInt();
            suma += numero;
            contador++;
        } while (suma<10000);
        System.out.printf("\nLa suma de todos ellos es: %.2f", suma);
        System.out.printf("\nSe han introducido %d números", contador);
        System.out.printf("\nLa media de los números es: %.2f", (suma/contador));
        s.close();
    }
}
