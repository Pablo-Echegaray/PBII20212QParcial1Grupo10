package ar.edu.unlam.dominio;

import java.util.Arrays;
import java.util.Objects;

public class Socio extends Cliente{

	private Integer numeroSocio;
	private Libreria libreria;
	
	public Socio(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni, Integer numeroSocio, Libreria libreria) {
		super(nombre, nacionalidad, edad, domicilio, dni);
	 
		this.numeroSocio=numeroSocio;
		this.libreria=libreria;
	}
	
	public Boolean darseDeBaja(Socio socio) {
		Boolean aceptarBajaSocio=false;
		Socio copiaListadoDeSocio[]= libreria.getListadoDeSocios();
		for (int i = 0; i < copiaListadoDeSocio.length; i++) {
			if (copiaListadoDeSocio[i]!=null) {
				if (copiaListadoDeSocio[i].equals(socio)) {
					
				}
				
				
				
			}
		}
		
		return aceptarBajaSocio;
		
	}

	public Integer getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(Integer numeroSocio) {
		this.numeroSocio = numeroSocio;
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
