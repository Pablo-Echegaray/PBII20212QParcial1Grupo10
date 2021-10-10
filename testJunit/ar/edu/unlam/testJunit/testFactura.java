package ar.edu.unlam.testJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Estudiante;
import ar.edu.unlam.dominio.Factura;
import ar.edu.unlam.dominio.Genero;
import ar.edu.unlam.dominio.Jubilado;
import ar.edu.unlam.dominio.Libreria;
import ar.edu.unlam.dominio.Socio;
import ar.edu.unlam.dominio.Universidades;

public class testFactura {

	@Test
	public void testCalcularDescuentoEnFactura() {
		// 1- Preparacion:
		// 1a- Datos de entrada
		Libreria elAteneo = new Libreria("El Ateneo", "Suipacha 655");
		Estudiante estudiante = new Estudiante("Pablo", "Argentina", 26, "Monte Grande", 123, elAteneo, 1244,
				Universidades.UNLAM);
		Jubilado jubilado = new Jubilado("Anastasio", "Brasil", 93, "Moron", 111, elAteneo);
		Socio socio = new Socio("Franco", "Uruguay", 35, "Lomas de Zamora", 122, 98544, elAteneo);
		Cliente cliente = new Cliente("Pedro", "Argentina", 31, "San Justo", 133, elAteneo);
		Factura facturaEst = new Factura(estudiante);
		Factura facturaJub = new Factura(jubilado);
		Factura facturaSocio = new Factura(socio);
		Factura facturaCliente = new Factura(cliente);
		// -------------------------------------------
		// 1b- Valores esperados

		final Double DESCUENTO_ESTUDIANTE = 5.0;
		final Double DESCUENTO_JUBILADO = 10.0;
		final Double DESCUENTO_SOCIO = 15.0;
		final Double DESCUENTO_CLIENTE = 0.0;
		// ------------------------------------------
		// Ejecucion

		Double descEstudiante = facturaEst.validarDescuento();
		Double descJubilado = facturaJub.validarDescuento();
		Double descSocio = facturaSocio.validarDescuento();
		Double descCliente = facturaCliente.validarDescuento();
		// ------------------------------------------
		// Validacion
		assertEquals(DESCUENTO_ESTUDIANTE, descEstudiante);
		assertEquals(DESCUENTO_JUBILADO, descJubilado);
		assertEquals(DESCUENTO_SOCIO, descSocio);
		assertEquals(DESCUENTO_CLIENTE, descCliente);

	}

	@Test
	public void queSePuedaCobrarLoQueCorresponde() {
		Libreria elAteneo = new Libreria("El Ateneo", "Suipacha 655");
		Estudiante estudiante = new Estudiante("Pablo", "Argentina", 26, "Monte Grande", 123, elAteneo, 1244,
				Universidades.UNLAM);
		Jubilado jubilado = new Jubilado("Anastasio", "Brasil", 93, "Moron", 111, elAteneo);
		Socio socio = new Socio("Franco", "Uruguay", 35, "Lomas de Zamora", 122, 98544, elAteneo);
		Cliente cliente = new Cliente("Pedro", "Argentina", 31, "San Justo", 133, elAteneo);
		Autor autor = new Autor("Antonie", "Francesa", 98, "Torre Eifel 520", 20132);
		CopiaLibro elPrincipito = new CopiaLibro("El Principito", Genero.CUENTOS, 2000, autor, "Planeta", 850.0, 10);
		CopiaLibro libro = new CopiaLibro("Otro Libro", Genero.CIENCIA_FICCION, 1700, autor, "Editorial", 200.0, 10);
		Double vueltoEstudiante = 782.0;
		Double vueltoJubilado = 278.0;
		Double vueltoSocio = 76.0;
		Double vueltoCliente = 471.0;
		estudiante.comprarLibro(libro);
		estudiante.comprarLibro(elPrincipito);
		jubilado.comprarLibro(libro);
		socio.comprarLibro(libro);
		socio.comprarLibro(libro);
		cliente.comprarLibro(elPrincipito);

		Factura facturaEst = new Factura(estudiante);
		Factura facturaJub = new Factura(jubilado);
		Factura facturaSocio = new Factura(socio);
		Factura facturaCliente = new Factura(cliente);

		Double pagoEst = facturaEst.cobrar(2000.0);
		Double pagoJub = facturaJub.cobrar(500.0);
		Double pagoSoc = facturaSocio.cobrar(500.0);
		Double pagoCli = facturaCliente.cobrar(1500.0);

		assertEquals(vueltoEstudiante, pagoEst);
		assertEquals(vueltoJubilado, pagoJub);
		assertEquals(vueltoSocio, pagoSoc);
		assertEquals(vueltoCliente, pagoCli);

	}

}
