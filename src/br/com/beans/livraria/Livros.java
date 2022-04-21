package br.com.beans.livraria;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.beans.livraria.interfaces.AutorLivro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livros {
	
	private String nome;
	private String codigo;
	
	@Autowired
	AutorLivro  autorLivro;

	public void exibir() {
		System.out.println(this.nome + " - " + this.codigo);
		autorLivro.exibirInforAutor();
	}
}
