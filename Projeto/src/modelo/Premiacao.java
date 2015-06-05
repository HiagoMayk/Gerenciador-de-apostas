package modelo;
import java.util.ArrayList;

public class Premiacao 
{
	private ArrayList<Premio> premios;
	
	public Premiacao() 
	{
		premios = new ArrayList<Premio>();
	}

	public ArrayList<Premio> getPremios() 
	{
		return premios;
	}

	public void setPremios(ArrayList<Premio> premios) 
	{
		this.premios = premios;
	}	
	
}
