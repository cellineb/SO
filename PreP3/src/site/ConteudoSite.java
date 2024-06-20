package site;

import java.net.URL;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLConnection;

public class ConteudoSite {
	URL url;
	public String caminho;
	public StringBuilder conteudo = new StringBuilder();	

	public ConteudoSite() {

		try {
			@SuppressWarnings("deprecation")
			URL url = new URL("http://universities.hipolabs.com/search?country=United+Kingdom");
			URLConnection conexao = url.openConnection();
			InputStreamReader leitor = new InputStreamReader(conexao.getInputStream());
			
			int caractere;
			while ((caractere = leitor.read()) != -1) {
				conteudo.append((char)caractere);
			}
			leitor.close();
			
			caminho = "C:\\TEMP\\hol.json";
			
			FileWriter escritor = new FileWriter(caminho);
			escritor.write(conteudo.toString());
			escritor.close();
				
			
			
		} catch (IOException e) {
			System.err.println("Não foi póssivel baixar o conteúdo do site: " + e.getMessage());
		
		}
	}
}
