package dados;
import java.util.ArrayList;

import modelo.Apostador;

public interface IDAOApostador 
{
	public void addApostador(Apostador apostador);
	public void removerApostador(int index);	
	public ArrayList<Apostador> getApostadores();
}
