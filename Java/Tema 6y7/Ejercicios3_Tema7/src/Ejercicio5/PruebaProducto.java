package Ejercicio5;

public class PruebaProducto {
    public static void main(String[] args) throws ExcepcionPrecioNegativo{

        // Creo varias instancia de productos
        Producto p1 = new Producto("Producto 1", 10);
        ProductoFresco p2 = new ProductoFresco("Producto 2",1, 20);
        ProductoRefrigerado p3 = new ProductoRefrigerado("Producto 3",1, 30);

        // Muestro la informacion
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Compro 10 unidades de cada uno
        System.out.println("Compro 10 unidades del producto 1: " + p1.comprar(10));
        System.out.println("Compro 10 unidades del producto 2: " + p2.comprar(10));
        System.out.println("Compro 10 unidades del producto 3: " + p3.comprar(10));

    }
}
