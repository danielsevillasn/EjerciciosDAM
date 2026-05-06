package EjerciciosRepaso.Genericos.Ejercicio9;

public class Registro<T> {
    private int id;
    private T dato;

    public Registro(int id, T dato) {
        this.id = id;
        this.dato = dato;
    }
    
    @Override
    public String toString() {
        return "Registro [id=" + id + ", dato=" + dato + "]";
    }
    
}
