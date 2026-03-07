import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        System.out.print("Nota del primer control: ");
        nota1 = s.nextDouble();
        System.out.print("Nota del segundo control: ");
        nota2 = s.nextDouble();
        double notaMedia = (nota1 + nota2) / 2;
        if (notaMedia > 5) {
            System.out.println("Tu nota de Programación es: " + notaMedia);
        }
        if (notaMedia < 5) {
            System.out.print("¿Cual ha sido el resultado de la recuperación? (apto/no apto): ");
            String resultado = s.next();
            if (resultado.equals("apto")) {
                System.out.println("Tu nota de Programación es: 5" );
            } else {
                System.out.println("Tu nota de Programación es: " + notaMedia);
            }
            
        }
    s.close();
}
}
