public class Pila {
	NodoPila cima = null;
	int size = 0;
	
	// Método para saber si la pila está vacia
	public boolean estaVacia() {
		return cima == null;
	}
	
	// Método para empujar un elemento en la pila
	public void empujar( int dato ) {
		NodoPila nuevo = new NodoPila(dato);
		nuevo.siguiente = cima;
		cima = nuevo;
		size++;
	}
	
	// Metodo para sacar un elemento de la pila
	public int sacar() {
		int auxiliar = cima.dato;
		cima = cima.siguiente;
		size--;
		return auxiliar;
	}
	
	// Método para saber quien está en la cima de la pila
	public int cima() {
		return cima.dato;
	}
	
	// Método para saber el tamaño de la pila
	public int tamanioPila() {
		return size;
	}
	
	// Metodo para vaciar la pila
	public void limpiarPila() {
		while( !estaVacia() ) {
			sacar();
		}
	}
}
