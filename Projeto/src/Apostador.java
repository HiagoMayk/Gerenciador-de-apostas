import java.util.ArrayList;

public class Apostador
{
	private String nome;
	private int idApostador;
	private ArrayList<Aposta> apostas;
	
<<<<<<< HEAD
	public Apostador(String nome, int idApostador, String objeto, float valor)
=======
	public Apostador(String nome, int idApostador, String objeto, float valor) 
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
	{
		this.nome = nome;
		this.idApostador = idApostador;
		apostas = new ArrayList<Aposta>();
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getIdApostador() 
	{
		return idApostador;
	}

	public void setIdApostador(int idApostador)
	{
		this.idApostador = idApostador;
	}

	public ArrayList<Aposta> getApostas() 
<<<<<<< HEAD
	{
		return apostas;
	}

	public void setApostas(ArrayList apostas) 
	{
		this.apostas = apostas;
	}

	public void inserirAposta(String objeto, float valor) 
	{
		Aposta novaAposta = new Aposta(objeto, valor);
		apostas.add(novaAposta);
=======
	{
		return apostas;
	}

	public void setApostas(ArrayList apostas) 
	{
		this.apostas = apostas;
	}

	public void inserirAposta(String objeto, float valor) 
	{	
		RegraJogo regra = new RegraJogo();
		
		Aposta novaAposta = new Aposta(objeto, valor);
		
		if (regra.validaAposta(novaAposta, apostas.size())){	
			apostas.add(novaAposta);
		}
		else System.out.println("APOSTA INVALIDA");
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
	}

	public void removerAposta(int index) 
	{
<<<<<<< HEAD
		if(!(apostas.size() < index || index < 0))
		{
			apostas.remove(apostas.get(index));
		}
=======
		    apostas.remove(apostas.get(index));
		
>>>>>>> 0b91ed68e80d25189d363d2fcb678d7d6b42b051
	}
	
}
