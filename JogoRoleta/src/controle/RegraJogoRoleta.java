package controle;

import java.util.ArrayList;

import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;
import dados.EntradaSaidaRoleta;
import dados.EntradaSaidaRoleta;
import dados.IDAOApostador;
import dados.IO;
import modelo.Aposta;
import modelo.Resultado;

public class RegraJogoRoleta extends RegraJogo 
{	
	public RegraJogoRoleta()
	{			
		//Esse código vai deposi para o Regrajogo Abstrato
		IO io = new EntradaSaidaRoleta();
		super.setQuantMaxApostadores(io.quantMaxApostadores());              
                super.setQuantMaxApostas(io.quantMaxApostas());
		super.setValorMaxApostas(io.valorMaxApostas());
		super.setValorMinApostas(io.valorMinApostas());
		super.setObjetosAposta(io.getObjetosAposta());
	}
	
	/*
	 * Verifica a maneira de apostar de cada apostador e se 
	 * aquantidade de cavalos bate com a quantidade exigida 
	 * por uma determinada maneira de aposta.
	 * 
	 */
	  public boolean verificarManeiraAposta(Aposta aposta, IDAOApostador apostadores) {
          
          return true;
    }

	public void calcularTabelaPremiacao(IDAOApostador apostadores) 
	{
            //Não usado nessa instancia
	}
     
        public ArrayList<Premio> premioPorApostador(Resultado resultado)               
        {
            float p = 0;
            ArrayList<Premio> premios = new ArrayList<Premio>();
            
            for(int i = 0; i < resultado.getClassificacao().size(); i++) //todos os ganhadores
            {
                for(int j = 0; j < resultado.getClassificacao().get(i).getDAOAposta().getApostas().size(); j++) //todas as apostas
                {
                    if(resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Par/Impar"))
                    {
			p = p + (resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getValor() * 2);	
                    }
                    else if(resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("1 Número"))
                    {
				p = p + (resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getValor() * 8);		
                    }
                    else if(resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dúzia"))
                    {
			p = p + (resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getValor() * 5);	
                    }	
                }
                Premio premio = new Premio(p);
                premios.add(premio);
                p = 0;
            }
            return premios;
        }

        
	//Retorna um array list com a ordem da premiação (valores) - no caso só 1 valor pois só um ganha
	public ArrayList<Premio> getTabelaPremiacao() 
	{
		return super.getTabelaPremiacao();
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
	
	public ArrayList<ObjetoAposta> getObjetosAposta()
	{
		return super.getObjetosAposta();
	}
}