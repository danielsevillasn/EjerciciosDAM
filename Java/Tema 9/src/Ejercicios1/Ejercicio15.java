package Ejercicios1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        HashMap<String, Double> productosSupermercado = new HashMap<String, Double>();
        productosSupermercado.put("avena", 2.21);
        productosSupermercado.put("garbanzos", 2.39);
        productosSupermercado.put("tomate", 1.59);
        productosSupermercado.put("jengibre", 3.13);
        productosSupermercado.put("quinoa", 4.50);
        productosSupermercado.put("guisantes", 1.60);

        Scanner s = new Scanner(System.in);
        String nombreProducto = "";
        int cantidad;
        int nProductos = 0;
        Double total = 0.0;
        boolean productoRepetido = false;
        ArrayList<String> listaProductos = new ArrayList<String>();
        ArrayList<Double> listaPrecios = new ArrayList<Double>();
        ArrayList<Integer> listaCantidades = new ArrayList<Integer>();

        while (true) {
            System.out.print("Producto: ");
            nombreProducto = (s.nextLine()).toLowerCase();
            if (nombreProducto.equalsIgnoreCase("fin")) {
                break;
            }
            if (productosSupermercado.containsKey(nombreProducto)) {
                productoRepetido = false;
                System.out.print("Cantidad: ");
                cantidad = Integer.parseInt(s.nextLine());
                double precio = productosSupermercado.get(nombreProducto) * cantidad;
                total += precio;
                if (listaProductos.size() != 0) {
                    for (int i = 0; i < listaProductos.size(); i++) {
                        if (listaProductos.get(i).equalsIgnoreCase(nombreProducto)) {
                            listaPrecios.set(i, precio + listaPrecios.get(i));
                            listaCantidades.set(i, cantidad + listaCantidades.get(i));
                            productoRepetido = true;
                            break;
                        }
                    }
                }
                if (listaProductos.size() == 0 || !productoRepetido) {
                    listaProductos.add(nombreProducto);
                    listaPrecios.add(precio);
                    listaCantidades.add(cantidad);
                    nProductos++;
                }
            } else {
                System.out.println("El producto no existe");
            }
        }
        System.out.print("Introduzca un código de descuento (INTRO si no tiene ninguno): ");
        String codigoDescuento = s.nextLine();
        Double descuento = 0.0;
        if (codigoDescuento.equals("ECODTO")) {
            descuento = total * 0.10;
            total = total - descuento;
        }
        System.out.println("\nCalculando el importe...\n");

        System.out.printf("%-12s %-10s %-10s %-10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < nProductos; i++) {
            String p = listaProductos.get(i);
            System.out.printf("%-13s %-13.2f %-8d %-10.2f\n",
                    p,
                    productosSupermercado.get(p),
                    listaCantidades.get(i),
                    listaPrecios.get(i));
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Descuento: %.2f \n", descuento);
        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL: %.2f", total);
        s.close();
    }
}
