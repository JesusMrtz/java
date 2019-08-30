import javax.swing.JOptionPane;

public class Lista {
	NodoLC ultimo = null;
	
	// Método para saber si la lista está vacía
	public boolean estaVacia() {
		return ultimo == null;
	}
	
	// Método para insertar nodos
	public Lista insertar( int elemento ) {
		NodoLC nuevo = new NodoLC(elemento);
		
		if( ultimo != null ) {
			nuevo.siguiente = ultimo.siguiente;
			ultimo.siguiente = nuevo;
		}
		
		ultimo = nuevo;
		return this;
	}
	
	// Método para mostrar la lista
	public void mostrarLista() {
		NodoLC auxiliar = ultimo.siguiente;
		String cadena = "";
		
		do {
			cadena+= "[" + auxiliar.dato + "] <=> ";
			auxiliar = auxiliar.siguiente;
		} while( auxiliar != ultimo.siguiente );
		
		JOptionPane.showMessageDialog(null, cadena, "Mostrando lista", JOptionPane.INFORMATION_MESSAGE);
	}
	
	// Método para eliminar un nodo de la lista circular
	public boolean eliminarNodo( int elemento ) {
		if( !estaVacia() ) {
			NodoLC actual;
			boolean encontrado = false;
			actual = ultimo;
			
			while( actual.siguiente != ultimo && !encontrado ) {
				encontrado = actual.siguiente.dato == elemento;
				
				if( !encontrado ) {
					actual = actual.siguiente;
				}
			}
			
			encontrado = actual.siguiente.dato == elemento;
			if( encontrado ) {
				NodoLC auxiliar = actual.siguiente;
				if( ultimo == ultimo.siguiente ) {
					ultimo = null;
				} else {
					if( auxiliar == ultimo ) {
						ultimo = actual;
					}
					
					actual.siguiente = auxiliar.siguiente;
				}
				
				auxiliar = null;
			}
			
			return encontrado == true;
		}
		
		return false;
	}
}
