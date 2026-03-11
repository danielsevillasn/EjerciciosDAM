import java.util.Arrays;

public class PruebaProducto2 {
    public static void main(String[] args) throws ExcepcionPrecioNegativo{

        Producto[] productos = {
                new Producto("Producto Genérico", 10),
                new ProductoFresco("Manzanas",2 , 4),
                new ProductoRefrigerado("Leche", 3, 1),
                new ProductoRefrigerado("Yogur", 2.5,2 ),
                new ProductoFresco("Manzanas",2 , 2)
        };

        Arrays.sort(productos);

        int numProductos = 0;
        int numProductosFrescos = 0;
        int numProductosRefrigerados = 0;
        double totalImporte = 0;

        ProductoRefrigerado productoMasAlejado = null;
        ProductoFresco productoProximoCaducar = null;

        for (Producto producto : productos) {
            System.out.println(producto);

            totalImporte += producto.comprar(5);

            if (producto instanceof ProductoRefrigerado) {
                numProductosRefrigerados++;
                ProductoRefrigerado productoRefrigerado = (ProductoRefrigerado) producto;
                if (productoMasAlejado == null || productoRefrigerado.getnCajon() > productoMasAlejado.getnCajon()) {
                    productoMasAlejado = productoRefrigerado;
                }
            } else if (producto instanceof ProductoFresco) {
                numProductosFrescos++;
                ProductoFresco productoFresco = (ProductoFresco) producto;
                if (productoProximoCaducar == null
                        || productoFresco.getDiasCaducidad() < productoProximoCaducar.getDiasCaducidad()) {
                    productoProximoCaducar = productoFresco;
                }
            } else {
                numProductos++;
            }

        }

        System.out.println("El total de la compra es: " + totalImporte);
        System.out.println("El numero de productos genericos es de: " + numProductos);
        System.out.println("El numero de productos frescos es de: " + numProductosFrescos);
        System.out.println("El numero de productos refrigerados es de: " + numProductosRefrigerados);

        System.out.println("El producto refrigerado mas alejado es: " + productoMasAlejado);
        System.out.println("El producto fresco mas proximo a caducar es: " + productoProximoCaducar);
    }
}
