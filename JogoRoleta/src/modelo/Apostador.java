package modelo;

import dados.DAOAposta;
import dados.IDAOAposta;

public class Apostador
{
	private String nome;
        private IDAOAposta apostasDAO;

	public Apostador(String nome) 
	{
            apostasDAO = new DAOAposta();
            this.nome = nome;       
        }
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public IDAOAposta getDAOAposta(){
        
            return apostasDAO;
        }
        
}
