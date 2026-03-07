import java.util.Scanner;
public class Ejercicio12y16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int puntuacion = 0;
        System.out.println("De que color es una manzana");
        System.out.println("1.Roja");
        System.out.println("2.Verde");
        System.out.println("3.Amarilla");
        System.out.print("Exprese su eleccion (1-3): ");
        int eleccion = s.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Correcto");
                puntuacion = puntuacion +1;
                break;
            case 2:
                System.out.println("Incorrecto");
                break;
            case 3:
                System.out.println("Incorrecto");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("De que color es un arbol");
        System.out.println("1.Roja");
        System.out.println("2.Verde");
        System.out.println("3.Amarilla");
        System.out.print("Exprese su eleccion (1-3): ");
        eleccion = s.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Incorrecto");
                break;
            case 2:
                System.out.println("Correcto");
                puntuacion = puntuacion +1;
                break;
            case 3:
                System.out.println("Incorrecto");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        System.out.println("De que color es un platano");
        System.out.println("1.Roja");
        System.out.println("2.Verde");
        System.out.println("3.Amarilla");
        System.out.print("Exprese su eleccion (1-3): ");
        eleccion = s.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Incorrecto");
                break;
            case 2:
                System.out.println("Incorrecto");
                break;
            case 3:
                System.out.println("Correcto");
                puntuacion = puntuacion +1;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        System.out.println("De que color es una mesa");
        System.out.println("1.Marron");
        System.out.println("2.Verde");
        System.out.println("3.Amarilla");
        System.out.print("Exprese su eleccion (1-3): ");
        eleccion = s.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Correcto");
                puntuacion = puntuacion +1;
                break;
            case 2:
                System.out.println("Incorrecto");
                break;
            case 3:
                System.out.println("Incorrecto");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        System.out.println("De que color es una señal de stop");
        System.out.println("1.Roja");
        System.out.println("2.Verde");
        System.out.println("3.Amarilla");
        System.out.print("Exprese su eleccion (1-3): ");
        eleccion = s.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Correcto");
                puntuacion = puntuacion +1;
                break;
            case 2:
                System.out.println("Incorrecto");
                break;
            case 3:
                System.out.println("Incorrecto");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        System.out.println("Su puntuacion es: " + puntuacion + "/5");
        s.close();
    }

}
