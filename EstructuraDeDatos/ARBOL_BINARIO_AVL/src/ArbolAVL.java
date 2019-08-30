public class ArbolAVL {
	private NodoArbolAVL raiz = null;
	
	
	//Obtener la raiz
	public NodoArbolAVL obtenerRaiz() {
		return raiz;
	}
	
	// Buscar un nodo
	public NodoArbolAVL buscar( int dato, NodoArbolAVL raiz ) {
		if( raiz == null ) {
			return null;
		} else if( raiz.dato == dato ) {
			return raiz;
		} else if( raiz.dato < dato ) {
			return buscar(dato, raiz.hijoDerecho);
		} else {
			return buscar(dato, raiz.hijoIzquierdo);
		}
	}
	
	// Método para obtener el factor de equilibrio
	public int obtenerFactorEquilibrio( NodoArbolAVL nodo ) {
		if( nodo == null ) {
			return -1;
		} else {
			return nodo.factorEquilibrio;
		}
	}
	
	// Rotación simple izquierda
	public NodoArbolAVL rotacionSimpleIzquierda( NodoArbolAVL nodo ) {
		NodoArbolAVL auxiliar = nodo.hijoIzquierdo;
		nodo.hijoIzquierdo = auxiliar.hijoDerecho;
		auxiliar.hijoDerecho = nodo;
		
		nodo.factorEquilibrio = Math.max(obtenerFactorEquilibrio(nodo.hijoIzquierdo), obtenerFactorEquilibrio(nodo.hijoDerecho)) + 1;
		auxiliar.factorEquilibrio = Math.max(obtenerFactorEquilibrio(auxiliar.hijoIzquierdo), obtenerFactorEquilibrio(auxiliar.hijoDerecho)) + 1;
		
		return auxiliar;
	}
	
	// Rotación simple derecho
	public NodoArbolAVL rotacionSimpleDerecha( NodoArbolAVL nodo ) {
		NodoArbolAVL auxiliar = nodo.hijoDerecho;
		nodo.hijoDerecho = auxiliar.hijoIzquierdo;
		auxiliar.hijoIzquierdo = nodo;
		
		nodo.factorEquilibrio = Math.max(obtenerFactorEquilibrio(nodo.hijoIzquierdo), obtenerFactorEquilibrio(nodo.hijoDerecho)) + 1;
		auxiliar.factorEquilibrio = Math.max(obtenerFactorEquilibrio(auxiliar.hijoIzquierdo), obtenerFactorEquilibrio(auxiliar.hijoDerecho)) + 1;
		
		return auxiliar;
	}
	
	// Rotación doble derecho
	public NodoArbolAVL rotacionDobleDerecho( NodoArbolAVL nodo ) {
		NodoArbolAVL auxiliar;
		nodo.hijoIzquierdo = rotacionSimpleDerecha(nodo.hijoIzquierdo);
		auxiliar = rotacionSimpleIzquierda(nodo);
		
		return auxiliar;
	}
	
	// Rotacion doble izquierdo
	public NodoArbolAVL rotacionDobleIzquierdo( NodoArbolAVL nodo ) {
		NodoArbolAVL auxiliar;
		nodo.hijoDerecho = rotacionSimpleIzquierda(nodo.hijoDerecho);
		auxiliar = rotacionSimpleDerecha(nodo);
		
		return auxiliar;
	}
	
	// Metodo para insertar un nodo en el árbol AVL
	public NodoArbolAVL insertarNodoAVL( NodoArbolAVL nuevo, NodoArbolAVL subArbol ) {
		NodoArbolAVL nuevoPadre = subArbol;
		
		if( nuevo.dato < subArbol.dato ) {
			if( subArbol.hijoIzquierdo == null ) {
				subArbol.hijoIzquierdo = nuevo;
			} else  {
				subArbol.hijoIzquierdo = insertarNodoAVL(nuevo, subArbol.hijoIzquierdo);
				
				if( (obtenerFactorEquilibrio(subArbol.hijoIzquierdo) - obtenerFactorEquilibrio(subArbol.hijoDerecho) == 2) ) {
					if( nuevo.dato < subArbol.hijoIzquierdo.dato ) {
						nuevoPadre = rotacionSimpleIzquierda(subArbol);
					} else {
						nuevoPadre = rotacionDobleDerecho(subArbol);
					}
				}
			} 
		} else if( nuevo.dato > subArbol.dato ) {
			if( subArbol.hijoDerecho == null ) {
				subArbol.hijoDerecho = nuevo;
			} else {
				subArbol.hijoDerecho = insertarNodoAVL(nuevo, subArbol.hijoDerecho);
				
				if( (obtenerFactorEquilibrio(subArbol.hijoDerecho) - obtenerFactorEquilibrio(subArbol.hijoIzquierdo) == 2) ) {
					if( nuevo.dato > subArbol.hijoDerecho.dato ) {
						nuevoPadre = rotacionSimpleDerecha(subArbol);
					} else {
						nuevoPadre = rotacionDobleIzquierdo(subArbol);
					}
				}
			}
		} else {
			System.out.println("Nodos duplicados");
		}
		
		// Actualizando la altura
		if( subArbol.hijoIzquierdo == null && subArbol.hijoDerecho != null ) {
			subArbol.factorEquilibrio = subArbol.hijoDerecho.factorEquilibrio + 1;
		} else if( subArbol.hijoDerecho == null && subArbol.hijoIzquierdo != null ) {
			subArbol.factorEquilibrio = subArbol.hijoIzquierdo.factorEquilibrio + 1;
		} else {
			subArbol.factorEquilibrio = Math.max(obtenerFactorEquilibrio(subArbol.hijoIzquierdo), obtenerFactorEquilibrio(subArbol.hijoDerecho)) + 1;
		}
		
		return nuevoPadre;
	}
	
	// Método para insertar
	public void insertar( int dato ) {
		NodoArbolAVL nuevo = new NodoArbolAVL(dato);	
		
		if(raiz == null) {
			raiz = nuevo;
		} else {
			raiz = insertarNodoAVL(nuevo, raiz);
		}
	}
	
	// Recorridos 
	// Método para recorrer el arbol InOrden (izquierdo, raiz, derecho)
	public void recorrerInOrden ( NodoArbolAVL r ) {
		if( r != null ) {
			recorrerInOrden(r.hijoIzquierdo);
			System.out.print("[" + r.dato + "] => ");
			recorrerInOrden(r.hijoDerecho);
		}
	}
	
	// Método para recorrer el arbol PreOrden (Raiz, izquierda, derecha)
	public void recorrerPreOrden( NodoArbolAVL r ) {
		if( r != null ) {
			System.out.print("[" + r.dato + "] => ");
			recorrerPreOrden(r.hijoIzquierdo);
			recorrerPreOrden(r.hijoDerecho);
		}
	}
	
	// Método para recorrer el arbol PostOrden(izquierda, derecha, raiz)
	public void recorrerPostOrden( NodoArbolAVL r ) {
		if( r != null ) {
			recorrerPostOrden(r.hijoIzquierdo);
			recorrerPostOrden(r.hijoDerecho);
			System.out.print("[" + r.dato + "] => ");
		}
	}
}
