import java.util.ArrayList;


public interface IRegraJogo 
{
	public boolean aplicarRegraJogo();
	//Regras gerais de apostas
	public boolean verificarRegrasAposta(Aposta aposta, int quant);
	public boolean verificarManeiraAposta(Aposta aposta, GerenciadorApostador gerenciadorApostadores);
	public boolean validaAposta(Aposta aposta, int quant, GerenciadorApostador gerenciadorApostador);
	public ArrayList<Premio> aplicarRegrasPremiacao(GerenciadorApostador gerenciadorApostadores);
}
