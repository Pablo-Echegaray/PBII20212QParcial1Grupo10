package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Estudiante;
import ar.edu.unlam.dominio.Genero;
import ar.edu.unlam.dominio.Jubilado;
import ar.edu.unlam.dominio.Libreria;
import ar.edu.unlam.dominio.Socio;
import ar.edu.unlam.dominio.Universidades;

public class InterfazLibreria {
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Libreria libreria = new Libreria("Ateneo", "CABA");
		Autor autor = new Autor("Michael Foucault", "Francesa", 1930, "Paris", 123);
		CopiaLibro libro = new CopiaLibro("Vigilar y Castigar", Genero.ACADEMICO, 1975, autor, "Éditions Gallimard", 900.0, 2);
		Boolean agrego = libreria.agregarCopiaLibro(libro);
		System.out.println(agrego);
		CopiaLibro libroA = new CopiaLibro("Otro Libro", Genero.CIENCIA_FICCION, 1700, autor, "Editorial", 12100.0, 5);
		Boolean agrego2 =libreria.agregarCopiaLibro(libroA);
		System.out.println(agrego2);
		CopiaLibro libroB = new CopiaLibro("Libro B", Genero.TERROR, 1980, autor, "Editorial", 100.0, 5);
		Boolean agrego3 =libreria.agregarCopiaLibro(libroB);
		System.out.println(agrego3);
		CopiaLibro libroC = new CopiaLibro("Libro C", Genero.NOVELA, 2011, autor, "Editorial gg", 800.0, 5);
		Boolean agrego4 =libreria.agregarCopiaLibro(libroC);
		System.out.println(agrego4);
		CopiaLibro libroD = new CopiaLibro("Libro D", Genero.CUENTOS, 2021, autor, "Editorial gg", 1800.0, 7);
		Boolean agrego5 =libreria.agregarCopiaLibro(libroD);
		System.out.println(agrego5);
		Boolean agrego6 = libreria.agregarCopiaLibro(libroD);
		System.out.println(agrego6);
		
		CopiaLibro []librosEnStock= libreria.getLibrosEnStock();
		
		for (int i = 0; i < librosEnStock.length; i++) {
			if(librosEnStock[i] !=null) {
				System.out.println(librosEnStock[i].toString() + "\n");
			}
		}
	    System.out.println("--------------------------------------------------------------------------");
	    
	    Boolean vendo = libreria.venderLibro(libro);
	    System.out.println(vendo);
	    Boolean vendo2 = libreria.venderLibro(libroA);
	    System.out.println(vendo2);
	    Boolean vendo3 = libreria.venderLibro(libroB);
	    System.out.println(vendo3);
	    Boolean vendo4 = libreria.venderLibro(libroC);
	    System.out.println(vendo4);
	    Boolean vendo5 = libreria.venderLibro(libroD);
	    System.out.println(vendo5);
	    
	    CopiaLibro [] vendidos = libreria.getLibrosVendidos();
	    for (int i = 0; i < vendidos.length; i++) {
			if(librosEnStock[i] !=null) {
				System.out.println(vendidos[i].toString() + "\n");
			}
		}
	    
	    System.out.println("-----------------------------------------------------------------------------");
	    Boolean vendoLibro = libreria.venderLibro(libro);
	    System.out.println(vendoLibro);
	    vendidos = libreria.getLibrosVendidos();
	    for (int i = 0; i < vendidos.length; i++) {
			if(librosEnStock[i] !=null) {
				System.out.println(vendidos[i].toString() + "\n");
			}
		}
	    
	    System.out.println("---------------------------------------------------------------------------------");
	    CopiaLibro bestSeller = libreria.bestSeller();
	    System.out.println(bestSeller.toString());
	}

}
