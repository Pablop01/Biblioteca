package es.ieslavereda.biblioteca.common;

import java.util.ArrayList;

public class Ejemplar extends Libro{

	private boolean prestado = false;
	private ArrayList<Persona> aQuien = null;
	private static int cantidad = 0;
	
	public Ejemplar(String titulo, String autor, int isbn) {
		super(titulo, autor, isbn);
		this.prestado = prestado;
		this.aQuien = aQuien;
		this.cantidad = cantidad;
		
	}
	
	
	
}
