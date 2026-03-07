import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura;
        System.out.print("Introduzca la altura del árbol de navidad: ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=4){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura de la pirámide maya: ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosext = altura-1;
        int espaciosint = 1;
        String caracter = "^";
        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            if (i < altura-1){    
                for (int j = 1; j <= espaciosext; j++){ //Bucle que controla los espacios exteriores
                    System.out.print(" ");
                }
                if (i == 0){
                    System.out.print("*"); 
                }
                else if(i > 0 && i < altura-1) {
                    System.out.print(caracter);
                    if (i > 1 && i < altura-2) { //Condición para las filas intermedias
                        if (i == 2) { //Condición para la segunda fila
                            espaciosint = 1;
                        }
                        for (int j = 1; j <= espaciosint; j++){
                            System.out.print(" ");
                        }
                        System.out.print(caracter);
                    }
                    if (i == altura-2) { //Condición para la última fila
                        for (int j = 1; j < (altura-2.5)*2 ; j++){ //El 2.5 es para ajustar el número de espacios interiores ya que si no queda desproporcionado
                            System.out.print(caracter);
                        }
                    }  
                }
            }
            if (i == altura-1){ //Condición para la última fila
                espaciosext= altura-1;
                for (int j = 1; j <= espaciosext; j++){ //Bucle que controla los espacios exteriores
                    System.out.print(" ");
                }
                System.out.print("Y");
            }
            espaciosint += 2; //Incrementa los espacios interiores en 2 por cada fila
            System.out.println(); //Salto de línea al terminar la fila
            if (i>0){
            espaciosext--; //Decrementa los espacios exteriores en 1 por cada fila
            }
        }
        s.close();
    }
}
