package Ejercicios1.Ejercicio17y18;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Elemento> contenido;

    public Carrito() {
        contenido = new ArrayList<Elemento>();
    }

    public void agrega(Elemento articuloNuevo) {
        boolean encontrado = false;
        for (Elemento e : contenido) {
            if (e.getNombreProducto().equals(articuloNuevo.getNombreProducto())) {
                e.setCantidadProducto(e.getCantidadProducto() + articuloNuevo.getCantidadProducto());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            contenido.add(articuloNuevo);
        }
    }

    public int numeroDeElementos() {
        return contenido.size();
    }

    public Double importeTotal() {
        Double resultado = 0.0;
        for (int i = 0; i < contenido.size(); i++) {
            resultado += contenido.get(i).getPrecioProducto() * contenido.get(i).getCantidadProducto();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "--Contenido carrito--\n" + contenido;
    }

}
