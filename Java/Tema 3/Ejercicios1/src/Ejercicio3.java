//Escribe un programa que pida un número por teclado (1-7) y que diga el día de la semana correspondiente.
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el numero del dia de la semana que quieras ver: ");
        final int x = s.nextInt();
        String numero = ""; //Sirve para establecer una variable string a la que se le asignara un valor en el switch
        switch (x) { //El switch evalua la variable x y dependiendo de su valor, ejecuta un case u otro
        case 1: //Cada case es un posible valor de x y el codigo que se ejecuta si x tiene ese valor
            numero = "Lunes";
            break; //El break sirve para salir del switch una vez se ha ejecutado el case correspondiente
        case 2:
            numero = "Martes";
            break;
        case 3:
            numero = "Miercoles";
            break;
        case 4:
            numero = "Jueves";
            break;
        case 5:
            numero = "Viernes";
            break;
        case 6:
            numero = "Sabado";
            break;
        case 7:
            numero = "Domingo";
            break;
        default:
            numero = "No existe ningun dia asociado a ese numero"; //El default es el codigo que se ejecuta si x no coincide con ningun case
        }
    System.out.println("El numero es: " +numero);
    s.close();
}
}
