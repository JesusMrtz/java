package fabricas;
import interfaces.ServicioFactory;
import interfaces.ServicioInformatico;
import implementacion.ServicioWebSite;

public class WebSiteFactory implements ServicioFactory {

	@Override
	public ServicioInformatico crearServicio() {
		return new ServicioWebSite();
	}

}
