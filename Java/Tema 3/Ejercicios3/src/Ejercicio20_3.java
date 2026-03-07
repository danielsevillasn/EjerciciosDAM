import java.util.Scanner;
public class Ejercicio20_3 {
    public static void main(String[] args){
        int capacidad;
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        capacidad = s.nextInt();
        int cantidad = (int)(Math.random() * (capacidad+1));
        System.out.println("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + cantidad + " litros de agua.");
        for (int i = capacidad; i >= 0; i--){
            System.out.print("*");
            if (i <= cantidad && i != 0){
                for ( int j = 0; j < 4; j++){
                System.out.print("=");
                }
            }
            else if (i > cantidad && i != 0){
                for ( int j = 0; j < 4; j++){
                System.out.print(" ");
                }
            }
            if (i == 0){
                for ( int j= 0; j < 4; j++){
                    System.out.print("*");
                }
            }
            System.out.print("*");
            System.out.println();
        }
        s.close();
    }
}
