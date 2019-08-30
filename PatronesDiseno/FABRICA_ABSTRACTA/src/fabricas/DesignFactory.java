package fabricas;
import interfaces.ServicioFactory;
import interfaces.ServicioInformatico;
import implementacion.ServicioDesing;

public class DesignFactory implements ServicioFactory {

	@Override
	public ServicioInformatico crearServicio() {
		return new ServicioDesing();
	}

}
