package controle;

import java.util.ArrayList;

import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;
import dados.EntradaSaidaCavalos;
import dados.EntradaSaidaDados;
import dados.IO;

public class RegraJogoCavalos extends RegraJogo 
{	
	public RegraJogoCavalos()
	{			
		//Esse código vai deposi para o Regrajogo Abstrato
		IO io = new EntradaSaidaCavalos();
		super.setQuantMaxApostadores(io.quantMaxApostadores());
		super.setQuantMaxApostas(io.quantMaxApostas());
		super.setValorMaxApostas(io.valorMaxApostas());
		super.setValorMinApostas(io.valorMinApostas());
		super.setObjetosAposta(io.getObjetosAposta());
		//super.setTabelaPremiacao(io.getTebelaPremiacao());
		super.setApostadores(io.getApostadores());
		super.setObjetosGanhadores(io.getObjetosGanhadores());
	}
	
	/*
	 * Verifica a maneira de apostar de cada apostador e se 
	 * aquantidade de cavalos bate com a quantidade exigida 
	 * por uma determinada maneira de aposta.
	 * 
	 */
	public boolean verificarManeiraAposta() 
	{
		for(int i = 0; i < getApostadores().size(); i++)
		{
			for(int j = 0; j < getApostadores().get(i).getDAOAposta().getApostas().size(); j++)
			{
				if((getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Vencedor") || 
					getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Placer")) &&
				    getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().size() != 1)
				{
					System.out.println("Problema na maneira de aposta Vencedor/Placer");
					return false;
				}
				else if((getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dupla") ||
						 getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Exata")) &&
						 getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().size() != 2)
				{
					System.out.println("Problema na maneira de aposta Dupla/Exata");
					return false;
				}
				else if(getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Trifeta") &&
						getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().size() != 3)
				{
					System.out.println("Problema na maneira de aposta Trifeta");
					return false;
				}
				else if(getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Quadrifeta") &&
						getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().size() != 4)
				{
					System.out.println("Problema na maneira de aposta Quadrifeta");
					return false;
				}		
			}
		}
		return true;
	}
	
	public void calcularTabelaPremiacao() 
	{
		float vencedor = 0;
		float placer = 0;
		float dupla = 0;
		float exata = 0;
		float trifeta = 0;
		float quadrifeta = 0;
		
		//Esta bugado em algum lugar por aqui (07/06/2015)
		for(int i = 0; i < getApostadores().size(); i++)
		{
			for(int j = 0; j < getApostadores().get(i).getDAOAposta().getApostas().size(); j++)
			{
				if(getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Vencedor"))
				{
					vencedor += getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					System.out.println("vencedor = " + vencedor);
				}
				else if((getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Placer")))
				{
					placer += getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					System.out.println("placer = " + placer);
				}
				else if((getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dupla")))
				{
					dupla += getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					System.out.println("dupla = " + dupla);
				}
				else if((getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Exata")))
				{
					exata += getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					System.out.println("exata = " + exata);
				}
				else if(getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Trifeta"))
				{
					trifeta += getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					System.out.println("trifeta = " + trifeta);
				}
				else if(getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Quadrifeta"))
				{
					quadrifeta += getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					System.out.println("quadrifeta = " + quadrifeta);
				}		
			}
		}
		
		Premiacao premiacao = new Premiacao();
		ArrayList<Premio> premios = new ArrayList<Premio>();
		Premio premio = new Premio(vencedor);
		premios.add(premio);
		premio = new Premio(placer);
		premios.add(premio);
		premio = new Premio(dupla);
		premios.add(premio);
		premio = new Premio(exata);
		premios.add(premio);
		premio = new Premio(trifeta);
		premios.add(premio);
		premio = new Premio(quadrifeta);
		premios.add(premio);
		premiacao.setPremios(premios);
		setTabelaPremiacao(premiacao);
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
	
	public ArrayList<ObjetoAposta> getObjetosAposta()
	{
		return super.getObjetosAposta();
	}
}