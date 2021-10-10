package ar.edu.unlam.dominio;

public class Libreria {

		private String nombre;
		private String direccion;
		private CopiaLibro librosVendidos[];
		private CopiaLibro librosEnStock[];
		private Socio listadoDeSocios[];
		private Integer controlCantidadSocios;
		private Integer contador;
	    private Integer contadorStock;

		
		public Libreria(String nombre, String direccion) {
			
			this.nombre = nombre;
			this.direccion = direccion;
			this.librosEnStock = new CopiaLibro[10];
			this.librosVendidos = new CopiaLibro[10];
			this.listadoDeSocios = new Socio[10];
			this.controlCantidadSocios = 0;
			this.contador = 0;
			this.contadorStock = 0;
		}
		
		/* public Integer libroMasVendidos(CopiaLibro librosVendidos) {
			for(Integer i = 0; i < librosVendidos.length; i++) {
		
			}
		}
		
		*/
		
		public Boolean agregarCopiaLibro(CopiaLibro libro) {
			Boolean seAgrego = false;
			
			for(int i = 0; i < librosEnStock.length; i++) {
				if(librosEnStock[i] == null) {
					for(int j=0; j<librosEnStock.length; j++) {
						if(librosEnStock[j] != null && librosEnStock[j].equals(libro)) {
							return seAgrego = false;
						}
					}
					librosEnStock[contadorStock++] = libro;
					seAgrego = true;
					break;
				}	
			}
			return seAgrego;
		}
		
		//Implementacion Julian
//		public Boolean vender(CopiaLibro libro) {
//			Boolean sePuedeVender = false;
//			for(int i = 0; i < librosEnStock.length; i++) {
//				if(librosEnStock[i] != null) {
//					if(librosEnStock[i].equals(libro)) {
//						librosEnStock[i] = null;
//						librosVendidos[contador++] = libro;
//						sePuedeVender = true;
//						break;
//					}
//				}
//			}
//			return sePuedeVender;
//		}
		
		//Implementacion Pablo
		
		private Boolean validarLibrosVendidosExistentes(CopiaLibro libro) {
			Boolean existeEnLibrosVendidos = false;
			for(int i=0; i<this.librosVendidos.length; i++) {
				if(this.librosVendidos[i] !=null) {
					if(this.librosVendidos[i].equals(libro)) {
						existeEnLibrosVendidos = true;
					}
				}
			}
			return existeEnLibrosVendidos;
		}
		
		public Boolean venderLibro(CopiaLibro libro) {
			Boolean sePuedeVender = false;
			for(int i = 0; i < librosEnStock.length; i++) {
				if(librosEnStock[i] != null) {
					if(librosEnStock[i].equals(libro)) {
						if(libro.getCantidadParcialEnStock() > 0) {
						libro.incrementarCantidadVendida();
						sePuedeVender = true;
						if(!validarLibrosVendidosExistentes(libro)) {
							librosVendidos[contador++] = libro;
						}
						if(libro.getCantidadParcialEnStock() ==0) {
							librosEnStock[i] = null;
						}
						
						break;
						}
					}
				}
			}
			return sePuedeVender;
		}
		
		private CopiaLibro [] ordenarLibrosVendidosPorCantidadDeVendidos() {
			CopiaLibro[] librosVendidos = this.getLibrosVendidos();
			CopiaLibro auxiliar;
			for(int i=1; i<librosVendidos.length; i++) {
				for(int j = 0; j< librosVendidos.length - 1; i++) {
					if(librosVendidos[j] != null && librosVendidos[j+1] !=null) {
						if(librosVendidos[j].getCantidadVendida() < librosVendidos[j+1].getCantidadVendida()) {
							auxiliar = librosVendidos[j+1];
							librosVendidos[j+1] = librosVendidos[j];
							librosVendidos[j]= auxiliar;
						}
					}
				}
			}
			return librosVendidos;
			
		}
		
		public CopiaLibro bestSeller () {
			CopiaLibro [] librosVendidos = ordenarLibrosVendidosPorCantidadDeVendidos();
			CopiaLibro bestSeller = null;
			Integer vendidos = librosVendidos[0].getCantidadVendida();
			for(int i=0; i<librosVendidos.length; i++) {
				if(librosVendidos[i] !=null) {
					if(librosVendidos[i].getCantidadVendida() > vendidos) {
						vendidos = librosVendidos[i].getCantidadVendida();
						bestSeller = librosVendidos[i];
					}
				}
			}
			return bestSeller;
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
		
		public CopiaLibro[] getLibrosEnStock() {
			return librosEnStock;
		}
		
		public CopiaLibro[] getLibrosVendidos() {
			return librosVendidos;
		}

		public Socio[] getListadoDeSocios() {
			return listadoDeSocios;
		}

		public void setListadoDeSocios(Socio[] listadoDeSocios) {
			this.listadoDeSocios = listadoDeSocios;
		}
}
