public class Principal {

	public static void main(String[] args) {
		Conexion c = Conexion.getInstancia();
		
		c.conectar();
		c.desconectar();
		
		Conexion c2 = Conexion.getInstancia();
		c2.conectar();
		c2.desconectar();
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}

}