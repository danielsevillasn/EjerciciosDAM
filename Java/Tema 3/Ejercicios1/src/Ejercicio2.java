//Escribe un programa que pida la hora por teclado y que muestre luego un mensaje indicando si es de mañana, de tarde o de noche.
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime que hora es: ");
        final int y = s.nextInt();
        if ((y>=6) && (y<=12)){ //Los operadores lógicos como el && sirve para ver poner varias condiciones en un mismo if y sirve como un y, es decir, que tienen que cumplirse ambas
            System.out.println("Buenos dias");
        }
        else if ((y>=13) && (y<=20)){ //Los operadores lógicos como el && sirve para ver poner varias condiciones en un mismo if y sirve como un y, es decir, que tienen que cumplirse ambas
            System.out.println("Buenas tardes");
        }
        else if (((y>=21) && (y<=23)) || ((y>=0) && (y<=5))){ //Los operadores lógicos como el && sirve para ver poner varias condiciones en un mismo if y sirve como un y, es decir, que tienen que cumplirse ambas
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("La hora introducida no es correcta");
        }
        s.close(); 
    }
}