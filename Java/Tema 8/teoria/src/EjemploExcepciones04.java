import java.util.Scanner;
public class EjemploExcepciones04 {
    public static void main(String[] args) {
        int m= pideEntero("Número de manzanas: ");
        int p = pideEntero("Número de personas: ");
        try {
            System.out.print("A cada persona le corresponden " + reparteManzanas(m, p) + " manzanas.\n");
        } catch (ArithmeticException ae) { //El programa recibe el error del metodo, manda un mensaje y se acaba
            System.out.println("Los datos introducidos no son correctos.");
        }
    }

    public static int reparteManzanas(int manzanas, int personas){
        try{
            return manzanas/personas;
        }catch(ArithmeticException ae){ //Si da un error aritmético el programa manda el mensaje y vuelve a mandar el error
            System.out.println("El número de personas vale 0.");
            throw ae; //Le paso la pelota al main para que haga lo conveniente
        }
    }

    public static int pideEntero(String mensaje){
        Scanner s = new Scanner(System.in);
        boolean datoValido = false;
        int entero = 0;
        do{
            try{
                System.out.println(mensaje);
                entero = Integer.parseInt(s.nextLine());
                datoValido = true;
            }catch(NumberFormatException e){
                System.out.println("Lo introducido no es un numero entero");
            }
        }while(!datoValido);
        return entero;
    }
}
