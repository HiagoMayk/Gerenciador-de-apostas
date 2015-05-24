import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorApostador 
{
	private ArrayList<Apostador> apostadores;

	public GerenciadorApostador() 
	{
		apostadores = new ArrayList<Apostador>();
	
	}

	public void inserirApostador(Apostador apostador) {
		apostadores.add(apostador);
	}

	public void removerApostador(int id) 
	{
		for(Iterator<Apostador> a = apostadores.iterator(); a.hasNext();) 
		{
		    Apostador apostador = a.next();
		    if(apostador.getIdApostador() == id)
		    {
		    	apostadores.remove(apostador);
		    }
		}
	}

	public ArrayList<Apostador> getApostadores() {
		return apostadores;
	}

	public void setApostadores(ArrayList<Apostador> apostadores) {
		this.apostadores = apostadores;
	}

}