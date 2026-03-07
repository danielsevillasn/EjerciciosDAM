import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio8_A_UT2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime lo que mide el cateto adyacente y el opuesto en metros: "); 
        double CatetoAdyacente = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double CatetoOpuesto = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double hipotenusa = ((CatetoAdyacente*CatetoAdyacente)+(CatetoOpuesto*CatetoOpuesto));
        System.out.printf("El resultado de su hipotenusa es: %.3f %1s", hipotenusa, "metros cubicos"); //Calcula la área del triangulo a partir de la formula
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}