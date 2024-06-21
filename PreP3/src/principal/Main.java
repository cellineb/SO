//Pegar o conteúdo do site: http://universities.hipolabs.com/search?country=United+Kingdom (Usar modo RAW ou Dados Brutos), esse site
//traz um arquivo comuniversidades britânicas. Gravar em um arquivo chamado hol.json na pasta C:\TEMP (\tmp se for Linux) e fazer uma 
//aplicação java que, na classe principal, chame uma classe de controle que leia o arquivo, e, apresente o nome da faculdade e seu
//website, para todas as faculdades listadas.

package principal;

import site.ConteudoSite;
import java.util.List;
import controller.UniversidadesController;
import model.Universidade;

public class Main {

	public static void main(String[] args) {
		
		ConteudoSite site = new ConteudoSite();
		UniversidadesController controller = new UniversidadesController(site);
		List<Universidade> universidades = controller.getUniversidades();
		
		for (Universidade universidade : universidades) {
			System.out.println("Nome: " + universidade.getNome());
			System.out.println("Site: " + universidade.getSite() + "\n");
		}
		
	}

}
