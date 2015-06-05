package dados;
import modelo.Aposta;

import java.util.ArrayList;

import modelo.Apostador;
import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;

public class EntradaSaida implements IO
{
	@Override
	public ArrayList<ObjetoAposta> getObjetosAposta() 
	{
		ArrayList<ObjetoAposta> objetos = new ArrayList<ObjetoAposta>();
		//Adiciona os objetos da aposta
				ObjetoAposta objeto = new ObjetoAposta("1");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("2");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("3");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("4");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("5");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("6");
				objetos.add(objeto);
				
		return objetos;
	}

	@Override
	public ArrayList<Apostador> getApostadores()
	{
		// TODO Auto-generated method stub
		IDAOApostador apostadoresDAO = new DAOApostador();
		
		apostadoresDAO.addApostador("Mayk");
		Aposta aposta = new Aposta("1", 10);
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		apostadoresDAO.addApostador("Stefano");
		aposta = new Aposta("2", 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		apostadoresDAO.addApostador("Lilian");
		aposta = new Aposta("3", 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		apostadoresDAO.addApostador("Hiago");
		aposta =new Aposta("4", 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		apostadoresDAO.addApostador("Momo");
		aposta =new Aposta("5", 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		apostadoresDAO.addApostador("Loss");
		aposta =new Aposta("6", 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		return apostadoresDAO.getApostadores();
	}

	@Override
	public int quantMaxApostadores() 
	{
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int quantMaxApostas() 
	{
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public float valorMinApostas() 
	{
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public float valorMaxApostas() 
	{
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Premiacao getTebelaPremiacao() 
	{
		// TODO Auto-generated method stub
		Premiacao premiacao = new Premiacao();
		ArrayList<Premio> premios = new ArrayList<Premio>();
		Premio premio = new Premio(60);
		
		premios.add(premio);
		premiacao.setPremios(premios);
		return premiacao;
	}
	
	@Override
	//Retorna um ArrayList dos objetos ganhadores em sua ordem
	public ArrayList<ObjetoAposta> getObjetosGanhadores()
	{
		ArrayList<ObjetoAposta> objetosGanhadores = new ArrayList<ObjetoAposta>();
		ObjetoAposta objeto = new ObjetoAposta("4");
		objetosGanhadores.add(objeto);
		
		return objetosGanhadores;
	}
	
}
