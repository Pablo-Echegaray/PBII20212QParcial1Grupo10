package ar.edu.unlam.dominio;

import java.util.Objects;

public abstract class Libro {
	private String titulo;
	private Genero genero;
	private Integer anioEdicion;
	private Autor autor;
	private String editorial;
	private Double precio;

	public Libro(String titulo, Genero genero, Integer anioEdicion, Autor autor, String editorial, Double precio) {
		this.titulo = titulo;
		this.genero = genero;
		this.anioEdicion = anioEdicion;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;

	}
	
	protected abstract void actualizarCantidadParcialLibrosEnStock();

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
	
	public Double getPrecio() {
		return this.precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anioEdicion, autor, editorial, genero, precio, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(anioEdicion, other.anioEdicion) && Objects.equals(autor, other.autor)
				&& Objects.equals(editorial, other.editorial) && genero == other.genero
				&& Objects.equals(precio, other.precio) && Objects.equals(titulo, other.titulo);
	}
	


}
