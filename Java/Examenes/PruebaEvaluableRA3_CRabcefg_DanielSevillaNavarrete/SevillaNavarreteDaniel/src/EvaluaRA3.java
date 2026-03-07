import java.util.Scanner;
public class EvaluaRA3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura = 0; //Inicializa la variable cuyo valor ha de ser un valor entero
        System.out.println("Escriba la altura: ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=5){ //Si la altura es mayor o igual a 5 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar y limpia el bufer
                System.out.println("Escriba la altura: ");
                altura = s.nextInt();
                s.nextLine(); //Sirve para limpiar el bufer
            }
        }
        int asteriscos = altura*2+(altura-2); //Sirve para calcular el numero de asteriscos

        //Tambien se podria realizar con un contador que se inicia en 0 y cada vez que se muestra un asterisco suma 1 a la variable pero de esta manera es mas sencilla

        int anchura = altura;
        int espaciosext = altura-2;
        final String caracter = "*"; //Constante que almacena caracteres
        for (int i = 0; i<altura;i++){ //Bucle que inicia en un valor 0 y que no para de realizarse hasta que se deja de cumplir la condicion previa gracias al ir sumando de uno en uno
            if(i==0 || i==altura-1){ //Si el nivel es igual a 0 o a la altura-1, entonces imprime una linea equivalente al numero de la anchura
                for(int j = 0;j<anchura;j++){ //Bucle que inicia en un valor 0 y que no para de realizarse hasta que se deja de cumplir la condicion previa gracias al ir sumando de uno en uno
                    System.out.print(caracter);
                }
            }
            else{ //Si no se da las condiciones anteriores, entonces imprime una cantidad determinada de espacios y un asterisco
                for(int j=0;j<espaciosext;j++){//Bucle que inicia en un valor 0 y que no para de realizarse hasta que se deja de cumplir la condicion previa gracias al ir sumando de uno en uno
                    System.out.print(" ");
                }
                System.out.print(caracter);
                espaciosext--; //Resta uno al valor a la variable
            }
            System.out.println(); //Salto de línea
        }
        System.out.println("Hay " + asteriscos + " asteriscos");
        s.close(); //Cierra el escaner
    }
}
