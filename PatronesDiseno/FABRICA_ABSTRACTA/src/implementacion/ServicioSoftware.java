package implementacion;

import interfaces.ServicioInformatico;

public class ServicioSoftware implements ServicioInformatico {

	@Override
	public void asignarTrabajo() {
		System.out.println("Nuestros programadores ha aceptado el trabajo del sistema");
	}

	@Override
	public void indicarFechaEntrega() {
		System.out.println("Los programadores han fijado una fecha de entrega el dia 23/02/202");
	}

	@Override
	public void informarSobrePago() {
		System.out.println("El monto a pagar será por paypal");
	}

}
