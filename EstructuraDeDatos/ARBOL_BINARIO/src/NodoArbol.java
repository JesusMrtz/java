public class NodoArbol {
	int dato;
	NodoArbol hijoIzquierdo = null,
			hijoDerecho = null;
	String nombre;
	
	public NodoArbol( int dato, String nombre ) {
		this.dato = dato;
		this.nombre = nombre;
	}
	
	// Permitir la información completa del objeto
	public String toString() {
		return nombre + " su dato es " + dato;
	}
}