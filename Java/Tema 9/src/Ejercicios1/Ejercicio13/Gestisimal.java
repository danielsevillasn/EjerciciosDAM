package Ejercicios1.Ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestisimal {
    public static void main(String[] args) {
        ArrayList<Articulo> almacen = new ArrayList<Articulo>();
        Scanner s = new Scanner(System.in);
        String opcion = "";
        boolean salir = false;
        boolean codigoEncontrado = false;
        int codigo;
        String descripción;
        double precioCompra;
        double precioVenta;
        int stock;

        while (!salir) {
            System.out.println("--Menu GESTISIMAL--");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Venta");
            System.out.println("7. Salir");
            System.out.print("Eliga una opcion(1-7): ");
            opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    if (almacen.size() != 0) {
                        System.out.println(almacen);
                    } else {
                        System.out.println("No hay articulos en el almacen");
                    }
                    break;
                case "2":
                    codigoEncontrado = false;
                    System.out.print("Ingrese el codigo del nuevo articulo: ");
                    codigo = Integer.parseInt(s.nextLine());
                    for (int i = 0; i < almacen.size(); i++) {
                        if (almacen.get(i).getCodigo() == codigo) {
                            codigoEncontrado = true;
                            break;
                        }
                    }
                    if (!codigoEncontrado) {
                        System.out.print("Ingrese el descripción del nuevo articulo: ");
                        descripción = s.nextLine();
                        System.out.print("Ingrese el precioCompra del nuevo articulo: ");
                        precioCompra = Double.parseDouble(s.nextLine());
                        System.out.print("Ingrese el precioVenta del nuevo articulo: ");
                        precioVenta = Double.parseDouble(s.nextLine());
                        System.out.print("Ingrese el stock del nuevo articulo: ");
                        stock = Integer.parseInt(s.nextLine());
                        almacen.add(new Articulo(codigo, descripción, precioCompra, precioVenta, stock));
                    } else {
                        System.out.println("Ya existe un codigo asignado con ese valor, pruebe con otro");
                    }
                    break;
                case "3":
                    codigoEncontrado = false;
                    System.out.print("Ingrese el codigo del articulo a eliminar: ");
                    codigo = Integer.parseInt(s.nextLine());
                    for (int i = 0; i < almacen.size(); i++) {
                        if (almacen.get(i).getCodigo() == codigo) {
                            System.out.println("Articulo " + codigo + " eliminado");
                            almacen.remove(i);
                            codigoEncontrado = true;
                            break;
                        }
                    }
                    if (!codigoEncontrado) {
                        System.out.println("El codigo no ha sido encontrado, pruebe de nuevo");
                    }
                    break;
                case "4":
                    codigoEncontrado = false;
                    System.out.print("Ingrese el codigo del articulo a modificar: ");
                    codigo = Integer.parseInt(s.nextLine());
                    for (int i = 0; i < almacen.size(); i++) {
                        Articulo articuloEscogido = almacen.get(i);
                        if (articuloEscogido.getCodigo() == codigo) {
                            codigoEncontrado = true;
                            System.out.println("¿Que es lo que quieres modificar?");
                            System.out.println("1. Codigo");
                            System.out.println("2. Descripcion");
                            System.out.println("3. Precio compra");
                            System.out.println("4. Precio venta");
                            System.out.print("Eliga una opcion(1-4): ");
                            opcion = s.nextLine();
                            switch (opcion) {
                                case "1":
                                    System.out.print("Ingrese el codigo del nuevo articulo: ");
                                    codigo = Integer.parseInt(s.nextLine());
                                    articuloEscogido.setCodigo(codigo);
                                    break;
                                case "2":
                                    System.out.print("Ingrese el descripción del nuevo articulo: ");
                                    descripción = s.nextLine();
                                    articuloEscogido.setDescripción(descripción);
                                    break;
                                case "3":
                                    System.out.print("Ingrese el precioCompra del nuevo articulo: ");
                                    precioCompra = Double.parseDouble(s.nextLine());
                                    articuloEscogido.setPrecioCompra(precioCompra);
                                    break;
                                case "4":
                                    System.out.print("Ingrese el precioVenta del nuevo articulo: ");
                                    precioVenta = Double.parseDouble(s.nextLine());
                                    articuloEscogido.setPrecioVenta(precioVenta);
                                    break;
                                default:
                                    System.out.println("Opcion invalida, intente de nuevo");
                                    break;
                            }
                            codigoEncontrado = true;
                            break;
                        }
                    }
                    if (!codigoEncontrado) {
                        System.out.println("El codigo no ha sido encontrado, pruebe de nuevo");
                    }
                    break;
                case "5":
                    codigoEncontrado = false;
                    System.out.print("Ingrese el codigo del articulo a aumentar: ");
                    codigo = Integer.parseInt(s.nextLine());
                    for (int i = 0; i < almacen.size(); i++) {
                        Articulo articuloEscogido = almacen.get(i);
                        if (articuloEscogido.getCodigo() == codigo) {
                            codigoEncontrado = true;
                            System.out.print("Ingrese el stock añadido al articulo: ");
                            stock = Integer.parseInt(s.nextLine());
                            articuloEscogido.setStock(articuloEscogido.getStock() + stock);
                            break;
                        }
                    }
                    if (!codigoEncontrado) {
                        System.out.println("El codigo no ha sido encontrado, pruebe de nuevo");
                    }
                    break;
                case "6":
                    int nArticulos;
                    double totalFactura = 0;
                    System.out.print("¿Que cantidad de tipos de articulos quieres vender?: ");
                    nArticulos = Integer.parseInt(s.nextLine());
                    if (almacen.size() >= nArticulos) {
                        for (int i = 0; i < nArticulos; i++) {
                            System.out.println("--" + i + " Articulo--");
                            codigoEncontrado = false;
                            System.out.print("Ingrese el codigo del articulo a vender: ");
                            codigo = Integer.parseInt(s.nextLine());
                            for (int j = 0; j < almacen.size(); j++) {
                                Articulo articuloEscogido = almacen.get(j);
                                if (articuloEscogido.getCodigo() == codigo) {
                                    codigoEncontrado = true;
                                    System.out.print("Ingrese cuanta cantidad quieres vender: ");
                                    stock = Integer.parseInt(s.nextLine());
                                    if (articuloEscogido.getStock() - stock >= 0) {
                                        articuloEscogido.setStock(articuloEscogido.getStock() - stock);
                                        System.out.println("Se ha reducido el stock del articulo a: "
                                                + articuloEscogido.getStock());
                                        System.out.println("El precio de la venta ha sido de: "
                                                + (articuloEscogido.getPrecioVenta() * (double) stock * 1.21));
                                        totalFactura += articuloEscogido.getPrecioVenta() * (double) stock * 1.21;
                                    } else {
                                        System.out.println("No hay suficientes articulos");
                                    }
                                    break;
                                }
                            }
                            if (!codigoEncontrado) {
                                System.out.println("El codigo no ha sido encontrado, pruebe de nuevo");
                            }
                        }
                    } else {
                        System.out.println("No hay tanto tipos de productos en el almacen");
                    }
                    System.out.println("El total facturado es de: " + totalFactura);
                    break;
                case "7":
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo");
                    break;
            }
        }
        s.close();
    }
}
