package es.ieslavereda.biblioteca.common;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private boolean socio = false;
	private int cantidadLibros;
	private ArrayList<Ejemplar> librosActuales;
	
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.cantidadLibros = 0;
		this.librosActuales = new ArrayList<Ejemplar>();

	}
	
	public void serSocio() {
		this.socio = true;
	}
	
	public boolean esSocio() {
		return socio;
	}

	public int getCantidadLibros() {
		return cantidadLibros;
	}
	
	public void setLibrosActuales(ArrayList<Ejemplar> librosActuales) {
		this.librosActuales = librosActuales;
	}

	public ArrayList<Ejemplar> getLibrosActuales() {
		return librosActuales;
	}
	
	public String imprimirLibros() {
		String salida = "Libros que tiene "+this.nombre+" "+this.apellidos+": ";
		ArrayList<Ejemplar> ejemplares = getLibrosActuales();
		
		for(Ejemplar e : ejemplares) {
			salida += e.getLibro().getTitulo() + " " + e.getCodigo()+" ";
		}
		
		return salida;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
	public void setCantidadLibros(int n) {
		this.cantidadLibros += n;
	}
	
	@Override
	public String toString() {
		return nombre + " " + apellidos;
	}
	
}
