public class NodoDoble {
	protected int dato;
	NodoDoble siguiente = null;
	NodoDoble anterior = null;
	
	// Constructo cuando no hay nodos en la lista
	public NodoDoble( int dato ) {
		this.dato = dato;
	}
	
	// Constructor cuan hay nodos en la lista
	public NodoDoble( int dato, NodoDoble siguiente, NodoDoble anterior ) {
		this.dato = dato;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}
}