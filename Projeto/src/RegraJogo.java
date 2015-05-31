//import Resultado;
//import GerenciadorApostador;

import java.util.ArrayList;

public abstract class RegraJogo implements IRegraJogo
{
	private int quantMaxApostadores;
	private int quantMaxApostas;
	private float valorMaxApostas;
	private float valorMinApostas;
	private ArrayList<ObjetoAposta> objetos;
	private Premiacao premiacao;				//Uma tabela de valores a ser ganho por colocaçães
	private GerenciadorResultado gerenciadorResultado;
	private ArrayList<Apostador> apostadores;
	private ArrayList<ObjetoAposta> objetosGanhadores;
	
	public void RegrasJogo()
	{	
		objetos = new ArrayList<ObjetoAposta>();
		premiacao = new Premiacao();
		gerenciadorResultado = new GerenciadorResultado();
		apostadores = new ArrayList<Apostador>();
		objetosGanhadores = new ArrayList<ObjetoAposta>();
		
		/*
		 * Não consegui inicializar aqui, pois o super deve esta na promeira linha do contrutor da classe
		 * que extends de RegraJogo
		 * 
		this.quantMaxApostadores = quantMaxApostadores;
		this.quantMaxApostas = quantMaxApostas;
		this.valorMaxApostas = valorMaxApostas;
		this.valorMinApostas = valorMinApostas;
		this.objetos = objetos;
		this.premiacao = premiacao;
		*/
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
	
	public GerenciadorResultado getGerenciadorResultado() 
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
	
	public boolean aplicarRegraJogo() 
	{
		return true;
	}
	
	//Implementação da instancia
	public boolean verificarRegrasAposta() 
	{
		return true;
	}
	
	//Implementação da instancia 
	public boolean verificarManeiraAposta() 
	{
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

}
