import java.util.ArrayList;


public class Classificacao 
{
	private ArrayList<Colocacao> classificacao;

	public Classificacao() {
		classificacao = new ArrayList<Colocacao>();
	}

	public void inserirColocado(Colocacao colocado)
	{
		classificacao.add(colocado);
	}
	
	public void removerColocado(int idApostador)
	{
		for(int i=0; i<classificacao.size(); i++)
		{
			if(idApostador == classificacao.get(i).getApostador().getIdApostador())
			{
				classificacao.remove(classificacao.get(i).getApostador());
			}
		}
	}
	
	public ArrayList<Colocacao> getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ArrayList<Colocacao> classificacao) {
		this.classificacao = classificacao;
	}
	
}
