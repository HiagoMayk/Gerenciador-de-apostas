//import Resultado;
//import GerenciadorApostador;

import java.util.ArrayList;

public class RegraJogo {

<<<<<<< HEAD
	private int quantMaxApostadores;
	private int quantMaxApostas;
	private int valorMinApostas;
	private int valorMaxApostas;
	private GerenciadorApostador gerenciadorApostadores;
	private GerenciadorApostador gerenciadorApostador;
=======
	
	static final int quantMaxApostadores = 40;

	static final int quantMaxApostas = 2;

	static final float valorMinApostas = 1;

	static final float valorMaxApostas = 50;

	private GerenciadorApostador gerenciadorApostadores;

>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
	private Resultado resultado;
	
	private ArrayList<String> objetos;

	public void RegrasJogo() {	
		objetos = new ArrayList<String>();
		
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

	public boolean verificarRegrasAposta() {
		return false;
	}

	public boolean validaAposta(Aposta aposta, int quant) {
		
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

	public void verificarRegrasPremiacao() {

	}

	public void verificarManeiraAposta() {

	}

}
