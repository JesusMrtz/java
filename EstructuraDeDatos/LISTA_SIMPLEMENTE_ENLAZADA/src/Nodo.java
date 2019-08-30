public class Nodo {
	public int dato;
	public Nodo siguiente = null; // Puntero enlace 
	
	// Constructor para crear un nodo al final de la lista enlazada
	public Nodo( int dato ) {
		this.dato = dato;
	}
	
	// Constructor para insertar al inicio de la lista enlazada
	public Nodo( int dato, Nodo siguiente ) {
		this.dato = dato;
		this.siguiente = siguiente;
	}
}
