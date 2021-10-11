package ar.edu.unlam.dominio;

import java.util.Objects;

public class Socio extends Cliente {

	private static Integer numeroSocio=0;
	private Integer nroSocio=0;

	public Socio(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni,
			Libreria libreria) {
		super(nombre, nacionalidad, edad, domicilio, dni, libreria);

		numeroSocio++;
		this.nroSocio=numeroSocio;

	}

	public Boolean darseDeBaja(Socio socio) {
		Boolean aceptarBajaSocio = false;
		Socio copiaListadoDeSocio[] = super.getLibreria().getListadoDeSocios();
		for (int i = 0; i < copiaListadoDeSocio.length; i++) {
			if (copiaListadoDeSocio[i] != null) {
				if (copiaListadoDeSocio[i].equals(socio)) {

				}

			}
		}

		return aceptarBajaSocio;

	}

	
	public  Integer getNumeroSocio() {
		return nroSocio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroSocio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(numeroSocio, other.numeroSocio);
	}

}
