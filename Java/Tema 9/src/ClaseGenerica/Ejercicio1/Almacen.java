package ClaseGenerica.Ejercicio1;

public class Almacen<T> {
    private T objeto;

    public Almacen(T objeto) {
        this.objeto = objeto;
    }

    public void mostrarTipo(){
        System.out.println("El objeto guardado es de tipo: "+objeto.getClass().getName());
    }
}
