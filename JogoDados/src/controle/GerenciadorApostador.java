package controle;
import dados.*;
import modelo.*;

import java.util.ArrayList;

public class GerenciadorApostador implements IGerenciadorApostador
{
	private IDAOApostador apostadoresDAO;
	
	public GerenciadorApostador()
	{
		apostadoresDAO = new DAOApostador() ;
               
	}	
	
	//Pode-se inserir um apostador sem ele ter uma aposta associada, porém toda aposta deve ter um apostador associado
	public void novoApostador(String nome) 
	{
		Apostador apostador = new Apostador(nome);		
		apostadoresDAO.addApostador(apostador);
	}
		
	//Remove apostador pelo seu id
	public void removerApostador(int idApostador)
	{
		apostadoresDAO.removerApostador(idApostador);
	}

	public ArrayList<Apostador> getApostadores() {
		return apostadoresDAO.getApostadores();
	}
		
	//Retorna um apostador pelo seu id
	public Apostador getApostador(int index) 
	{
		return apostadoresDAO.getApostadores().get(index);
	
	}
        
        public IDAOApostador getDAOApostadores() {
		return apostadoresDAO;
	}
       	
}