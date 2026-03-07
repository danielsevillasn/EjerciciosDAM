package PrimerEjemplo.grupo;
public class Alumno
	{
		private String nombre;
		private int edad;
		
		//constructor
		public Alumno(String nombre, int edad)
		{
			this.nombre = nombre;
			this.edad = edad;
		}
		//setter y getters
		public String getNombre()
			{
				return nombre;
			}
		public void setNombre(String nombre)
			{
				this.nombre = nombre;
			}
		public int getEdad()
			{
				return edad;
			}
		public void setEdad(int edad)
			{
				this.edad = edad;
			}

			//métodos o comportamientos
		public String toString()
			{
				return "Soy "+this.nombre+
						" y mi edad es: "+this.edad;
			}

	}
