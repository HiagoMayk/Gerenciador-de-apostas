package controle;

import dados.IDAOAposta;
import dados.IDAOApostador;
import java.util.ArrayList;
import modelo.Aposta;
import modelo.ObjetoAposta;
import modelo.Resultado;

public class GerenciadorResultadoCavalos implements IGerenciadorResultado
{
	private Resultado resultado;
	private RegraJogo regraJogo;
	
	public GerenciadorResultadoCavalos() 
	{
		resultado = new Resultado();
		regraJogo = new RegraJogoCavalos();
	}

	public Resultado getResultado()
	{
            if(resultado.getClassificacao().size() <= 0)
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
						if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Vencedor"))
						{
							if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(objetosGanhadores.get(0).getNome()))
							{
								resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                break;
							}
						}
						else if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Placer"))
						{
							if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(objetosGanhadores.get(0).getNome()) ||
							   apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(objetosGanhadores.get(1).getNome()))
							{
								resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                break;
                                                        }	
						}
						else if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getManeira().equals("Dupla"))
						{
                                                    if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(objetosGanhadores.get(0).getNome()) &&
							apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(1).getNome().equals(objetosGanhadores.get(1).getNome()))
                                                    {
                                                        resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(1));
                                                                break;
                                                    }
                                                    else if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0).getNome().equals(objetosGanhadores.get(1).getNome()) &&
							    apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(1).getNome().equals(objetosGanhadores.get(0).getNome()))
                                                    {
								resultado.setColocado(apostadores.getApostadores().get(i));
								resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(1));
                                                                resultado.setObjetoGanhador(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(j).getObjetosAposta().get(0));
                                                                break;
                                                    }
					}
				}
                        }	
	}
} 
