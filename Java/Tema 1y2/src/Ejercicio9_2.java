import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio9_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime el radio y la altura del triangulo que quieres calcular: "); 
        double radio = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double altura = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double π = 3.14;
        System.out.println("El resultado de su volumen es: " + ((1.0/3.0)*π*(radio*radio)*altura) + "metros cubicos"); //Calcula la área del triangulo a partir de la formula
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}