
public class Colocacao 
{
	private Apostador Apostador;
	private float valor;
	
	public Colocacao(Apostador apostador, float valor) 
	{
		Apostador = apostador;
		this.valor = valor;
	}

	public Apostador getApostador() {
		return Apostador;
	}

	public void setApostador(Apostador apostador) {
		Apostador = apostador;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
