public class Lista {
	// Punteros para verificar donde está el inicio y final de la lista
	protected Nodo inicio, fin = null;
	
	
	// Método para agregar un nodo al inicio de la lista
	public void agregarAlInicio( int dato ) {
		// Creando al nodo
		inicio = new Nodo(dato, inicio);
		
		if( fin == null ) {
			fin = inicio;
		}
		
	}
	
	// Método para saber si la lista está vacia
	public boolean estaVacia() {
		return inicio == null;
	}
	
	// Método para insertar al final de la lista
	public void agregarAlFinal( int elemento ) {
		if( !estaVacia() ) {
			fin.siguiente = new Nodo(elemento);
			fin = fin.siguiente;
		} else {
			inicio = fin = new Nodo(elemento);
		}
	}
	
	// Eliminar un nodo al inicio de la lista
	public int eliminarNodoInicial() {
		int elemento = inicio.dato;
		if( inicio == fin ) {
			inicio = fin = null;
		} else {
			inicio = inicio.siguiente;
		}
		return elemento;
	}
	
	// Eliminar un nodo al final de la lista
	public int eliminarNodoFinal() {
		int elemento = fin.dato;
		
		if( fin == inicio ) {
			fin = inicio = null;
		} else {
			Nodo auxiliar = inicio;
			while( auxiliar.siguiente != fin ) {
				auxiliar = auxiliar.siguiente;
			}
			
			fin = auxiliar;
			fin.siguiente = null;
		}
		
		return elemento;
	}
	
	// Metodo para eliminar un nodo en especifico
	public void eliminarNodo( int elemento ) {
		if( !estaVacia() ) {
			if( inicio == fin && elemento == inicio.dato ) {
				inicio = fin = null;
			} else if( elemento == inicio.dato ) {
				inicio = inicio.siguiente;
			} else {
				Nodo anterior, temporal;
				anterior = inicio;
				temporal = inicio.siguiente;
				
				while( 	temporal != null && temporal.dato != elemento ) {
					anterior = anterior.siguiente;
					temporal = temporal.siguiente;
				}
				
				if( temporal != null ) {
					anterior.siguiente = temporal.siguiente;
					if( temporal == fin ) {
						fin = anterior;
					}
				}
			}
		}
	}
	
	// Método para mostrar los datos
	public void mostrarLista() {
		Nodo recorrer = inicio;
		
		while( recorrer != null ) {
			System.out.print("[" + recorrer.dato + "] --> ");
			recorrer = recorrer.siguiente;
		}
		System.out.println();
	}
	
	// Método para buscar un elemento
	public boolean encontrarElemento( int elemento ) {
		Nodo temporal = inicio;
		
		while( temporal != null && temporal.dato != elemento ) {
			temporal = temporal.siguiente;
		}
		
		return temporal != null;
	}
}