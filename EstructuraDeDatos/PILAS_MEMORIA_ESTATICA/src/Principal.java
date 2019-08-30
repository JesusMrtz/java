import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opcion = 0, elemento, tamanio;
		try {
			tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,
					"¿De que tamaño quieres la pila", 
					"Solicitando tamaño",
					JOptionPane.INFORMATION_MESSAGE));
			Pila pila = new Pila(tamanio);
			
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Empujar un elemento de la pila\n"
						+ "2. Sacar un elemento de la pila \n"
						+ "3. ¿La pila está vacia\n"
						+ "4. ¿La pila está llena?\n"
						+ "5. ¿Qué elemento está en la cima\n"
						+ "6. Tamaño de la pila\n"
						+ "7. Salir\n"
						+ "¿Que deseas hacer?", "Menú de opciones",
						JOptionPane.INFORMATION_MESSAGE));
				
				switch( opcion ) {
					case 1:
						if( !pila.estaLlena() ) {
							elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
									"Ingrese el elemento a empujar en la pila",
									"Apilando datos",
									JOptionPane.INFORMATION_MESSAGE));
							pila.empujar(elemento);
						} else {
							JOptionPane.showMessageDialog(null, 
									"La pila está llena", "Error",
									JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 2:
						if( !pila.estaVacia() ) {
							JOptionPane.showMessageDialog(null, 
									"El elemento obtenido es " + pila.sacar(), 
									"Obteniendo elemento",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, 
									"La pila está vacia", "Error",
									JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 3:
						if( !pila.estaVacia() ) {
							JOptionPane.showMessageDialog(null, 
									"La pila no está vacia", "Estatus",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, 
									"La pila está vacia", "Estatus",
									JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 4:
						if( !pila.estaLlena() ) {
							JOptionPane.showMessageDialog(null, 
									"La pila no está llena", "Estatus",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, 
									"La pila está llena", "Estatus",
									JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 5:
						if( !pila.estaLlena() ) {
							JOptionPane.showMessageDialog(null, 
									"El elemento que se encuentra en la cima es " + pila.cimaPila(), 
									"Estatus",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, 
									"La pila está vacia", "Error",
									JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 6:
						JOptionPane.showMessageDialog(null, 
								"El tamaño de la pila es de " + pila.tamanioPila() + " elementos", 
								"Tamaño",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					case 7:
						JOptionPane.showMessageDialog(null, 
								"Aplicación finalizada", "Fin",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						JOptionPane.showMessageDialog(null, 
								"Opción incorrecta", "Error",
								JOptionPane.INFORMATION_MESSAGE);
							break;
				}
			} while( opcion != 7 );
			
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
		}
	}

}