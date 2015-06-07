package modelo;

import java.util.ArrayList;

public class Aposta 
{
	private String maneira;
	private ArrayList<ObjetoAposta> objeto;
	private float valor;
	
	public Aposta() 
	{
		objeto = new ArrayList<ObjetoAposta>();
	}
	
	public String getManeira() {
		return maneira;
	}

	public void setManeira(String maneira) {
		this.maneira = maneira;
	}

	public ArrayList<ObjetoAposta> getObjetosAposta() 
	{
		return objeto;
	}

	public void setAposta(ArrayList<ObjetoAposta> objeto, float valor) 
	{
		this.objeto = objeto;
		this.valor = valor;
	}

	public float getValor() 
	{
		return valor;
	}

	public void setValor(float valor) 
	{
		this.valor = valor;
	}
	
}
