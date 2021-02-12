package es.ieslavereda.biblioteca.common;

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
	
	public static void prestarEjemplar(Libro l, Persona p) {
		l.prestarEjemplar(p);
	}

	public static void devolverEjemplar(Libro l, Persona p) {
		l.devolverEjemplar(p);
	}
}
