public class Pila {
	int vectorPila[];
	int cima = 0;
	
	// Constructor
	public Pila( int tamanio ) {
		vectorPila = new int[tamanio];
		cima -= 1;
	}
	
	// Método push
	public void empujar( int dato ) {
		cima++;
		vectorPila[cima] = dato;
	}
	
	// Método pop
	public int sacar() {
		int fuera = vectorPila[cima];
		cima--;
		return fuera;
	}
	
	// Método para saber si la pila está vacia
	public boolean estaVacia() {
		return vectorPila.length == 0;
	}
	
	// Método para saber si la pila está llena
	public boolean estaLlena() {
		return vectorPila.length - 1 == cima;
	}
	
	// Método para saber que elemento esta en la cima
	public int cimaPila() {
		return vectorPila[cima];
	}
	
	// Retornar el tamaño de un vector
	public int tamanioPila() {
		return vectorPila.length;
	}
}
