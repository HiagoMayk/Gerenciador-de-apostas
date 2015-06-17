package controle;
import java.util.ArrayList;

import controle.*;
import dados.*;
import modelo.*;

public interface IRegraJogo 
{
	public boolean verificaQuantidadeAposta(IDAOAposta apostas);
	public boolean verificaFaixaValores(Aposta aposta);
	public boolean verificaDominioAposta(Aposta aposta);
	public boolean aplicarRegraJogo(Aposta aposta, IDAOAposta apostas, IDAOApostador apostadores);
	public boolean verificarManeiraAposta(Aposta aposta, IDAOApostador apostadores);
	public void calcularTabelaPremiacao(IDAOApostador apostadores);
        public ArrayList<Premio> premioPorApostador(Resultado resultado);
}
