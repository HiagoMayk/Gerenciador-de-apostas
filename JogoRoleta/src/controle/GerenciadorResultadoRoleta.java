package controle;

import dados.IDAOAposta;
import dados.IDAOApostador;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import modelo.Aposta;
import modelo.ObjetoAposta;
import modelo.Resultado;

public class GerenciadorResultadoRoleta implements IGerenciadorResultado
{
	private Resultado resultado;
	private RegraJogo regraJogo;
	
	public GerenciadorResultadoRoleta() 
	{
		resultado = new Resultado();
		regraJogo = new RegraJogoRoleta();
	}

	public Resultado getResultado()
	{
            if(resultado.getClassificacao().size() <=0)
            {
                return null;
            }
            return resultado;
	}

	//varia de acordo com as regras de jogo
	public void obterResultado(ArrayList<ObjetoAposta> objetosGanhadores, IDAOApostador apostadores)
	{
			for(int i = 0; i < apostadores.getApostadores().size() ; i++) //apostadores
			{
				for(int j = 0; j < apostadores.getApostadores().get(i).getDAOAposta().getApostas().size(); j++) //Apostas
				{               
                                                if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("1 Número"))
						{
							if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(objetosGanhadores.get(0).getNome()))
							{
								resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                break;
                                                        }	
						}
                                                
                                                if(objetosGanhadores.get(0).getNome().equals("0"))
                                                {
                                                    break;
                                                }
                                                else
                                                {
						if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Par/Ímpar"))
						{
							if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals("Par") &&
                                                           Integer.parseInt(objetosGanhadores.get(0).getNome())%2 == 0)
							{
								resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                break;
                                                        }
                                                        else if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals("Ímpar") &&
                                                           Integer.parseInt(objetosGanhadores.get(0).getNome())%2 != 0)
							{
								resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                break;
                                                        }
						}
						else if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dúzia"))
						{
                                                    if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(String.valueOf(((Integer.parseInt(objetosGanhadores.get(0).getNome())/12)+1))))
                                                    {
								resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                break;
                                                    }
                                                }
				}
                            }
			}
		
	}
        
}
