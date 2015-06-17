package controle;

import java.util.ArrayList;

import modelo.ObjetoAposta;
import modelo.Premiacao;
import modelo.Premio;
import dados.EntradaSaidaCavalos;
import dados.EntradaSaidaCavalos;
import dados.IDAOApostador;
import dados.IO;
import modelo.Aposta;
import modelo.Resultado;

public class RegraJogoCavalos extends RegraJogo 
{	
	public RegraJogoCavalos()
	{			
		//Esse código vai deposi para o Regrajogo Abstrato
		IO io = new EntradaSaidaCavalos();
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
        if (aposta.getManeira().equals("Vencedor") && (aposta.getObjetosAposta().size() != 1)) {
            return false;
        } else if (aposta.getManeira().equals("Placer") && (aposta.getObjetosAposta().size() != 1)) {
            return false;
        } else if (aposta.getManeira().equals("Dupla") && (aposta.getObjetosAposta().size() != 2)) {
            return false;
        } else if (aposta.getManeira().equals("Vencedor")) {
            for (int i = 0; i < apostadores.getApostadores().size(); i++) {
                for (int j = 0; j < apostadores.getApostadores().get(i).getDAOAposta().getApostas().size(); j++) {
                    if (apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Vencedor")
                            && aposta.getObjetosAposta().get(0).getNome().equals(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome())) {
                        return false;
                    }

                }
            }
        } else if (aposta.getManeira().equals("Placer")) {
            for (int i = 0; i < apostadores.getApostadores().size(); i++) {
                for (int j = 0; j < apostadores.getApostadores().get(i).getDAOAposta().getApostas().size(); j++) {
                    if (apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Placer")
                            && aposta.getObjetosAposta().get(0).getNome().equals(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome())) {
                        return false;
                    }

                }
            }
        } else if (aposta.getManeira().equals("Dupla")) {
            for (int i = 0; i < apostadores.getApostadores().size(); i++) {
                for (int j = 0; j < apostadores.getApostadores().get(i).getDAOAposta().getApostas().size(); j++) {
                    if (apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dupla")
                            && aposta.getObjetosAposta().get(0).getNome().equals(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

	public void calcularTabelaPremiacao(IDAOApostador apostadores) 
	{
	        float vencedor = 0;
		float placer = 0;
		float dupla = 0;
		
		//Esta bugado em algum lugar por aqui (07/06/2015)
		for(int i = 0; i < apostadores.getApostadores().size(); i++)
		{
			for(int j = 0; j < apostadores.getApostadores().get(i).getDAOAposta().getApostas().size(); j++)
			{
				if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Vencedor"))
				{
					vencedor += apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					//System.out.println("vencedor = " + vencedor);
				}
				else if((apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Placer")))
				{
					placer += apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					//System.out.println("placer = " + placer);
				}
				else if((apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dupla")))
				{
					dupla += apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getValor();
					//System.out.println("dupla = " + dupla);
				}		
			}
		}
		
		Premiacao premiacao = new Premiacao();
		ArrayList<Premio> premios = new ArrayList<Premio>();
		Premio premio = new Premio(vencedor);
		premios.add(premio);
		premio = new Premio(placer);
		premios.add(premio);
		premio = new Premio(dupla);
		premios.add(premio);
		premiacao.setPremios(premios);	
                setTabelaPremiacao(premiacao);
        
	}
        
        
        public ArrayList<Premio> premioPorApostador(Resultado resultado)               
        {
            float vencedor = 0;
            float placer = 0;
            float dupla = 0;
            ArrayList<Premio> premios = new ArrayList<Premio>();
            
            for(int i = 0; i < resultado.getClassificacao().size(); i++) //todos os ganhadores
            {
                for(int j = 0; j < resultado.getClassificacao().get(i).getDAOAposta().getApostas().size(); j++) //todas as apostas
                {
                    if(resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Vencedor"))
                    {
					vencedor += 1;
					//System.out.println("vencedor = " + vencedor);
                    }
                    else if(resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Placer"))
                    {
					placer += 1;
					//System.out.println("placer = " + placer);
                    }
                    else if(resultado.getClassificacao().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dupla"))
                    {
					dupla += 1;
					//System.out.println("dupla = " + dupla);
                    }	
                }
            }
            
            Premio p1 = null;
            Premio p2 = null;
            Premio p3 = null;
            
            if(super.getTabelaPremiacao().get(0).getPremio() == 0){
                p1 = new Premio(0);
            }
            else{
                p1 = new Premio(super.getTabelaPremiacao().get(0).getPremio()/vencedor);
            }
            
            if(super.getTabelaPremiacao().get(1).getPremio() == 0){
                p2 = new Premio(0);
            }
            else{
                p2 = new Premio(super.getTabelaPremiacao().get(1).getPremio()/placer);
            }
            
            if(super.getTabelaPremiacao().get(2).getPremio() == 0){
                p3 = new Premio(0);
            }
            else{
                p3 = new Premio(super.getTabelaPremiacao().get(2).getPremio()/dupla);
            }
           
            premios.add(p1);
            premios.add(p2);
            premios.add(p3);
            
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