package ar.edu.unlam.dominio;

public abstract class Persona {
	private String nombre;
	private String nacionalidad;
	private String fechaDeNacimiento;
	private String domicilio;
	private Integer dni;
	
	private int contador;
	
	public Persona(String nombre, String nacionalidad, String fechaDeNacimiento, String domicilio, Integer dni) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fechaDeNacimiento = fechaDeNacimiento;
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


	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
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
	
	
	
	
	
}
