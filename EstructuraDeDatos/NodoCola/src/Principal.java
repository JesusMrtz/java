import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opcion = 0, elemento = 0;
		Cola cola = new Cola();
		
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Insertar un elemento en la cola\n"
						+ "2. Quitar un elemento de la cola\n"
						+ "3. ¿La cola está vacia?\n"
						+ "4. Elemento ubicado al inicio de la cola\n"
						+ "5. Tamaño de la cola\n"
						+ "6. Salir",
						"Menú de opciones",
						JOptionPane.QUESTION_MESSAGE));
				
				switch( opcion ) {
				case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingresa el elemento a insertar",
							"Insertando en la cola",
							JOptionPane.QUESTION_MESSAGE));
					cola.insertar(elemento);
				break;
				case 2:
					if( !cola.estaVacia() ) {
						JOptionPane.showMessageDialog(null,
								"El elemento " + cola.quitar() + " a sido removido",
								"Quitando elemento",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null,
								"La cola está vacia",
								"Error",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 3:
					if( !cola.estaVacia() ) {
						JOptionPane.showMessageDialog(null,
								"La cola está vacia",
								"Estatus",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null,
								"Cola no esta vacia",
								"Estatus",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 4:
					if( !cola.estaVacia() ) {
						JOptionPane.showMessageDialog(null,
								"El elemento ubicadoal inicio es " + cola.inicioCola(),
								"Quitando elemento",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null,
								"La cola está vacia",
								"Estatus",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null,
							"El tamaño de la cola es de " + cola.tamanioCola() + " elementos",
							"Estatus",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					JOptionPane.showMessageDialog(null,
							"Hasta luego",
							"fin",
							JOptionPane.INFORMATION_MESSAGE);
					break;
					default:
						JOptionPane.showMessageDialog(null,
								"No existe esa opción",
								"Error",
								JOptionPane.ERROR_MESSAGE);
						break;
				}
			} catch( NumberFormatException e ) {
				JOptionPane.showMessageDialog(null,
						"Error " + e.getMessage());
			}
		} while( opcion != 6 );
	}

}
