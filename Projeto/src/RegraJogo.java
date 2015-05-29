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
	
	
	public void RegrasJogo()
	{	
		objetos = new ArrayList<ObjetoAposta>();
		premiacao = new Premiacao();
		gerenciadorResultado = new GerenciadorResultado();
		apostadores = new ArrayList<Apostador>();
		
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
	
	public void aplicarRegraJogo() 
	{

	}
	
	//Implementação da instancia
	public boolean verificarRegrasAposta(Aposta aposta, int quant) 
	{
		return true;
	}
	
	//Implementação da instancia 
	public boolean verificarManeiraAposta(Aposta aposta, GerenciadorApostador gerenciadorApostadores) 
	{
		return true;
	}
	
	//Implementação da instancia 
	public boolean validaAposta(Aposta aposta, int quant, GerenciadorApostador gerenciadorApostador) 
	{
		return true;
	}

	//Implementação da instancia 
	public ArrayList<Premio> aplicarRegrasPremiacao(GerenciadorApostador gerenciadorApostadores) 
	{
		return premiacao.getPremios();
	}

}
