//Escribe un programa que pida el día y el mes de nacimiento y diga el signo del zodiaco.
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime tu fecha de nacimiento en dia y mes: ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        String signo = ""; //Inicializo la variable signo vacia que luego se llenara con el signo correspondiente
        if (dia<1 || dia>31){ //Si el dia es menor que 1 o mayor que 31 o el mes es menor que 1 o mayor que 12 entonces la fecha no es correcta
            System.out.println("El dia introducido no es correcto");
        }
        else if (mes<1 || mes>12){
            System.out.println("El mes introducido no es correcto");
        }
        else { //Si la fecha es correcta, se comprueba el signo segun el dia y el mes y se asigna a la variable signo el signo correspondiente
            if (dia>=21 && mes==3 || dia<=19 && mes==4){
                signo="Aries";
            }
            if (dia>=20 && mes==4 || dia<=20 && mes==5){
                signo="Tauro";
            }
            if (dia>=21 && mes==5 || dia<=20 && mes==6){
                signo="Geminis";
            }
            if (dia>=21 && mes==6 || dia<=22 && mes==7){
                signo="Cancer";
            }
            if (dia>=23 && mes==7 || dia<=22 && mes==8){
                signo="Leo";
            }
            if (dia>=23 && mes==8 || dia<=22 && mes==9){
                signo="Virgo";
            }
            if (dia>=23 && mes==9 || dia<=22 && mes==10){
                signo="Libra";
            }
            if (dia>=23 && mes==10 || dia<=21 && mes==11){
                signo="Escorpio";
            }
            if (dia>=22 && mes==11 || dia<=21 && mes==12){
                signo="Sagitario";
            }
            if (dia>=22 && mes==12 || dia<=19 && mes==1){
                signo="Capricornio";
            }
            if (dia>=20 && mes==1 || dia<=18 && mes==2){
                signo="Acuario";
            }
            if (dia>=19 && mes==2 || dia<=20 && mes==3){
                signo="Piscis";
            }
            System.out.println("Tu signo es: " + signo);
        }
        scanner.close();
    }
}