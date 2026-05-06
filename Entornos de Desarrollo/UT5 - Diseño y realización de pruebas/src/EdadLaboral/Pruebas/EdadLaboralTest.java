package EdadLaboral.Pruebas;

import EdadLaboral.Implementaciones.EdadLaboral;
import org.junit.Test;
import static org.junit.Assert.*;

public class EdadLaboralTest {

    // --- TESTS ---
    @Test
    public void edadValidaNormal() {
        assertTrue(EdadLaboral.esEdadLaboral(30));
    }

    @Test
    public void limiteInferior() {
        assertFalse(EdadLaboral.esEdadLaboral(15)); // Un año menos
        assertTrue(EdadLaboral.esEdadLaboral(16));  // Límite exacto
    }

    @Test
    public void limiteSuperior() {
        assertTrue(EdadLaboral.esEdadLaboral(65));  // Límite exacto
        assertFalse(EdadLaboral.esEdadLaboral(66)); // Un año más
    }

    @Test
    public void edadesImposibles() {
        assertFalse(EdadLaboral.esEdadLaboral(-5));
        assertFalse(EdadLaboral.esEdadLaboral(150));
    }
}
