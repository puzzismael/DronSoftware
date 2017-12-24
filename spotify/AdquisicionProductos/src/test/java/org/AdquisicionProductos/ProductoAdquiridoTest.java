package org.AdquisicionProductos;

import static org.junit.Assert.*;

import org.AdquisicionProductos.Dominio.ProductoAdquirido;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class ProductoAdquiridoTest extends TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	ProductoAdquirido pa=new ProductoAdquirido();

	
	@Test
	public void testInsertarAdquisicion1_14_20() {
		
		
		pa.InsertarAdquisicion(1, 14, "waka-waka", "carlos", 20);
		assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==4);
		
	}
	@Test
public void testInsertarAdquisicion() {
		
		
		pa.InsertarAdquisicion(1, 14, "waka-waka", "carlos", 20);
		assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==4);
		
	}
	

}
