package ar.edu.unlam.testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.Estudiante;
import ar.edu.unlam.dominio.Factura;
import ar.edu.unlam.dominio.Jubilado;
import ar.edu.unlam.dominio.Socio;



public class testLibreria {

	@Test
	public void testCalcularDescuentoEnFactura() {
		// 1- Preparacion:
		// 1a- Datos de entrada
		
		Estudiante estudiante = new Estudiante("Pablo", "Argentina", "26", "Monte Grande", 123);
		Jubilado jubilado = new Jubilado("Anastasio", "Brasil", "93", "Moron", 111);
		Socio socio = new Socio("Franco", "Uruguay", "35", "Lomas de Zamora", 122);
		Cliente cliente = new Cliente("Pedro", "Argentina", "31", "San Justo", 133);
		Factura facturaEst = new Factura(estudiante); 
		Factura facturaJub = new Factura(jubilado); 
		Factura facturaSocio = new Factura(socio); 
		Factura facturaCliente = new Factura(cliente); 
		//-------------------------------------------
		// 1b- Valores esperados
		
		final Double DESCUENTO_ESTUDIANTE= 5.0;
		final Double DESCUENTO_JUBILADO= 10.0;
		final Double DESCUENTO_SOCIO= 15.0;
		final Double DESCUENTO_CLIENTE= 0.0;
		//------------------------------------------
		// Ejecucion
		
		Double descEstudiante= facturaEst.calcularDescuento();
		Double descJubilado=facturaJub.calcularDescuento();
		Double descSocio=facturaSocio.calcularDescuento();
		Double descCliente= facturaCliente.calcularDescuento();
		//------------------------------------------
		// Validacion
		assertEquals(DESCUENTO_ESTUDIANTE, descEstudiante);
		assertEquals(DESCUENTO_JUBILADO, descJubilado);
		assertEquals(DESCUENTO_SOCIO, descSocio);
		assertEquals(DESCUENTO_CLIENTE, descCliente);
			
	}

}
