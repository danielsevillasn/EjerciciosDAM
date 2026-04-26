package Ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        productos.add(new Producto("Monitor", 200.0));
        productos.add(new Producto("Teclado", 50.0));
        productos.add(new Producto("Ratón", 25.0));
        productos.add(new Producto("Auriculares", 80.0));

        System.out.println(productos);

        for(int i = 0; i<productos.size();i++){
            productos.get(i).setPrecio(productos.get(i).getPrecio()*1.10);
        }

        productos.removeIf(p -> p.getPrecio() < 30.0);

        System.out.println(productos);
    }
}
