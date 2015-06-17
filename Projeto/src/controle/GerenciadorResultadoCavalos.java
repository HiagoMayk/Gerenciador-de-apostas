package controle;

import modelo.Resultado;

public class GerenciadorResultadoCavalos implements IGerenciadorResultado
{
	private Resultado resultado;
	private RegraJogo regraJogo;
	
	public GerenciadorResultadoCavalos() 
	{
		resultado = new Resultado();
		regraJogo = new RegraJogoCavalos();
	}

	public Resultado getResultado()
	{
		return resultado;
	}

	//varia de acordo com as regras de jogo
	public void obterResultado()
	{
		boolean verifica = regraJogo.aplicarRegraJogo();
		
		if(verifica == true)
		{
			for(int i = 0; i < regraJogo.getApostadores().size() ; i++) //apostadores
			{
				for(int j = 0; j < regraJogo.getApostadores().get(i).getDAOAposta().getApostas().size(); j++) //Apostas
				{	
					for(int z = 0; z < regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().size(); z++) //Objetos
					{
						if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Vencedor"))
						{
							if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(z).getNome().equals(regraJogo.getObjetosGanhadores().get(0).getNome()))
							{
								resultado.setColocado(regraJogo.getApostadores().get(i));
								resultado.setObjetoGanhador(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(z));
							}
						}
						else if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Placer"))
						{
							if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(z).getNome().equals(regraJogo.getObjetosGanhadores().get(0).getNome()) ||
							   regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(z).getNome().equals(regraJogo.getObjetosGanhadores().get(1).getNome()))
							{
								resultado.setColocado(regraJogo.getApostadores().get(i));
								resultado.setObjetoGanhador(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(z));
							}	
						}
						else if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dupla"))
						{
								
						}
						else if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Exata"))
						{
								
						}
						else if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Tripla"))
						{
								
						}
						else if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Quadrupla"))
						{
								
						}
							
							/*
							if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(regraJogo.getObjetosGanhadores().get(k).getNome()))
							{
								resultado.setColocado(regraJogo.getApostadores().get(i));
								resultado.setObjetoGanhador(regraJogo.getObjetosGanhadores().get(k));
							}	
							 */
						}
				}
			}
		}
		}
}
