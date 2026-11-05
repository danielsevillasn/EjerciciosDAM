package EjerciciosPropuestosRepaso.Ejercicio7;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {
    /** Constructor que recibe OutputStream */
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    /* Redefinicion del método de escribir la cabecera para que no haga nada. */
    protected void writeStreamHeader() throws IOException {
    }
}