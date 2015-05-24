import java.util.ArrayList;


public class UserInterface {

	private GerenciadorApostador gerenciadorApostador;

	private GerenciadorAposta gerenciadorAposta;

	private Resultado resultado;

	public void novoApostador(String nome) {
		
		gerenciadorApostador.novoApostador(nome);
	}

	public void novaAposta(int idApostador, float valor, ObjetoAposta objeto) {
		gerenciadorApostador.getApostadores().get(idApostador).novaAposta(objeto, valor);	
	}

	public void gerarClassificacao() {

	}

}