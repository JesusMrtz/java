
public class Principal {

	public static void main(String[] args) {
		ArbolAVL arbolAVL = new ArbolAVL();
		
		// Insertando nodos
		arbolAVL.insertar(10);
		arbolAVL.insertar(5);
		arbolAVL.insertar(13);
		arbolAVL.insertar(1);
		arbolAVL.insertar(6);
		arbolAVL.insertar(17);
		arbolAVL.insertar(16);
		
		System.out.println("Recorrido preorden: ");
		arbolAVL.recorrerPreOrden(arbolAVL.obtenerRaiz());
	}

}
