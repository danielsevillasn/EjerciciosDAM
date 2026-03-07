import java.util.Scanner;
public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10: ");
        final int x = s.nextInt();
        String numero = ""; //Sirve para establecer una variable string a la que se le asignara un valor en el switch
        switch (x) { //El switch evalua la variable x y dependiendo de su valor, ejecuta un case u otro
        case 1: //Cada case es un posible valor de x y el codigo que se ejecuta si x tiene ese valor
            numero = "1";
            break; //El break sirve para salir del switch una vez se ha ejecutado el case correspondiente
        case 2:
            numero = "2";
            break;
        case 3:
            numero = "3";
            break;
        case 4:
            numero = "4";
            break;
        case 5:
            numero = "5";
            break;
        case 6:
            numero = "6";
            break;
        case 7:
            numero = "7";
            break;
        case 8:
            numero = "8";
            break;
        case 9:
            numero = "9";
            break;
        case 10:
            numero = "10";
            break;
        default:
            numero = "No es ninguno que este entre 1 al 10";
        }
    System.out.println("El numero es: " +numero);
    s.close();
}
}
