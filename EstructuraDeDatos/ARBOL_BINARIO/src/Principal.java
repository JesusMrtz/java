import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opcion = 0, elemento;
		String nombre;
		ArbolBinario arbolBinario = new ArbolBinario();
		
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un nodo\n"
						+ "2. Recorrer el arbol InOrden\n"
						+ "3. Recorrer el arbol PreOrden\n"
						+ "4. Recorrer el arbol PostOrden\n"
						+ "5. Buscar un nodo en el árbol\n"
						+ "6. "
						+ "7. Salir\n"
						+ "Elige una opción",
						"Menú de opciones",
						JOptionPane.QUESTION_MESSAGE));
				
				switch( opcion ) {
				case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingresa el número del nodo",
							"Agregando nodo", JOptionPane.QUESTION_MESSAGE));
					
					nombre = JOptionPane.showInputDialog(null, 
							"Ingresa el nombre del nodo",
							"Agregando nombre", JOptionPane.QUESTION_MESSAGE);
					
					arbolBinario.agregarNodo(elemento, nombre);
					break;
				case 2:
					if( !arbolBinario.estaVacio() ) {
						System.out.println("Recorrido InOrden");
						arbolBinario.recorrerInOrden(arbolBinario.raiz);
						System.out.println();
					} else {
						JOptionPane.showMessageDialog(null, 
								"El arbol esta vacio",
								"Cuidado", 
								JOptionPane.WARNING_MESSAGE);
					}
					break;
				case 3:
					if( !arbolBinario.estaVacio() ) {
						System.out.println("Recorrido PreOrden");
						arbolBinario.recorrerPreOrden(arbolBinario.raiz);
						System.out.println();
					} else {
						JOptionPane.showMessageDialog(null, 
								"El arbol esta vacio",
								"Cuidado", 
								JOptionPane.WARNING_MESSAGE);
					}
					break;
				case 4:
					if( !arbolBinario.estaVacio() ) {
						System.out.println("Recorrido PostOrden");
						arbolBinario.recorrerPostOrden(arbolBinario.raiz);
						System.out.println();
					} else {
						JOptionPane.showMessageDialog(null, 
								"El arbol esta vacio",
								"Cuidado", 
								JOptionPane.WARNING_MESSAGE);
					}
					break;
				case 5:
					if( !arbolBinario.estaVacio() ) {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
								"Ingresa el número del nodo a buscar",
								"Buscando nodo", JOptionPane.QUESTION_MESSAGE));
						
						
						if( arbolBinario.buscarNodo(elemento) != null ) {
							System.out.println("Nodo encontrado: " + arbolBinario.buscarNodo(elemento));
						} else {
							JOptionPane.showMessageDialog(null, 
									"Nodo no encontrado",
									"Resultado", 
									JOptionPane.INFORMATION_MESSAGE);
						}
						
					} else {
						JOptionPane.showMessageDialog(null, 
								"El arbol esta vacio",
								"Cuidado", 
								JOptionPane.WARNING_MESSAGE);
					}
					break;
				case 6:
					if( !arbolBinario.estaVacio() ) {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
								"Ingresa el número del nodo a eliminar",
								"Eliminando nodo", JOptionPane.QUESTION_MESSAGE));
						
						
						if( arbolBinario.eliminar(elemento) != false ) {
							System.out.println("El nodo a sido elimidado del arbol");
						} else {
							JOptionPane.showMessageDialog(null, 
									"Nodo no encontrado",
									"Resultado", 
									JOptionPane.INFORMATION_MESSAGE);
						}
						
					} else {
						JOptionPane.showMessageDialog(null, 
								"El arbol esta vacio",
								"Cuidado", 
								JOptionPane.WARNING_MESSAGE);
					}
					break;
				case 7:
					JOptionPane.showMessageDialog(null, 
							"Aplicación finalizada",
							"Fin", 
							JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, 
							"Opción incorrecta",
							"Error", 
							JOptionPane.ERROR_MESSAGE);
					break;
				}
			} catch(NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
			}
		} while( opcion != 7 );
	}

}
