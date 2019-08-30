public class Principal {

	public static void main(String[] args) {
		int numero = 5;
		int numeroFigonacci = 0;
		int primero = 1;
		int segundo = 0;
		System.out.println("El número figonacci de " + numero + " es de: " + numeroFigonacci(numero));
		
		if(numero <= 0 ) {
			System.out.println("El número figonacci de " + numero + " es de: " + 0);
		} else {
			for(int i = 0; i < numero; i++) {
				numeroFigonacci = primero + segundo;
				primero = segundo;
				segundo = numeroFigonacci;
			}
			System.out.println("El número figonacci de " + numero + " es de: " + numeroFigonacci);
		}
	}
	
	public static int numeroFigonacci( int numero ) {
		if( numero <= 0 ) {
			return 0;
		}
		
		if( numero == 1 || numero == 2 ) {
			return 1;
		} else {
			return numeroFigonacci(numero - 1) + numeroFigonacci(numero - 2);
		}
	}

}
