package fascade;

import api.AvionApi;
import api.HotelApi;

public class CheckFacade {
	private AvionApi avionAPI;
	private HotelApi hotelAPI;	
	
	public CheckFacade() {
		avionAPI = new AvionApi();
		hotelAPI = new HotelApi();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}		
}