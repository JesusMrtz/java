public class Principal {

	public static void main(String[] args) {
		int discos = 3;
		
		torresHanoi(discos, "torres origen", "torre auxiliar", "torre destino");
	}
	
	public static void torresHanoi( int cantidadDiscos, String origen, String auxiliar, String destino ) {
		// Caso base
		if( cantidadDiscos == 1 ) {
			System.out.println("Mover disco de la " + origen + " a la " + destino);
		} else {
			torresHanoi( cantidadDiscos - 1, origen, destino, auxiliar );
			System.out.println("Mover disco de la " + origen + " a la " + destino);
			torresHanoi( cantidadDiscos - 1, auxiliar, origen, destino );
		}
	}

}
