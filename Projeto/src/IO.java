import java.io.IOException;
import java.util.ArrayList;

public interface IO 
{
	public abstract void obterEntrada();
	public abstract void obtersaida();
	public abstract ArrayList<ObjetoAposta> getObjetosAposta();
	public abstract ArrayList<Apostador> getApostadores();
	public abstract int quantMaxApostadores();
	public abstract int quantMaxApostas();
	public abstract float valorMinApostas();
	public abstract float valorMaxApostas();
	public abstract Premiacao getTebelaPremiacao();
}