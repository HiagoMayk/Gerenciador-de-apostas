package controle;
import java.util.ArrayList;

import modelo.Premio;

public interface IRegraJogo 
{
	public boolean verificaQuantidadeAposta();
	public boolean verificaFaixaValores();
	public boolean verificaDominioAposta();
	public boolean aplicarRegraJogo();
	public boolean verificarManeiraAposta();
	public ArrayList<Premio> getTabelaPremiacao();
}
