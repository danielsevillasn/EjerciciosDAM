import java.util.Scanner;
public class LetraM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura que ha tener la M (minimo 5 y ha de ser impar): ");
        int altura = s.nextInt();
        while(true){
            if(altura>=5 && altura%2!=0){
                break;
            }
            else{
                System.out.println("La altura introducida no es mayor o igual que 5");
                System.out.print("Introduzca la altura que ha tener la M (minimo 5): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espacios1_1 = altura;
        int espacios1_2 = altura;
        int ancho1 = 2;
        int ancho2 = 2;
        int ancho3 = 3;
        int espacios2 = 1;
        String caracter = "*";
        for (int i= 0;i<altura;i++){
            if(i>=0 && i<3){
                for (int j = 0; j<ancho1;j++){
                    System.out.print(caracter);
                }
                for (int j = 0;j<espacios1_1;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<ancho1;j++){
                    System.out.print(caracter);
                }
                espacios1_1 -=2;
                ancho1++;
            }else if(i>=3 && i<=altura/2){
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
                for (int j = 0;j<espacios2;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
                for (int j = 0;j<espacios1_1;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
                for (int j = 0;j<espacios2;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
                espacios1_1 -=2;
                espacios2 ++;
            }else if(i >altura/2 && i< altura/2 +2){
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
                for (int j = 0;j<espacios2;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<ancho3;j++){
                    System.out.print(caracter);
                }
                for (int j = 0;j<espacios2;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
                espacios2++;
            }else{
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
                for (int j = 0;j<espacios1_2;j++){
                    System.out.print(" ");
                }
                for (int j = 0; j<ancho2;j++){
                    System.out.print(caracter);
                }
            }
            System.out.println();
        }
        s.close();
    }
}
