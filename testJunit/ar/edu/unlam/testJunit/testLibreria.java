package ar.edu.unlam.testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Genero;
import ar.edu.unlam.dominio.Libreria;
import ar.edu.unlam.dominio.Socio;

public class testLibreria {

	@Test
	public void queSePuedaAgregarUnaCopiaLibro() {
		Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
		Autor antoine = new Autor ("Antonie", "Francesa", 98, "Torre Eifel 520", 20132);
		CopiaLibro elPrincipito = new CopiaLibro("El Principito", Genero.CUENTOS, 2000, antoine, "Planeta", 850.34, 2);
		
		Boolean seAgrega = elAteneo.agregarCopiaLibro(elPrincipito);
		Boolean seAgregoExitosamente = true;
		
		assertEquals(seAgregoExitosamente, seAgrega);
		
	}
	
	//@Test
	public void queNoSePuedaAgregarUnLibroRepetido() {
		Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
		Autor antoine = new Autor ("Antonie", "Francesa", 98, "Torre Eifel 520", 20132);
		Autor hernandez = new Autor("Jose Hernandez", "Argentino", 1900, "Buenos Aires", 123);
		CopiaLibro elPrincipito = new CopiaLibro("El Principito", Genero.CUENTOS, 2000, antoine, "Planeta", 850.34, 2);
		CopiaLibro martinFierro = new CopiaLibro("Martin Fierro", Genero.CUENTOS, 1900, hernandez, "Editorial", 900.0, 3);
		Boolean seAgrega = elAteneo.agregarCopiaLibro(elPrincipito);
		Boolean noSeAgrega = elAteneo.agregarCopiaLibro(elPrincipito);
		Boolean seAgregaOtroLibro = elAteneo.agregarCopiaLibro(martinFierro);
		Boolean noSePudoAgregar = false;
		Boolean seAgregoExitosamente = true;
		
		assertEquals(noSeAgrega, noSePudoAgregar);
		assertEquals(seAgregoExitosamente, seAgregaOtroLibro);
	}
	
   // @Test
	public void queSePuedaVenderUnaCopiaLibro(){
    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
    	Autor antoine = new Autor ("Antonie", "Francesa", 98, "Torre Eifel 520", 20132);
    	CopiaLibro elPrincipito = new CopiaLibro("El Principito", Genero.CUENTOS, 2000, antoine, "Planeta", 850.34,2);
    	
    	Boolean seAgrego = elAteneo.agregarCopiaLibro(elPrincipito);
    	Boolean seIntentaVender = elAteneo.venderLibro(elPrincipito);
    	Boolean seIntentaVender2 = elAteneo.venderLibro(elPrincipito);
    	Boolean sePudoVenderExitosamente = true;
    	
    	assertEquals(seIntentaVender, sePudoVenderExitosamente);
    	assertEquals(sePudoVenderExitosamente, seIntentaVender2);
    	
    }
    
   // @Test
	public void queSiLaCantidadParcialEnStockEsCeroSeElimineDelArrayLibrosEnStock() {
    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
    	Autor autor = new Autor("Michael Foucault", "Francesa", 1930, "Paris", 123);
		CopiaLibro libro = new CopiaLibro("Vigilar y Castigar", Genero.ACADEMICO, 1975, autor, "Éditions Gallimard", 900.0, 2);
		
		Integer posicionesNullEsperadas = 10;
		Integer posicionesNull = 0;
		elAteneo.agregarCopiaLibro(libro);
		elAteneo.venderLibro(libro);
		elAteneo.venderLibro(libro);
		CopiaLibro [] librosEnStock = elAteneo.getLibrosEnStock();
		
		
		for(int i=0; i< librosEnStock.length; i++) {
			if(librosEnStock[i] == null) {
				posicionesNull++;
			}
		}
		
		assertEquals(posicionesNullEsperadas, posicionesNull);
    }
    
    
    //@Test
    public void queSePuedaAgregarUnSocio() {
    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
    	Socio pablo = new Socio ("Pablo", "Uruguayo", 20, "Jonte 502", 5615, 26540, elAteneo);
    	
    	Boolean seIntentaAgregar = elAteneo.agregarUnSocio(pablo);
    	Boolean seAgrego =	true;
    	Boolean seIntentaAgregar2 = elAteneo.agregarUnSocio(pablo);
    	Boolean seAgrego2 = false;
    	
    	assertEquals(seAgrego, seIntentaAgregar);
    	assertFalse(seIntentaAgregar2);
    }
    
    //@Test
    public void queSePuedaDarDeBaja() {
    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
    	Socio pablo = new Socio ("Pablo", "Uruguayo", 20, "Jonte 502", 5615, 26540, elAteneo);
    	
    	Boolean seIntentaAgregar = elAteneo.agregarUnSocio(pablo);
    	Boolean seIntentaDarDeBaja = elAteneo.darDeBajaSocio(pablo);
    	Boolean seDioDeBaja = true;
    	
    	assertEquals(seIntentaDarDeBaja, seDioDeBaja);
    }

}
