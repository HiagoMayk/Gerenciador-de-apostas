
public class Resultado 
{
	private Classificacao classificacao;
	private Premiacao premiacao;

	public Resultado() 
	{
		classificacao = new Classificacao();
		premiacao = new Premiacao();
	}

	public Classificacao getClassificacao() 
	{
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao)
	{
		this.classificacao = classificacao;
	}

	public Premiacao getPremiacao()
	{
		return premiacao;
	}

	public void setPremiacao(Premiacao premiacao) 
	{
		this.premiacao = premiacao;
	}
}