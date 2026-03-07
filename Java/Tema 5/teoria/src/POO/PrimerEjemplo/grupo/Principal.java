package PrimerEjemplo.grupo;
public class Principal
	{
	
		public static void main(String args[])
		{
			Grupo primerGrupo;
			Grupo segundoGrupo;
			
			Alumno unaAlumna;
			unaAlumna = new Alumno("Andrea",20);
			
			Alumno otroAlumno;
			otroAlumno = new Alumno("Marco",19);

			primerGrupo = new Grupo("DAW1",unaAlumna);
			segundoGrupo = new Grupo("SMR2",otroAlumno);
			
			// ahora ya no, miGrupo.nombre = "DAW1";
			// porque es privado
			
			// ya no primerGrupo.setNombre("DAW1");
			// segundoGrupo.setNombre("SMR2");
			
			System.out.println(primerGrupo.getNombre());
			System.out.println(segundoGrupo.getNombre());
	
			// ya no hace falta primerGrupo.setDelegada(unaAlumna);
			
			System.out.println(unaAlumna);
			System.out.println(otroAlumno);
			
			System.out.println(primerGrupo);
			
			
		}

	}
