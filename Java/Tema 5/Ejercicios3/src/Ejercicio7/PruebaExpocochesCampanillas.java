package Ejercicio7;
import java.util.Scanner;

public class PruebaExpocochesCampanillas {
    public static void main(String[] args) {
        String menu = "";
        Scanner s = new Scanner(System.in);
        Boolean salir = false;
        String opcion = "";
        ExpocochesCampanillas expo = new ExpocochesCampanillas();
        while(!salir){
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println("Elija una opción: ");
            menu = s.nextLine();
            switch (menu) {
                case "1":
                    expo.mostrarEntradas();
                    break;
                case "2":
                    System.out.println("1. SalaPrincipal");
                    System.out.println("2. Zona compra-venta");
                    System.out.println("3. Zona VIP");
                    System.out.println("Elija una opcion: ");
                    opcion = s.nextLine();
                    switch (opcion) {
                        case "1":
                            expo.venderSalaPrincipal(0);
                            break;
                        case "2":
                            expo.venderZonaCompraVenta(0);
                            break;
                        case "3":
                            expo.venderZonaVip(0);
                            break;
                        default:
                            System.out.println("El mensaje introducido no es valido");
                            break;
                    }
                    break;
                case "3":
                    salir = true;
                    break;
                default:
                    System.out.println("El mensaje introducido no es valido");
                    break;
            }
        }
        s.close();
    }
}
