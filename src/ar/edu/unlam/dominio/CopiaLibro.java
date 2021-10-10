package ar.edu.unlam.dominio;

public class CopiaLibro extends Libro {

	public CopiaLibro(String titulo, Genero genero, Integer anioEdicion, Autor autor, String editorial, Double precio) {
		super(titulo, genero, anioEdicion, autor, editorial, precio);
	}

	@Override
	public String toString() {
		return "CopiaLibro [getTitulo()=" + getTitulo() + ", getGenero()=" + getGenero() + ", getAnioEdicion()="
				+ getAnioEdicion() + ", getAutor()=" + getAutor() + ", getEditorial()=" + getEditorial()
				+ ", getPrecio()=" + getPrecio() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
