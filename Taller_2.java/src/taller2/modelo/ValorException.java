package taller2.modelo;

public class ValorException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	private static final  String MENSAJE = "Su pedido excede a los 150.000"; 
	
	public ValorException() { 
		super(MENSAJE);
	}
	

}
