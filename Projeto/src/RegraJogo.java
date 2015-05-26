//import Resultado;
//import GerenciadorApostador;

import java.util.ArrayList;

public abstract class RegraJogo 
{
	private int quantMaxApostadores;
	private int quantMaxApostas;
	private float valorMinApostas;
	private float valorMaxApostas;
	private Resultado resultado;
	private ArrayList<ObjetoAposta> objetos;
	private Premiacao premiacao;
	
	public void RegrasJogo() 
	{	
		objetos = new ArrayList<ObjetoAposta>();
		premiacao = new Premiacao();
		resultado = new Resultado();
	}
	
	public int getQuantMaxApostadores() {
		return quantMaxApostadores;
	}

	public int getQuantMaxApostas() {
		return quantMaxApostas;
	}

	public float getValorMinApostas() {
		return valorMinApostas;
	}

	public float getValorMaxApostas() {
		return valorMaxApostas;
	}

	public void aplicarRegraJogo() {

	}
	
	//Regras gerais de apostas
	public boolean verificarRegrasAposta(Aposta aposta, int quant) {
		return true;
	}
	
	public boolean verificarManeiraAposta(Aposta aposta, GerenciadorApostador gerenciadorApostadores) {
		return true;
	}

	public boolean validaAposta(Aposta aposta, int quant, GerenciadorApostador gerenciadorApostador) 
	{
		return true;
	}

	public ArrayList<Premio> verificarRegrasPremiacao(GerenciadorApostador gerenciadorApostadores) {
		return premiacao.getPremios();
	}

}
