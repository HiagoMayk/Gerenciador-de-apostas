package modelo;
import java.util.ArrayList;

public class Resultado 
{
	private ArrayList<Apostador> classificacao;
	private ArrayList<ObjetoAposta> objetosGanhadores;

	public Resultado() 
	{
		classificacao = new ArrayList<Apostador>();
		objetosGanhadores = new ArrayList<ObjetoAposta>();
	}

	public void setColocado(Apostador apostador)
	{
		classificacao.add(apostador);
	}
	
	public void setObjetoGanhador(ObjetoAposta objeto)
	{
		objetosGanhadores.add(objeto);
	}
	
		
	public ArrayList<Apostador> getClassificacao() 
	{
		return classificacao;
	}

	public void setClassificacao(ArrayList<Apostador> classificacao) 
	{
		this.classificacao = classificacao;
	}
	
	public void setObjetosGanhadores(ArrayList<ObjetoAposta> objetosGanhadores) {
		this.objetosGanhadores = objetosGanhadores;
	}
	
	public ArrayList<ObjetoAposta> getObjetosGanhadores() {
		return objetosGanhadores;
	}
}
