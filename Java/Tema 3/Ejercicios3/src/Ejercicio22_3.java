import java.util.Scanner;
public class Ejercicio22_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = s.nextInt();
        for (int i = 0; i < longitud; i++){
            int cuerpo = (int)(Math.random() *3+1); // Genera un número aleatorio entre 1 y 3
            if (i == 0){
                for ( int j= 0; j < 12; j++){
                    System.out.print(" ");
                }
                System.out.print("@");
            }
            else{
                for ( int j= 0; j < 11; j++){
                    System.out.print(" ");
                }
                switch (cuerpo){
                    case 1:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print(" *");
                        break;
                    case 3:
                        System.out.print("  *");
                        break;
                }
            }
            System.out.println();
        }
        s.close();
    }

}
