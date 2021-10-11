package ar.edu.unlam.dominio;

import java.util.Objects;

public class Jubilado extends Cliente {

	private Integer numeroCarnetJubilado;
	
	public Jubilado(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni,
			Libreria libreria, Integer numeroCarnetJubilado) {
		super(nombre, nacionalidad, edad, domicilio, dni, libreria);
		
		this.numeroCarnetJubilado= numeroCarnetJubilado;

	}

	public Integer getNumeroCarnetJubilado() {
		return numeroCarnetJubilado;
	}

	public void setNumeroCarnetJubilado(Integer numeroCarnetJubilado) {
		this.numeroCarnetJubilado = numeroCarnetJubilado;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroCarnetJubilado);
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
		Jubilado other = (Jubilado) obj;
		return Objects.equals(numeroCarnetJubilado, other.numeroCarnetJubilado);
	}
	
	

}
