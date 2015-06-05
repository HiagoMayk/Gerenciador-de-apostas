package dados;
import java.util.ArrayList;

import modelo.Apostador;

public interface IDAOApostador 
{
	public void addApostador(String nome);
	public void removerApostador(int id);
	public Apostador procurarApostador(int idApostador);
	public ArrayList<Apostador> getApostadores();
}
