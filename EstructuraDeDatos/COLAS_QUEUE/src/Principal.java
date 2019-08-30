import java.util.Queue;
import java.util.LinkedList;
public class Principal {

	public static void main(String[] args) {
		Queue <Integer> cola = new LinkedList<Integer>();
		
		cola.add(10);
		cola.add(20);
		cola.add(20);
		cola.add(30);
		cola.add(50);
		
		System.out.println("El inicio de la cola es: " + cola.peek());
		System.out.println("EL tamaño de la cola es: " + cola.size());
		System.out.println("Esta vacias?: " + cola.isEmpty());
		cola.clear();
	}

}
