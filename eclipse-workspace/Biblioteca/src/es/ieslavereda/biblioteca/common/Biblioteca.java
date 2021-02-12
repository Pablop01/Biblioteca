package es.ieslavereda.biblioteca.common;

import java.util.*;

public class Biblioteca {

	private ArrayList<Persona> listaSocios;
	private ArrayList<Libro> listaLibros;
	
	public Biblioteca() {
		this.listaSocios = new ArrayList();
		this.listaLibros = new ArrayList();
	}
	
	public void addSocio(Persona p) {
		listaSocios.add(p);
	}
	
	public void addLibro(Libro l) {
		listaLibros.add(l);
	}
	
	public Libro buscarIsbn(int isbn){
		for(Libro l : listaLibros) {
			if(l.getIsbn()==isbn) {
				return l;
			}
		}
		return null;
	}
	
	
}
