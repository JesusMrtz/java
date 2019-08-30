import java.util.Arrays;
import java.util.Scanner;
public class Principal {
	private static Scanner input;

	public static void main(String[] args) {
		int numeros [] = new int [5];
		String palabras[] = new String [5];
		int numerosCopia [] = new int [5];
		input = new Scanner(System.in);
		
		for( int i = 0 ; i < numeros.length; i++ ) {
			System.out.print("Ingrese número: ");
			numeros[i] =  input.nextInt();
		}
		
		System.out.println("\nLos datos sin ordenar son:");
		
		// Mostrando los numeros
		for( int i = 0 ; i < numeros.length; i++ ) {
			System.out.print("[" + numeros[i] + "]");
		}
		
		System.out.println("\nLos datos ordenados son:");
		Arrays.sort(numeros);
		// Mostrando los numeros ordenados
		for( int i = 0 ; i < numeros.length; i++ ) {
			System.out.print("[" + numeros[i] + "]");
		}
		
		// Rellenando al arreglo palabras
		Arrays.fill(palabras, "Bienvenido a la fiesta");
		
		System.out.println("\nElementos del arreglo palabras:");
		
		// Mostrando los numeros
		for( int i = 0 ; i < palabras.length; i++ ) {
			System.out.print("[" + palabras[i] + "]");
		}
		
		// Copiando los elementos del arreglo numeros al numerosCopia
		System.arraycopy(numeros, 0, numerosCopia, 0, numeros.length);
				
		System.out.println("\nLos elementos del arreglo numerosCopia:");
				
		// Mostrando los numeros
		for( int i = 0 ; i < numerosCopia.length; i++ ) {
			System.out.print("[" + numerosCopia[i] + "]");
		}
	}

}