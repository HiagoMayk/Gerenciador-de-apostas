public class Aposta 
{
	private ObjetoAposta objeto;
	private float valor;
	
	public Aposta(String obj, float valor) 
	{
		objeto = new ObjetoAposta(obj);
		this.valor = valor;
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

}
