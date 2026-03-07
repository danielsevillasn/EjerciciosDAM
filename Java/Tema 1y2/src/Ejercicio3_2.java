import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline
        System.out.print("Dime la cantidad de pesetas que quieres pasar a euros: "); 
        double peseta = tecla.nextDouble(); //Lee y cambia la variable de entrada a la variable double
        double euros = 166.386; //El double sirve para establecer un numero decimal
        System.out.println(peseta + " pesetas en euros son " + (peseta/euros)); //Muestra el valor de la variable en la pantalla
        tecla.close(); //Sirve para cerrar el metodo scanner 
    }
}
