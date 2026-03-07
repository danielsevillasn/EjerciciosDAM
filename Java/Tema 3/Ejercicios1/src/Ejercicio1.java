//Escribe un programa que pida por teclado un día de la semana y que diga la asignatura que toca a primera hora ese día.
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime un dia de la semana (lunes a viernes) (tiene que estar en minuscula): ");
        final String x = s.nextLine();
        x.toLowerCase();
        String asignatura = ""; //Sirve para establecer una variable string a la que se le asignara un valor en el switch
        switch (x) { //El switch evalua la variable x y dependiendo de su valor, ejecuta un case u otro
        case "lunes"-> //Cada case es un posible valor de x y el codigo que se ejecuta si x tiene ese valor
            asignatura = "Nube"; 
        case "martes"-> //La flecha sirve para reducir el tamaño de lo que ocupa los : y el break
            asignatura = "Sistemas"; //El break sirve para salir del switch una vez se ha ejecutado el case correspondiente
        case "miercoles"->
            asignatura = "Lenguajes";
        case "jueves"->
            asignatura = "Entornos";
        case "viernes"->
            asignatura = "Programacion";
        default->
            asignatura = "El dia introducido no es correcto"; //El default es el codigo que se ejecuta si x no coincide con ningun case
        }
    System.out.println("La asignatura a primera hora de ese día es: " +asignatura);
    s.close();
}
}
