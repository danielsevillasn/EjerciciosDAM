/**
 * Este ejercicio emplea el try-catch-finally y los explica
 * 
 * @author Dani
 */

import java.util.Scanner;
public class EjemploExcepciones01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula la media de dos números");

        try{ //Prueba el codigo incluido
            System.out.print("Introduzca el primer numero: ");
            double numero1 = Double.parseDouble(s.nextLine());
    
            System.out.print("Introduzca el segundo número: ");
            double numero2 = Double.parseDouble(s.nextLine());
    
            System.out.println("La media es "+ (numero1+numero2)/2);
        }catch(Exception e){ //Si el programa tiene excepciones entonces, lo recoge y dice lo siguiente
            System.out.println("No se puede calcular la media. ");
            System.out.println("Los datos introducidos no son correctos");
            System.out.println("Excepcion: "+e.getClass()); //Muestra el tipo de excepcion
            System.out.println("Error: "+e.getMessage()); //Muestra el error exacto
        }finally{ //Si tiene una excepcion o no dice esto al final
            System.out.println("Gracias por utilizar este programa !hasta la próxima!");
        }
        s.close();
    }
}
