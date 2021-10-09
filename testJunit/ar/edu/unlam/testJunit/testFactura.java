package ar.edu.unlam.testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.Estudiante;
import ar.edu.unlam.dominio.Factura;
import ar.edu.unlam.dominio.Jubilado;
import ar.edu.unlam.dominio.Libreria;
import ar.edu.unlam.dominio.Socio;
import ar.edu.unlam.dominio.Universidades;



public class testFactura {

	@Test
	public void testCalcularDescuentoEnFactura() {
		// 1- Preparacion:
		// 1a- Datos de entrada
		Libreria elAteneo= new Libreria("El Ateneo", "Suipacha 655");
		Estudiante estudiante = new Estudiante("Pablo", "Argentina", 26, "Monte Grande", 123, 1244,Universidades.UNLAM);
		Jubilado jubilado = new Jubilado("Anastasio", "Brasil", 93, "Moron", 111);
		Socio socio = new Socio("Franco", "Uruguay", 35, "Lomas de Zamora", 122, 98544, elAteneo );
		Cliente cliente = new Cliente("Pedro", "Argentina", 31, "San Justo", 133);
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
		
		Double descEstudiante= facturaEst.validarDescuento();
		Double descJubilado=facturaJub.validarDescuento();
		Double descSocio=facturaSocio.validarDescuento();
		Double descCliente= facturaCliente.validarDescuento();
		//------------------------------------------
		// Validacion
		assertEquals(DESCUENTO_ESTUDIANTE, descEstudiante);
		assertEquals(DESCUENTO_JUBILADO, descJubilado);
		assertEquals(DESCUENTO_SOCIO, descSocio);
		assertEquals(DESCUENTO_CLIENTE, descCliente);
			
	}

}
