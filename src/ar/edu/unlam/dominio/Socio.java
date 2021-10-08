package ar.edu.unlam.dominio;

import java.util.Objects;

public class Socio extends Cliente{

	private Integer numeroSocio=0;
	private Libreria elAteneo;
	
	public Socio(String nombre, String nacionalidad, String edad, String domicilio, Integer dni, Integer numeroSocio, Libreria elAteneo) {
		super(nombre, nacionalidad, edad, domicilio, dni);
	 
		this.numeroSocio=numeroSocio;
		this.elAteneo=elAteneo;
	}
	
	public Boolean darseDeBaja(Socio socio) {
		Boolean aceptarBajaSocio=false;
		Socio copiaListadoDeSocio[]= elAteneo.getListadoDeSocios();
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
