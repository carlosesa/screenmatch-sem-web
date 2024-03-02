package br.jus.tjma;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.jus.tjma.model.DadosSerie;
import br.jus.tjma.service.ConsumoAPI;
import br.jus.tjma.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		DadosSerie dados = new ConverteDados().obterDados(json, DadosSerie.class);
		
		System.out.println(dados);
		// System.out.println(dados.intTotalTemporadas());
		// System.out.println(dados.strAvaliacao());
	}

}
