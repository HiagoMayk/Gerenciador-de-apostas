package controle;
import java.util.ArrayList;

import dados.EntradaSaida;
import dados.IO;
import modelo.ObjetoAposta;
import modelo.Premio;

public class RegraJogoDados extends RegraJogo 
{
	public RegraJogoDados()
	{			
		//Esse código vai deposi para o Regrajogo Abstrato
		IO io = new EntradaSaida();
		super.setQuantMaxApostadores(io.quantMaxApostadores());
		super.setQuantMaxApostas(io.quantMaxApostas());
		super.setValorMaxApostas(io.valorMaxApostas());
		super.setValorMinApostas(io.valorMinApostas());
		super.setObjetosAposta(io.getObjetosAposta());
		super.setTabelaPremiacao(io.getTebelaPremiacao());
		super.setApostadores(io.getApostadores());
		super.setObjetosGanhadores(io.getObjetosGanhadores());
	}
	
	//Não pode apostar no mesmo objeto que outra pessoa já tenha apostado
	public boolean verificarManeiraAposta() 
	{
		boolean pertence = true;

		for(int i = 0; i < getApostadores().size(); i++)
		{
			for(int l = 0; l < getApostadores().size(); l++)
			{
				for(int j = 0; j < getApostadores().get(i).getDAOAposta().getApostas().size(); j++)
				{
					pertence = true;
					if(i != l) //Não deve comparar com ele mesmo
					{
						for(int k = 0; k < getApostadores().get(l).getDAOAposta().getApostas().size(); k++)
						{
							if(getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjeto().getNome().equals(getApostadores().get(l).getDAOAposta().getApostas().get(k).getObjeto().getNome()))
							{
								pertence =  false;
							}
						}
						if(pertence == false){
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	//Retorna um array list com a ordem da premiação (valores) - no caso só 1 valor pois só um ganha
	public ArrayList<Premio> getTabelaPremiacao() 
	{
		return super.getTabelaPremiacao();
	}
		
	public int getQuantMaxApostadores() 
	{
		return super.getQuantMaxApostadores();
	}

	public int getQuantMaxApostas() 
	{
		return super.getQuantMaxApostas();
	}

	public float getValorMinApostas() 
	{
		return super.getValorMinApostas();
	}

	public float getValorMaxApostas() 
	{
		return super.getValorMaxApostas();
	}
	
	public GerenciadorResultado getGerenciadorResultado() 
	{
		return super.getGerenciadorResultado();
	}
	
	public ArrayList<ObjetoAposta> getObjetosAposta()
	{
		return super.getObjetosAposta();
	}
	
}
