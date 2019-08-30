import javax.swing.JOptionPane;

public class Lista {
	NodoDoble inicio = null, 
			fin = null;
	
	
	// Método cuando la lista está vacia
	public boolean estaVacia() {
		return inicio == null;
	}
	
	// Método para agregar nodos al final
	public void agregarAlFinal( int elemento ) {
		if( !estaVacia() ) {
			fin = new NodoDoble(elemento, null, fin);
			fin.anterior.siguiente = fin;
		} else {
			inicio = fin = new NodoDoble(elemento);
		}
	}
	
	// Metodo para agregar nodos al inicio
	public void agregarAlInicio( int elemento ) {
		if( !estaVacia() ) {
			inicio = new NodoDoble(elemento, inicio, null);
			inicio.siguiente.anterior = inicio;
		} else {
			inicio = fin = new NodoDoble(elemento);
		}
	}
	
	// Método para mostrar la lista de inicio a fin
	public void mostrarListaInicioFin() {
		if( !estaVacia() ) {
			String datos = "";
			NodoDoble auxiliar = inicio;
			while( auxiliar != null ) {
				datos += "[" + auxiliar.dato + "]";
				auxiliar = auxiliar.siguiente;
				datos+= "<=>";
			}
			
			JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio a fin",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	// Método para mostrar la lista de fin a inicio
	public void mostarListaFinInicio() {
		if( !estaVacia() ) {
			String datos = "";
			NodoDoble auxiliar = fin;
			while( auxiliar != null ) {
				datos += "[" + auxiliar.dato + "] ";
				auxiliar = auxiliar.anterior;
				datos += " <=> ";
			}
			
			JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio a fin",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	// Método para eliminar nodo del inicio 
	public int eliminarNodoInicio() {
		int elemento = inicio.dato;
		
		if( !estaVacia() ) {
			inicio = inicio.siguiente;
			inicio.anterior = null;
		} else {
			inicio = fin = null;
		}
		
		return elemento;
	}
	
	// Método para eliminar nodo del final al inicio
	public int eliminarNodoFinal() {
		int elemento = fin.dato;
		
		if( !estaVacia() ) {
			fin = fin.anterior;
			fin.siguiente = null;
		} else {
			inicio = fin = null;
		}
		
		return elemento;
	}
	
}
