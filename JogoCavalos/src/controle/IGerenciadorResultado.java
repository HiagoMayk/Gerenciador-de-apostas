package controle;

import dados.IDAOApostador;
import java.util.ArrayList;
import modelo.ObjetoAposta;
import modelo.Resultado;

public interface IGerenciadorResultado 
{
	public Resultado getResultado();
	public void obterResultado( ArrayList<ObjetoAposta> objetosGanhadores, IDAOApostador apostadores);
}
