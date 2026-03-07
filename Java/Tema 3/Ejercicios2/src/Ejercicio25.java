import java.util.Scanner;
public class Ejercicio25 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido =s.nextInt();

    int numero = numeroIntroducido;
    int alreves = 0;
    
    if (numero < 0) {
      numero = -numero;
    } 
    while (numero > 0) { // mientras queden cifras 
      alreves = (alreves * 10) + (numero % 10); // sirve para ir formando el número al revés
      numero = numero / 10; // quita la última cifra
    } // while
    System.out.print("Si le damos la vuelta al " + numeroIntroducido);
    if(numeroIntroducido <0) { 
      System.out.print(" tenemos el " + -alreves + ".");
    }
    else{
    System.out.println(" tenemos el " + alreves + ".");
    }
    s.close();
  }
}
