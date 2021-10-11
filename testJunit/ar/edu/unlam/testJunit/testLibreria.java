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
		
		Boolean seAgrego = elAteneo.agregarCopiaLibro(elPrincipito);
		Boolean seAgregoExitosamente = true;
		
		assertEquals(seAgregoExitosamente, seAgrego);
		
	}
	
    @Test
	public void queSePuedaVenderUnaCopiaLibro(){
    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
    	Autor antoine = new Autor ("Antonie", "Francesa", 98, "Torre Eifel 520", 20132);
    	CopiaLibro elPrincipito = new CopiaLibro("El Principito", Genero.CUENTOS, 2000, antoine, "Planeta", 850.34, null);
    	
    	Boolean seAgrego = elAteneo.agregarCopiaLibro(elPrincipito);
    	Boolean seIntentaVender = elAteneo.vender(elPrincipito);
    	Boolean sePudoVenderExitosamente = true;
    	
    	assertEquals(seIntentaVender, sePudoVenderExitosamente);
    	
    }
    
    @Test
    public void queSePuedaAgregarUnSocio() {
    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
    	Socio pablo = new Socio ("Pablo", "Uruguayo", 20, "Jonte 502", 5615, 26540);
    	
    	Boolean seIntentaAgregar = elAteneo.agregarUnSocio(pablo);
    	Boolean seAgrego =	true;
    	Boolean seIntentaAgregar2 = elAteneo.agregarUnSocio(pablo);
    	Boolean seAgrego2 = false;
    	
    	assertEquals(seAgrego, seIntentaAgregar);
    	assertFalse(seIntentaAgregar2);
    }
    
    @Test
    public void queSePuedaDarDeBaja() {
    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
    	Socio pablo = new Socio ("Pablo", "Uruguayo", 20, "Jonte 502", 5615, 26540);
    	
    	Boolean seIntentaAgregar = elAteneo.agregarUnSocio(pablo);
    	Boolean seIntentaDarDeBaja = elAteneo.darDeBajaSocio(pablo);
    	Boolean seDioDeBaja = true;
    	
    	assertEquals(seIntentaDarDeBaja, seDioDeBaja);
    }

}
