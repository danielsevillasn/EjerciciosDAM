import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime 2 numeros: "); 
        double numero1 = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double numero2 = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        System.out.println("El resultado de su suma: " + (numero1+numero2));
        System.out.println("El resultado de su resta: " + (numero1-numero2));
        System.out.println("El resultado de su multiplicacion: " + (numero1*numero2));
        System.out.println("El resultado de su multiplicacion: " + (numero1/numero2));
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}