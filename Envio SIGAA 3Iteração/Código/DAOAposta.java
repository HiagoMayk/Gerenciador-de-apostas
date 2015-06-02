import java.util.ArrayList;

public class DAOAposta implements IDAOAposta
{
	
	private ArrayList<Aposta> apostas;
	
	public DAOAposta()
	{
		apostas = new ArrayList<Aposta>();
	}
	
	public void addAposta(Aposta aposta)
	{
		
		apostas.add(aposta);
	}
	
	public void removerAposta(int index)
	{
		if(apostas.size() != 0 && !(apostas.size() < index || index < 0))
		{
			apostas.remove(apostas.get(index));
		}
		
	}
	
	public Aposta procurarAposta(int index)
	{
		if(apostas.size() != 0 && !(apostas.size() < index || index < 0))
		{
			return apostas.get(index);
		}
		else
		{
			return null; //ERRO 
		}	
	}
	
	public ArrayList<Aposta> getApostas() 
	{
		return apostas;
	}

}
