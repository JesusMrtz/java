package fabricas;
import interfaces.ServicioFactory;
import interfaces.ServicioInformatico;
import implementacion.ServicioSoftware;;

public class SoftwareFactory implements ServicioFactory {

	@Override
	public ServicioInformatico crearServicio() {
		return new ServicioSoftware();
	}

}
