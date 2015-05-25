import java.util.ArrayList;

public class Apostador
{
	private String nome;
	private int idApostador;
	private ArrayList<Aposta> apostas;
	
	public Apostador(String nome, int idApostador, String objeto, float valor) 
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
	}

	public void removerAposta(int index) 
	{
		    apostas.remove(apostas.get(index));
		
	}
	
}
