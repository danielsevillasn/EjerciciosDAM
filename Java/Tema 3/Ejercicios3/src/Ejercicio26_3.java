import java.util.Scanner;
public class Ejercicio26_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = s.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = s.nextInt();
        int alturaAleatoria = (int)(Math.random()*(altura)+1); //Numero entre la altura y 1 
        int anchuraAleatoria1 = (int)(Math.random()*(anchura)+1); //Numero entre la anchura y 1 
        int anchuraAleatoria2 = (int)(Math.random()*(2)+1); //Numero entre 1 y 2
        String caracter = "*" ;
        for (int i = 1; i<=altura; i++){
            if(i == alturaAleatoria){
                if(i == 1 || i == altura-1){
                    for (int j = 1; j<=anchuraAleatoria1-1; j++){
                        System.out.print(caracter);
                    }
                    System.out.print(" ");
                    for (int j = anchuraAleatoria1; j<=anchura-1; j++){
                        System.out.print(caracter);
                    }
                }
                else{
                    if(anchuraAleatoria2 == 1){
                        System.out.print(" ");
                        for (int j = 1; j<=anchura-1; j++){
                            System.out.print(caracter);
                        }
                    }
                    if(anchuraAleatoria2 == 2){
                        for (int j = 1; j<=anchura-1; j++){
                            System.out.print(caracter);
                        }
                        System.out.print(" ");
                    }
                }
            }
            else{
                for (int j = 1; j<=anchura;j++){
                    System.out.print(caracter);
                }
            }
            System.out.println();
        }
        s.close();
    }
}
