package ar.edu.unlam.dominio;

public class Libreria {

		private String nombre;
		private String direccion;
		private CopiaLibro librosVendidos[];
		private CopiaLibro librosEnStock[];
		private Socio listadoDeSocios[];
		private Integer controlCantidadSocios;
		private Integer contador;

		
		public Libreria(String nombre, String direccion) {
			this.contador = 0;
			this.nombre = nombre;
			this.direccion = direccion;
			this.librosEnStock = new CopiaLibro[10];
			this.librosVendidos = new CopiaLibro[10];
			this.listadoDeSocios = new Socio[10];
			this.controlCantidadSocios = 0;
		}
		
		/* public Integer libroMasVendidos(CopiaLibro librosVendidos) {
			for(Integer i = 0; i < librosVendidos.length; i++) {
		
			}
		}
		
		*/
		
		public Boolean agregarCopiaLibro(CopiaLibro nuevo) {
			Boolean seAgrego = false;
			for(int i = 0; i < librosEnStock.length; i++) {
				if(librosEnStock[i] == null) {
					librosEnStock[i] = nuevo;
					seAgrego = true;
					break;
				}	
			}
			return seAgrego;
		}
		
		public Boolean vender(CopiaLibro libro) {
			Boolean sePuedeVender = false;
			for(int i = 0; i < librosEnStock.length; i++) {
				if(librosEnStock[i] != null) {
					if(librosEnStock[i].equals(libro)) {
						librosEnStock[i] = null;
						librosVendidos[contador++] = libro;
						sePuedeVender = true;
						break;
					}
				}
			}
			return sePuedeVender;
		}
		
		private Boolean validarSocioExistente(Socio socio) {
			Boolean coincidenciaSocio = false;
			for (int i = 0; i < listadoDeSocios.length; i++) {
				if (listadoDeSocios[i] != null) {
					if (listadoDeSocios[i].equals(socio)) {
						coincidenciaSocio = true;
						break;
					}

				}

			}

			return coincidenciaSocio;

		}
		
		public Boolean agregarUnSocio(Socio socio) {
			Boolean sePudoAgregarUnSocio = false;
			Boolean socioSinRegistrar = validarSocioExistente(socio);

			if (socioSinRegistrar == false) {
				for (int i = 0; i < listadoDeSocios.length; i++) {
					if (listadoDeSocios[i] == null) {
						listadoDeSocios[controlCantidadSocios++] = socio;
						sePudoAgregarUnSocio = true;
						break;

					}
				}

			}

			return sePudoAgregarUnSocio;

		}
		
		public Boolean darDeBajaSocio(Socio socio) {
			Boolean darBaja = false;
			for (int i = 0; i < listadoDeSocios.length; i++) {
				if (listadoDeSocios[i] != null) {
					if (listadoDeSocios[i].equals(socio)) {
						listadoDeSocios[i] = null;
						darBaja = true;
						break;
					}
				}
			}
			
			return darBaja;
			
		}
		
		public Libro[] getLibrosEnStock() {
			return librosEnStock;
		}
		
		public Libro[] getLibrosVendidos() {
			return librosVendidos;
		}

		public Socio[] getListadoDeSocios() {
			return listadoDeSocios;
		}

		public void setListadoDeSocios(Socio[] listadoDeSocios) {
			this.listadoDeSocios = listadoDeSocios;
		}
}
