

import java.util.ArrayList;

public class Apostador
{
	private String nome;
	private int idApostas = 0;

	private int idApostador;

	private GerenciadorAposta gerenciadorAposta;
	
	public Apostador(String nome, int idApostador) 
	{
		this.nome = nome;
		this.idApostador = idApostador;		
	}
	
	public void incrementarIdApostas(){
		
		idApostas ++;
	}

	public void novaAposta(ObjetoAposta objeto, float valor) 
	{
		Aposta novaAposta = new Aposta(objeto, valor, idApostas);
		incrementarIdApostas();
		//VERIFICAR E VALIADAR APOSTAS
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
