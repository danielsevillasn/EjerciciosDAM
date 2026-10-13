import java.util.TimerTask;

public class HiloEsc  extends TimerTask  {
	Monitor mon;
	int iNumPub = 1;
	
	public HiloEsc (Monitor mon)
	{
		this.mon=mon;
	}

	
	@Override
	public void run() {
		mon.actualizaInfo(iNumPub);
		System.out.println("Escritor, actualiza a: " + mon.devuelveInfo());
		iNumPub++;
	}
}
