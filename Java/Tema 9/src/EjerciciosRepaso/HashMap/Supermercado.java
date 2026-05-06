package EjerciciosRepaso.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        // Creamos el mapa: Clave (String - Nombre) -> Valor (Double - Precio)
        HashMap<String, Double> inventario = new HashMap<>();
        Scanner s = new Scanner(System.in);

        // 1. Añadimos 5 productos
        inventario.put("Leche", 1.20);
        inventario.put("Pan", 0.85);
        inventario.put("Huevos", 2.50);
        inventario.put("Manzanas", 1.95);
        inventario.put("Arroz", 1.10);

        // 2. Consulta de precio por nombre
        System.out.print("Introduzca el nombre del producto para consultar su precio: ");
        String productoBuscado = s.nextLine();

        // Verificamos si existe antes de obtenerlo para evitar nulos
        if (inventario.containsKey(productoBuscado)) {
            System.out.println("El precio de " + productoBuscado + " es: " + inventario.get(productoBuscado) + "€");
        } else {
            System.out.println("Lo sentimos, el producto '" + productoBuscado + "' no está en el inventario.");
        }

        // 3. Mostrar claves y valores por separado
        System.out.println("\n--- LISTA DE PRODUCTOS (Claves) ---");
        // keySet() devuelve un "Set" con todas las claves
        for (String producto : inventario.keySet()) {
            System.out.println("- " + producto);
        }

        System.out.println("\n--- LISTA DE PRECIOS (Valores) ---");
        // values() devuelve una colección con todos los valores
        for (Double precio : inventario.values()) {
            System.out.println("- " + precio + "€");
        }

        s.close();
    }
}
