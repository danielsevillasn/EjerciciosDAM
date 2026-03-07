import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio8_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime la cantidad de horas trabajadas: "); 
        double Horas = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double salario = 12; //El double sirve para establecer un numero decimal
        System.out.println("El salario semanal por  " +Horas + " horas es " + (Horas*salario) + "euros"); //Muestra la secuencia impuesta en la pantalla
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}