//Escribe un programa que pida un número entero (de hasta 5 cifras) y diga cuál es la primera cifra.
import java.util.Scanner;
public class EvaluaPractica_CRa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero de hasta 5 cifras: ");
        int numero = s.nextInt();

        if (numero < 0) { //Sirve para ver si el numero es negativo
            numero = Math.abs(numero); //Lo paso a positivo
        }
        int primeraCifra = 0;
        if (numero < 10) { //Si el numero tiene una cifra entonces la primera cifra es el numero
            primeraCifra = numero;
        } 
        else if (numero < 100) { //Si el numero tiene dos cifras entonces divido entre 10 y saco la primera por que esta en un int y no tiene decimales
            primeraCifra = numero / 10;
        } 
        else if (numero < 1000) { //Si el numero tiene 3 cifras entonces divido entre 100 y saco la primera por que esta en un int y no tiene decimales
            primeraCifra = numero / 100;
        } 
        else if (numero < 10000) { //Si el numero tiene 4 cifras entonces divido entre 1000 y saco la primera por que esta en un int y no tiene decimales
            primeraCifra = numero / 1000;
        } 
        else if (numero < 100000) { //Si el numero tiene 5 cifras entonces divido entre 10000 y saco la primera por que esta en un int y no tiene decimales
            primeraCifra = numero / 10000;
        } 
        else {
            System.out.println("El número tiene más de 5 cifras."); //Si el numero tiene mas de 5 cifras entonces no se calcula y da 0 
        }
        System.out.println("La primera cifra del número es: " + primeraCifra);
        s.close();
    }
}