/**
 * @author inma
 * @version 1.0
 */
package Ej3FamiliarEnum;

import Ej3FamiliarEnum.Clases.Sexo;
import Ej3FamiliarEnum.Clases.Familiar;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author inma
 * @version 1.0
 */
public class PruebaFamiliar {

	/**
	 * @author inma
	 * @version 1.0
	 * @param args
	 */
	public static void main(String[] args) {

		Familiar ElAbuelo = new Familiar("Pedro",null, null, LocalDate.of(1946, 10, 12), Sexo.HOMBRE);
		Familiar LaAbuela = new Familiar("Nuria",null, null, LocalDate.of(1941, 8, 22), Sexo.MUJER);
		Familiar ElPadre = new Familiar("Ramon",ElAbuelo, null, LocalDate.of(1968, 1, 30), Sexo.HOMBRE);
		Familiar LaMadre = new Familiar("Marta",null, null, LocalDate.of(1966, 3, 24), Sexo.MUJER);
		Familiar ElTio = new Familiar("Gorca",ElAbuelo, null, LocalDate.of(1954, 1, 3), Sexo.HOMBRE);
		Familiar ElHijo = new Familiar("Guillermo",ElPadre, LaMadre, LocalDate.of(2000, 5, 14), Sexo.HOMBRE);
		Familiar LaHija = new Familiar("Paula",ElPadre, LaMadre, LocalDate.of(2004, 7, 22), Sexo.MUJER);
		
		//Hija-Padre
		if (LaHija.esMiPadre(ElPadre))
			System.out.println("Si es su hija");
		else
			System.out.println("No es su hija");
		
		//Nieta-Abuelo
		if (LaHija.esMiAbuelo(ElAbuelo))
			System.out.println("Si es su nieta");
		else
			System.out.println("No es su nieta");
		
		//Hermana-Hermano
		if (LaHija.esMiHermano(ElHijo))
			System.out.println("Si es su hermano ");
		else
			System.out.println("No es su hermano");
		
		//Sobrina-Tio
		if (LaHija.esMiTio(ElTio))
			System.out.println("Si es su tio ");
		else
			System.out.println("No es su tio");
	}

}
