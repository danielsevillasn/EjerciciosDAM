import java.util.Scanner;

public class PruebaOperaciones {
    public static void main(String[] args){
        Operaciones o1 = new Operaciones(7,0);
        Scanner s = new Scanner(System.in);
        boolean datoValido = false;
        do {
            try {
                System.out.println("Ingrese el primer numero: ");
                o1.setN1(Integer.parseInt(s.nextLine()));
                System.out.println("Ingrese el segundo numero: ");
                o1.setN2(Integer.parseInt(s.nextLine()));
                System.out.println(o1);
                datoValido = true;
            } catch (Exception e) {
                System.out.println("El segundo numero es un 0");
            }
        } while (!datoValido);
        s.close();
    }
}
