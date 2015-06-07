package dados;
import modelo.Aposta;

import java.util.ArrayList;

import modelo.Apostador;
import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;

public class EntradaSaidaDados implements IO
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
		
		ArrayList<ObjetoAposta> objetos = new ArrayList<ObjetoAposta>();
		ObjetoAposta objeto = new ObjetoAposta("1");
		Aposta aposta = new Aposta();
		objetos.add(objeto);
		
		apostadoresDAO.addApostador("Mayk");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("2");
		aposta = new Aposta();
		objetos.add(objeto);
		
		apostadoresDAO.addApostador("Stefano");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("3");
		aposta = new Aposta();
		objetos.add(objeto);
		
		apostadoresDAO.addApostador("Lilian");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("4");
		aposta = new Aposta();
		objetos.add(objeto);
		
		apostadoresDAO.addApostador("Hiago");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("5");
		aposta = new Aposta();
		objetos.add(objeto);
		
		apostadoresDAO.addApostador("Momo");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("6");
		aposta = new Aposta();
		objetos.add(objeto);
		
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
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
		ObjetoAposta objeto = new ObjetoAposta("3");
		objetosGanhadores.add(objeto);
		
		return objetosGanhadores;
	}
	
}
