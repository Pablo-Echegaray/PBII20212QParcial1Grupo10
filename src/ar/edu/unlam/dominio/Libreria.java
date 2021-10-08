package ar.edu.unlam.dominio;

public class Libreria {

	private Socio listadoDeSocios[];
	private Integer controlCantidadSocios;

	public Libreria() {

		this.listadoDeSocios = new Socio[10];
		this.controlCantidadSocios = 0;
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

	public Socio[] getListadoDeSocios() {
		return listadoDeSocios;
	}

	public void setListadoDeSocios(Socio[] listadoDeSocios) {
		this.listadoDeSocios = listadoDeSocios;
	}

}
