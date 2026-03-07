import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio7_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime la base imponible de tu factura: "); 
        double BaseImponible = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double IVA = 1.21; //El double sirve para establecer un numero decimal
        System.out.println("La factura de base imponible " +BaseImponible + " es " + (BaseImponible*IVA) + "euros"); //Muestra la secuencia impuesta en la pantalla
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}