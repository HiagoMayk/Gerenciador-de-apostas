
public class GerenciadorResultado implements IGerenciadorResultado
{
	private Resultado resultado;
	private RegraJogo regraJogo;
	
	public GerenciadorResultado() 
	{
		resultado = new Resultado();
		regraJogo = new RegraJogoDados();
	}

	public Resultado getResultado() 
	{
		return resultado;
	}

	public void setResultado(Resultado resultado) 
	{
		this.resultado = resultado;
	}

	public void obterResultado()
	{
		boolean verifica = regraJogo.aplicarRegraJogo();	
		if(verifica == true)
		{
			for(int k = 0; k < regraJogo.getObjetosGanhadores().size(); k++) //Objetos Ganhadores
			{
				for(int i = 0; i < regraJogo.getApostadores().size() ; i++)
				{
					for(int j = 0; j < regraJogo.getApostadores().get(i).getGerenciadorAposta().getApostas().size(); j++)
					{
						if(regraJogo.getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getObjeto().getNome().equals(regraJogo.getObjetosGanhadores().get(k).getNome()))
						{
							resultado.setColocado(regraJogo.getApostadores().get(i));
							resultado.setObjetoGanhador(regraJogo.getObjetosGanhadores().get(k));
						}	
					}
				}
			}
		}
	}

}
