import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio6_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime la base y la altura del triangulo que quieres calcular: "); 
        double base = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double altura = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        System.out.println("El resultado de su area es: " + ((base*altura)/2) + "metros"); //Calcula la área del triangulo a partir de la formula
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}