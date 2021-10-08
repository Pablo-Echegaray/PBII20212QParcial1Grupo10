package ar.edu.unlam.dominio;

public class Autor extends Persona{
	private  Libro [] librosEscritos;
	private Integer contadorLibros;
	
	public Autor(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni) {
		super(nombre, nacionalidad, edad, domicilio, dni);
		
	}
	public Libro[] getLibrosEscritos() {
		return librosEscritos;
	}

	public void setLibrosEscritos(Libro[] librosEscritos) {
		this.librosEscritos = librosEscritos;
	}
	
	
	public Boolean agregarLibro(Libro librosEscrito) {
		Boolean seAgregoLibro=false;
		
		for(int i = 0; i < librosEscritos.length; i++) {
			if(librosEscritos[i] == null) {
				librosEscritos [contadorLibros++] = librosEscrito;
				seAgregoLibro=true;
				break;
			}
		}
		return seAgregoLibro;
		
	}

}
