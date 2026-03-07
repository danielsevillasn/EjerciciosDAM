import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Crea el objeto scanner
        System.out.print("Dame un caracter con el que quieras hacer la piramide: ");
        String a = scanner.nextLine();
        System.out.print("Dime la orientacion de la piramide ");
        System.out.print("(1: arriba, 2: abajo, 3: izquierda, 4: derecha): ");
        int orientacion = scanner.nextInt();
        switch (orientacion) { //Segun la orientacion, hace la piramide de una forma u otra
            case 1: //Piramide hacia arriba
                System.out.println("  " + a);
                System.out.println(" " + a + a + a);
                System.out.println(a + a + a + a + a);
                break;
            case 2: //Piramide hacia abajo
                System.out.println(a + a + a + a + a);
                System.out.println(" " + a + a + a);
                System.out.println("  " + a);
                break;
            case 3: //Piramide hacia la izquierda
                System.out.println("    " + a);
                System.out.println("  " + a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println("  " + a + " " + a);
                System.out.println("    " + a);
                break;
            case 4: //Piramide hacia la derecha
                System.out.println(a);
                System.out.println(a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println(a + " " + a);
                System.out.println(a);
                break;
            default:
                System.out.println("Orientacion no valida");
        }
        scanner.close(); //Cierra el objeto scanner
    }
}
