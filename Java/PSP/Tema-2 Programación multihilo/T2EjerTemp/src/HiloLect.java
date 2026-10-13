import java.util.TimerTask;

public class HiloLect  extends TimerTask {
	Monitor mon;
	String sUltimaLectura = "";
	boolean bVivo = true;
	
	public HiloLect (Monitor mon)
	{
		this.mon=mon;
	}
	
	@Override
	public void run() {
		String sLec = mon.devuelveInfo();
		System.out.println("Lector: " + sLec);
		
		if (sLec.equals(sUltimaLectura))
		{
			System.out.println("Muere el Lector porque la publicacion no cambia");
			bVivo = false;
		}
		else
		{
			sUltimaLectura = sLec;
		}
	}
}
