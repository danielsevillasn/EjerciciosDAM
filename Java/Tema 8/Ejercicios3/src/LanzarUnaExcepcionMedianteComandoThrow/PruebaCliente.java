import java.util.Scanner;

public class PruebaCliente {
    static void main() {
        Cliente c1 = new Cliente("Pepe",20);
        int n1;
        Scanner s = new Scanner(System.in);
        int n2;

        try {
            System.out.println("Dame la cantidad que quieres depositar: ");
            n1 = Integer.parseInt(s.nextLine());
            c1.extraer(n1);
            System.out.println("Dame la cantidad que quieres sacar: ");
            n2 = Integer.parseInt(s.nextLine());
            c1.extraer(n2);
        } catch (CantidadExcedida e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c1);
        s.close();
    }
}
