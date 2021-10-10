package ar.edu.unlam.testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Genero;
import ar.edu.unlam.dominio.Libreria;

public class TestLibreriaB {

	    @Test
        public void queDevuelvaElEjemplarMayorVendido() {
		    	Libreria elAteneo = new Libreria ("El Ateneo", "Suipacha 655");
		    	Autor autor = new Autor("Michael Foucault", "Francesa", 1930, "Paris", 123);
				CopiaLibro libro = new CopiaLibro("Vigilar y Castigar", Genero.ACADEMICO, 1975, autor, "Éditions Gallimard", 900.0, 2);
				elAteneo.agregarCopiaLibro(libro);
				CopiaLibro libroA = new CopiaLibro("Otro Libro", Genero.CIENCIA_FICCION, 1700, autor, "Editorial", 12100.0, 5);
				elAteneo.agregarCopiaLibro(libroA);
				CopiaLibro libroB = new CopiaLibro("Libro B", Genero.TERROR, 1980, autor, "Editorial", 100.0, 5);
				elAteneo.agregarCopiaLibro(libroB);
				CopiaLibro libroC = new CopiaLibro("Libro C", Genero.NOVELA, 2011, autor, "Editorial gg", 800.0, 5);
				elAteneo.agregarCopiaLibro(libroC);
				CopiaLibro libroD = new CopiaLibro("Libro D", Genero.CUENTOS, 2021, autor, "Editorial gg", 1800.0, 7);
				elAteneo.agregarCopiaLibro(libroD);
				CopiaLibro bestSeller = libroD;
				
				for(int i = 0; i < 3; i++) {
					elAteneo.venderLibro(libroB);
				}
				
				for(int i = 0; i < 4; i++) {
					elAteneo.venderLibro(libroC);
				}
				
				for(int i = 0; i < 7; i++) {
					elAteneo.venderLibro(libroD);
				}
				
				elAteneo.venderLibro(libro);
				elAteneo.venderLibro(libro);
				elAteneo.venderLibro(libroA);
				
		    	CopiaLibro libroMasVendido = elAteneo.bestSeller();
		    	
		    	assertSame(bestSeller, libroMasVendido);
		    	
		    	
		    }
	}


