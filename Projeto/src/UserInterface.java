import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface 
{
	//private GerenciadorApostador gerenciadorApostador;
	private GerenciadorResultado gerenciadorResultado;
	//private RegraJogo regraJogo;
	
	public UserInterface()
	{
		//regraJogo = new RegraJogoDados();
		//gerenciadorApostador = new GerenciadorApostador();
		gerenciadorResultado = new GerenciadorResultado();
	}
	
	public void iniciarInterface()
	{	
		gerenciadorResultado.obterResultado();
		for(int i = 0; i < gerenciadorResultado.getResultado().getClassificacao().size(); i++)
		{	
			System.out.println(gerenciadorResultado.getResultado().getClassificacao().get(i).getNome());
		}
		
		/*
		 * primeira implementação
		 * 
		 * 
		boolean verifica = regraJogo.aplicarRegraJogo();
		if( verifica == true)
		{
			System.out.println("Objetos APOSTA");
		
			for(int i = 0; i < regraJogo.getObjetosAposta().size(); i++)
			{	
				System.out.println(regraJogo.getObjetosAposta().get(i).getNome());
			}
		
			System.out.println("Apostadores");
			for(int i = 0; i < regraJogo.getApostadores().size(); i++)
			{	
				for(int j = 0; j < regraJogo.getApostadores().get(i).getGerenciadorAposta().getApostas().size(); j++)
					System.out.println(regraJogo.getApostadores().get(i).getNome() + " ------- " + regraJogo.getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getObjeto().getNome() + " ------- " + regraJogo.getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getValor());
			}
		}
		else
		{
			System.out.println("dados inválidos");
		}
		
		
		String nome, objetoAposta;
		float valor;
		int id, indexAposta;
		
		System.out.print("Digite o nome da instancia: ");
		Scanner ler = new Scanner(System.in);
		String s = ler.nextLine();
		System.out.println("");
		
		
		
		
		while(true)
		{
			
			 
			System.out.println("");
			System.out.println("========= Gerenciador de Apostas: " + s + " =========");
			System.out.println("Novo apostador: -------------- 1");
			System.out.println("Remover apostador ------------ 2");
			System.out.println("Nova aposta: ----------------- 3");
			System.out.println("Remover aposta --------------- 4");
			System.out.println("Listar Apostadores: ---------- 5");
			System.out.println("Ver resultado: --------------- 6");
			System.out.println("Sair: ------------------------ 0");
			System.out.println("");
			System.out.print(">>> ");
			
			int opcao = ler.nextInt();
			switch(opcao){
			 
			case 1: //Novo apostador
						System.out.println("Nome do apostador: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						nome = ler.nextLine();
						
						novoApostador(nome);
						break;	
				case 2: //Remover apostador
						System.out.println("Digite o id do apostador: ");
						System.out.print(">>> ");;
						ler = new Scanner(System.in);
						id = ler.nextInt();
						gerenciadorApostador.removerApostador(id);
						break;
				case 3: //Nova aposta
						System.out.println("Id do apostador: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						id = ler.nextInt();
					
						System.out.println("Objeto de aposta: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						objetoAposta = ler.nextLine();
					
						System.out.println("Valor apostado: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						valor = ler.nextFloat();
	
						novaAposta(id, valor, objetoAposta);
						break;
				case 4: //Remover aposta
						System.out.println("Id do apostador: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						id = ler.nextInt();
					
						System.out.println("Index da aposta: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						indexAposta = ler.nextInt();
						
						gerenciadorApostador.getApostador(id).getGerenciadorAposta().removerAposta(indexAposta);
						break;
				case 5: //Listar Apostadores
						listar();
						break;
				case 6: //Ver resultado;
						break;
				case 0: //Sair
						System.exit(1);;
				default:
					System.out.println("Digite um numero válido");
					break;
					
				
			}
		}
	}

	public void novoApostador(String nome) 
	{
		gerenciadorApostador.novoApostador(nome);
		//String n = gerenciadorApostador.getApostador(idNovo).getNome();
	}

	public void novaAposta(int idApostador, float valor, String objeto) 
	{
		gerenciadorApostador.getApostador(idApostador).getGerenciadorAposta().inserirAposta(objeto, valor);
	}

	public void gerarClassificacao() 
	{

	}
	
	public void listar()
	{
		System.out.println("ID \t NOME \t APOSTAS");
		for(int i = 0; i < gerenciadorApostador.getApostadores().size(); i++)
		{	
			System.out.print(gerenciadorApostador.getApostadores().get(i).getIdApostador());
			System.out.print(" \t ");
			System.out.print(gerenciadorApostador.getApostadores().get(i).getNome());
			System.out.print(" \t ");
			for(int j = 0; j < gerenciadorApostador.getApostadores().get(i).getGerenciadorAposta().getApostas().size(); j++)
			{	
				System.out.print(gerenciadorApostador.getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getObjeto().getNome());
				System.out.print("  ");
				System.out.println(gerenciadorApostador.getApostadores().get(i).getGerenciadorAposta().getApostas().get(j).getValor());
				System.out.print("\t\t ");
			}
			System.out.println("");
		}
		*/
	}
	
		
	public static void main(String args[]) throws IOException
	{
		UserInterface u = new UserInterface();
		u.iniciarInterface();
	}

}
