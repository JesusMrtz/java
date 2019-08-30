import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Lista lista = new Lista();
		int opcion = 0, elemento;
		
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"1. Agregar un nodo al inicio\n"
						+ "2. Agregar un nodo al final\n"
						+ "3. Mostrar la lista de inicio a fin\n"
						+ "4. Mostrar la lista de fin a inicio\n"
						+ "5. Eliminar un nodo del inicio\n"
						+ "6. Eliminar un nodo del final\n"
						+ "7. Salir\n "
						+ "¿Que deseas hacer?", "Menú de opciones"
						, JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion) {
				case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingrese el elemento", "Agregando nodo al inicio",
							JOptionPane.INFORMATION_MESSAGE));
					lista.agregarAlInicio(elemento);
					break;
				case 2:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingrese el elemento", "Agregando nodo al final",
							JOptionPane.INFORMATION_MESSAGE));
					lista.agregarAlFinal(elemento);
					break;
				case 3:
					if( !lista.estaVacia() ) {
						lista.mostrarListaInicioFin();
					} else {
						JOptionPane.showMessageDialog(null, "No contienes nodos para recorrer","Error",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 4:
					if( !lista.estaVacia() ) {
						lista.mostarListaFinInicio();
					} else {
						JOptionPane.showMessageDialog(null, "No contienes nodos para recorrer","Error",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 5:
					if( !lista.estaVacia() ) {
						elemento = lista.eliminarNodoInicio();
						JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,"elemento eliminado",
								JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "No hay nodos aùn","Lista vacia",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 6:
					if( !lista.estaVacia() ) {
						elemento = lista.eliminarNodoFinal();
						JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,"elemento eliminado",
								JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "No hay nodos aùn","Lista vacia",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Aplicación finalizada","Fin",
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
		} while( opcion != 7 );
	}

}
