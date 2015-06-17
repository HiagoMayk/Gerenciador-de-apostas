package dados;
import java.util.ArrayList;

import modelo.Apostador;

public class DAOApostador implements IDAOApostador
{
	private ArrayList<Apostador> apostadores;
	
	public DAOApostador()
	{
		apostadores = new ArrayList<Apostador>();
	}
	

	
	public void addApostador(Apostador apostador)
	{		
		apostadores.add(apostador);
	}
	
	public void removerApostador(int index)
	{
		if(apostadores.size() > 0) //Verifica se existe algum apostador
		{
			for(int i = 0; i < apostadores.size(); i++) 
			{
				if(i == index)
			    {
			    	apostadores.remove(apostadores.get(i));
			    }
			}
		}		
	}

	public ArrayList<Apostador> getApostadores() 
	{
		return apostadores;
	}

}
