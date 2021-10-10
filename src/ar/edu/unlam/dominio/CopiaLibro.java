package ar.edu.unlam.dominio;

public class CopiaLibro extends Libro {
	private Integer cantidadIngresadaEnStock;
	private Integer cantidadVendida;
	private Integer cantidadParcialEnStock;
	

	

	public CopiaLibro(String titulo, Genero genero, Integer anioEdicion, Autor autor, String editorial, Double precio, Integer cantidadIngresadaEnStock) {
		super(titulo, genero, anioEdicion, autor, editorial, precio);
		
		this.cantidadIngresadaEnStock=cantidadIngresadaEnStock;
		this.cantidadVendida=0;
		this.cantidadParcialEnStock = this.cantidadIngresadaEnStock;
		
	}

		
	
	
	protected void actualizarCantidadParcialLibrosEnStock() {
		if(this.cantidadParcialEnStock>0) {
		 this.cantidadParcialEnStock  -= 1; 
		}
		
	}

	public void incrementarCantidadVendida() {
		if(this.cantidadIngresadaEnStock > this.cantidadVendida) {
		this.cantidadVendida++;
		actualizarCantidadParcialLibrosEnStock();
		}
	}
	
	public Integer getCantidadParcialEnStock() {
		return this.cantidadParcialEnStock;
	}
	
	public Integer getCantidadVendida() {
		return this.cantidadVendida;
	}
	
	public Integer getCantidadIngresadaEnStock() {
		return this.cantidadIngresadaEnStock;
	}




	@Override
	public String toString() {
		return "CopiaLibro [cantidadIngresadaEnStock=" + cantidadIngresadaEnStock + ", cantidadVendida="
				+ cantidadVendida + ", cantidadParcialEnStock=" + cantidadParcialEnStock + "]" + " Titulo : " + getTitulo()+ " Autor "+ getAutor().getNombre();
	}

	

}
