import java.util.Stack;
public class Principal {

	public static void main(String[] args) {
		Stack pila = new Stack();
		
		pila.add(10);
		pila.add(21);
		pila.add(21);
		pila.add(22);
		
		System.out.println("La cima de la pila es: " + pila.peek());
		System.out.println("Sacando al elemento: " + pila.pop());
		System.out.println("Sacando al elemento: " + pila.pop());
		System.out.println("Tamaño de la pila: " + pila.size());
		System.out.println("La pila esta vacia?: " + pila.isEmpty());
		
	}

}
