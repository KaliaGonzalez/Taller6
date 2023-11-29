package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import taller2.modelo.Combo;
import taller2.modelo.productoMenu;

class CombosTest {
	private Combo combo;
	@BeforeEach
	void setUp() throws Exception { 
		combo = new Combo("combo corral",1.0);
	}

	@Test
	public void testGetNombre() {
        assertEquals("combo corral", combo.getNombre());
    } 
	@Test
	public void testAgregarItem() { 
		combo.agregarItemACombo(new productoMenu("Hamburguesa", 20000));
	} 
	@Test
	public void testGetDescuento() {
        assertEquals(1.0, combo.getDescuento());
    }  
	@Test
	public void testGenerarFactura() {
        productoMenu produc1 = new productoMenu("Hamburguesa",20000); 
        combo.agregarItemACombo(produc1); 
        String facturaEsperada = "Factura generada: Combo corral_c (2 items)";
        assertEquals(facturaEsperada, combo.generarTextoFactura());
    }  
	

}
