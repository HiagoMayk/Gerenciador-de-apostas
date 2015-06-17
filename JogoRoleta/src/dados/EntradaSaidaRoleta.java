package dados;
import modelo.Aposta;

import java.util.ArrayList;

import modelo.Apostador;
import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;

public class EntradaSaidaRoleta implements IO
{
	@Override
	public ArrayList<ObjetoAposta> getObjetosAposta() 
	{
		ArrayList<ObjetoAposta> objetos = new ArrayList<ObjetoAposta>();
		//Adiciona os objetos da aposta
		for(int i = 0; i <= 36; i++){
                    ObjetoAposta objeto = new ObjetoAposta(String.valueOf(i));
                    objetos.add(objeto);
                }         	
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
		return 30;
	}

	@Override
	public float valorMinApostas() 
	{
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public float valorMaxApostas() 
	{
		// TODO Auto-generated method stub
		return 30;
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
