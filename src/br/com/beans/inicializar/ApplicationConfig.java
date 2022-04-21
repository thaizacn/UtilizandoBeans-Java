package br.com.beans.inicializar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.beans.livraria.Autor;
import br.com.beans.livraria.Livros;
import br.com.beans.livraria.interfaces.AutorLivro;

@Configuration
public class ApplicationConfig {
	
// <bean id="livros" class="com.springbeans.Livros"/>
	@Bean
	public Livros getLivros() {
		return new Livros();
	}
	
	@Bean
	public AutorLivro getAutorLivro() {
		return new Autor();
	}

}
