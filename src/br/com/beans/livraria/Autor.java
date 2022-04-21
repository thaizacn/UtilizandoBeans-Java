package br.com.beans.livraria;

import br.com.beans.livraria.interfaces.AutorLivro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autor implements AutorLivro{
	
	private String nome;
	private String genero;
	
	public void exibirInforAutor() {
		System.out.println("Autor da obra: " + this.nome + ", do genero " + this.genero);
	}

}
