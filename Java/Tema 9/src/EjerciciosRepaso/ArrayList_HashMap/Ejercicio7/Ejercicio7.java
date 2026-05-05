package EjerciciosRepaso.ArrayList_HashMap.Ejercicio7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1. Catálogo de productos (HashMap)
        HashMap<String, Double> catalogo = new HashMap<>();
        catalogo.put("tomate", 1.59);
        catalogo.put("quinoa", 4.50);
        catalogo.put("avena", 2.10);
        catalogo.put("pan", 0.85);

        // 2. Carrito de la compra (ArrayList)
        ArrayList<Elemento> carrito = new ArrayList<>();

        // 3. Lectura de datos
        System.out.println("Introduzca productos (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Producto: ");
            String nombre = s.nextLine().toLowerCase();

            if (nombre.equals("fin")) {
                break;
            }

            if (!catalogo.containsKey(nombre)) {
                System.out.println("Lo siento, no tenemos ese producto.");
                continue;
            }

            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(s.nextLine());

            carrito.add(new Elemento(nombre, cantidad));
        }

        // 4. Procesamiento y salida de resultados
        System.out.println("\n--- Resumen de su compra ---");
        double totalCompra = 0;

        for (Elemento e : carrito) {
            double precioUnitario = catalogo.get(e.getNombre());
            double subtotal = precioUnitario * e.getCantidad();
            totalCompra += subtotal;

            System.out.printf("%s x %d: %.2f€ (Subtotal: %.2f€)%n",
                    e.getNombre(), e.getCantidad(), precioUnitario, subtotal);
        }

        System.out.printf("\nCOSTE TOTAL: %.2f€%n", totalCompra);
        s.close();
    }
}
