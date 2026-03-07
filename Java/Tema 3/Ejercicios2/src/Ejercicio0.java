import java.util.Scanner;
public class Ejercicio0 {
    public static void main(String[] args) {
        int numero = 1;
        String letra;
        Scanner s = new Scanner(System.in);
        do { //Hacer esta sentencia mientras que se cumpla que el numero es par
            System.out.print("Dime un numero: ");
            numero = s.nextInt();
            if (numero%2==0){ //Si el numero es par entonces
                    System.out.println("Que bonito es el número "+numero);
            }else{ //Si el numero no es par entonces
                    System.out.println("Que poco bonito es el número impar "+numero);
            }
            System.out.print("Quieres continuar (s/n): ");
            letra = s.next();
            if (!letra.equalsIgnoreCase("s")){ //El IgnoreCase sirve para lo de las mayusculas y las minúsculas 
                break;//Si la letra no es s entonces se rompe el bucle
            }
        } while ((numero%2==0) || (letra.equalsIgnoreCase("s"))); //En los bucles nunca hay que definir las variables ya que fuera de ellos no se conocen
        System.out.println("By... Alejandro");
        s.close();
    }
}
