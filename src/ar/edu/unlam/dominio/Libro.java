package ar.edu.unlam.dominio;

public abstract class Libro {
	private String titulo;
	private Genero genero;
	private Integer anioEdicion;
	private Autor autor;
	private String editorial;

	public Libro(String titulo, Genero genero, Integer anioEdicion, Autor autor, String editorial) {
		this.titulo = titulo;
		this.genero = genero;
		this.anioEdicion = anioEdicion;
		this.autor = autor;
		this.editorial = editorial;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(Integer anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

}
