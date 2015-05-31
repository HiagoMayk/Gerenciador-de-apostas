import java.util.ArrayList;


public interface IDAOApostador {
	public void addApostador(Apostador apostador);
	public void removerApostador(int id);
	public Apostador procurarApostador(int idApostador);
	public ArrayList<Apostador> getApostadores();
}
