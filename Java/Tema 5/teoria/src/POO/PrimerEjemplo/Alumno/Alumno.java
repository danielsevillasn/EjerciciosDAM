package PrimerEjemplo.Alumno;
public class Alumno
	{
		//atributos o características
		private int dni;
		private String nombre;

		//constructores
		public Alumno(int dni, String nombre)
			{
				super();
				this.dni = dni;
				this.nombre = nombre;
			}
		
		
			//modificadores
		public int getDni()
			{
				return dni;
			}
		public void setDni(int dni)
			{
				this.dni = dni;
			}
		public String getNombre()
			{
				return nombre;
			}
		public void setNombre(String nombre)
			{
				this.nombre = nombre;
			}

		//comportamientos o métodos
		@Override
		public String toString()
			{
				return "Alumno [dni=" + dni + ", nombre=" + nombre + "]";
			}
		
		
		
		

	}
