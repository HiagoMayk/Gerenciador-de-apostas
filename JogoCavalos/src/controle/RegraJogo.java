package controle;
//import Resultado;
//import GerenciadorApostador;

import java.util.ArrayList;
import modelo.Aposta;
import dados.*;
import modelo.Apostador;
import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;
import modelo.Resultado;

public abstract class RegraJogo implements IRegraJogo
{
	private int quantMaxApostadores;
	private int quantMaxApostas;
	private float valorMaxApostas;
	private float valorMinApostas;
	private ArrayList<ObjetoAposta> objetos;
	private Premiacao premiacao;				//Uma tabela de valores a ser ganho por colocaçães
	private IGerenciadorResultado gerenciadorResultado;
	
	public boolean aplicarRegraJogo(Aposta aposta, IDAOAposta apostas, IDAOApostador apostadores)
	{
		premiacao = new Premiacao();
		if((verificaDominioAposta(aposta) && verificaQuantidadeAposta(apostas) && verificaFaixaValores(aposta) && verificarManeiraAposta(aposta, apostadores)) == true)
		{
			System.out.println("todo ok ate aqui!!!");
			return true;
		}
		return false;
	}
	
	public boolean verificaQuantidadeAposta(IDAOAposta apostas)
	{
            //Se a quantidade de apostas é maior que o maximo possível
		if (getQuantMaxApostas() <= apostas.getApostas().size())
		{
                    return false;
		}
            return true;
	}
	
	public boolean verificaFaixaValores(Aposta aposta)
	{		
            if (aposta.getValor() < getValorMinApostas() ||
		getValorMaxApostas() < aposta.getValor())
            {
		return false;	
            }
            return true;
	}
	
	public boolean verificaDominioAposta(Aposta aposta)
	{
           IO io = new EntradaSaidaCavalos();
            //Se as apostas do usuário está no domínio de objetos de aposta do jogo
            for(int i = 0; i < io.getObjetosAposta().size(); i++) // dominio da aposta
            {
                for(int j = 0; j < aposta.getObjetosAposta().size(); j++) // Objetos apostados
                {
                    if(getObjetosAposta().get(i).getNome().equals(aposta.getObjetosAposta().get(j).getNome()))
                    {
                        return true;
                    }
                }
            } 
                
            return true;
	}
        
        public ArrayList<Premio> premioPorApostador(Resultado resultado)               
        {
            return null;
        }
        
        public boolean verificarManeiraAposta(Aposta aposta){
            return true;
        }
        
     
	//Implementação da instancia 
	public ArrayList<Premio> getTabelaPremiacao() 
	{
		return premiacao.getPremios();
	}
	
	public void setQuantMaxApostadores(int quantMaxApostadores) 
	{
		this.quantMaxApostadores = quantMaxApostadores;
	}

	public void setQuantMaxApostas(int quantMaxApostas) 
	{
		this.quantMaxApostas = quantMaxApostas;
	}

	public void setValorMinApostas(float valorMinApostas) 
	{
		this.valorMinApostas = valorMinApostas;
	}

	public void setValorMaxApostas(float valorMaxApostas) 
	{
		this.valorMaxApostas = valorMaxApostas;
	}
	
	public void setObjetosAposta(ArrayList<ObjetoAposta> objetos) 
	{
		this.objetos = objetos;
	}
	
	public void setTabelaPremiacao(Premiacao premiacao)
	{
		this.premiacao = premiacao;
	}
	
	public int getQuantMaxApostadores()
	{
		return quantMaxApostadores;
	}

	public int getQuantMaxApostas() 
	{
		return quantMaxApostas;
	}

	public float getValorMinApostas() 
	{
		return valorMinApostas;
	}

	public float getValorMaxApostas() 
	{
		return valorMaxApostas;
	}
	
	public IGerenciadorResultado getGerenciadorResultado() 
	{
		return gerenciadorResultado;
	}
	
	public ArrayList<ObjetoAposta> getObjetosAposta() 
	{
		return objetos;
	}
	
}
