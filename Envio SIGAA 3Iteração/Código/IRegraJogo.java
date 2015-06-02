import java.util.ArrayList;


public interface IRegraJogo 
{
	public boolean aplicarRegraJogo();
	//Regras gerais de apostas
	public boolean verificarRegrasAposta();
	public boolean verificarManeiraAposta();
	public ArrayList<Premio> getTabelaPremiacao();
}
