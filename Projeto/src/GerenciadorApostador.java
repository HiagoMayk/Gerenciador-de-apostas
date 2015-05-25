import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorApostador 
{
	private ArrayList<Apostador> apostadores;
	private int id = 0;

	public GerenciadorApostador() 
	{
		apostadores = new ArrayList<Apostador>();	
	}
	
	public void incrementaID() 
	{
		id ++;
	}
	
	public int novoApostador( String nome, String objeto, float valor) {
		Apostador apostador = new Apostador(nome, id, objeto, valor);
		incrementaID();
		inserirApostador(apostador);
		return apostador.getIdApostador();
	}

	public void inserirApostador(Apostador apostador) {
		apostadores.add(apostador);
	}

	public void removerApostador(int idApostador) 
	{
		if(apostadores.size() > 0)
		{
			for(int i = 0; i < apostadores.size(); i++) 
			{
				if(apostadores.get(i).getIdApostador() == idApostador)
			    {
			    	apostadores.remove(apostadores.get(i));
			    }
			}
		}		
	}

	public ArrayList<Apostador> getApostadores() {
		return apostadores;
	}

	public void setApostadores(ArrayList<Apostador> apostadores) {
		this.apostadores = apostadores;
	}
	
	public Apostador getApostador(int idApostador) 
	{
		for(int i = 0; i < apostadores.size(); i++) 
		{
			if(apostadores.get(i).getIdApostador() == idApostador)
		    {
		    	return apostadores.get(i);
		    }
		}
		
		return null;
	}
<<<<<<< HEAD
}
=======
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
