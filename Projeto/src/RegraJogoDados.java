import java.util.ArrayList;

public class RegraJogoDados extends RegraJogo 
{
	public RegraJogoDados()
	{	
		//Esse código vai deposi para o Regrajogo Abstrato
		IO io = new EntradaSaida();
		
		super.setQuantMaxApostadores(io.quantMaxApostadores());
		super.setQuantMaxApostas(io.quantMaxApostas());
		super.setValorMaxApostas(io.valorMaxApostas());
		super.setValorMinApostas(io.valorMinApostas());
		super.setObjetosAposta(io.getObjetosAposta());
		super.setTabelaPremiacao(io.getTebelaPremiacao());
		super.setApostadores(io.getApostadores());
	}
	
	public void aplicarRegraJogo() 
	{
		//implementar
	}
	
	//Regras gerais de apostas
	public boolean verificarRegrasAposta(Aposta aposta, int quant) {
		/*
		if (quantMaxApostas < quant){
			return false;
		}	
		
		if (aposta.getValor() < valorMinApostas || valorMaxApostas < aposta.getValor() ){
		
			return false;			
		}
		
		System.out.println("aquiiiiii");
		//O erro está aquiiii
		for(int i=0; i < objetos.size(); i++)
		{
			if(objetos.get(i).equals(aposta.getObjeto().getNome()))
			{
				
			}
		}
		
		return false;	
		*/
		return true;
	}
	
	//Não pode apostar no mesmo objeto que outra pessoa já tenha apostado
	public boolean verificarManeiraAposta(Aposta aposta, GerenciadorApostador gerenciadorApostadores) {
		/*
		for(int i = 0; i < gerenciadorApostadores.getApostadores().size(); i++)
		{
			if(aposta.getObjeto().equals(gerenciadorApostadores.getApostadores().get(i).getApostas().get(0))){
				return true;
			}
		}
		return false;
		*/
		return true;
	}

	public boolean validaAposta(Aposta aposta, int quant, GerenciadorApostador gerenciadorApostador) 
	{
		/*
		if(verificarRegrasAposta(aposta, quant) && verificarManeiraAposta(aposta, gerenciadorApostador))
		{
			return true;
		}
		return false;	
		*/
		return true;
	}

	//Retorna um array list com a ordem da premiação (valores) - no caso só 1 valor pois só um ganha
	public ArrayList<Premiacao> verificarRegrasPremiacao(GerenciadorApostador gerenciadorApostadores) {
		/*Premiacao premio = new Premiacao();
		ArrayList premios =  new ArrayList<Premiacao>();
		float valor = 0;
		
		for(int i = 0; i<gerenciadorApostadores.getApostadores().size(); i++)
		{
			valor += gerenciadorApostadores.getApostadores().get(i).getApostas().get(0).getValor();
		}
		
		premio.setPremio(valor);
		premios.add(premio);
		*/
		return null;
	}
		
	public int getQuantMaxApostadores() 
	{
		return super.getQuantMaxApostadores();
	}

	public int getQuantMaxApostas() 
	{
		return super.getQuantMaxApostas();
	}

	public float getValorMinApostas() 
	{
		return super.getValorMinApostas();
	}

	public float getValorMaxApostas() 
	{
		return super.getValorMaxApostas();
	}
	
	public GerenciadorResultado getGerenciadorResultado() 
	{
		return super.getGerenciadorResultado();
	}
	
	public ArrayList<ObjetoAposta> getObjetosAposta()
	{
		return super.getObjetosAposta();
	}
	
}
