package Herramientas;
import java.util.Scanner;

public class PideDatos {
    /**
     * Pide datos conforme a un menú
     * @param mesajes del menu
     * @return opción del menú
     */
    public static String datosMenu(String[]mensajes){
        Scanner sc=new Scanner(System.in);
        Menu menu =new Menu(mensajes);

        menu.mostraMenu();
        String opcion = sc.nextLine();
        return opcion;
    }

    /**
     * Pide datos String conforme a un mensaje
     * 
     * @param mensaje para pedir datos
     * @return datos por teclado
     */
    public static String datosEscritos(String mensaje){
        Scanner datosEscritos = new Scanner(System.in);
        String datosParaIntroducir;

        System.out.println(mensaje);
        datosParaIntroducir = datosEscritos.nextLine().toLowerCase();
        System.out.println();
        return datosParaIntroducir;
    }

    /**
     * Pide datos int conforme a un mensaje
     * 
     * @param mensaje para pedir datos
     * @return datos por teclado
     */
    public static int datosNumericos(String mensaje){
        Scanner datosIntroducidos = new Scanner(System.in);
        int numero =0;
        boolean datoValido = false;
        do {
            try {
                System.out.println(mensaje);
                numero =Integer.parseInt(datosIntroducidos.nextLine());
                datoValido = true;
            } catch (NumberFormatException nfe) {
                // TODO: handle exception
                System.out.println("Error: Tiene que introducir un número entreo sin decimales.");
            }
        } while (!datoValido);
        return numero;
    }

    /**
     * Pide datos char conforme a un mensaje
     * 
     * @param mensaje para pedir datos
     * @return datos teclado
     */

    public static char datosChar(String mensaje){
        Scanner datosIntroducidos = new Scanner(System.in);
        char letra;

        System.out.println(mensaje);
        letra= datosIntroducidos.next().charAt(0);
        return  letra;
    }


}
