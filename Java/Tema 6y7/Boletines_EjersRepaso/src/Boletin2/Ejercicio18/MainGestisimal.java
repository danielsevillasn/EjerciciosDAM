package Boletin2.Ejercicio18;

import java.util.Scanner;

public class MainGestisimal {private static Scanner s = new Scanner(System.in);
    // Necesitamos una instancia de Gestisimal para los métodos no estáticos como modificar()
    private static Gestisimal gestor = new Gestisimal();

    public static void main(String[] args) {
        int opcion = 0;

        do {
            try {
                menu();
                System.out.print("\nIntroduzca una opción: ");
                opcion = Integer.parseInt(s.nextLine());

                switch (opcion) {
                    case 1:
                        Gestisimal.listado();
                        break;
                    case 2:
                        crearAlta();
                        break;
                    case 3:
                        eliminarBaja();
                        break;
                    case 4:
                        gestor.modificar(); // Método no estático
                        break;
                    case 5:
                        gestionarEntrada();
                        break;
                    case 6:
                        gestionarSalida();
                        break;
                    case 7:
                        System.out.println("Saliendo del programa... ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida (1-7).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, introduzca un número válido.");
            }
        } while (opcion != 7);
    }

    private static void menu() {
        System.out.println("\n--- GESTISIMAL: Gestión Simplificada de Almacén ---");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
    }

    private static void crearAlta() {
        System.out.println("\n--- NUEVO ARTÍCULO ---");
        System.out.print("Código: ");
        int cod = Integer.parseInt(s.nextLine());
        System.out.print("Descripción: ");
        String desc = s.nextLine();
        System.out.print("Precio de compra: ");
        double pCompra = Double.parseDouble(s.nextLine());
        System.out.print("Precio de venta: ");
        double pVenta = Double.parseDouble(s.nextLine());
        System.out.print("Stock inicial: ");
        int stock = Integer.parseInt(s.nextLine());

        Articulo nuevo = new Articulo(cod, desc, pCompra, pVenta, stock);
        Gestisimal.alta(nuevo);
    }

    private static void eliminarBaja() {
        System.out.print("Introduzca el código del artículo a dar de baja: ");
        int cod = Integer.parseInt(s.nextLine());
        Gestisimal.baja(cod);
        System.out.println("Proceso de baja finalizado.");
    }

    private static void gestionarEntrada() {
        System.out.print("Código del artículo: ");
        int cod = Integer.parseInt(s.nextLine());
        System.out.print("Cantidad que entra: ");
        int cant = Integer.parseInt(s.nextLine());
        Gestisimal.entradaMercancia(cod, cant);
    }

    private static void gestionarSalida() {
        System.out.print("Código del artículo: ");
        int cod = Integer.parseInt(s.nextLine());
        System.out.print("Cantidad que sale: ");
        int cant = Integer.parseInt(s.nextLine());
        Gestisimal.salidaMercancia(cod, cant);
    }
}
