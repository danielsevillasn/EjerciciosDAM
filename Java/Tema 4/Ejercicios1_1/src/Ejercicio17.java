import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] num = new int[10];
        for(int i = 0; i<num.length;i++){
            num[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i<2;i++){
            if ( i == 0){
                System.out.print("Índice: ");
                for (int j = 0; j<num.length;j++){
                    System.out.print(j+ "\t");
                }
            }
            if ( i == 1){
                System.out.print("Valor:  ");
                for (int j : num){ //Foreach que sirve para mostrar por pantalla el array
                    System.out.print(j+ "\t");
                }
            }
            System.out.println();
        }
        System.out.print("Dime un numero del array que te gustaria que este en la posicion 0: ");
        int numero = s.nextInt();
        int posicion0 = num[0];
        boolean encontrado = false;
        while (true){ //Secuencia para comprobar si el numero esta en el array y pedir otro si no lo esta
            for (int i = 0; i < num.length; i++) {
                if (num[i] == numero){
                    encontrado = true;
                    break;
                }
                else if (i == num.length -1){
                    encontrado = false;
                    System.out.print("El numero no esta en el array, por favor, introduzca otro numero: ");
                    numero = s.nextInt();
                    s.nextLine();
                }
            }
            if (encontrado){
                break;
            }
        }
        do{
            for (int i = 0; i < num.length; i++) { //Secuencia para intercambiar los numeros de las posiciones
                if (i!=num.length-1){
                    num[i] = num[i+1];
                }
                else{
                    num[i] = posicion0;
                }
            }
        }while (num[0] != numero);
        for(int i = 0; i<2;i++){
            if ( i == 0){
                System.out.print("Índice: ");
                for (int j = 0; j<num.length;j++){
                    System.out.print(j+ "\t");
                }
            }
            if ( i == 1){
                System.out.print("Valor:  ");
                for (int j : num){ //Foreach que sirve para mostrar por pantalla el array
                    System.out.print(j+ "\t");
                }
            }
            System.out.println();
        }
        s.close();
    }

}
