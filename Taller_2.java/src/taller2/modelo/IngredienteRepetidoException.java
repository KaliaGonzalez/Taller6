package taller2.modelo;

public class IngredienteRepetidoException extends HamburguesasException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String MENSAJE = "\"Hay un error con el archivo de datos\n ¡El ingrediente repetido encontrado fue!";
	public IngredienteRepetidoException(String message) {
		super(MENSAJE+ " " + message + "!" );
		// TODO Auto-generated constructor stub
	}

}
