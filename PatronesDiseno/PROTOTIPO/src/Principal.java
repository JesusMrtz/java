import java.util.Scanner;
public class Principal {
	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int opcion, posicionX, posicionY;
		Figura figura;
		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		
		circulo.setNombre("Mi circulo");
		circulo.mover(12, 34);
		
		cuadrado.setNombre("Mi cuadrado");
		cuadrado.mover(200, 200);
		
		System.out.println("Estas son las figuras originales: ");
		System.out.println("Circulo: " + circulo.getNombre());
		circulo.getPosition();
		System.out.println("Cuadrado: " + cuadrado.getNombre());
		cuadrado.getPosition();
		
		System.out.print("Digite la opcion que desea clonar: ");
		opcion = entrada.nextInt();
		
		if( opcion == 1 ) {
			figura = circulo.clonar();
		} else {
			figura = cuadrado.clonar();
		}
		
		figura.setNombre(figura.getNombre() + " clonado");
		System.out.print("Digite la nueva posición X: ");
		posicionX = entrada.nextInt();
		System.out.print("Digite la nueva posición Y: ");
		posicionY = entrada.nextInt();
		figura.mover(posicionX, posicionY);
		
		System.out.println("Esta es la figura clonada:");
		System.out.println(figura.getNombre());
		figura.getPosition();
		
		System.out.println("\nEstas son las figuras originales: ");
		System.out.println("Circulo: " + circulo.getNombre());
		circulo.getPosition();
		System.out.println("Cuadrado: " + cuadrado.getNombre());
		cuadrado.getPosition();
		
		System.out.print("Digite la opcion que desea clonar: ");
		opcion = entrada.nextInt();
		
		
		/*Persona uno = new Persona("Jesus");
		
		System.out.println("El nombre del objeto 1 es: ");
		System.out.println(uno.getNombre());
		
		Persona dos = new Persona("");
		dos = uno;
		
		dos.setNombre("Karely");
		System.out.println("El nombre dle objeto 2");
		System.out.println(dos.getNombre());
		System.out.println(uno.getNombre());*/
	}

}