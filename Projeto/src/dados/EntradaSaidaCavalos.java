package dados;

import java.util.ArrayList;

import modelo.Aposta;
import modelo.Apostador;
import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;

public class EntradaSaidaCavalos implements IO
{
	@Override
	public ArrayList<ObjetoAposta> getObjetosAposta() 
	{
		ArrayList<ObjetoAposta> objetos = new ArrayList<ObjetoAposta>();
		//Adiciona os objetos da aposta
				ObjetoAposta objeto = new ObjetoAposta("C1");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("C2");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("C3");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("C4");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("C5");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("C6");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("C7");
				objetos.add(objeto);
				
		return objetos;
	}
	
	@Override
	public ArrayList<Apostador> getApostadores()
	{
		// TODO Auto-generated method stub
		IDAOApostador apostadoresDAO = new DAOApostador();
		
		/*Maneira: Vencedor*/
		ArrayList<ObjetoAposta> objetos = new ArrayList<ObjetoAposta>();
		ObjetoAposta objeto = new ObjetoAposta("C1");
		objetos.add(objeto);
		//objeto = new ObjetoAposta("C3");   //Força erro ao adicionar mais de 1 
		//objetos.add(objeto);				 //objeto de aposta na maneira vendcedor
		Aposta aposta = new Aposta();
		aposta.setManeira("Vencedor");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.addApostador("Mayk");
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C2");
		aposta = new Aposta();
		aposta.setManeira("Vencedor");
		objetos.add(objeto);
		apostadoresDAO.addApostador("Stefano");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C3");
		aposta = new Aposta();
		aposta.setManeira("Vencedor");
		objetos.add(objeto);
		apostadoresDAO.addApostador("Lilian");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C4");
		aposta = new Aposta();
		aposta.setManeira("Vencedor");
		objetos.add(objeto);
		apostadoresDAO.addApostador("Hiago");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		aposta = new Aposta();
		aposta.setManeira("Vencedor");
		objetos.add(objeto);
		apostadoresDAO.addApostador("Momo");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C6");
		aposta = new Aposta();
		aposta.setManeira("Vencedor");
		objetos.add(objeto);
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C7");
		aposta = new Aposta();
		aposta.setManeira("Vencedor");
		objetos.add(objeto);
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		/*Maneira: Placer*/
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		aposta.setManeira("Placer");
		apostadoresDAO.addApostador("Mayk");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Placer");
		apostadoresDAO.addApostador("Stefano");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Placer");
		apostadoresDAO.addApostador("Lilian");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Placer");
		apostadoresDAO.addApostador("Hiago");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C1");
		objetos.add(objeto);
		aposta.setManeira("Placer");
		apostadoresDAO.addApostador("Momo");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Placer");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Placer");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		/*Maneira: Dupla*/
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Dupla");
		apostadoresDAO.addApostador("Mayk");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Dupla");
		apostadoresDAO.addApostador("Stefano");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Dupla");
		apostadoresDAO.addApostador("Lilian");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Dupla");
		apostadoresDAO.addApostador("Hiago");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C1");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Dupla");
		apostadoresDAO.addApostador("Momo");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Dupla");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Dupla");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		/*Maneira: Exata*/
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Exata");
		apostadoresDAO.addApostador("Mayk");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Exata");
		apostadoresDAO.addApostador("Stefano");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Exata");
		apostadoresDAO.addApostador("Lilian");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Exata");
		apostadoresDAO.addApostador("Hiago");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C1");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Exata");
		apostadoresDAO.addApostador("Momo");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Exata");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);	
		aposta = new Aposta();
		aposta.setManeira("Exata");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		/*Maneira: Trifeta*/
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Trifeta");
		apostadoresDAO.addApostador("Mayk");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Trifeta");
		apostadoresDAO.addApostador("Stefano");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Trifeta");
		apostadoresDAO.addApostador("Lilian");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Trifeta");
		apostadoresDAO.addApostador("Hiago");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C1");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Trifeta");
		apostadoresDAO.addApostador("Momo");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Trifeta");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Trifeta");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		/*Maneira: Quadrifeta*/
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Quadrifeta");
		apostadoresDAO.addApostador("Mayk");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(0).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Quadrifeta");
		apostadoresDAO.addApostador("Stefano");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(1).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C6");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Quadrifeta");
		apostadoresDAO.addApostador("Lilian");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(2).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Quadrifeta");
		apostadoresDAO.addApostador("Hiago");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(3).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C1");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Quadrifeta");
		apostadoresDAO.addApostador("Momo");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(4).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);	
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Quadrifeta");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		objetos = new ArrayList<ObjetoAposta>();
		objeto = new ObjetoAposta("C5");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C3");
		objetos.add(objeto);
		objeto = new ObjetoAposta("C4");
		objetos.add(objeto);
		aposta = new Aposta();
		aposta.setManeira("Quadrifeta");
		apostadoresDAO.addApostador("Loss");
		aposta.setAposta(objetos, 10);
		apostadoresDAO.procurarApostador(5).getDAOAposta().addAposta(aposta);
		
		return apostadoresDAO.getApostadores();
	}

	@Override
	public int quantMaxApostadores() 
	{
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public int quantMaxApostas() 
	{
		// TODO Auto-generated method stub
		return 100;
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
	//Retorna um ArrayList dos objetos ganhadores em sua ordem
	public ArrayList<ObjetoAposta> getObjetosGanhadores()
	{
		//Retorna os cavalos na ordem de chegada
		ArrayList<ObjetoAposta> objetosGanhadores = new ArrayList<ObjetoAposta>();
		ObjetoAposta objeto = new ObjetoAposta("C3");
		objetosGanhadores.add(objeto);
		objeto = new ObjetoAposta("C7");
		objetosGanhadores.add(objeto);
		objeto = new ObjetoAposta("C5");
		objetosGanhadores.add(objeto);
		objeto = new ObjetoAposta("C1");
		objetosGanhadores.add(objeto);
		objeto = new ObjetoAposta("C4");
		objetosGanhadores.add(objeto);
		objeto = new ObjetoAposta("C6");
		objetosGanhadores.add(objeto);
		objeto = new ObjetoAposta("C2");
		objetosGanhadores.add(objeto);
		
		return objetosGanhadores;
	}
	
}
