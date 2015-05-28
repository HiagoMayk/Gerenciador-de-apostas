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
<<<<<<< HEAD
		String nome, objetoAposta;
		float valor;
		int id, indexAposta;
		
=======
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
		System.out.print("Digite o nome da instancia: ");
		Scanner ler = new Scanner(System.in);
		String s = ler.nextLine();
		System.out.println("");
<<<<<<< HEAD
		
		/*
		System.out.print("digite um objeto de aposta: ");
		ler = new Scanner(System.in);
		objetoAposta = ler.nextLine();
		
		while(objetoAposta != "-1")// Gigitar -1 pra sair
		{
			System.out.print("Digite o nome da instancia: ");
			ler = new Scanner(System.in);
			objetoAposta = ler.nextLine();
			System.out.println("");
		}
		*/
		
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
=======
				
		while(true)
		{
			System.out.println("========= Gerenciador de Apostas: " + s + " =========");
			System.out.println("Novo apostador: ------ 1");
			System.out.println("Nova aposta ---------- 2");
			System.out.println("Listar Apostadores --- 3");
			System.out.println("Ver resultado -------- 4");
			System.out.println("Sair ----------------- 0");
			System.out.println("");
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
			
			int opcao = ler.nextInt();
			switch(opcao){
				case 1: 
<<<<<<< HEAD
						System.out.println("Nome do apostador: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						nome = ler.nextLine();
						
						System.out.println("Objeto de aposta: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						objetoAposta = ler.nextLine();
						
						System.out.println("Valor apostado: ");
						System.out.print(">>> ");
=======
						String nome, objetoAposta;
						float valor;
						System.out.print("Nome do apostador: ");
						ler = new Scanner(System.in);
						nome = ler.nextLine();
						
						System.out.print("Objeto de aposta ");
						ler = new Scanner(System.in);
						objetoAposta = ler.nextLine();
						
						System.out.print("Valor apostado: ");
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
						ler = new Scanner(System.in);
						valor = ler.nextFloat();
						
						novoApostador(nome, valor, objetoAposta);
						break;	
<<<<<<< HEAD
				case 2: 
						System.out.println("Digite o id do apostador: ");
						System.out.print(">>> ");;
						ler = new Scanner(System.in);
						id = ler.nextInt();
						gerenciadorApostador.removerApostador(id);
				case 3:
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
				case 4: 
						System.out.println("Id do apostador: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						id = ler.nextInt();
					
						System.out.println("Inddex da aposta: ");
						System.out.print(">>> ");
						ler = new Scanner(System.in);
						indexAposta = ler.nextInt();
						
						if(gerenciadorApostador.getApostador(id).getApostas().size() <= 1)
						{
							gerenciadorApostador.removerApostador(id);
						}else{
							gerenciadorApostador.getApostador(id).removerAposta(indexAposta);
						}
						break;
				case 5:
						listar();
						break;
				case 6:;
				case 0: System.exit(1);;
				default:
					System.out.println("Digite um numero válido");
=======
				case 2: ;
				case 3: 
						listar();
						break;
				case 0: System.exit(1);;
				default:
					System.out.println("Digite um numero vÃ¡lido");
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
			}
		}
	}

	public void novoApostador(String nome, float valor, String objeto) 
	{
		int idNovo = gerenciadorApostador.novoApostador(nome, objeto, valor);
<<<<<<< HEAD
		novaAposta(idNovo, valor, objeto);
		//String n = gerenciadorApostador.getApostador(idNovo).getNome();
=======
		novaAposta(idNovo, valor, objeto);		
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
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
<<<<<<< HEAD
		System.out.println("ID \t NOME \t APOSTAS");
		for(int i = 0; i < gerenciadorApostador.getApostadores().size(); i++)
		{	
			System.out.print(gerenciadorApostador.getApostadores().get(i).getIdApostador());
			System.out.print(" \t ");
			System.out.print(gerenciadorApostador.getApostadores().get(i).getNome());
			System.out.print(" \t ");
			for(int j = 0; j < gerenciadorApostador.getApostadores().get(i).getApostas().size(); j++)
			{	
				System.out.print(gerenciadorApostador.getApostadores().get(i).getApostas().get(j).getObjeto().getNome());
				System.out.print("  ");
				System.out.println(gerenciadorApostador.getApostadores().get(i).getApostas().get(j).getValor());
				System.out.print("\t\t ");
			}
			System.out.println("");
		}

=======
		for(int i = 0; i < gerenciadorApostador.getApostadores().size(); i++) 
		{
			System.out.println(gerenciadorApostador.getApostadores().get(i).getNome());
		}
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
	}
	
	public static void main(String args[]) throws IOException
	{
		UserInterface u = new UserInterface();
		u.iniciarInterface();
		
	}

}
