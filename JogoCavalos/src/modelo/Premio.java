package modelo;

//Esta classe contém os valores ganhos por classificação
public class Premio
{
	private float valor;
	
	public Premio(float valor) 
	{
		this.valor = valor;
	}

	public float getPremio() 
	{
		return valor;
	}

	public void setPremio(float valor) 
	{
		this.valor = valor;
	}
}