import java.util.ArrayList;


public interface IDAOAposta {
	public void addAposta(Aposta aposta);
	public void removerAposta(int index);
	public Aposta procurarAposta(int index);
	public ArrayList<Aposta> getApostas();
}
