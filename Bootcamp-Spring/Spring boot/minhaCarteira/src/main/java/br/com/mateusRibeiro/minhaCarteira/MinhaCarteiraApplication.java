package br.com.mateusRibeiro.minhaCarteira;

import br.com.mateusRibeiro.minhaCarteira.model.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinhaCarteiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhaCarteiraApplication.class, args);
		Usuario usuario = new Usuario();
		usuario.setNome("Mateus");
	}

}
