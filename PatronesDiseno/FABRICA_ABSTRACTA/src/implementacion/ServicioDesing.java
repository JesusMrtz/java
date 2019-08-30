package implementacion;

import interfaces.ServicioInformatico;

public class ServicioDesing implements ServicioInformatico {

	@Override
	public void asignarTrabajo() {
		System.out.println("El trabajo se le ha entregado a los diseñadores gráficos disponible");
	}

	@Override
	public void indicarFechaEntrega() {
		System.out.println("Los diseñadores han determinado terminar el trabajo el dia 27/07/2019");
		
	}

	@Override
	public void informarSobrePago() {
		System.out.println("Deberán recibir el pago en efectivo al terminar el logotipo");
	}

}
