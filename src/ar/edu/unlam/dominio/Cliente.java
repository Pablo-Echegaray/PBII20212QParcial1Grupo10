package ar.edu.unlam.dominio;

public class Cliente extends Persona {

	private CopiaLibro librosComprados[];
	private Integer variableControl;
	private Libreria libreria;

	public Cliente(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni, Libreria libreria) {
		super(nombre, nacionalidad, edad, domicilio, dni);
		this.librosComprados = new CopiaLibro[4];
		this.variableControl = 0;
		this.libreria = libreria;

	}

	
	
				


	public Boolean comprarLibro(CopiaLibro libro) {
		Boolean sePuedeComprarLibro = false;

		if (chequearLibroEnStock(libro)) {
			for (int i = 0; i < librosComprados.length; i++) {
				if (librosComprados[i] == null) {
					librosComprados[variableControl++] = libro;
					this.libreria.venderLibro(libro);
					sePuedeComprarLibro = true;
					break;

				}

			}
		}
		return sePuedeComprarLibro;

	}

	private Boolean chequearLibroEnStock(CopiaLibro libro) {
		CopiaLibro[] librosEnStock = libreria.getLibrosEnStock();
		Boolean seEncuentraEnStock = false;
		for (int i = 0; i < librosEnStock.length; i++) {
			if (librosEnStock[i] != null) {
				if (librosEnStock[i].equals(libro)) {
					seEncuentraEnStock = true;
					break;
				}
			}
		}
		return seEncuentraEnStock;
	}

	public CopiaLibro[] getLibrosComprados() {
		return this.librosComprados;
	}

	public Libreria getLibreria() {
		return this.libreria;
	}

	public void setLibrosComprados(CopiaLibro[] librosComprados) {
		this.librosComprados = librosComprados;
	}

}
