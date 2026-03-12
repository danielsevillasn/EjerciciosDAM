package Boletin2.Ejercicio18;

import java.util.Scanner;

public class Gestisimal {
    private static int maxProductos = 20;
    private static Articulo[] articulos = new Articulo[maxProductos];
    Scanner s = new Scanner(System.in);

    public static void listado() {
        System.out.println("El listado de productos es: ");
        for (Articulo a : articulos) {
            if(a != null){
                System.out.println(a);
            }
        }
    }

    public static void alta(Articulo a) {
    int huecoLibre = -1;
    for (int i = 0; i < maxProductos; i++) {
        if (articulos[i] == null) {
            huecoLibre = i;
            break;
        }
    }

    if (huecoLibre != -1) {
        articulos[huecoLibre] = a;
        System.out.println("Artículo registrado con éxito.");
    } else {
        System.out.println("Almacén lleno. No se pudo registrar.");
    }
}

    public static void baja(int codigo) {
        for (int i = 0; i < maxProductos; i++) {
            if (articulos[i] != null && articulos[i].getCodigo() == codigo) {
                articulos[i] = null;
                break;
            }
        }
    }

    public void modificar(){
        boolean datoValido = false;
        int codigoArticulo = 0;
        do{
            try{
                System.out.print("Dime el codigo del articulo que quieras modificar: ");
                codigoArticulo = Integer.parseInt(s.nextLine());
                datoValido = true;
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while(!datoValido);

        boolean salir = false;
        while(!salir){
            String opcion = "";
            System.out.println("Dime que quieres modificar de todo esto");
            System.out.println("1- Descripcion");
            System.out.println("2- Precio de compra");
            System.out.println("3- Precio de venta");
            System.out.println("4- Stock disponible");
            System.out.println("5- Salir");
            System.out.print("Elija una opcion(1-4): ");
            opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Reestablece la descripcion: ");
                    String descripcion = s.nextLine();
                    for(int i = 0;i < maxProductos;i++){
                        if(articulos[i] != null && articulos[i].getCodigo() == codigoArticulo){
                            articulos[i].setDescripcion(descripcion);
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("Reestablece el precio de compra: ");
                    double precioCompra = Double.parseDouble(s.nextLine());
                    for(int i = 0;i < maxProductos;i++){
                        if(articulos[i] != null && articulos[i].getCodigo() == codigoArticulo){
                            articulos[i].setPrecioCompra(precioCompra);
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Reestablece el precio de venta: ");
                    double precioVenta = Double.parseDouble(s.nextLine());
                    for(int i = 0;i < maxProductos;i++){
                        if(articulos[i] != null && articulos[i].getCodigo() == codigoArticulo){
                            articulos[i].setPrecioVenta(precioVenta);
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("Reestablece el stock disponible: ");
                    int stock = Integer.parseInt(s.nextLine());
                    for(int i = 0;i < maxProductos;i++){
                        if(articulos[i] != null && articulos[i].getCodigo() == codigoArticulo){
                            articulos[i].setStock(stock);
                            break;
                        }
                    }
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("El mensaje introducido no es valido");
                    break;
            }
        }
    }

    public static void entradaMercancia(int codigo, int cantidad){
        for(int i = 0;i<maxProductos;i++){
            if(articulos[i] != null && articulos[i].getCodigo() == codigo){
                articulos[i].setStock(articulos[i].getStock()+cantidad);
                break;
            }
        }
    }

    public static void salidaMercancia(int codigo, int cantidad){
        for(int i = 0;i<maxProductos;i++){
            if(articulos[i] != null && articulos[i].getCodigo() == codigo){
                if(articulos[i].getStock()-cantidad<0){
                    System.out.println("No hay suficiente stock");
                }else{
                    articulos[i].setStock(articulos[i].getStock()-cantidad);
                }
                break;
            }
        }
    }
}
