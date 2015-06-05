package modelo;

import dados.DAOAposta;
import dados.IDAOAposta;

public class Apostador
{
	private String nome;
	private int idApostador;
	private IDAOAposta apostasDAO;

	public Apostador(String nome, int idApostador) 
	{
		this.nome = nome;
		this.idApostador = idApostador;
		apostasDAO = new DAOAposta();
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
	
	public DAOAposta getDAOAposta()
	{
		return (DAOAposta) apostasDAO;
	}
	
}
