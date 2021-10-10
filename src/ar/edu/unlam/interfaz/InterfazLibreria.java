package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Autor;
import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.CopiaLibro;
import ar.edu.unlam.dominio.Genero;

public class InterfazLibreria {
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
					case 1:
						crearCliente();
						break;
					case 2:
						guardarDatosAutor();
						break;
					case 3:
						guardarDatosLibro();
						break;
					case 4:
						
						break;
					case 9:
						break;
					default:
						System.out.println("Opción Invalida");
						break;
					}

			} while (opcion != 9);
		}

		private static void guardarDatosLibro() {
			
			System.out.println("---------------------------------------------");
			System.out.println("¿De que autor es el libro que vas a ingresar? ");
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
				Integer anioEdicion;
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
			
			CopiaLibro nuevaCopia= new CopiaLibro(titulo,genero,anioEdicion,autor,editorial ,precio);
			System.out.println(nuevaCopia.toString());
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
			
		
		
		
		
		private static void guardarDatosAutor() {
			String nombre, nacionalidad, domicilio;
			Integer edad, dni;
			
			System.out.println("Introduzca el nombre y apellido: ");
			nombre=teclado.nextLine();
			
			System.out.println("Introduzca la nacionalidad: ");
			nacionalidad=teclado.nextLine();
			
			System.out.println("Introduzca la edad: ");
			edad=teclado.nextInt();
			
			System.out.println("Introduzca el domicilio: ");
			domicilio=teclado.nextLine();
			
			System.out.println("Introduzca el numero de DNI: ");
			dni=teclado.nextInt();
			
			Autor autor=new Autor(nombre, nacionalidad,edad, domicilio,dni);
			System.out.println("Se guardo los datos del "+autor.toString());
		
	}

		private static void crearCliente() {
			String nombre,nacionalidad, domicilio;
			Integer edad, dni;
			
			System.out.println("Introduzca el nombre y apellido: ");
			nombre=teclado.nextLine();
			
			System.out.println("Introduzca la nacionalidad:");
			nacionalidad=teclado.next();
			
			System.out.println("Introduzca el domicilio: ");
			domicilio=teclado.nextLine();
			
			System.out.println("Introduzca la edad: ");
			edad=teclado.nextInt();
			
			System.out.println("Introduzca el numero de DNI: ");
			dni=teclado.nextInt();
			
			Cliente cliente=new Cliente(nombre, nacionalidad,edad, domicilio,dni);
			
			
		
	}

		private static int seleccionarOpcion() {
				
			int opcionSeleccionada = 0;

			System.out.println("-----------------------------------");
			System.out.println("BIENVENIDO A LIBRERIA");
			System.out.println("Menu de opciones\n");
			System.out.println("1 - Ingresar nuevo cliente");
			System.out.println("2 - Guardar datos de un Autor");
			System.out.println("3 - Guardar datos de un Libro");
			System.out.println("4 - ");
			System.out.println("9 - Salir");
			System.out.println("-----------------------------------");
			System.out.println("Ingrese una opcion");

			opcionSeleccionada = teclado.nextInt();
			teclado.nextLine();
				return opcionSeleccionada;

	}

}
