
public class Principal {

	public static void main(String[] args) {
		Esfera esfera = new Esfera(3);
		
		System.out.println("Radio: " + esfera.getRadio());
		System.out.println("Diametro: " + esfera.getDiametro());
		System.out.println("Circuferencia: " + esfera.getCircuferencia());
		System.out.println("Area: " + esfera.getArea());
		System.out.println("Volumen: " + esfera.getVolumen());
	}

}