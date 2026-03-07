import java.util.Scanner;

public class Ejercicio6_A_UT2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline y le atribuye un nombre
        System.out.print("Dame un numero que quieras saber su tabla de multiplicar: "); //Sirve para imponer un mensaje en el terminal que sirve como pregunta 
        final int numero = tecla.nextInt(); 
        System.out.println("Tabla del "+ numero);
        System.out.println(numero + " X  1 =    " + (numero*1));
        System.out.println(numero + " X  2 =   " + (numero*2));
        System.out.println(numero + " X  3 =   " + (numero*3));
        System.out.println(numero + " X  4 =   " + (numero*4));
        System.out.println(numero + " X  5 =   " + (numero*5));
        System.out.println(numero + " X  6 =   " + (numero*6));
        System.out.println(numero + " X  7 =   " + (numero*7));
        System.out.println(numero + " X  8 =   " + (numero*8));
        System.out.println(numero + " X  9 =   " + (numero*9));
        System.out.println(numero + " X 10 =   " + (numero*10));
        tecla.close();
    }
}
