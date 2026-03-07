import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime 2 numeros: "); 
        int numero1 = tecla.nextInt();
        int numero2 = tecla.nextInt();
        System.out.print("El resultado de su multiplicacion: " + (numero1*numero2));
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}