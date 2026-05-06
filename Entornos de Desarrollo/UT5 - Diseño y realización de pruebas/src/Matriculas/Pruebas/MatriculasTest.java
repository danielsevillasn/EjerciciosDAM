package Matriculas.Pruebas;

import Matriculas.Implementaciones.Matriculas;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatriculasTest {
    @Test
    public void valoresNulos(){
        String m1 = null;
        String m2 = "1111BBB";
        assertEquals("error",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void minusculas(){
        String m1 = "1112Bbc";
        String m2 = "1111bBB";
        assertEquals("mayor",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void espacios(){
        String m1 = " 1112Bbc ";
        String m2 = "1111 bBB";
        assertEquals("mayor",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void formato1(){
        String m1 = "111BBC";
        String m2 = "1111bBB";
        assertEquals("error",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void formato2(){
        String m1 = "1111BB";
        String m2 = "1111bBB";
        assertEquals("error",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void letrasIguales1(){
        String m1 = "1111BBB";
        String m2 = "1112BBB";
        assertEquals("menor",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void letrasIguales2(){
        String m1 = "1111BBC";
        String m2 = "1111BBB";
        assertEquals("mayor",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void letrasIguales3(){
        String m1 = "1111BBB";
        String m2 = "1111BBC";
        assertEquals("menor",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void numerosIguales1(){
        String m1 = "1111BBB";
        String m2 = "1112BBB";
        assertEquals("menor",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void numerosIguales2(){
        String m1 = "1111BBB";
        String m2 = "1111BBB";
        assertEquals("iguales",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void numerosIguales3(){
        String m1 = "1112BBB";
        String m2 = "1111BBB";
        assertEquals("mayor",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void iguales(){
        String m1 = "1111BBB";
        String m2 = "1111BBB";
        assertEquals("iguales",Matriculas.comparaMatricula(m1,m2));
    }

    @Test
    public void vocales(){
        String m1 = "1111BAB";
        String m2 = "1111ABB";
        assertEquals("error",Matriculas.comparaMatricula(m1,m2));
    }
}
