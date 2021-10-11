package ar.edu.unlam.testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Genero;

public class testCopiaLibro {

	@Test
	public void queSePuedaModificarAtributosDeStock() {
		Autor autor = new Autor("Michael Foucault", "Francesa", 1930, "Paris", 123);
		CopiaLibro libro = new CopiaLibro("Vigilar y Castigar", Genero.ACADEMICO, 1975, autor, "Éditions Gallimard", 900.0, 2);
		
		Integer cantidadIngresadaEsperada = 2;
		Integer cantidadVendidaEsperada = 1;
		Integer cantidadParcialEsperada = 1;
		
		libro.incrementarCantidadVendida();
		
		Integer cantidadIngresada = libro.getCantidadIngresadaEnStock();
		Integer cantidadVendida = libro.getCantidadVendida();
		Integer cantidadParcial = libro.getCantidadParcialEnStock();
		
		assertEquals(cantidadIngresadaEsperada, cantidadIngresada);
		assertEquals(cantidadVendidaEsperada, cantidadVendida);
		assertEquals(cantidadParcialEsperada, cantidadParcial);
		
		//----------------------------------------------------
		
		Integer cantidadVendidaEsperada2 = 2;
	    Integer cantidadParcialEsperada2 = 0;
	    
	    libro.incrementarCantidadVendida();
	    
	    
		Integer cantidadVendida2 = libro.getCantidadVendida();
		Integer cantidadParcial2 = libro.getCantidadParcialEnStock();
		
		assertEquals(cantidadVendidaEsperada2, cantidadVendida2);
		assertEquals(cantidadParcialEsperada2, cantidadParcial2);
		
		
	}
	
	@Test
	public void queNoSePuedaModificarAtributosDeStockSiElStockParcialEsCero() {
		Autor autor = new Autor("Michael Foucault", "Francesa", 1930, "Paris", 123);
		CopiaLibro libro = new CopiaLibro("Vigilar y Castigar", Genero.ACADEMICO, 1975, autor, "Éditions Gallimard", 900.0, 2);
		
		Integer cantidadParcialEsperada = 0;
		Integer cantidadVendidaEsperada = 2;
		
		libro.incrementarCantidadVendida();
		libro.incrementarCantidadVendida();
		libro.incrementarCantidadVendida();
		
		Integer cantidadParcial = libro.getCantidadParcialEnStock();
		Integer cantidadVendida = libro.getCantidadVendida();
		
		assertEquals(cantidadParcialEsperada, cantidadParcial);
		assertEquals(cantidadVendidaEsperada, cantidadVendida);
	}


}
