import java.util.Scanner;
public class BucleDo {
    public static void main(String[] args) {
        int a = 0;
        do{ //Se inicia la variable fuera y se modifica dentro
            System.out.println(a);
            a ++;
        } while(a<=10); //En el do la condicion se pone al final
        int numero = 1;
        Scanner s = new Scanner(System.in);
        do { //Hacer esta sentencia mientras que se cumpla que el numero es par
            System.out.println("Dime un numero: ");
            numero = s.nextInt();
            if (numero%2==0){ //Si el numero es par entonces
                System.out.println("Que bonito es el número "+numero);
            }else{ //Si el numero no es par entonces
                System.out.println("Que poco bonito es el número impar "+numero);
            }
        } while (numero%2==0); //En los bucles nunca hay que definir las variables ya que fuera de ellos no se conocen
        s.close();
    }

}
