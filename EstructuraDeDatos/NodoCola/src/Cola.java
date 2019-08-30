public class Cola {
	NodoCola inicio = null, 
			fin = null;
	int size = 0;

	
	// Método para saber si esta vacia la cola
	public boolean estaVacia() {
		return inicio == null;
	}
	
	// Método para insertar elemento
	public void insertar( int elemento ) {
		NodoCola nuevo = new NodoCola(elemento);
		
		if( inicio == null ) {
			inicio = nuevo;
		} else {
			fin.siguiente = nuevo;
		}
		fin = nuevo;
		size++;
	}
	
	// Quitar un elemento de la fila
	public int quitar() {
		int auxiliar = inicio.dato;
		inicio = inicio.siguiente;
		size--;
		return auxiliar;
	}
	
	// Quien está al inicio de la cola
	public int inicioCola() {
		return inicio.dato;
	}
	
	// Tamaño de la cola
	public int tamanioCola() {
		return size;
	}
	
	
}