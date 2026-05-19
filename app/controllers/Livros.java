package controllers;

import java.util.List;

import models.Livro;
import play.mvc.Controller;

public class Livros extends Controller{
	
	public static void listar() {
		List<Livro> lista = Livro.findAll();
		
		int total = 0;
		
		for (int i = 0; i<lista.size(); i++) {
			total += lista.get(i).estoque;
		}
		render(lista, total);
	}
	
	public static void salvar(Livro l) {
		l.save();
		listar();
	}
	
	public static void form() {
		render();
	}
	
	public static void remover(Long id) {
		Livro l = Livro.findById(id);
		l.delete();
		listar();
	}
	
	public static void editar(Long id) {
		Livro l = Livro.findById(id);
		render(l);
	}

}
