
import java.util.ArrayList;

public class Apostador
{
	private String nome;

	private int idApostador;

	private GerenciadorAposta gerenciadorAposta;
	
	public Apostador(String nome, int idApostador, GerenciadorAposta gerenciadorApostas) 
	{
		this.nome = nome;
		this.idApostador = idApostador;
		this.gerenciadorAposta = gerenciadorApostas;
	}

	public void novaAposta(ObjetoAposta objeto, float valor, int id) 
	{
		Aposta novaAposta = new Aposta(objeto, valor, id);
		gerenciadorAposta.inserirAposta(novaAposta);
	}

	public ArrayList<Aposta> apostasApostador() 
	{
		return gerenciadorAposta.getApostas();
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getIdApostador() 
	{
		return idApostador;
	}

	public void setIdApostador(int idApostador)
	{
		this.idApostador = idApostador;
	}

	public GerenciadorAposta getGerenciadorApostas() 
	{
		return gerenciadorAposta;
	}

	public void setGerenciadorApostas(GerenciadorAposta gerenciadorAposta) 
	{
		this.gerenciadorAposta = gerenciadorAposta;
	}
}
