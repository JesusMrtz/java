import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
	private static Scanner input;
	
	public static void main(String[] args) {
		ArrayList <String> cadenas = new ArrayList <String>();
		input = new Scanner (System.in);
		String frase, respuesta;
		
		do {
			System.out.print("Ingrese la frase: ");
			frase = input.nextLine();
			
			// Agregando la frase
			cadenas.add(frase);
			
			System.out.print("Desea insertar una frase (Si/No): ");
			respuesta = input.nextLine();
		} while( respuesta.equalsIgnoreCase("si") );
		
		// Mostrando el contenido de la cadena
		System.out.println("\nMostrando el contenido del arreglo dinamico:");
		for( int i = 0; i < cadenas.size(); i++ ) {
			System.out.println(cadenas.get(i));
		}
		
		// Utilizando el método set
		cadenas.set(1, "Mi amor karely");
		System.out.println("\nMostrando el contenido del arreglo dinamico MODIFICADAS:");
		for( int i = 0; i < cadenas.size(); i++ ) {
			System.out.println(cadenas.get(i));
		}
		
		// Eliminando un elemento
		cadenas.remove(0);
		System.out.println("\nFrases que nos quedan");
		for( int i = 0; i < cadenas.size(); i++ ) {
			System.out.println(cadenas.get(i));
		}
	}

}
