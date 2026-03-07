import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dame la hora: ");
        final int a = s.nextInt();
        System.out.print("Dame los minutos: ");
        final int b = s.nextInt();
        final int segundos1 = a*60*60;
        final int segundos2 = b*60;
        final int segundosdia = 86400;
        if (a>24 || a<0){ //Si a es distinto de 0, la ecuación tiene solución única
            System.out.println("La hora no es valida");
        }
        if (b>60 || b<0){
            System.out.println("Los minutos no son validos");
        }
        final int segundostotales = segundosdia-(segundos1+segundos2);
        System.out.println("Faltan "+ segundostotales + " segundos para terminar el dia");
        s.close();
}
}
