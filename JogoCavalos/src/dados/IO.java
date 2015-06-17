package dados;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Apostador;
import modelo.ObjetoAposta;
import modelo.Premiacao;

public interface IO 
{
	public abstract ArrayList<ObjetoAposta> getObjetosAposta();
	public abstract int quantMaxApostadores();
	public abstract int quantMaxApostas();
	public abstract float valorMinApostas();
	public abstract float valorMaxApostas();
	public abstract ArrayList<ObjetoAposta> getObjetosGanhadores();
}