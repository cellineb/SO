package controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Universidade;
import site.ConteudoSite;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class UniversidadesController {
	
	List<Universidade> universidades = new ArrayList<>();
	public UniversidadesController(ConteudoSite site) {
		try (FileReader leitor = new FileReader(site.caminho)) {
			JSONTokener tokener = new JSONTokener(leitor);
			JSONArray arrayUniversidades = new JSONArray(tokener);
			
			int tamanho = arrayUniversidades.length();
			for (int i = 0; i < tamanho; i++) {
				JSONObject objetoUniversidade = arrayUniversidades.getJSONObject(i);
				String nome = objetoUniversidade.getString("name");
				String caminhoSite = objetoUniversidade.getJSONArray("web_pages").getString(0);
				universidades.add(new Universidade(nome, caminhoSite));
			}
		}
		
		catch(IOException e){
			System.err.println("Erro ao ler o arquivo " + e.getMessage());
		}
	}


	public List<Universidade> getUniversidades() {
		return universidades;

	}

}


