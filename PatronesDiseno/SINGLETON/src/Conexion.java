public class Conexion {
	
	// Declaracion
	private static Conexion instancia;
	
	// Evitar instanciar el objeto
	private Conexion() {
		
	}
	
	// Para obtener la instancia unicamente por este método
	// Notese la palabra reservada "static" hace posible el acceso mediante clase.metodo
	public static Conexion getInstancia() {
		if( instancia == null ) {
			instancia = new Conexion();
		}
		
		return instancia;
	}
	
	// Método de prueba
	public void conectar() {
		System.out.println("Me conecto a la BD");
	}
	
	// Método de prueba
	public void desconectar() {
		System.out.println("Me desconecté a la BD");
	}
}