import java.util.Objects;

// Suponiendo que Listable es genérica
public class Lista<T> implements Listable<T> {

    private T[] elementos;
    private int numElementos;

    @SuppressWarnings("unchecked")
    public Lista(int tamanio) {
        if (tamanio > 0) {
            // Se usa Object y casting a T[] (común en genéricos de Java)
            this.elementos = (T[]) new Object[tamanio];
            this.numElementos = 0;
        } else {
            throw new IllegalArgumentException("El tamaño debe ser positivo");
        }
    }

    @Override
    public int posicion(T elemento) {
        for (int i = 0; i < this.numElementos; i++) {
            if (Objects.equals(this.elementos[i], elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean aniadir(T elemento) {
        // Verifica capacidad y (opcionalmente) si ya existe
        if (this.numElementos < this.elementos.length && this.posicion(elemento) == -1) {
            this.elementos[this.numElementos++] = elemento;
            return true;
        }
        return false;
    }

    @Override
    public int tamanio() {
        return this.numElementos;
    }

    @Override
    public boolean eliminar(T elemento) {
        int indice = this.posicion(elemento);

        if (indice != -1) {
            this.numElementos--;
            // Desplazamos los elementos a la izquierda
            for (int i = indice; i < this.numElementos; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            // Limpiamos la última referencia para ayudar al Garbage Collector
            this.elementos[this.numElementos] = null;
            return true;
        }
        return false;
    }

    @Override
    public void listar() {
        for (int i = 0; i < this.numElementos; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void vaciar() {
        // En lugar de crear un array nuevo, también podrías simplemente
        // poner a null las posiciones ocupadas y hacer numElementos = 0
        this.elementos = (T[]) new Object[this.elementos.length];
        this.numElementos = 0;
    }
}