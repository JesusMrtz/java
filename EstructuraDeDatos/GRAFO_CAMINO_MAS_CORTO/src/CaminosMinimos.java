public class CaminosMinimos {

	// Método para determinar todos los caminos (Floyd)
	public String algoritmoFloyd( long [][] mAdy ) {
		int vertices = mAdy.length;
		long matrizAdyacencia[][] = mAdy;
		String caminos[][] = new String [vertices][vertices];
		String caminosAuxiliar[][] = new String[vertices][vertices];
		String caminoRecorrido = "", cadena = "", caminitos = "";
		float temporal1, temporal2, temporal3, temporal4, minimo;
		
		// Inicializando las matrices caminos y caminosAuxiliar
		for(int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				caminos[i][j] = "";
				caminosAuxiliar[i][j] = "";
			}
		}
		
		for( int k = 0; k < vertices; k++ ) {
			for( int i = 0; i < vertices; i++ ) {
				for( int j = 0; j < vertices; j++ ) {
					temporal1 = matrizAdyacencia[i][j];
					temporal2 = matrizAdyacencia[i][k];
					temporal3 = matrizAdyacencia[k][j];
					temporal4 = temporal2 + temporal3;
					
					// Encontrando al minimo
					minimo = Math.min(temporal1, temporal4);
					
					if( temporal1 != temporal4 ) {
						if( minimo == temporal4 ) {
							caminoRecorrido = "";
							caminosAuxiliar[i][j] = "";
							caminos[i][j] = caminosR(i, k, caminosAuxiliar, caminoRecorrido) + (k + 1);
							
						}
					}
					matrizAdyacencia[i][j] = (long) minimo; 
				}
			}
		}
		
		// Agregando el camino minimo a cadena;
		for(int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";
			}
			cadena+= cadena + "\n";
		}
		
		////////////
		for(int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				if( matrizAdyacencia[i][j] != 1000000000 ) {
					if( i != j ) {
						if( caminos[i][j].equals("") ) {
							caminitos += "De (" + (i + 1) + "-->" + (j + 1)	+") irse por ... ("
									+ (i + 1) + ", " + (j + 1) + ")\n";
						} else {
							caminitos += "De (" + (i + 1) + "-->" + (j + 1)	+") irse por ... ("
									+ (i + 1) + ", " + caminos[i][j] + ", " + (j + 1) + ")\n";
						}
					}
				}
			}
		}
		return "La matriz de caminos más corto entre los diferenctes vertices es:\n" + cadena + 
				"\nLos diferentes caminos más cortos entre vertices son : \n"
				+ caminitos;
	}
	
	public String caminosR( int i, int k, String[][]caminosAuxiliares, String caminoRecorrido ) {
		if( caminosAuxiliares[i][k].equals("") ) {
			return "";
		} else {
			caminoRecorrido+= caminosR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminoRecorrido) +
					(Integer.parseInt(caminosAuxiliares[i][k].toString()) + 1) + ", ";
			return caminoRecorrido;
		}
	}
}