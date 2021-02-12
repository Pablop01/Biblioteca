package es.ieslavereda.biblioteca.test;

import es.ieslavereda.biblioteca.common.*;
public class Test {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca();
		
		Libro l = new Libro("El quijote","Yo",12564346);
		Libro l2 = new Libro("Harry Potter","Yo",12564346);
		Libro l3 = new Libro("Tirant lo blanc","Yo",12564346);
		Libro l4 = new Libro("Mar adentro","Yo",12564346);
		
		Persona p = new Persona("Pablo","Perea","1242345R");
		Persona p2 = new Persona("Raul","Nan","2345673456G");
		Persona p3 = new Persona("Dani","Ibanyez","643643345S");
		
		l.addEjemplar(6);
		l2.addEjemplar(6);
		l3.addEjemplar(6);
		l4.addEjemplar(6);
		
		l.prestarEjemplar(p);
		l2.prestarEjemplar(p);
		l3.prestarEjemplar(p);
//		l4.prestarEjemplar(p);
		
		l.prestarEjemplar(p2);
		l.prestarEjemplar(p3);
		
		System.out.println(l);
		
		l.devolverEjemplar(p);
		l.devolverEjemplar(p3);
		System.out.println(l);
//		System.out.println(l2);
//		System.out.println(l3);
//		System.out.println(l4);
		System.out.println();
		System.out.println(p.imprimirLibros());
//		System.out.println(p2.imprimirLibros());
//		System.out.println(p3.imprimirLibros());
		
	}

}
