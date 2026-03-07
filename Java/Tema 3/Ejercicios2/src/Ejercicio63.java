import java.util.Scanner;
public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura1;
        System.out.print("Introduzca la altura de la primera pirámide: ");
        altura1 = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura1>=2){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura de la primera pirámide: ");
                altura1 = s.nextInt();
                s.nextLine();
            }
        }
        int altura2;
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        altura2 = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura2>=2){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura de la segunda pirámide: ");
                altura2 = s.nextInt();
                s.nextLine();
            }
        }
        int fila1 = 1;
        int fila2 = 1;
        String caracter = "*";
        int altura; 
        int espaciosext1;
        int espaciosext2;
        if (altura1>altura2){
            altura = altura1;
            espaciosext1 = (altura1-1);
            espaciosext2 = (altura2-1);
        }
        else{
            altura = altura2;
            espaciosext1 = (altura1-1);
            espaciosext2 = (altura2-1);
        }
        int ContadorFilas = altura;
        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            for (int k = 1; k <= espaciosext1; k++){ //Bucle que controla los espacios
                    System.out.print(" ");
            }
            if (ContadorFilas<=altura1){
                for (int j = 1; j<=fila1; j++){ //Bucle que controla los caracteres por fila
                    System.out.print(caracter);
                }
                fila1+=2;
            }
            else{
                for (int j = 1; j<=fila1; j++){ //Bucle que controla los caracteres por fila
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= espaciosext1; k++){ //Bucle que controla los espacios
                    System.out.print(" ");
            }
            if (ContadorFilas<=altura1){
                espaciosext1--;
            }
            System.out.print(" ");
            if (ContadorFilas<=altura2){
                for (int k = 1; k <= espaciosext2; k++){ //Bucle que controla los espacios
                    System.out.print(" ");
                }
                for (int j = 1; j<=fila2; j++){ //Bucle que controla los caracteres por fila
                    System.out.print(caracter);
                }
                fila2+=2;
                espaciosext2--;
            }
            System.out.println();
            ContadorFilas--;
        }
        s.close();
    }
}