
public class Monitor {
	private String sInfo = "";
	
	public void actualizaInfo (int iPub)
	{
		this.sInfo = "Publicacion " + iPub;
	}
	
	public String devuelveInfo ()
	{
		return sInfo;
	}
}
