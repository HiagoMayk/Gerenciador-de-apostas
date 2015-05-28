import java.util.ArrayList;

public class GerenciadorAposta
{
	private ArrayList<Aposta> apostas;
	
	public GerenciadorAposta()
	{
		apostas = new ArrayList<Aposta>();
	}
	
	public ArrayList<Aposta> getApostas() 
	{
		return apostas;
	}
	
	public void setApostas(ArrayList<Aposta> apostas) 
	{
		this.apostas = apostas;
	}
	
	public void inserirAposta(String objeto, float valor) 
	{	
		Aposta novaAposta = new Aposta(objeto, valor);
		apostas.add(novaAposta);
		/*
		RegraJogo regra = new RegraJogo();
		
		Aposta novaAposta = new Aposta(objeto, valor);
		
		if (regra.validaAposta(novaAposta, apostas.size(), gerenciadorApostador)){	
			apostas.add(novaAposta);
		}
		else System.out.println("APOSTA INVALIDA");
		*/
	}

	public void removerAposta(int index) 
	{
		if(apostas.size() != 0 && !(apostas.size() < index || index < 0))
		{
			apostas.remove(apostas.get(index));
		}
	}
}
