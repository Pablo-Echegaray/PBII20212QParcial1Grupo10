package ar.edu.unlam.dominio;

public class Estudiante extends Cliente{
	
	private Integer numeroLibretaEstudiante;
	private Universidades universidadConBeneficio;
	

	public Estudiante(String nombre, String nacionalidad, Integer edad, String domicilio, Integer dni, Integer numeroLibretaEstudiante, Universidades universidadConBeneficio) {
		super(nombre, nacionalidad, edad, domicilio, dni);
		
		this.numeroLibretaEstudiante= numeroLibretaEstudiante;
		this.universidadConBeneficio= universidadConBeneficio;
		
	
	}
	
	

}
