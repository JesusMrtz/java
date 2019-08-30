public class ArbolBinario {
	NodoArbol raiz = null;
	
	// Método para insertar un nodo en el arbol
	public void agregarNodo( int dato, String nombre ) {
		NodoArbol nuevo = new NodoArbol(dato, nombre);
		
		if( raiz == null ) {
			raiz = nuevo;
		} else {
			NodoArbol auxiliar = raiz;
			NodoArbol padre;
			
			while( true ) {
				padre = auxiliar;
				if( dato < auxiliar.dato ) {
					auxiliar = auxiliar.hijoIzquierdo;
					if( auxiliar == null ) {
						padre.hijoIzquierdo = nuevo;
						return;
					}
				} else {
					auxiliar = auxiliar.hijoDerecho;
					if( auxiliar == null ) {
						padre.hijoDerecho = nuevo;
						return;
					}
				}
			}
		}
	}
	
	// Método para saber cuando el arbol está vacio
	public boolean estaVacio() {
		return raiz == null;
	}
	
	// Método para recorrer el arbol InOrden (izquierdo, raiz, derecho)
	public void recorrerInOrden ( NodoArbol r ) {
		if( r != null ) {
			recorrerInOrden(r.hijoIzquierdo);
			System.out.print("[" + r.dato + "] => ");
			recorrerInOrden(r.hijoDerecho);
		}
	}
	
	// Método para recorrer el arbol PreOrden (Raiz, izquierda, derecha)
	public void recorrerPreOrden( NodoArbol r ) {
		if( r != null ) {
			System.out.print("[" + r.dato + "] => ");
			recorrerPreOrden(r.hijoIzquierdo);
			recorrerPreOrden(r.hijoDerecho);
		}
	}
	
	// Método para recorrer el arbol PostOrden(izquierda, derecha, raiz)
	public void recorrerPostOrden( NodoArbol r ) {
		if( r != null ) {
			recorrerPostOrden(r.hijoIzquierdo);
			recorrerPostOrden(r.hijoDerecho);
			System.out.print("[" + r.dato + "] => ");
		}
	}
	
	// Método para buscar un nodo en el árbol
	public NodoArbol buscarNodo( int dato ) {
		NodoArbol aux = raiz;
		
		while( aux.dato != dato ) {
			if( dato < aux.dato ) {
				aux = aux.hijoIzquierdo;
			} else {
				aux = aux.hijoDerecho;
			}
			
			if( aux == null ) {
				return null;
			}
		}
		return aux;
	}
	
	// Método para eliminar un nodo en el arbol
	public boolean eliminar( int dato ) {
		NodoArbol auxiliar = raiz;
		NodoArbol padre = raiz;
		boolean esHijoIzquierdo = true;
		
		while( auxiliar.dato != dato ) {
			padre = auxiliar;
			
			if( dato < auxiliar.dato ) {
				esHijoIzquierdo = true;
				auxiliar = auxiliar.hijoIzquierdo;
			} else {
				esHijoIzquierdo = false;
				auxiliar = auxiliar.hijoDerecho;
			}
			
			if( auxiliar == null ) {
				return false;
			}
		} // Fin del while
		
		if( auxiliar.hijoIzquierdo == null && auxiliar.hijoDerecho == null ) {
			if( auxiliar == raiz ) {
				raiz = null;
			} else if(esHijoIzquierdo){
				padre.hijoIzquierdo = null;
			} else {
				padre.hijoDerecho = null;
			}
		} else if( auxiliar.hijoDerecho == null ) {
			if( auxiliar == raiz ) {
				raiz = auxiliar.hijoIzquierdo;
			} else if(esHijoIzquierdo){
				padre.hijoIzquierdo = auxiliar.hijoIzquierdo;
			} else {
				padre.hijoDerecho = auxiliar.hijoIzquierdo;
			}
		} else if( auxiliar.hijoIzquierdo == null ) {
			if( auxiliar == raiz ) {
				raiz = auxiliar.hijoDerecho;
			} else if(esHijoIzquierdo){
				padre.hijoIzquierdo = auxiliar.hijoDerecho;
			} else {
				padre.hijoDerecho = auxiliar.hijoIzquierdo;
			}
		} else {
			NodoArbol reemplazo = obtenerNodoReemplazo( auxiliar );
			
			if( auxiliar == raiz ) {
				raiz = reemplazo;
			} else if(esHijoIzquierdo) {
				padre.hijoIzquierdo = reemplazo;
			} else {
				padre.hijoDerecho = reemplazo;
			}
			
			reemplazo.hijoIzquierdo = auxiliar.hijoIzquierdo;
		}
		
		return true;
	}
	
	// Método encargado de devolvernos el nodo reemplazo
	public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReem) {
		NodoArbol reemplazarPadre = nodoReem;
		NodoArbol reemplazo = nodoReem;
		NodoArbol auxiliar = nodoReem.hijoDerecho;
		
		while( auxiliar != null ) {
			reemplazarPadre = reemplazo;
			reemplazo = auxiliar;
			auxiliar = auxiliar.hijoIzquierdo;
		}
		
		if( reemplazo != nodoReem.hijoDerecho ) {
			reemplazarPadre.hijoIzquierdo = reemplazo.hijoDerecho;
			reemplazo.hijoDerecho = nodoReem.hijoDerecho;
		}
		
		System.out.println("El nodo reemplazo es: " + reemplazo);
		return reemplazo;
	}
}