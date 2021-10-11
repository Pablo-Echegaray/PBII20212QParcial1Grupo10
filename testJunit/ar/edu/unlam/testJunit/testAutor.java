package ar.edu.unlam.testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Genero;

public class testAutor {

	@Test
	public void queSePuedaAgregarAutor() {
		Autor autor1=new Autor("Jorge Luis Borges", "Argentino",86,"Cementerio de los reyes",14061986);
		Autor autor2=new Autor("Gabriel García Márquez","Colombiano",87,"Cementerio Cartagena de Indias",17042017);
		Autor autor3=new Autor("Julio Cortazar","Argentino",69,"Cementerio de Montparnasse",12021984);
		Autor autor4=new Autor("Ernesto Sabato","Argentino",99,"Cementerio Santos Lugares",30042011);
		Autor autor5=new Autor("Antoine de Saint-Exupery","Francesa",44,"Cementerio Mediterraneo",31071944);
		
	//
		Boolean sePudoAgregarAutor=true;
		assertNotNull(autor1);
		assertNotNull(autor2);
		assertNotNull(autor3);
		assertNotNull(autor4);
		assertNotNull(autor5);
	
	}
	
	public void queSePuedaAgregarUnLibroPorAutor() {
		Autor autor1=new Autor("Jorge Luis Borges", "Argentino",86,"Cementerio de los reyes",14061986);
		
		CopiaLibro ficciones= new CopiaLibro("Ficciones",Genero.NOVELA,1985,autor1,"editorial",30000.0, null);
		
		Boolean seIntentaAgregar=autor1.agregarLibro(ficciones);
		Boolean sePudoAgregar=true;

		assertEquals(sePudoAgregar,seIntentaAgregar);
	}
}