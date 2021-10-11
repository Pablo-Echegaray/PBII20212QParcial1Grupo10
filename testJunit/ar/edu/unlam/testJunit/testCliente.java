package ar.edu.unlam.testJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Genero;
import ar.edu.unlam.dominio.Libreria;

public class testCliente {

	@Test
	public void queSePuedaComprarUnLibro() {


		Libreria libreria = new Libreria("El Ateneo", "CABA");
		Cliente cliente = new Cliente("Pedro", "Brasilera", 38, "Carabobo1517", 28578451, libreria);
		Autor autorElPrincipito = new Autor("Antoine de Saint-Exupéry", "francesa", 87, "Torre Eiffel38", 1117985);

		CopiaLibro copiaElPrincipito = new CopiaLibro("El Principito", Genero.CUENTOS, 2017, autorElPrincipito,
				"Planeta", 850.38, 2);
		libreria.agregarCopiaLibro(copiaElPrincipito);
		Boolean compraExitosa = true;
		Integer cantidadComprada = 1;
		Boolean sePuedoComprarLibro = cliente.comprarLibro(copiaElPrincipito);
		Integer cantidadVendida = copiaElPrincipito.getCantidadVendida();


		assertEquals(compraExitosa, sePuedoComprarLibro);
		assertEquals(cantidadComprada, cantidadVendida);

	}

}
