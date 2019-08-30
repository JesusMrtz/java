package implementacion;

import interfaces.ServicioInformatico;

public class ServicioWebSite implements ServicioInformatico {

	@Override
	public void asignarTrabajo() {
		System.out.println("El personal encargado de desarrollo web ha aceptado el trabajo");
	}

	@Override
	public void indicarFechaEntrega() {
		System.out.println("El sitio web se terminará el dia 29/01/2019");
	}

	@Override
	public void informarSobrePago() {
		System.out.println("El monto a pagar no incluyele dominio y el hosting	");
	}

}
