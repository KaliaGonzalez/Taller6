package Interfaz; 
import	java.awt.*; 
import javax.swing.*;
@SuppressWarnings("serial")
public class InterfazPrueba extends JFrame{ 
	public final static String RUTA_IMAGEN = "./data/prueba.jpg";
	public InterfazPrueba () {  
		setTitle("Reservas CarPrime"); 
		setSize(800,900); 
		setResizable(false); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		setLayout( new BorderLayout( ) ); 
		JLabel labImagen = new JLabel( );
		labImagen.setIcon( new ImageIcon( RUTA_IMAGEN ) );
		add( labImagen, BorderLayout.NORTH ); 
	}
	public static void main( String[] pArgs )
	{
		try
		{
			// Unifica la interfaz para Mac y para Windows.
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

			InterfazPrueba interfaz = new InterfazPrueba( );
			interfaz.setVisible( true );
		}
		catch( Exception e )
		{
			e.printStackTrace( );
		}
	}
}
