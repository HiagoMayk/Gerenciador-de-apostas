import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorAposta 
{

	private ArrayList<Aposta> apostas;

	public GerenciadorAposta() 
	{
		apostas = new ArrayList<Aposta>();
	}

	public ArrayList<Aposta> getApostas() 
	{
		return apostas;
	}

	public void setApostas(ArrayList apostas) 
	{
		this.apostas = apostas;
	}

	public void inserirAposta(Aposta aposta) 
	{
		apostas.add(aposta);
	}

	public void removerAposta(int id) 
	{
		for(Iterator<Aposta> a = apostas.iterator(); a.hasNext();) 
		{
		    Aposta aposta = a.next();
		    if(aposta.getIdAposta() == id)
		    {
		    	apostas.remove(aposta);
		    }
		}
	}

}