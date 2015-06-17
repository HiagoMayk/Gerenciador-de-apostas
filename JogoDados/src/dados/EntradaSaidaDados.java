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
		return 100;
	}

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
