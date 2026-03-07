/**
 * La clase emplea basicamente lo mismo que la anterior pero con un bucle
 * 
 * @author Dani
 */
import java.util.Scanner;

public class EjemploExcepciones02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula la media de dos números");

        boolean datoValido = false;
        double numero1 = 0;

        do{
            try{ //Prueba el codigo incluido
                System.out.print("Introduzca el primer numero: ");
                numero1 = Double.parseDouble(s.nextLine());
                datoValido = true;
            }catch(Exception e){ //Si el programa tiene excepciones entonces, lo recoge y dice lo siguiente
                System.out.println("Los datos introducidos no son correctos");
                System.out.println("Excepcion: "+e.getClass()); //Muestra el tipo de excepcion
                System.out.println("Error: "+e.getMessage()); //Muestra el error exacto
            }
        }while(!datoValido); //El bucle sirve para que hasta que no se solucione el error no para
        
        double numero2 = 0;
        datoValido = false;

        do{
            try{ //Prueba el codigo incluido
                System.out.print("Introduzca el segundo número: ");
                numero2 = s.nextDouble();
                datoValido = true;
            }catch(Exception e){ //Si el programa tiene excepciones entonces, lo recoge y dice lo siguiente
                System.out.println("No se puede calcular la media. ");
                System.out.println("Los datos introducidos no son correctos");
                System.out.println("Excepcion: "+e.getClass()); //Muestra el tipo de excepcion
                System.out.println("Error: "+e.getMessage()); //Muestra el error exacto
            }
            s.nextLine();
        }while(!datoValido); //El bucle sirve para que hasta que no se solucione el error no para
        System.out.println("La media es "+ (numero1+numero2)/2);
        s.close();
    }
}
