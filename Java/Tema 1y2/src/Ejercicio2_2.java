import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime la cantidad de euros que quieres pasar a pesetas: "); 
        double euros = tecla.nextDouble();
        double peseta = 166.386; //El double sirve para establecer un numero decimal
        System.out.println(euros + " euros en pesetas son " + (euros*peseta)); //Muestra el valor de la variable en la pantalla
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}
