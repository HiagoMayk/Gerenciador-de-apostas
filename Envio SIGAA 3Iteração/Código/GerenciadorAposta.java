import java.util.ArrayList;

public class GerenciadorAposta
{	
	public IDAOAposta apostasDAO;
	
	public GerenciadorAposta()
	{
		apostasDAO = new DAOAposta();
	}
	
	public void inserirAposta(String objeto, float valor) 
	{	
		Aposta novaAposta = new Aposta(objeto, valor);
		
		/*
		RegraJogo regra = new RegraJogo();
		
		Aposta novaAposta = new Aposta(objeto, valor);
		
		if (regra.validaAposta(novaAposta, apostas.size(), gerenciadorApostador)){	
			apostas.add(novaAposta);
		}
		else System.out.println("APOSTA INVALIDA");
		*/
		
		apostasDAO.addAposta(novaAposta);	
	}
	
	public ArrayList<Aposta> getApostas() 
	{
		return apostasDAO.getApostas();
	}

	public void removerAposta(int index) 
	{
		apostasDAO.removerAposta(index);
	}
	
}
