package controle;
import java.util.ArrayList;

import dados.EntradaSaidaDados;
import dados.IDAOApostador;
import dados.IO;
import modelo.Aposta;
import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;
import modelo.Resultado;

public class RegraJogoDados extends RegraJogo
{	
	public RegraJogoDados()
	{			
		IO io = new EntradaSaidaDados();
		super.setQuantMaxApostadores(io.quantMaxApostadores());
		super.setQuantMaxApostas(io.quantMaxApostas());
		super.setValorMaxApostas(io.valorMaxApostas());
		super.setValorMinApostas(io.valorMinApostas());
		super.setObjetosAposta(io.getObjetosAposta());
	}
	
	//Não pode apostar no mesmo objeto que outra pessoa já tenha apostado
	public boolean verificarManeiraAposta(Aposta aposta,IDAOApostador apostadores) 
        {
            for(int i = 0; i < apostadores.getApostadores().size(); i++ ) //todos os apostasores
            {
                for(int j = 0; j < apostadores.getApostadores().get(i).getDAOAposta().getApostas().size(); j++) //Apostas
                {
                    if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(aposta.getObjetosAposta().get(0).getNome()))
                    {
                        return false;
                    }
                }
            }
            return true;
	}
	
	public void calcularTabelaPremiacao(IDAOApostador apostadores) 
	{
		Premiacao premiacao = new Premiacao();
		int soma = 0;
		
		for(int i = 0; i < apostadores.getApostadores().size(); i++)
		{
			soma += apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(0).getValor();
		}
		
		ArrayList<Premio> premios = new ArrayList<Premio>();
		Premio premio = new Premio(soma);
		premios.add(premio);
		premiacao.setPremios(premios);
		setTabelaPremiacao(premiacao);
	}      
      
	//Retorna um array list com a ordem da premiação (valores) - no caso só 1 valor pois só um ganha
	public ArrayList<Premio> getTabelaPremiacao() 
	{
		return super.getTabelaPremiacao();
	}
         
        public ArrayList<Premio> premioPorApostador(Resultado resultado)               
        {
            ArrayList<Premio> premios = new ArrayList<Premio>();
            Premio p = new Premio(super.getTabelaPremiacao().get(0).getPremio()/resultado.getClassificacao().size());
            premios.add(p);
            
            return premios;
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
