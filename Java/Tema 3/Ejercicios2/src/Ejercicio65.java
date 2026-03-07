import java.util.Scanner;
public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura;
        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=3){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("La altura debe ser mayor o igual a 3.");
                System.out.print("Introduzca la altura de la pirámide maya: ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int palito;
        System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+ (altura-1) +"): ");
        palito = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (palito>=2 && palito<=altura-1){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la fila del palito horizontal (entre 2 y 6): ");
                palito = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosext = altura-1;
        int Anchopalito = palito*2 -1;
        int espaciosint = 1;
        String caracter = "*";
        for (int i = 1; i<=altura; i++ ){ //Bucle que controla las filas
            for (int j = 1; j <= espaciosext; j++){ //Bucle que controla los espacios exteriores
                    System.out.print(" ");
                }
            if (i == 1){    
                System.out.print(caracter);
            }
            else if (i == palito){
                for (int j = 1; j <= Anchopalito; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
                espaciosint = espaciosint+2;
            }
            else{
                System.out.print(caracter);
                for (int j = 1; j <= espaciosint; j++){ //Bucle que controla los espacios interiores
                    System.out.print(" ");
                }
                System.out.print(caracter);
                espaciosint = espaciosint+2; //Incrementa los espacios interiores en 2 por cada fila
            }
            System.out.println(); //Salto de línea al terminar la fila
            espaciosext--; //Decrementa los espacios exteriores en 1 por cada fila
        }
        s.close();
    }
}