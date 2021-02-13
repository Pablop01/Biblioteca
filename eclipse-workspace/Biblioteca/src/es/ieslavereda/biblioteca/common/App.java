package es.ieslavereda.biblioteca.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca(); 
		
		do {	
			showMenu();
			seleccionarOpcion(b);
			}while(true);
	}
	
	public static void showMenu() {
		
		System.out.println("	╔═══════════════════════════════════════════════╗");
		System.out.println("	║						║");
		System.out.println("	║	Biblioteca Municipal de La Pobla    	║");
		System.out.println("	║						║");
		System.out.println("	║	1. Dar de alta nuevo socio		║");
		System.out.println("	║	2. Añadir nuevo libro			║");
		System.out.println("	║	3. Prestar ejemplar			║");
		System.out.println("	║	4. Devolver ejemplar			║");
		System.out.println("	║	5. Ver ejemplares de un libro		║");
		System.out.println("	║	6. Libros que tiene un socio		║");
		System.out.println("	║	7. Lista de socios			║");
		System.out.println("	║	8. Lista de libros			║");
		System.out.println("	║						║");
		System.out.println("	║	Elige una opción		   	║");
		System.out.println("	║						║");
		System.out.println("	╚═══════════════════════════════════════════════╝");
		System.out.println();
		
	}
	
	public static void seleccionarOpcion(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = sc.nextInt();
		
		switch(opcion) {
		
			case 1:
				crearSocio(b);
				break;
			case 2:
				crearLibro(b);
				break;
			case 3:
				prestarEjemplar(b);
				break;
			case 4:
				devolverEjemplar(b);
				break;
			case 5:
				mostrarEjemplares(b);
				break;
			case 6:
				mostrarLibrosSocio(b);
				break;
			case 7:
				System.out.println("Elige como deseas ordenarlos");
				System.out.println("1. Por nombre");
				System.out.println("2. Por cantidad de libros prestados");
				System.out.println();
				mostrarSocios(b);
				break;
			case 8:
				System.out.println("Elige como deseas ordenarlos");
				System.out.println("1. Por titulo");
				System.out.println("2. Por autor");
				System.out.println("2. Por cantidad de ejemplares");
				System.out.println();
				mostrarLibros(b);
				break;
			default:
				System.out.println("Elige una opción valida");
				seleccionarOpcion(b);
			
		}
		
		
	}
	
	public static void crearSocio(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce los apellidos");
		String apellidos = sc.nextLine();
		System.out.println("Introduce el DNI");
		String dni = sc.nextLine();
		
		Persona p = new Persona(nombre,apellidos,dni);
		b.addSocio(p);
	}

	public static void crearLibro(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el titulo");
		String titulo = sc.nextLine();
		System.out.println("Introduce el autor");
		String autor = sc.nextLine();
		System.out.println("Introduce el ISBN");
		int isbn = sc.nextInt();
		
		Libro l = new Libro(titulo,autor,isbn);
		b.addLibro(l);
	}
	
	public static void prestarEjemplar(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el DNI de la persona");
		String dni = sc.nextLine();
		System.out.println("Introduce el ISBN del libro");
		int isbn = sc.nextInt();
		
		Persona p = b.buscarDNI(dni);
		Libro l = b.buscarIsbn(isbn);
		
		l.prestarEjemplar(p);

	}

	public static void devolverEjemplar(Biblioteca b) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el DNI de la persona");
		String dni = sc.nextLine();
		System.out.println("Introduce el ISBN del libro");
		int isbn = sc.nextInt();
		
		Persona p = b.buscarDNI(dni);
		Libro l = b.buscarIsbn(isbn);
		
		l.devolverEjemplar(p);
		
	}
	
	public static void mostrarEjemplares(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el ISBN del libro");
		
		int isbn = sc.nextInt();
		Libro l = b.buscarIsbn(isbn);
		
		System.out.println(l.getEjemplares());
		
	}
	
	public static void mostrarLibrosSocio(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el ISBN del libro");
		
		String dni = sc.nextLine();
		Persona p = b.buscarDNI(dni);
		
		System.out.println(p.getLibrosActuales());
		
	}
	
	public static void mostrarSocios(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Persona> listaSocios = b.getListaSocios();
		
		int opcion = sc.nextInt();
		
		switch(opcion) {
		
			case 1:
				Collections.sort(listaSocios, new NombreComparator());
				System.out.println(listaSocios);
				break;
			case 2:
				Collections.sort(listaSocios, new PrestadosComparator());
				System.out.println(listaSocios);
				break;
			default:
				System.out.println("Introduce una opcion valida");
				mostrarSocios(b);
				
		}	
		
	}
	
	public static void mostrarLibros(Biblioteca b) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> listaLibros = b.getListaLibros();
		
		int opcion = sc.nextInt();
		
		switch(opcion) {
		
			case 1:
				Collections.sort(listaLibros, new TituloComparator());
				System.out.println(listaLibros);
				break;
			case 2:
				Collections.sort(listaLibros, new AutorComparator());
				System.out.println(listaLibros);
				break;
			case 3:
				Collections.sort(listaLibros, new CantidadComparator());
				System.out.println(listaLibros);
				break;	
			default:
				System.out.println("Introduce una opcion valida");
				mostrarSocios(b);
		
		}
	}	
}
