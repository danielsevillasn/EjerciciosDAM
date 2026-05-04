package Poligonos.pruebas;

import org.junit.Test;
import Poligonos.Implementaciones.CalculosPoligonos;
import static org.junit.Assert.*;


public class CalculosPoligonosTest {
    @Test
    public void numerosNegativos(){
        int[] lados = {-1,2,4,-5};
        assertEquals("imposible",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void numerosNulos(){
        int[] lados = {-1,2,0,-5};
        assertEquals("imposible",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void valorNulo(){
        int[] lados = null;
        assertEquals("imposible",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void pocosLados1(){
        int[] lados = {1,2};
        assertEquals("imposible",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void pocosLados2(){
        int[] lados = {2};
        assertEquals("imposible",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void pocosLados3(){
        int[] lados = {2,3,4};
        assertEquals("irregular",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void ladorMayor(){
        int[] lados = {10,5,5};
        assertEquals("imposible",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void muchosLados(){
        int[] lados = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        assertEquals("regular",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void cuadrado(){
        int[] lados = {2,2,2,2};
        assertEquals("cuadrado",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void rectangulo(){
        int[] lados = {2,1,2,1};
        assertEquals("rectángulo",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void poligonoRegular(){
        int[] lados = {2,2,2,2,2,2};
        assertEquals("regular",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void poligonoIrregular(){
        int[] lados = {2,2,1,2,2,2};
        assertEquals("irregular",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void regularOIrregular(){
        int[] lados = {2,2,2,1};
        assertEquals("irregular",CalculosPoligonos.tipoDePolígono(lados));
    }

    @Test
    public void cuadradoORectangulo(){
        int[] lados = {5,5,5,4};
        assertEquals("irregular",CalculosPoligonos.tipoDePolígono(lados));
    }
}
