package ar.edu.unlam.dominio;

import java.util.Objects;

public abstract class Persona {
	private String nombre;
	private String nacionalidad;
	private Integer edad;
	private String domicilio;
	private Integer dni;
	
	
	public Persona(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni) {
		
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.domicilio = domicilio;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni, domicilio, edad, nacionalidad, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(domicilio, other.domicilio)
				&& Objects.equals(edad, other.edad) && Objects.equals(nacionalidad, other.nacionalidad)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
}
