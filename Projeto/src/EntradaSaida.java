import java.util.ArrayList;

public class EntradaSaida implements IO
{
	@Override
	public void obterEntrada()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtersaida()
	{
		// TODO Auto-generated method stub
		
	}

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
	public ArrayList<Apostador> getApostadores()
	{
		// TODO Auto-generated method stub
		GerenciadorApostador gerenciadorApostador = new GerenciadorApostador();
		
		gerenciadorApostador.novoApostador("Mayk");
		gerenciadorApostador.getApostador(0).getGerenciadorAposta().inserirAposta("1", 10);
		
		gerenciadorApostador.novoApostador("Stefano");
		gerenciadorApostador.getApostador(1).getGerenciadorAposta().inserirAposta("2", 10);
		
		gerenciadorApostador.novoApostador("Lilian");
		gerenciadorApostador.getApostador(2).getGerenciadorAposta().inserirAposta("3", 10);
		
		gerenciadorApostador.novoApostador("Hiago");
		gerenciadorApostador.getApostador(3).getGerenciadorAposta().inserirAposta("4", 10);
		
		gerenciadorApostador.novoApostador("Momo");
		gerenciadorApostador.getApostador(4).getGerenciadorAposta().inserirAposta("5", 10);
		
		gerenciadorApostador.novoApostador("Loss");
		gerenciadorApostador.getApostador(5).getGerenciadorAposta().inserirAposta("6", 10);
		
		return gerenciadorApostador.getApostadores();
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
		return 10;
	}

	@Override
	public Premiacao getTebelaPremiacao() {
		// TODO Auto-generated method stub
		Premiacao premiacao = new Premiacao();
		ArrayList<Premio> premios = new ArrayList<Premio>();
		Premio premio = new Premio(60);
		
		premios.add(premio);
		premiacao.setPremios(premios);
		return premiacao;
	}
	
}
