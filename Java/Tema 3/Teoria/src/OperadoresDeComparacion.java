import java.util.Scanner;
public class OperadoresDeComparacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 5;
        System.out.println("Dime un numero del 1 al 10: ");
        final int y = s.nextInt();
        if (y==x){ //Los operadores de comparación como el == sirve para ver si son iguales
            System.out.println("El numero es 5");
        }
        if (y!=x){ //Los operadores de comparación como el != sirven para ver si son distintos
            System.out.println("El numero es distinto de 5");
        }
        if (y<x){ //Los operadores de comparación como el != sirven para ver si es menor 
            System.out.println("El numero es menor que 5");
        }
        if (y>x){ //Los operadores de comparación como el != sirven para ver si es mayor
            System.out.println("El numero es mayor que 5");
        }
        if (y>=x){ //Los operadores de comparación como el != sirven para ver si es menor o igual
            System.out.println("El numero es mayor o igual que 5");
        }
        if (y<=x){ //Los operadores de comparación como el != sirven para ver si es mayor o igual
            System.out.println("El numero es menor o igual que 5");
        }
        s.close();

    }

}
