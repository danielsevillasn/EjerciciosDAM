import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double numero;
        int contador=0;
        double sumaimpar=0;
        double parmaximo = 0;
        int contadorimpar=0;
        do { //Bucle que se repite hasta que el usuario introduce un número negativo
            System.out.print("Introduce un número entero positivo y si quieres terminar uno negativo: ");
            numero= s.nextInt();
            if (numero>0){ //Comprueba que el número es positivo para contarle
                contador++;
            }
            if (numero % 2 == 0) { //Comprueba que el número es par
                if (numero > parmaximo) {
                    parmaximo = numero;
                }
            }
            else if (numero % 2 != 0 && numero > 0) { //Comprueba que el número es impar y positivo
                sumaimpar += numero;
                contadorimpar++;
            }
        } while (numero>0); //Mientras el número sea positivo, el bucle continúa
        System.out.printf("Se han introducido %d números", contador);
        System.out.printf("\nLa media de los números impares es: %.2f", (sumaimpar/contadorimpar));
        System.out.printf("\nEl número par máximo es: %.2f", parmaximo);
        s.close();
    }
}
