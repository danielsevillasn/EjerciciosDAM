import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        int contador= 0;
        int contraseña= 1234;
        Scanner s= new Scanner(System.in);
        do {
            System.out.print("Introduce la contraseña: ");
            contraseña= s.nextInt();
            if (contraseña==1234){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
                System.out.println("Lo siento, esa no es la combinación");
                System.out.println("Ha agotado sus 4 oportunidades");
                contador++;
            }
        } while (contador<=3);
        s.close();
    }
}
