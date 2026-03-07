import java.util.Scanner;
public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 5;
        System.out.println("Dime un numero del 1 al 10: ");
        final double y = s.nextDouble();
        if ((y>4) && (y<6)){ //Los operadores lógicos como el && sirve para ver poner varias condiciones en un mismo if y sirve como un y, es decir, que tienen que cumplirse ambas
            System.out.println("El numero es 5");
        }
        if ((y>=6) || (y<=4)){ //Los operadores lógicos como el && sirve para ver poner varias condiciones en un mismo if y sirve como un o, es decir, que tienen que cumplirse alguna
            System.out.println("El numero es distinto de 5");
        }
        if (!(y>=x)){ //Los operadores lógicos como el && sirve para ver poner varias condiciones en un mismo if y sirve como una negacion, es decir, que no tiene que cumplirse 
            System.out.println("El numero es menor que 5");
        }
        boolean a = false;
        boolean b = true;
        System.out.println("a || b = " + (a || b)); //Compara variables booleanas como si fuera una puerta OR
        System.out.println("a && b = " + (a && b)); //Compara variables booleanas como si fuera una puerta AND
        s.close();
    }
}