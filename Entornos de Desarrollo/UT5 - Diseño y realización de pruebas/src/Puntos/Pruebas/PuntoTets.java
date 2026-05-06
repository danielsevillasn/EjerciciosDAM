package Puntos.Pruebas;


import Puntos.Implementaciones.Punto;
import org.junit.Test;

import static org.junit.Assert.*;

public class PuntoTets {

    @Test
    public void mismaDistancia1(){
        Punto[] puntos = {
                new Punto(1,1),
                new Punto(1,2),
                new Punto(0,1)
        };
        Punto[][] resultado = new Punto[2][2];
        resultado[0][0] = new Punto(1,1);
        resultado[0][1] = new Punto(1,2);
        resultado[1][0] = new Punto(1,1);
        resultado[1][1] = new Punto(0,1);
        assertArrayEquals(resultado, Punto.masCercanos(puntos));
    }

    @Test
    public void mismaDistancia2(){
        Punto[] puntos = {
                new Punto(0, 0), // A
                new Punto(5, 0), // B (distancia 5)
                new Punto(3, 5)  // C (distancia sqrt(9+25) = 5.83)
        };
        Punto[][] resultado = Punto.masCercanos(puntos);

        assertEquals(1, resultado.length);
        assertEquals(new Punto(5, 0), resultado[0][1]);
    }

    @Test
    public void mismaDistancia3(){
        Punto[] puntos = {
                new Punto(0, 0), // A
                new Punto(5, 0), // B (distancia 5)
                new Punto(4, 2)  // C (distancia sqrt(16+4) = 4.47)
        };
        Punto[][] resultado = Punto.masCercanos(puntos);

        assertEquals(1, resultado.length);
        assertEquals(new Punto(4, 2), resultado[0][1]);
    }

    @Test
    public void valoresNulos(){
        Punto[] puntos = {
                new Punto(1,1),
                null,
                new Punto(0,1)
        };
        Punto[][] resultado = new Punto[1][2];
        resultado[0][0] = new Punto(1,1);
        resultado[0][1] = new Punto(0,1);
        assertArrayEquals(resultado, Punto.masCercanos(puntos));
    }

    @Test
    public void valoresNegativos(){
        Punto[] puntos = {
                new Punto(0,0),
                new Punto(-1,0),
                new Punto(2, 0)
        };
        Punto[][] resultado = new Punto[1][2];
        resultado[0][0] = new Punto(0,0);
        resultado[0][1] = new Punto(-1,0);
        assertArrayEquals(resultado, Punto.masCercanos(puntos));
    }

    @Test
    public void soloUnPunto(){
        Punto[] puntos = {
                new Punto(0,0),
        };
        assertArrayEquals(null, Punto.masCercanos(puntos));
    }

    @Test
    public void ningunPunto(){
        Punto[] puntos = null;
        assertNull(Punto.masCercanos(puntos));
    }

    @Test
    public void dosPuntos(){
        Punto[] puntos = {
                new Punto(0,0),
                new Punto(-1,0),
        };
        Punto[][] resultado = new Punto[1][2];
        resultado[0][0] = new Punto(0,0);
        resultado[0][1] = new Punto(-1,0);
        assertArrayEquals(resultado, Punto.masCercanos(puntos));
    }

    @Test
    public void distanciaCero(){
        Punto[] puntos = {
                new Punto(0,0),
                new Punto(0,0),
                new Punto(2, 0)
        };
        Punto[][] resultado = new Punto[1][2];
        resultado[0][0] = new Punto(0,0);
        resultado[0][1] = new Punto(0,0);
        assertArrayEquals(resultado, Punto.masCercanos(puntos));
    }


}
