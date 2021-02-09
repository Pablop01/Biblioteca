package es.ieslavereda.biblioteca.common;

public class Ejemplar {

	private Persona aQuien;
	private int codigo;
	private Libro l;

	public Ejemplar(Libro l, int codigo) {
		this.l = l;
		this.codigo = codigo;
	}

	public void prestarEjemplar(Libro l, Persona p) {

		if (p.esSocio()) {
			if (p.getCantidadLibros() < 3) {

				l.setDisponibles(l.getDisponibles() - 1);
				this.aQuien = p;
				p.setCantidadLibros(1);
				p.getLibrosActuales().add(this);

			} else {
				System.out.println("No puedes sacar mas de 3 libros");
			}
		} else {
			System.out.println("No eres socio");
		}

	}

	public Persona getaQuien() {
		return aQuien;
	}
	
	public Libro getLibro() {
		return l;
	}

	public int getCodigo() {
		return codigo;
	}
	
	@Override
	public String toString() {
		
		if(aQuien!=null) {
			return l.getTitulo() + " " + codigo + " Lo tiene " + aQuien;
		}else {
			return l.getTitulo() + " " + codigo + " esta disponible";
		}	
	}

}
