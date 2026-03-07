import java.util.Scanner;

public class EjemploExcepciones03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int asteriscos;
        int líneas;
        int longitud;
        boolean datoValido = false;
        int cuentaAsteriscos = 0;

        System.out.println("Este programa pinta varias líneas de asteriscos");

        do{
            try{
                System.out.print("Introduzca el número total de astericos: ");
                asteriscos = Integer.parseInt(s.nextLine());
                
                System.out.print("Introduzca el número de líneas que quiere pintar: ");
                líneas = Integer.parseInt(s.nextLine());
                
                if (asteriscos % líneas == 0) {
                    longitud = asteriscos / líneas;
                } else {
                    longitud = (int) Math.ceil((double) asteriscos / líneas);
                }
                cuentaAsteriscos = 0;
                for(int i = 1; i<= líneas; i++){
                    System.out.print("Línea "+i+": ");
                    for(int j = 0; (j<longitud) && (cuentaAsteriscos++ < asteriscos);j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                datoValido = true;
            }catch(NumberFormatException Excepcion1){
                System.out.println("Los datos introducidos no son correctos.");
                System.out.println("Se deben introducir números enteros");
            }catch(ArithmeticException Excepcion2){
                System.out.println("El número de líneas no puede ser 0");
            }
        }while(!datoValido);

        System.out.println("Tiene "+cuentaAsteriscos+" asteriscos");
        s.close();
    }
}
