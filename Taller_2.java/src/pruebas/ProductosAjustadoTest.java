package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import taller2.modelo.ProductoAjustado;
import taller2.modelo.ingrediente;
import taller2.modelo.productoMenu;

class ProductosAjustadoTest {
	productoMenu producto; 
	ProductoAjustado productoAjus; 
	List<ingrediente> agregados;
	List<ingrediente> eliminados;
	@BeforeEach
	void setUp() throws Exception { 
		agregados = new ArrayList<>(); 
		eliminados = new ArrayList<>(); 
		producto = new productoMenu("Hamburguesa",20000); 
		agregados.add(new ingrediente("lechuga",1000)); 
		agregados.add(new ingrediente("tomate",1000));
		eliminados.add(new ingrediente("huevo",2500)); 
		eliminados.add(new ingrediente("cebolla",1000)); 
		this.productoAjus = new ProductoAjustado(producto,producto.getPrecio());
	}
	public void testGetPrecio() {
        assertEquals(20000, productoAjus.getPrecio());
    } 
	 public void testGenerarTextoFactura_ConAgregadosYEliminados() {
	        String Text = "\n- Hamburguesa\nCon:\n\tLechuga y Tomate\nSin:\n\thuevo_mod\n\tcebolla_mod";
	        assertEquals(Text, productoAjus.generarTextoFactura());
	    }

}
