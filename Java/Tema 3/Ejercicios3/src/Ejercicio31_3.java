import java.util.Scanner;
public class Ejercicio31_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dinero;
        System.out.print("Por favor, introduzca el dinero que quieres apostar: ");
        dinero = s.nextDouble();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (dinero>=0){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("No se puede apostar una cantidad negativa");
                System.out.print("Por favor, introduzca el dinero que quieres apostar: ");
                dinero = s.nextDouble();
                s.nextLine();
            }
        }
        int dado1 = (int)(Math.random()*6+1);
        int dado2 = (int)(Math.random()*6+1);
        int suma = dado1 + dado2;
        if (suma == 7 || suma == 11){
            System.out.println("Has sacado un " + dado1 + " y un " + dado2 + ". ¡Has ganado " + (dinero*2) + " euros!");
        }
        else if (suma == 2 || suma == 3 || suma == 12){
            System.out.println("Has sacado un " + dado1 + " y un " + dado2 + ". Has perdido todo tu dinero");
        }
        else{
            do{
                System.out.println("Has sacado un " + dado1 + " y un " + dado2 + ". Tu objetivo ahora es sacar un " + suma + " antes de sacar un 7.");
                dado1 = (int)(Math.random()*6+1);
                dado2 = (int)(Math.random()*6+1);
                if (dado1 + dado2 == 7){
                    System.out.println("Has sacado un " + dado1 + " y un " + dado2 + ". Has perdido todo tu dinero");
                }
                else if(dado1 + dado2 == suma){
                    System.out.println("Has sacado un " + dado1 + " y un " + dado2 + ". ¡Has ganado " + (dinero*2) + " euros!");
                }
            }while((dado1 + dado2)!=7 && (dado1 + dado2)!=suma);
        }
        s.close();
    }

}
