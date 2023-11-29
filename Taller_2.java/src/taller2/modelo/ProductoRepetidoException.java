package taller2.modelo;

public class ProductoRepetidoException extends HamburguesasException{
	private static final long serialVersionUID = 1L;
	private static final String MENSAJE = "\"IMPORTANTE: Hay un error con el archivo de datos\n ¡El ingrediente repetido encontrado fue!";
	public ProductoRepetidoException(String message) {
		super(MENSAJE + " " + message);
		// TODO Auto-generated constructor stub
	}

}
