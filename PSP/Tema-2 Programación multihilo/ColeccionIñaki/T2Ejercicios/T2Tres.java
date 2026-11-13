
public class T2Tres {
	static final int INUMCOCHES = 5;	
	static T2TresH [] arrCoches = new T2TresH[INUMCOCHES];
		
	 public static void main (String [] args)
	 {
		 for (int iCoch = 0; iCoch < INUMCOCHES; iCoch++)
		 {
			 arrCoches[iCoch] = new T2TresH(iCoch + 1);
			 arrCoches[iCoch].start();
		 }
		 
		 for (int iCoch = 0; iCoch < INUMCOCHES; iCoch++)
		 {
			 try {
				arrCoches[iCoch].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 System.out.println("Finaliza toda la carrera");

		 long lTiempoTodos = 0;
		 int indMenTiempo = -1;
		 long lMenorTiempo = Long.MAX_VALUE;
		 int indMayTiempo = -1;
		 long lMayorTiempo = Long.MIN_VALUE;
		 
		 for (int iCoch = 0; iCoch < INUMCOCHES; iCoch++)
		 {
			 lTiempoTodos = lTiempoTodos + arrCoches[iCoch].iTiemTar; 
			 System.out.println("El coche: " + arrCoches[iCoch].iNombre + " ha tardado: " + arrCoches[iCoch].iTiemTar);
			 
			 if (arrCoches[iCoch].iTiemTar < lMenorTiempo)
			 {	
				 indMenTiempo = iCoch;
				 lMenorTiempo = arrCoches[iCoch].iTiemTar;
			 }

			 if (arrCoches[iCoch].iTiemTar > lMayorTiempo)
			 {	
				 indMayTiempo = iCoch;
				 lMayorTiempo = arrCoches[iCoch].iTiemTar;
			 }
			 
		 }

		 System.out.println("Los " + INUMCOCHES + " han tardado: " + lTiempoTodos);
		 
		 // Si hay empate muestra uno
		 System.out.println("El coche que menos ha tardado es: " + arrCoches[indMenTiempo].iNombre);
		 System.out.println("El coche que mas ha tardado es: " + arrCoches[indMayTiempo].iNombre);

	 }
}
