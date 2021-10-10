package ar.edu.unlam.testJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Genero;

public class testCliente {

	@Test
	public void queSePuedaComprarUnLibro() {

		Cliente cliente = new Cliente("Pedro", "Brasilera", 38, "Carabobo1517", 28578451);
		Autor autorElPrincipito = new Autor("Antoine de Saint-Exupéry", "francesa", 87, "Torre Eiffel38", 1117985);
		CopiaLibro copiaElPrincipito = new CopiaLibro("El Principito", Genero.CUENTOS, 2017, autorElPrincipito,"Planeta", 850.38,2);

		Boolean compraExitosa = true;

		Boolean sePuedoComprarLibro = cliente.comprarLibro(copiaElPrincipito);

		assertEquals(compraExitosa, sePuedoComprarLibro);

	}

}
