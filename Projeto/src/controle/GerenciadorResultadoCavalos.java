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
		/*
		if(verifica == true)
		{
			for(int k = 0; k < regraJogo.getObjetosGanhadores().size(); k++) //Objetos Ganhadores
			{
				for(int i = 0; i < regraJogo.getApostadores().size() ; i++)
				{
					for(int j = 0; j < regraJogo.getApostadores().get(i).getDAOAposta().getApostas().size(); j++)
					{
						if(regraJogo.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(regraJogo.getObjetosGanhadores().get(k).getNome()))
						{
							resultado.setColocado(regraJogo.getApostadores().get(i));
							resultado.setObjetoGanhador(regraJogo.getObjetosGanhadores().get(k));
						}	
					}
				}
			}
		}
		*/
	}
	
}
