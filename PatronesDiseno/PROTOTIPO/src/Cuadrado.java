public class Cuadrado implements Figura {
	private String nombre;
	private int positionX, positionY;
	
	public Cuadrado() {}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void mover(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}

	@Override
	public void getPosition() {
		System.out.println("Cuadrado en X: " + this.positionX);
		System.out.println("Cuadrado en Y: " + this.positionY);
	}

	@Override
	public Figura clonar() {
		Figura figura = new Cuadrado();
		figura.setNombre(this.nombre);
		figura.mover(this.positionX, this.positionY);
		return figura;
	}
}