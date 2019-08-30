public class NodoLC {
	int dato;
	NodoLC siguiente;
	
	public NodoLC( int dato ) {
		this.dato = dato;
		siguiente = this;
	}
}