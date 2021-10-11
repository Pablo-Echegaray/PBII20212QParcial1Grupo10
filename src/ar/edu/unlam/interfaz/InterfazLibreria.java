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
	
	static Libreria libreria= new Libreria("LIBRERIA", "CABA");
	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
					case 1:
						crearCliente();
						break;
					case 2:
						guardarDatosLibro();
						break;
					case 3:
						//venderLibro();
						break;
					case 9:
						break;
					default:
						System.out.println("Opción Invalida");
						break;
					}

			} while (opcion != 9);
		}
/*
		private static void venderLibro() {
			System.out.println("Introduzca el titulo del libro: ");
			String titulo=teclado.nextLine();
			
			System.out.println("Introduzca precio: ");
			Double precio=(Double)teclado.nextDouble();
			teclado.nextLine();
			CopiaLibro copia=new CopiaLibro(titulo, null, null, null, null, precio, null);
			System.out.println("Se vendio"+libreria.vender(copia));

		}*/


		private static void guardarDatosLibro() {
			
			System.out.println("---------------------------------------------");
			System.out.println("¿De que autor es el libro que vas a ingresar? ");
			System.out.println("---------------------------------------------");
				String nombre, nacionalidad, domicilio;
				Integer edad, dni;
				
				System.out.println("Introduzca el nombre y apellido: ");
				nombre=teclado.nextLine();
				
				System.out.println("Introduzca la nacionalidad: ");
				nacionalidad=teclado.nextLine();
				
				System.out.println("Introduzca la edad: ");
				edad=teclado.nextInt();
				teclado.nextLine();
				System.out.println("Introduzca el domicilio: ");
				domicilio=teclado.next();
				
				System.out.println("Introduzca el numero de DNI: ");
				dni=teclado.nextInt();
				teclado.nextLine();
				Autor autor=new Autor(nombre, nacionalidad,edad, domicilio,dni);	
				
			System.out.println("-----------------------------------------------");		
			System.out.println("Ingresar copia libro en el stock libreria: ");
			System.out.println("-----------------------------------------------");	
				String titulo,editorial;
				Double precio;
				Integer anioEdicion,cantidadIngresadaEnStock=0;
				Genero genero;
			
			System.out.println("Introduzca el titulo del libro: ");
			titulo=teclado.nextLine();
			
			System.out.println("Introduzca la editorial: ");
			editorial=teclado.nextLine();
			
			System.out.println("Introduzca año de edicion: ");
			anioEdicion=teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Introduzca precio: ");
			precio=(Double)teclado.nextDouble();
		
			genero=elegirGenero ();
			
			CopiaLibro nuevaCopia= new CopiaLibro(titulo,genero,anioEdicion,autor,editorial ,precio,cantidadIngresadaEnStock );
			System.out.println(nuevaCopia.toString());
			libreria.agregarCopiaLibro(nuevaCopia);
			cantidadIngresadaEnStock++;
			System.out.println(libreria.agregarCopiaLibro(nuevaCopia));
		}
		
		private static int seleccionarOpcionGenero() {
			int opcionGenero;
			System.out.println("------------------------------------");
			System.out.println("Introduzca una opcion para genero: ");
			System.out.println("1-Terror");
			System.out.println("2-Novela");
			System.out.println("3-Cuentos");
			System.out.println("4-Ciencia Ficción");
			System.out.println("5-Academico");
			System.out.println("6-Salir");
			System.out.println("------------------------------------");
			System.out.println("");
			 opcionGenero = teclado.nextInt();
			 teclado.nextLine();
			return opcionGenero;
			
		}

		private static Genero elegirGenero() {
			int opcionGenero=0;
			Genero genero=null;
			
				opcionGenero = seleccionarOpcionGenero();
				 
			switch(opcionGenero) {
			
			case 1:
					genero=Genero.TERROR;
				break;
			case 2:
					genero=Genero.NOVELA;
				
				break;
			case 3:
					genero=Genero.CUENTOS;
				break;
			case 4:
				genero=Genero.CIENCIA_FICCION;
				break;
			case 5:
					genero=Genero.ACADEMICO;
				break;
			default:
				System.out.println("Esta opcion es incorrecta");
				break;
			}
			return genero;
			
		}
			
		
		

		private static void crearCliente() {
			String nombre,nacionalidad, domicilio;
			Integer edad, dni;
			
			System.out.println("Introduzca el nombre y apellido: ");
			nombre=teclado.nextLine();
			
			System.out.println("Introduzca la nacionalidad:");
			nacionalidad=teclado.nextLine();
			
			System.out.println("Introduzca el domicilio: ");
			domicilio=teclado.nextLine();
			
			System.out.println("Introduzca la edad: ");
			edad=teclado.nextInt();
			
			System.out.println("Introduzca el numero de DNI: ");
			dni=teclado.nextInt();
			
			
			tipoCliente(nombre, nacionalidad, domicilio, edad, dni);
			
	}

		private static void tipoCliente(String nombre, String nacionalidad, String domicilio, Integer edad,
				Integer dni) {
			int tipoCliente=0;
			tipoCliente=seleccionarTipoCliente();
			switch(tipoCliente){
			case 1:
				Integer numeroLibretaEstudiante;
				System.out.println("Introduce el número de libreta: ");
				numeroLibretaEstudiante=teclado.nextInt();
				teclado.nextLine();
				
				Estudiante estudianteNuevo=new Estudiante(nombre, nacionalidad,edad, domicilio,dni, numeroLibretaEstudiante, null);
				System.out.println("se creo "+estudianteNuevo.toString());
				break;
			case 2:
				Jubilado jubiladoNuevo=new Jubilado(nombre, nacionalidad,edad, domicilio,dni);
				System.out.println("se creo "+jubiladoNuevo.toString());
				break;
			case 3:
				Integer identificadorSocio;
				System.out.println("Ingrese el identificador de Socio");
				identificadorSocio=teclado.nextInt();
				Socio socioNuevo=new Socio(nombre, nacionalidad,edad, domicilio,dni,identificadorSocio);
				System.out.println("se creo "+socioNuevo.toString());
				break;
			case 4:
				Cliente clienteNuevo=new Cliente(nombre, nacionalidad,edad, domicilio,dni);
				//System.out.println("se creo "+clienteNuevo.toString());
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}

		private static int seleccionarTipoCliente() {
			int tipoCliente;
			System.out.println("------------------------------------");
			System.out.println(" Indicar su categoria ");
			System.out.println("1- Estudiante");
			System.out.println("2- Jubilado");
			System.out.println("3- Socio");
			System.out.println("4- Ninguna");
			System.out.println("------------------------------------");
			tipoCliente=teclado.nextInt();
			teclado.nextLine();
			return tipoCliente;
		}

		private static int seleccionarOpcion() {
				
			int opcionSeleccionada = 0;

			System.out.println("-----------------------------------");
			System.out.println("BIENVENIDO A LIBRERIA");
			System.out.println("Menu de opciones\n");
			System.out.println("1 - Ingresar nuevo cliente");
			System.out.println("2 - Guardar datos de un Libro");
			//System.out.println("3 - Vender libro");
			System.out.println("9 - Salir");
			System.out.println("-----------------------------------");
			System.out.println("Ingrese una opcion");

			opcionSeleccionada = teclado.nextInt();
			teclado.nextLine();
				return opcionSeleccionada;

	}

}
