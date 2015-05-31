import java.util.ArrayList;


public class GerenciadorApostador 
{

	public IDAOApostador apostadoresDAO;
	public int id;
	
	public GerenciadorApostador()
	{
		apostadoresDAO = new DAOApostador();	
	}
	
	public void incrementaID(){
		id ++;
	}
	
	
	//Pode-se inserir um apostador sem ele ter uma aposta associada, porém toda aposta deve ter um apostador associado
	public void novoApostador(String nome) 
	{
		Apostador apostador = new Apostador(nome, id);
		incrementaID();
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
	public Apostador getApostador(int idApostador) 
	{
		return apostadoresDAO.procurarApostador(idApostador);
	
	}
}
