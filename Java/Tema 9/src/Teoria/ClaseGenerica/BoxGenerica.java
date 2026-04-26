package Teoria.ClaseGenerica;

/**
 * Versión genérica de la clase Box
 * 
 * @param <T> el tipo del valor que se meterá dentro de la caja
 */
public class BoxGenerica<T> {
    // T es el "tipo"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
