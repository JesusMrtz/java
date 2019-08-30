
public class Principal {

	public static void main(String[] args) {
		int numeroEscalones = -1;
		
		bajarEscalones(numeroEscalones);
	}
	
	public static void bajarEscalones( int numeroEscalones ) {
		if( numeroEscalones > 0 ) {
			try {
				Thread.sleep(500);
				// Dominio, división del problema original ( problema - 1 )
				System.out.println("Bajando escalon: " + numeroEscalones);
				bajarEscalones( numeroEscalones - 1 );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// Caso base, respuesta explicita
			System.out.println("Ha bajado los escalones");
		}
	}

}
