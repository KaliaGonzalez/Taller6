package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import taller2.modelo.productoMenu;

class ProductoMenuTest {
	private productoMenu pm;
	@BeforeEach
	void setUp() throws Exception { 
		pm = new productoMenu("Hamburguesa",20000);
	} 
	 @Test
	    public void testGenerarFactura() { 
		 String factura = "1 Hamburguesa 20000";//preguntarle a juan
	        assertEquals(factura, pm.generarTextoFactura());
	    }

}
