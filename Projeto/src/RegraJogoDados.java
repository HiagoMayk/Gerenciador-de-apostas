import java.util.ArrayList;

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
	}
	
	public boolean aplicarRegraJogo()
	{
		if((verificarRegrasAposta() && verificarManeiraAposta()) == true)
		{
			return true;
		}
		return false;
	}
	
	//Regras gerais de apostas
	public boolean verificarRegrasAposta() 
	{
		boolean pertence = true;
		
		for(int i = 0; i < getApostadores().size(); i++)
		{
			//Se a quantidade de apostas é maior que o minimo possível
			if (getQuantMaxApostas() < getApostadores().get(i).getGerenciadorAposta().getApostas().size())
			{
				return false;
			}
			
			//Se o valor das apostas está na faixa determinada
			for(int j = 0; j < getApostadores().get(i).getGerenciadorAposta().getApostas().size(); j++)
			{
				if (getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getValor() < getValorMinApostas() ||
					getValorMaxApostas() < getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getValor())
				{
					return false;	
				}
				
				pertence = false;
				//Se as apostas do usuário está no domínio de objetos de aposta do jogo
				for(int k = 0; k < getObjetosAposta().size(); k++)
				{
					if(getObjetosAposta().get(k).getNome().equals(getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getObjeto().getNome()))
					{
						pertence = true;
					}	
				}
				
				if(pertence == false){
					return false;
				}
			}
		}
		return true && pertence;
	}
	
	//Não pode apostar no mesmo objeto que outra pessoa já tenha apostado
	public boolean verificarManeiraAposta() 
	{
		boolean pertence = true;

		for(int i = 0; i < getApostadores().size(); i++)
		{
			for(int l = 0; l < getApostadores().size(); l++)
			{
				for(int j = 0; j < getApostadores().get(i).getGerenciadorAposta().getApostas().size(); j++)
				{
					pertence = true;
					if(i != l) //Não deve comparar com ele mesmo
					{
						for(int k = 0; k < getApostadores().get(l).getGerenciadorAposta().getApostas().size(); k++)
						{
							if(getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getObjeto().getNome().equals(getApostadores().get(l).getGerenciadorAposta().getApostas().get(k).getObjeto().getNome()))
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
