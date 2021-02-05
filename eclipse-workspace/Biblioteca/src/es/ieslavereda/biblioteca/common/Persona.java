package es.ieslavereda.biblioteca.common;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private static int cantidadLibros;
	private ArrayList<Ejemplar> librosActuales;
	
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.cantidadLibros = 3;
		librosActuales = new ArrayList<Ejemplar>();

	}
	
}
