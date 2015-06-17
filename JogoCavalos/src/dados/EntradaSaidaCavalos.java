package dados;
import modelo.Aposta;

import java.util.ArrayList;

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
				ObjetoAposta objeto = new ObjetoAposta("Cavalo 1");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("Cavalo 2");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("Cavalo 3");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("Cavalo 4");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("Cavalo 5");
				objetos.add(objeto);
				
				objeto = new ObjetoAposta("Cavalo 6");
				objetos.add(objeto);
                                
                                objeto = new ObjetoAposta("Cavalo 7");
				objetos.add(objeto);
				
		return objetos;
	}
        
	@Override
	public int quantMaxApostadores() 
	{
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int quantMaxApostas() 
	{
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public float valorMinApostas() 
	{
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public float valorMaxApostas() 
	{
		// TODO Auto-generated method stub
		return 50;
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
