//import Resultado;
//import GerenciadorApostador;

import java.util.ArrayList;

public class RegraJogo {
	static final int quantMaxApostadores = 6;
	static final int quantMaxApostas = 1;
	static final float valorMinApostas = 1;
	static final float valorMaxApostas = 50;
	private Resultado resultado;
	private ArrayList<String> objetos;

	public void RegrasJogo() {	
		objetos = new ArrayList<String>();
		
		//Adiciona os objetos da aposta
		objetos.add("1");
		objetos.add("2");
		objetos.add("3");
		objetos.add("4");
		objetos.add("5");
		objetos.add("6");
							
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
		
		if (quantMaxApostas < quant){
			return false;
		}	
		
		if (aposta.getValor() < valorMinApostas || valorMaxApostas < aposta.getValor() ){
		
			return false;			
		}
				
		for (String temp : objetos){	
			
			if (temp == aposta.getObjeto().getNome()){
			return true;
			}
		}
		
		return false;	
	}
	
	//Não pode apostar no mesmo objeto que outra pessoa já tenha apostado
	public boolean verificarManeiraAposta(Aposta aposta, GerenciadorApostador gerenciadorApostadores) {
		for(int i = 0; i < gerenciadorApostadores.getApostadores().size(); i++)
		{
			if(aposta.getObjeto().equals(gerenciadorApostadores.getApostadores().get(i).getApostas().get(0))){
				return true;
			}
		}
		return false;
	}

	public boolean validaAposta(Aposta aposta, int quant, GerenciadorApostador gerenciadorApostadores) 
	{
		if(verificarRegrasAposta(aposta, quant) && verificarManeiraAposta(aposta, gerenciadorApostadores))
		{
			return true;
		}
		return false;	
	}

	//Retorna um array list com a ordem da premiação (valores) - no caso só 1 valor pois só um ganha
	public ArrayList<Premiacao> verificarRegrasPremiacao() {
		Premiacao premio = new Premiacao();
		ArrayList premios =  new ArrayList<Premiacao>();
		float valor = 0;
		
		for(int i = 0; i<gerenciadorApostadores.getApostadores().size(); i++)
		{
			valor += gerenciadorApostadores.getApostadores().get(i).getApostas().get(0).getValor();
		}
		
		premio.setPremio(valor);
		premios.add(premio);
		return premios;
	}

}
