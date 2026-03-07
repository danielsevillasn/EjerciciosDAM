import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
        int numero= s.nextInt();
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i=1; i<=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        s.close();
    }
}
