import java.util.LinkedList;
public class Principal {
	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		int size = lista.size();
		
		System.out.println("Valores de la lista: ");
		for( int i = 0; i < size; i++ ) {
			System.out.print("[" + lista.get(i) + "] ==> ");
		}
		
		lista.remove(1);
		
		System.out.println("\nValores de la lista despues de eliminar: ");
		for( int i = 0; i < lista.size(); i++ ) {
			System.out.print("[" + lista.get(i) + "] ==> ");
		}
		
		lista.addFirst(100);;
		
		System.out.println("\nValores de la lista despues de reemplazar: ");
		for( int i = 0; i < lista.size(); i++ ) {
			System.out.print("[" + lista.get(i) + "] ==> ");
		}
	}

}