package modelo;

import java.util.ArrayList;

public class Aposta 
{
	private String maneira;
	private ArrayList<ObjetoAposta> objeto;
	private float valor;
	
	public Aposta(ArrayList<ObjetoAposta> obj, float valor, String maneira ) 
	{
		objeto = obj;
                this.valor = valor;
                this.maneira = maneira;
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
