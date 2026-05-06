package Telefono.Implementaciones;

import Telefono.Pruebas.Telefono;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TelefonoTest {
    @Test
    public void movilValido() {
        assertTrue(Telefono.esTelefonoNacional("612345678"));
        assertTrue(Telefono.esTelefonoNacional("712345678"));
    }

    @Test
    public void espaciosPermitidos() {
        assertTrue(Telefono.esTelefonoNacional("612 345 678"));
    }

    @Test
    public void limitesLongitud() {
        assertFalse(Telefono.esTelefonoNacional("61234567"));  // 8 dígitos
        assertFalse(Telefono.esTelefonoNacional("6123456789")); // 10 dígitos
    }

    @Test
    public void prefijosInvalidos() {
        assertFalse(Telefono.esTelefonoNacional("512345678"));
        assertFalse(Telefono.esTelefonoNacional("012345678"));
    }

    @Test
    public void conjeturaErrores() {
        assertFalse(Telefono.esTelefonoNacional(null));
        assertFalse(Telefono.esTelefonoNacional(""));
        assertFalse(Telefono.esTelefonoNacional("61234A678"));
    }
}
