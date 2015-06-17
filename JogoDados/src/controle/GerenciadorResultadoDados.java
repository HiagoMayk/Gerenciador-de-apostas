package controle;
import dados.IDAOApostador;
import java.util.ArrayList;
import modelo.ObjetoAposta;
import modelo.Resultado;

public class GerenciadorResultadoDados implements IGerenciadorResultado
{
	private Resultado resultado;
	
	public GerenciadorResultadoDados() 
	{
		resultado = new Resultado();
	}

	public Resultado getResultado()
	{   
            if(resultado.getClassificacao().size() <= 0){
                System.out.println("erro");
                return null;         
            }  
            else{
                return resultado;
            }	
	}

	//varia de acordo com as regras de jogo
	public void obterResultado(ArrayList<ObjetoAposta> objetosGanhadores, IDAOApostador apostadores)
        {	
            for(int k = 0; k < objetosGanhadores.size(); k++) //Objetos Ganhadores
            {
		for(int i = 0; i < apostadores.getApostadores().size(); i++) //apostadores
		{
                    if(apostadores.getApostadores().get(i).getDAOAposta().getApostas().get(0).getObjetosAposta().get(0).getNome().equals(objetosGanhadores.get(k).getNome()))
                    {
			resultado.setColocado(apostadores.getApostadores().get(i));
			resultado.setObjetoGanhador(objetosGanhadores.get(0));			
                    }
		}       
            }
        }       
}
