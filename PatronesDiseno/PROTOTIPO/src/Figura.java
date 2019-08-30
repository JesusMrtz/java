public interface Figura {
	public void setNombre( String nombre );
	public String getNombre();
	public void mover( int x, int y );
	public void getPosition();
	public Figura clonar();
}