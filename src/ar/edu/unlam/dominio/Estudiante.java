package ar.edu.unlam.dominio;

import java.util.Objects;

public class Estudiante extends Cliente {

	private Integer numeroLibretaEstudiante;
	private Universidades universidadConBeneficio;

	public Estudiante(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni,
			Libreria libreria, Integer numeroLibretaEstudiante, Universidades universidadConBeneficio) {
		super(nombre, nacionalidad, edad, domicilio, dni, libreria);

		this.numeroLibretaEstudiante = numeroLibretaEstudiante;
		this.universidadConBeneficio = universidadConBeneficio;

	}

	public Integer getNumeroLibretaEstudiante() {
		return numeroLibretaEstudiante;
	}

	public void setNumeroLibretaEstudiante(Integer numeroLibretaEstudiante) {
		this.numeroLibretaEstudiante = numeroLibretaEstudiante;
	}

	public Universidades getUniversidadConBeneficio() {
		return universidadConBeneficio;
	}

	public void setUniversidadConBeneficio(Universidades universidadConBeneficio) {
		this.universidadConBeneficio = universidadConBeneficio;
	}

	@Override
	public String toString() {
		return "Estudiante [numeroLibretaEstudiante=" + numeroLibretaEstudiante + ", universidadConBeneficio="
				+ universidadConBeneficio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroLibretaEstudiante, universidadConBeneficio);
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
		Estudiante other = (Estudiante) obj;
		return Objects.equals(numeroLibretaEstudiante, other.numeroLibretaEstudiante)
				&& universidadConBeneficio == other.universidadConBeneficio;
	}

}
