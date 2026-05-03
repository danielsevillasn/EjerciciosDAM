package Practica_JUnit.pruebas;

import static org.junit.Assert.*;
import org.junit.Test;
import static Practica_JUnit.implementaciones.Rectangulador.*;


public class RectanguladorTest {

	@Test
	public void unPrimoNoTieneRectangulos(){
		assertEquals( 0, rectangulosDiferentes(29));
	}
	
	@Test
	public void soloUnRectangulo(){
		assertEquals( 1, rectangulosDiferentes(391) );
	}

	@Test
	public void soloUnRectanguloCuadrado(){
		assertEquals( 1, rectangulosDiferentes(11*11) );
	}
	
	
	@Test
	public void variosRectangulos(){
		assertEquals( 5, rectangulosDiferentes(60));
		assertEquals( 3, rectangulosDiferentes(3838293));
		assertEquals( 3, rectangulosDiferentes(2834214));
		assertEquals( 89, rectangulosDiferentes(600000000));
	}


	@Test(expected=IllegalArgumentException.class)
	public void elCeroNoTieneRectangulos(){
		rectangulosDiferentes(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void unNegativoNoTieneRectangulos(){
		rectangulosDiferentes(-60);
	}
	
	@Test(timeout=1000)
	public void unNumeroGrande1(){
		assertEquals( 3, rectangulosDiferentes(9223372036854775801L ) );
	}

	@Test(timeout=1000)
	public void unNumeroGrande2(){
		assertEquals( 47, rectangulosDiferentes(9223372036854775807L ) );
	}

	@Test(timeout=1000)
	public void unNumeroGrande3(){
		assertEquals( 1, rectangulosDiferentes(3904997717061932759L ) );
	}
}
