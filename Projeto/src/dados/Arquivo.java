package dados;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo implements IO
{
	@Override
	public void entrada() throws IOException
	{
		System.out.println("Digite o nome do arquivo de leitura");
		leitor("entrada.txt");
	}

	@Override
	public void saida() throws IOException
	{
		System.out.println("Digite o nome do arquivo de escrita");
		leitor("resultado.txt");
	}
	
	public void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public void escritor(String path) throws IOException {
		File file = new File("resultado.txt");  
	    try {  
	           BufferedWriter out = new BufferedWriter(new FileWriter(file));  
	           out.write("----  RESULTADO  ----");  
	           out.close();  
	       } catch (IOException e) {  
	       }  
	}
	
}