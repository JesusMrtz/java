public class Esfera {
	private double radio = 0;
	
	public Esfera( double radio ) {
		if( radio > 0 ) {
			this.radio = radio;
		}
	}
	
	
	// Método u operaciones de la esfera
	
	public double getRadio() {
		return radio;
	}
	
	public double getDiametro() {
		return 2 * getRadio();
	}
	
	public double getCircuferencia() {
		return Math.PI * getDiametro();
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(getRadio(), 2);
	}
	
	public double getVolumen() {
		return (4 * Math.PI * Math.pow(getRadio(), 3)) / 3;
	}
}