package PrimerEjemplo.Alumno;
public class Principal
	{

		public static void main(String[] args)
			{
				Alumno a;
			
				
				a = new Alumno(3,"Pepe");
				
				int n=0;
				while(n<20)
					{
						if(n==6)
							a.setDni(n);
						n++;
					}
				
				System.out.println(a);
			}

	}
