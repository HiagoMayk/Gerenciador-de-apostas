public class Aposta 
{
	private ObjetoAposta objeto;

	private float valor;

	private int idAposta;

	
	public Aposta(ObjetoAposta objeto, float valor, int idAposta) 
	{
		this.objeto = objeto;
		this.valor = valor;
		this.idAposta = idAposta;
	}

	public ObjetoAposta getObjeto() 
	{
		return objeto;
	}

	public void setObjeto(ObjetoAposta objeto) 
	{
		this.objeto = objeto;
	}

	public Float getValor() 
	{
		return valor;
	}

	public void setValor(Float valor) 
	{
		this.valor = valor;
	}

	public int getIdAposta() 
	{
		return idAposta;
	}

	public void setIdAposta(int idAposta) 
	{
		this.idAposta = idAposta;
	}
}
