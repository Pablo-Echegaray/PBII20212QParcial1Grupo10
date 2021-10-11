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

	public Double cobrar(Double pago) {
		calcularPrecioFinal();
		Double vuelto = 0.0;
		if (pago > this.precioTotal) {
			vuelto = pago - this.precioTotal;
		}
		return vuelto;
	}

	public void calcularPrecioFinal() {
		Double precioParcialDeLaCompra = obtenerPrecioParcialDeLaCompra();
		Double iva = Math.ceil((precioParcialDeLaCompra * 21) / 100);
		this.precioTotal = precioParcialDeLaCompra + iva - aplicarDescuento();

	}

	private Double aplicarDescuento() {
		Double precioSinDescuento = obtenerPrecioParcialDeLaCompra();
		Double descuentoAAplicarEnPorcentaje = validarDescuento();
		Double descuentoAAplicarEnMoneda = Math.ceil((precioSinDescuento * descuentoAAplicarEnPorcentaje / 100));

		return descuentoAAplicarEnMoneda;
	}

	// Pasar modificador de acceso a <private>
	public Double validarDescuento() {
		Double descuento = 0.0;
		if (this.cliente instanceof Estudiante) {
			descuento = DESCUENTO_ESTUDIANTE;
		}
		if (this.cliente instanceof Jubilado) {
			descuento = DESCUENTO_JUBILADO;
		}
		if (this.cliente instanceof Socio) {
			descuento = DESCUENTO_SOCIO;
		}
		if (this.cliente.getClass() == Cliente.class) {
			descuento = 0.0;
		}
		return descuento;

	}

	private Double obtenerPrecioParcialDeLaCompra() {
		CopiaLibro[] ejemplaresACobrar = this.cliente.getLibrosComprados();
		Double precioParcial = 0.0;
		for (int i = 0; i < ejemplaresACobrar.length; i++) {
			if (ejemplaresACobrar[i] != null) {

				precioParcial += ejemplaresACobrar[i].getPrecio();
			}

		}

		return precioParcial;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public static Integer getNroFactura() {
		return nroFactura;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

}
