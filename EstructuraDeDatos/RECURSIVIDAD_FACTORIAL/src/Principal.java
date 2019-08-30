public class Principal {

	public static void main(String[] args) {
		int numero = 5;
		int numeroFactorial = 1;
		
		System.out.println("El factorial de " + numero + " es: " + factorialRecursivo(numero));
		
		/*if( numero < 0 ) {
			System.out.println("El factorial de " + numero + " es: 0");
		} else {
			for( int i = 1; i <= numero; i++ ) {
				numeroFactorial *= i;
			}
			System.out.println("El factorial de " + numero + " es: " + numeroFactorial);
		}*/
	}
	
	public static int factorialRecursivo( int numero ) {
		if( numero < 0 ) {
			return 0;
		}
		
		if( numero == 0 ) {
			// Caso base
			return 1;
		} else {
			// Dominio, (problema - 1)
			return numero * factorialRecursivo( numero - 1 );
		}
	}

}
