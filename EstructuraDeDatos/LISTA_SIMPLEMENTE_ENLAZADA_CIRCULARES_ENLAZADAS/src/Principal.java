import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Lista lista = new Lista();
		int opcion = 0, elemento;
		
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"1. Agregar un nodo a la lista circular\n"
						+ "2. Eliminar un nodo de la lista circular\n"
						+ "3. Mostrar los datos de lista circular\n"
						+ "4. Salir\n "
						+ "¿Que deseas hacer?", "Menú de opciones"
						, JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion) {
				case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingrese el elemento", "Agregando nodo a la lista circular",
							JOptionPane.INFORMATION_MESSAGE));
					lista.insertar(elemento);
					break;
				case 2:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingrese el elemento a eliminar", "Eliminando nodos",
							JOptionPane.INFORMATION_MESSAGE));
					
					boolean eliminado = lista.eliminarNodo(elemento);
					
					if( eliminado ) {
						JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo " + elemento,"Nodo eliminado",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "No se encontró el nodo","Nodo no encontrado",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 3:
					if( !lista.estaVacia() ) {
						lista.mostrarLista();
					} else {
						JOptionPane.showMessageDialog(null, "La lista aún no tiene nodos","No hay nodos",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Aplicación finalizada","Adiós",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "La opción no está en el menu","Error",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			} catch(NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "error " + n.getMessage());
			}
		} while( opcion != 4 );
	}

}
