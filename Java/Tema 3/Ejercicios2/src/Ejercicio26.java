import java.util.Scanner;
public class Ejercicio26 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int numero =s.nextInt();
    double numeroOriginal = numero;
    System.out.print("Introduzca un digito del numero anterior para averiguar en que posicion se encuentra: ");
    int digito = s.nextInt();
    int cifras = 0;
    int aux;
    do{ //Cuenta las cifras del número
            numeroOriginal = numeroOriginal /10;
            cifras++;
    } while (numeroOriginal >= 1);
    if (cifras ==1){
        System.out.print("El número introducido solo tiene una cifra, por lo que el dígito se situa en la cifra 1");
    } 
    else{
        do{  
        for (int i = 1; i < cifras; i++) {
            numero = numero/10;
        }
        cifras--;
        aux = numero; 
        } while (aux == digito);
        System.out.print("Se situa en la cifra " + cifras);
    }
    s.close();
  }
}