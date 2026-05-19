package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Livro extends Model{
	public String titulo;
	public double preco;
	public int estoque;
	public String genero;

}
