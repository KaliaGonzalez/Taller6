package pruebas;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import taller2.modelo.Pedido;
import taller2.modelo.ValorException;
import taller2.modelo.productoMenu;

class PedidosTest {
	Pedido pedido;
	@BeforeEach
	void setUp() throws Exception { 
		pedido = new Pedido("Kalia","Calle50#100-08");
	}
 
	@Test
	public void testagregarProducto() throws ValorException {  
		productoMenu product1 = new productoMenu("Producto 1", 100000); 
		pedido.agregarProducto(product1);
        pedido.agregarProducto(new productoMenu("Hamburguesa",60000)); 
        fail("Se esperaba ValorException"); 
		
    }  
	public void testGenerarTextoFactura() throws ValorException { 
		productoMenu produc1 = new productoMenu("Hamburgguesa",60000); 
		productoMenu produc2 = new productoMenu("Agua",4000); 
		pedido.agregarProducto(produc1); 
		pedido.agregarProducto(produc2); 
		String factura = "Factura\n\nPedido 0\nNombre: Cliente\nDirección: Dirección\n" + 
		produc1.generarTextoFactura() + produc2.generarTextoFactura(); 
		 assertEquals(factura, pedido.generarTextoFactura());
	}
	
}
