package ar.edu.unlam.dominio;

public class Autor extends Persona{
	private  CopiaLibro [] librosEscritos;
	private Integer contadorLibros;
	
	public Autor(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni) {
		super(nombre, nacionalidad, edad, domicilio, dni);
		
	}
	public CopiaLibro[] getLibrosEscritos() {
		return librosEscritos;
	}

	public void setLibrosEscritos(CopiaLibro[] librosEscritos) {
		this.librosEscritos = librosEscritos;
	}
	
	
	public Boolean agregarLibro(CopiaLibro librosEscrito) {
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
	@Override
	public String toString() {
		return "Autor " + getNombre() + " de nacionalidad " + getNacionalidad() + ",tiene "
				+ getEdad() +" años "+ ", su domicilio es " + getDomicilio() + ", y su dni es " + getDni();
				
	}

}
