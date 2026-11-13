
public class T4ACinco {
	public static void main (String [] args)
	{
		T4ACincoMon mon = new T4ACincoMon();
		T4ACincoPast pastQueso = new T4ACincoPast(mon,"queso",1);
		T4ACincoPast pastLimon = new T4ACincoPast(mon,"limon",1);
		T4ACincoPast pastFresa = new T4ACincoPast(mon,"fresa",1);
		
		T4ACincoZampon quesoUno = new T4ACincoZampon("QuesoUno", mon, "queso");
		T4ACincoZampon quesoDos = new T4ACincoZampon("QuesoDos", mon, "queso");
		T4ACincoZampon limonUno = new T4ACincoZampon("LimonUno", mon, "limon");
		T4ACincoZampon limonDos = new T4ACincoZampon("LimonDos", mon, "limon");
		T4ACincoZampon fresaUno = new T4ACincoZampon("FresaUno", mon, "fresa");
		T4ACincoZampon fresaDos = new T4ACincoZampon("FresaUno", mon, "fresa");

		
		pastQueso.start();
		pastLimon.start();
		pastFresa.start();

		quesoUno.start();
		quesoDos.start();
		limonUno.start();
		limonDos.start();
		fresaUno.start();
		fresaDos.start();
		
		try {
			pastQueso.join();
			pastLimon.join();
			pastFresa.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		mon.bConcinerosFin = true;
		
		
		quesoUno.interrupt();
		quesoDos.interrupt();
		limonUno.interrupt();
		limonDos.interrupt();
		fresaUno.interrupt();
		fresaDos.interrupt();
		
	}
}

