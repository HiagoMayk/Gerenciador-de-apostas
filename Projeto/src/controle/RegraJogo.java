package controle;
//import Resultado;
//import GerenciadorApostador;

import java.util.ArrayList;

import modelo.Apostador;
import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;

public abstract class RegraJogo implements IRegraJogo
{
	private int quantMaxApostadores;
	private int quantMaxApostas;
	private float valorMaxApostas;
	private float valorMinApostas;
	private ArrayList<ObjetoAposta> objetos;
	private Premiacao premiacao;				//Uma tabela de valores a ser ganho por colocaçães
	private GerenciadorResultadoDados gerenciadorResultado;
	private ArrayList<Apostador> apostadores;
	private ArrayList<ObjetoAposta> objetosGanhadores;
	
	public boolean aplicarRegraJogo()
	{
		premiacao = new Premiacao();
		if((verificaQuantidadeAposta() && verificaFaixaValores() &&
			verificaDominioAposta() && verificarManeiraAposta()) == true)
		{
			System.out.println("todo ok ate aqui!!!");
			return true;
		}
		return false;
	}
	
	public boolean verificaQuantidadeAposta()
	{
		for(int i = 0; i < getApostadores().size(); i++)
		{
			//Se a quantidade de apostas é maior que o maximo possível
			if (getQuantMaxApostas() < getApostadores().get(i).getDAOAposta().getApostas().size())
			{
				return false;
			}
		}
		
		return true;
	}
	
	public boolean verificaFaixaValores()
	{
		for(int i = 0; i < getApostadores().size(); i++)
		{		
			//Se o valor das apostas está na faixa determinada
			for(int j = 0; j < getApostadores().get(i).getDAOAposta().getApostas().size(); j++)
			{
				if (getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor() < getValorMinApostas() ||
					getValorMaxApostas() < getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor())
				{
					return false;	
				}
			}
		}
		return true;
	}
	
	public boolean verificaDominioAposta()
	{
		boolean pertence = true;
		
		for(int i = 0; i < getApostadores().size(); i++) //todos os apostadores
		{
			for(int j = 0; j < getApostadores().get(i).getDAOAposta().getApostas().size(); j++) //todas as apostas
			{
				pertence = false;
				//Se as apostas do usuário está no domínio de objetos de aposta do jogo
				for(int k = 0; k < getObjetosAposta().size(); k++) // dominio da aposta
				{
					for(int z = 0; z < getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().size(); z++)
					{
						if(getObjetosAposta().get(k).getNome().equals(getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(z).getNome()))
						{
							pertence = true;
						}	
					}
				}
				
				if(pertence == false){
					return false;
				}
			}
		}
		return true;
	}
	
	//Implementação da instancia 
	public ArrayList<Premio> getTabelaPremiacao() 
	{
		return premiacao.getPremios();
	}
	
	public ArrayList<ObjetoAposta> getObjetosGanhadores()
	{
		return objetosGanhadores;
	}
	
	public void setQuantMaxApostadores(int quantMaxApostadores) 
	{
		this.quantMaxApostadores = quantMaxApostadores;
	}

	public void setQuantMaxApostas(int quantMaxApostas) 
	{
		this.quantMaxApostas = quantMaxApostas;
	}

	public void setValorMinApostas(float valorMinApostas) 
	{
		this.valorMinApostas = valorMinApostas;
	}

	public void setValorMaxApostas(float valorMaxApostas) 
	{
		this.valorMaxApostas = valorMaxApostas;
	}
	
	public void setObjetosAposta(ArrayList<ObjetoAposta> objetos) 
	{
		this.objetos = objetos;
	}
	
	public void setTabelaPremiacao(Premiacao premiacao)
	{
		this.premiacao = premiacao;
	}
	
	public void setApostadores(ArrayList<Apostador> apostadores)
	{
		this.apostadores = apostadores;
	}
	
	public void setObjetosGanhadores(ArrayList<ObjetoAposta> objetosGanhadores)
	{
		this.objetosGanhadores = objetosGanhadores;
	}
	
	public int getQuantMaxApostadores() 
	{
		return quantMaxApostadores;
	}

	public int getQuantMaxApostas() 
	{
		return quantMaxApostas;
	}

	public float getValorMinApostas() 
	{
		return valorMinApostas;
	}

	public float getValorMaxApostas() 
	{
		return valorMaxApostas;
	}
	
	public GerenciadorResultadoDados getGerenciadorResultado() 
	{
		return gerenciadorResultado;
	}
	
	public ArrayList<ObjetoAposta> getObjetosAposta() 
	{
		return objetos;
	}
	
	public ArrayList<Apostador> getApostadores() 
	{
		return apostadores;
	}
	
}
