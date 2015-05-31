import java.util.ArrayList;

public class Apostador
{
	private String nome;
	private int idApostador;
	private GerenciadorAposta gerenciadorAposta;

	public Apostador(String nome, int idApostador) 
	{
		this.nome = nome;
		this.idApostador = idApostador;
		gerenciadorAposta = new GerenciadorAposta();
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
	
	public GerenciadorAposta getGerenciadorAposta()
	{
		return gerenciadorAposta;
	}
}
