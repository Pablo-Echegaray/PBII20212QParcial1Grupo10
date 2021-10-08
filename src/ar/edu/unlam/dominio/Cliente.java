package ar.edu.unlam.dominio;

public class Cliente extends Persona{

	private CopiaLibro  librosComprados[];
	private Integer variableControl;
	
	public Cliente(String nombre, String nacionalidad, String fechaDeNacimiento, String domicilio, Integer dni) {
		super(nombre, nacionalidad, fechaDeNacimiento, domicilio, dni);
		this.librosComprados= new CopiaLibro[4];
		this.variableControl=0;
		
	}
	
	public Boolean ComprarLibro (CopiaLibro libro) {
		Boolean sePuedeComprarLibro=false;
		
		for (int i = 0; i < librosComprados.length; i++) {
			if (librosComprados[i]==null) {
				librosComprados[variableControl++]=libro;
				sePuedeComprarLibro=true;
				break;
				
			}
		}
		return sePuedeComprarLibro;
		
	}
	public CopiaLibro[] getLibrosComprados() {
		return getLibrosComprados();
	}
	

	public void setLibrosComprados(CopiaLibro[] librosComprados) {
		this.librosComprados = librosComprados;
	}
	
}
