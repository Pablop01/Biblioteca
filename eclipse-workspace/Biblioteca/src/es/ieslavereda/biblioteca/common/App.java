package es.ieslavereda.biblioteca.common;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca(); 
		
	}
	
	public void showMenu() {}
	
	public static void crearSocio(Biblioteca b,String nombre, String apellidos, String dni) {
		Persona p = new Persona(nombre,apellidos,dni);
		b.addSocio(p);
	}

	public static void crearLibro(Biblioteca b,String titulo, String autor, int isbn) {
		Libro l = new Libro(titulo,autor,isbn);
		b.addLibro(l);
	}
	
	public static void prestarEjemplar() {
	
		
	}

	public static void devolverEjemplar() {

	}
}
