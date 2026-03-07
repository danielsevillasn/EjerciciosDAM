package PrimerEjemplo.grupo;
public class Grupo
	{
		//atributos
		private String nombre;
		private Alumno delegada;
		
		/** obsoleto
		public void mostrarNombre()
		{
			System.out.println(nombre);
		}
		**/
		//constructores
		public String getNombre()
		{
			return nombre;
		}

		public Grupo(String nombre, Alumno delegada)
			{
			
				this.nombre = nombre;
				this.delegada = delegada;
			}

		//modificadores
		public void setNombre(String nombre)
		{
			if(nombre.length()==4) 
			    this.nombre = nombre;
		}


		public Alumno getDelegada()
			{
				return delegada;
			}


		public void setDelegada(Alumno delegada)
			{
				this.delegada = delegada;
			}
		
		
		public String toString()
		{
			return "Grupo: "+this.nombre+
					" y mi delegada/o es: "+this.delegada;
		}
		
		
		
		
	}
