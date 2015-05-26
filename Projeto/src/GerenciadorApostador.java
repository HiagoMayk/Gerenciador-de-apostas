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
	
	//Pode-se inserir um apostador sem ele ter uma aposta associada, porém toda aposta deve ter um apostador associado
	public void novoApostador(String nome) 
	{
		Apostador apostador = new Apostador(nome, id);
		incrementaID();
		inserirApostador(apostador);
	}

	public void inserirApostador(Apostador apostador) {
		apostadores.add(apostador);
	}
	
	//Remove apostador pelo seu id
	public void removerApostador(int idApostador)
	{
		if(apostadores.size() > 0) //Verifica se existe algum apostador
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
	
	//Retorna um apostador pelo seu id
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
}
