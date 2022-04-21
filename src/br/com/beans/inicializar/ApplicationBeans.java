package br.com.beans.inicializar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import br.com.beans.livraria.Autor;
import br.com.beans.livraria.Livros;

public class ApplicationBeans {
	
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Livros livros = factory.getBean(Livros.class);
		livros.setNome("Os Setes Maridos e Evelyn Hugo");
		livros.setCodigo("7MARIDOS");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Taylor Jenkins Reid");
		autor.setGenero("ficcção");
		livros.exibir();
		
		((AbstractApplicationContext) factory).close();
	}

}
