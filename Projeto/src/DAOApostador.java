import java.util.ArrayList;


public class DAOApostador implements IDAOApostador{
	
	private ArrayList<Apostador> apostadores;
	
	
	public DAOApostador()
	{
		apostadores = new ArrayList<Apostador>();
	}
	
	public void addApostador(Apostador apostador){
		
		apostadores.add(apostador);
	}
	
	public void removerApostador(int idApostador){
		

		if(apostadores.size() > 0) //Verifica se existe algum apostador
		{
			for(int i = 0; i < apostadores.size(); i++) 
			{
				if(apostadores.get(i).getIdApostador() == idApostador)
			    {
			    	apostadores.remove(apostadores.get(i));
			    }
			}
		}		
		
	}
	
	
	
	public Apostador procurarApostador(int idApostador){		
		
		
			for(int i = 0; i < apostadores.size(); i++) 
			{
				if(apostadores.get(i).getIdApostador() == idApostador)
			    {
			    	return apostadores.get(i);
			    }
			}
			
			return null;
		
	}
	
	public ArrayList<Apostador> getApostadores() 
	{
		return apostadores;
	}


}
