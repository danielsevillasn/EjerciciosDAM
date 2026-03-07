import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double BaseImponible = scanner.nextDouble();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String TipoIVA = scanner.next();
        TipoIVA = TipoIVA.toLowerCase(); //Convierte el tipo de IVA a minusculas para evitar errores
        System.out.printf("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
        String CodigoPromocional = scanner.next();
        CodigoPromocional = CodigoPromocional.toLowerCase(); //Convierte el codigo
        double IVA = 0;
        double Codigo = 0;
        System.out.printf("Base imponible: %.2f\n", BaseImponible);
        switch (TipoIVA) {
        case "general":
            IVA = 0.21*BaseImponible;
            System.out.printf("IVA (21%%) %.2f\n", IVA);
            break;
        case "reducido":
            IVA = 0.10*BaseImponible;
            System.out.printf("IVA (10%%) %.2f\n", IVA);
            break;
        case "superreducido":
            IVA = 0.04*BaseImponible;
            System.out.printf("IVA (4%%) %.2f\n", IVA);
            break;
        default:
            System.out.println("Tipo de IVA no valido");
            break;
        }
        double PrecioConIVA = BaseImponible +IVA;
        System.out.printf("Precio con IVA %.2f%n", PrecioConIVA);
        switch (CodigoPromocional) {
            case "nopro": 
                Codigo = 0;
                System.out.printf("Cod. promo. (nopro): %.2f%n", Codigo);
                break;
            case "mitad":
                Codigo = PrecioConIVA / 2;
                System.out.printf("Cod. promo. (mitad): -%.2f%n", Codigo);
                break;
            case "meno5":
                Codigo = 5;
                System.out.printf("Cod. promo. (meno5): -%.2f%n", Codigo);
                break;
            case "5porc":
                Codigo = PrecioConIVA * 0.05;
                System.out.printf("Cod. promo. (5porc): -%.2f%n", Codigo);
                break;
            default:
                System.out.println("Cod. promo. no valido");
                break;
        }
        double Total = PrecioConIVA - Codigo;
        System.out.printf("TOTAL %.2f%n", Total);
        scanner.close();
    }

}
