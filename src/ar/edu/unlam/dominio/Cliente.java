package ar.edu.unlam.dominio;

public class Cliente extends Persona {

	private CopiaLibro librosComprados[];
	private Integer variableControl;

	public Cliente(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni) {
		super(nombre, nacionalidad, edad, domicilio, dni);
		this.librosComprados = new CopiaLibro[4];
		this.variableControl = 0;

	}

	public Boolean comprarLibro(CopiaLibro libro) {
		Boolean sePuedeComprarLibro = false;

		for (int i = 0; i < librosComprados.length; i++) {
			if (librosComprados[i] == null) {
				librosComprados[variableControl++] = libro;
				sePuedeComprarLibro = true;
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
