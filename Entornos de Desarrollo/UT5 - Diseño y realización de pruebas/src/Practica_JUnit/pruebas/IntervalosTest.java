package Practica_JUnit.pruebas;

import static org.junit.Assert.*;
import org.junit.Test;
import Practica_JUnit.implementaciones.Intervalos;


/**
 * Pruebas para el ejercicio de Intervalos
 *
 * Cada test probará solo un caso, y se indicará claramente en el nombre del test lo que se está probando.
 * Los test se basarán en caja negra
 *
 * @autor Tu nombre aquí
 */
public class IntervalosTest {

    @Test
    public void testDelJavadocDelMetodo() {
        var solapamiento = Intervalos.solapamiento( 5,10,0, 9);
        assertEquals(4,solapamiento);
    }

    @Test
    public void testDeNoSolapamiento1() {
        var solapamiento = Intervalos.solapamiento( 0,5,6, 10);
        assertEquals(0,solapamiento);
    }

    @Test
    public void testDeNoSolapamiento2() {
        var solapamiento = Intervalos.solapamiento( 6,10,0, 5);
        assertEquals(0,solapamiento);
    }

    @Test
    public void testDeIntervalosIguales() {
        var solapamiento = Intervalos.solapamiento( 0,5,0, 5);
        assertEquals(5,solapamiento);
    }

    @Test
    public void testDeSolapamientoParcial1() {
        var solapamiento = Intervalos.solapamiento( 0,7,6, 10);
        assertEquals(1,solapamiento);
    }

    @Test
    public void testDeSolapamientoParcial2() {
        var solapamiento = Intervalos.solapamiento( 6,10,0, 7);
        assertEquals(1,solapamiento);
    }

    @Test
    public void testDeInclusionTotal1() {
        var solapamiento = Intervalos.solapamiento( 0,10,4, 6);
        assertEquals(2,solapamiento);
    }

    @Test
    public void testDeInclusionTotal2() {
        var solapamiento = Intervalos.solapamiento( 4,6,0, 10);
        assertEquals(2,solapamiento);
    }

    @Test
    public void testDeSolapamientoUno() {
        var solapamiento = Intervalos.solapamiento( 6,8,7,10);
        assertEquals(1,solapamiento);
    }

    @Test
    public void testDeSolapamientoFallido() {
        var solapamiento = Intervalos.solapamiento( 6,7,7,10);
        assertEquals(0,solapamiento);
    }

    @Test
    public void testDeIntervalosSinLongitud1() {
        var solapamiento = Intervalos.solapamiento( 5,5,0,10);
        assertEquals(0,solapamiento);
    }

    @Test
    public void testDeIntervalosSinLongitud2() {
        var solapamiento = Intervalos.solapamiento( 0,10,5,5);
        assertEquals(0,solapamiento);
    }
}
