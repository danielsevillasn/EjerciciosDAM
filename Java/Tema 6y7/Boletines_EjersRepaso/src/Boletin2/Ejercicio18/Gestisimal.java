package Boletin2.Ejercicio18;
public class Gestisimal {
    private Articulo[] articulos;
    private int cantidadActualArticulos;
    private int maxProductos;

    public Gestisimal(int maxProductos){
        this.maxProductos = maxProductos;
        articulos = new Articulo[maxProductos];
    }

    public void listado(){
        System.out.println("El listado de productos es: ");
        for(Articulo a : articulos){
            System.out.println(a);
        }
    }

    public void alta(Articulo a){
        if(cantidadActualArticulos>=maxProductos){
            System.out.println("No se puede inscribir este articulo: "+a.getCodigo());
        }else{
            articulos[cantidadActualArticulos++] = a;
        }
    }

    public void baja(int codigo){
        for(int i = 0;i<maxProductos;i++){
            if(articulos[i].getCodigo() == codigo){
                articulos[i] = null;
            }
        }
    }

    public void modificar(String ){

    }
}
