import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Introduce un numero entero que no supere a 2.147.483.647: ");
        int numero= s.nextInt();
        int contador=0;
        if (numero<0){ //Si el número es negativo, lo convertimos a positivo
            numero= -numero;
        }
        do { //Hacemos un bucle para ir dividiendo el número entre 10 hasta que llegue a 0
            if((numero/10)>0){ //Si el resultado de la división es mayor que 0, seguimos dividiendo
                numero= numero/10;
                contador++;
            } else { //Si el resultado de la división es 0, significa que hemos llegado al final
                contador++;
                System.out.println("El número tiene " + contador + " cifras.");
                numero=0;
            }
        } while (numero !=0); //Mientras el número no sea 0, seguimos dividiendo
        s.close();
    }

}
