package es.ieslavereda.biblioteca.common;

import java.util.*;

public abstract class Libro {

	private String titulo;
	private String autor;
	private int isbn;
	
	public Libro(String titulo, String autor, int isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;

	}
	
	
}
