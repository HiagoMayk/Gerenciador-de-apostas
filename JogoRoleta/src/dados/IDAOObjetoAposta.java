package dados;
import modelo.ObjetoAposta;

public interface IDAOObjetoAposta 
{
	public void addObjetoAposta();
	public void removerObjetoAposta();
	public void procurarObjetoAposta(ObjetoAposta objAposta);
	public void getObjetoApostas();
}

