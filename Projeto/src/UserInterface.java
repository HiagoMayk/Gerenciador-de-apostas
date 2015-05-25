import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface 
{
	private GerenciadorApostador gerenciadorApostador;
	private Resultado resultado;
	
	public UserInterface()
	{
		gerenciadorApostador = new GerenciadorApostador();
	}
	
	public void iniciarInterface()
	{	
		System.out.print("Digite o nome da instancia: ");
		Scanner ler = new Scanner(System.in);
		String s = ler.nextLine();
		System.out.println("");
				
		while(true)
		{
			System.out.println("========= Gerenciador de Apostas: " + s + " =========");
			System.out.println("Novo apostador: ------ 1");
			System.out.println("Nova aposta ---------- 2");
			System.out.println("Listar Apostadores --- 3");
			System.out.println("Ver resultado -------- 4");
			System.out.println("Sair ----------------- 0");
			System.out.println("");
			
			int opcao = ler.nextInt();
			switch(opcao){
				case 1: 
						String nome, objetoAposta;
						float valor;
						System.out.print("Nome do apostador: ");
						ler = new Scanner(System.in);
						nome = ler.nextLine();
						
						System.out.print("Objeto de aposta ");
						ler = new Scanner(System.in);
						objetoAposta = ler.nextLine();
						
						System.out.print("Valor apostado: ");
						ler = new Scanner(System.in);
						valor = ler.nextFloat();
						
						novoApostador(nome, valor, objetoAposta);
						break;	
				case 2: ;
				case 3: 
						listar();
						break;
				case 0: System.exit(1);;
				default:
					System.out.println("Digite um numero válido");
			}
		}
	}

	public void novoApostador(String nome, float valor, String objeto) 
	{
		int idNovo = gerenciadorApostador.novoApostador(nome, objeto, valor);
		novaAposta(idNovo, valor, objeto);
		//String n = gerenciadorApostador.getApostador(idNovo).getNome();
		System.out.print("Passou! ");
	}

	public void novaAposta(int idApostador, float valor, String objeto) 
	{
		gerenciadorApostador.getApostador(idApostador).inserirAposta(objeto, valor);
	}

	public void gerarClassificacao() 
	{

	}
	
	public void listar()
	{
		for(int i = 0; i < gerenciadorApostador.getApostadores().size(); i++) 
		{
			System.out.println(gerenciadorApostador.getApostadores().get(i).getNome());
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		UserInterface u = new UserInterface();
		u.iniciarInterface();
		
	}

}