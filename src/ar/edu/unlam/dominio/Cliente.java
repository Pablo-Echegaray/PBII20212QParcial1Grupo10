package ar.edu.unlam.dominio;

public class Cliente extends Persona{

	private CopiaLibro  librosComprados[];
	
	public Cliente(String nombre, String nacionalidad, String fechaDeNacimiento, String domicilio, Integer dni) {
		super(nombre, nacionalidad, fechaDeNacimiento, domicilio, dni);
		
	}
	
	public void ComprarLibro() {
		
	}
}
