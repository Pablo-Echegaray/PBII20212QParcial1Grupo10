package ar.edu.unlam.dominio;

public class Factura {

	private Cliente cliente;
	private static Integer nroFactura = 1001;
	private Double precioTotal;
	private final Double IVA = 21.0;
	private final Double DESCUENTO_ESTUDIANTE = 5.0;
	private final Double DESCUENTO_JUBILADO = 10.0;
	private final Double DESCUENTO_SOCIO = 15.0;

	public Factura(Cliente cliente) {
		this.cliente = cliente;
		this.precioTotal = 0.0;
		nroFactura++;
	}

	public Double calcularDescuento() {
		Double descuento = 0.0;
		if(this.cliente instanceof Estudiante) {
			descuento = DESCUENTO_ESTUDIANTE;
		}
		if(this.cliente instanceof Jubilado) {
			descuento = DESCUENTO_JUBILADO;
		}
		if(this.cliente instanceof Socio) {
			descuento = DESCUENTO_SOCIO;
		}
		if(this.cliente.getClass() ==  Cliente.class) {
			descuento = 0.0;
		}
		return descuento;
		
	}

	public Double calcularPrecioTotal() {
		
		return 0.0;
	}

}
