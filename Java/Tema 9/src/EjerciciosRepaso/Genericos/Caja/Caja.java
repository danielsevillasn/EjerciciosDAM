package EjerciciosRepaso.Genericos.Caja;

public class Caja<T> {
    private T dato;

    public Caja(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public void nombreClase(){
        System.out.println(dato.getClass().getName());
    }
}
