import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opcion = 0, elemento;
		Lista lista = new Lista();
		
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
										"1. Agregar un elemento al inicio de la lista\n"
										+ "2. Agregar un elemento al final de la lista\n"
										+ "3. Mostrar los datos de la lista\n"
										+ "4. Eliminar elemento al inicio de la lista\n"
										+ "5. Eliminar un elemento al final de la lista\n"
										+ "6. Eliminar un elemento en especifico \n"
										+ "7. Buscar un elemento\n"
										+ "8. Salir", "Menu de opciones", 3));
				
				switch(opcion) {
				case 1:
					try {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
								"Ingresa el número:", "Insertando al inicio", 3));
						// Agregando al inicio
						lista.agregarAlInicio(elemento);
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
					}
					break;
				case 2:
					try {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
								"Ingresa el número:", "Insertando al final", 3));
						// Agregando al final
						lista.agregarAlFinal(elemento);
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
					}
					break;
				case 3:
					// Mostrando lista
					lista.mostrarLista();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "El elemento " + lista.eliminarNodoInicial() + " se ha eliminado de la lista",
							"Eliminando nodo de la lista", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "El elemento " + lista.eliminarNodoFinal() + " se ha eliminado de la lista",
							"Eliminando nodo de la lista", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					try {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
								"Ingresa el número:", "Eliminando", 3));
						// eliminar nodo en especifico
						if( lista.encontrarElemento(elemento) ) {
							lista.eliminarNodo(elemento);
							JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento, 
									"Eliminando nodo en especifico", 
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "El elemento " + elemento + " no está en la lista"
									,"Nodo no encontrado",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
					}
				case 7:
					try {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
								"Ingrese el elemento a buscar", "Buscando nodo en la lista", 3));
						
						if( lista.encontrarElemento(elemento) ) {
							JOptionPane.showMessageDialog(null, "El elemento " + elemento + " está en la lista", "Nodo encontrado",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "El elemento " + elemento + " no está en la lista"
									,"Nodo no encontrado",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
					}
					break;
				case 8:
					JOptionPane.showMessageDialog(null, "Programa finalizado" );
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción incorrecta");
					break;
				}
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
			}
		} while(opcion != 8);
	}

}
