package es.ieslavereda.biblioteca.common;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private int cantidadLibros;
	private ArrayList<Libro> librosActuales;
	
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.cantidadLibros = 0;
		librosActuales = new ArrayList<Libro>();

	}

	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}		
	
}
