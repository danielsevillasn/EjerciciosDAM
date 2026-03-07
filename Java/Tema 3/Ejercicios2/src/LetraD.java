import java.util.Scanner;
public class LetraD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura que ha tener la D (minimo 6): ");
        int altura = s.nextInt();
        while(true){
            if(altura>=6){
                break;
            }
            else{
                System.out.println("La altura introducida no es mayor o igual que 6");
                System.out.println("Introduzca la altura que ha tener la D (minimo 6): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosint = altura-2;
        int anchura = altura-1;
        String caracter = "*";
        for (int i= 0;i<altura;i++){
            if(i == 0 || i == altura-1){
                for(int j = 0;j<anchura;j++){
                    System.out.print(caracter);
                }
            }
            else{
                System.out.print(caracter);
                for(int j = 0;j<espaciosint;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            System.out.println();
        }
        s.close();
    }

}
