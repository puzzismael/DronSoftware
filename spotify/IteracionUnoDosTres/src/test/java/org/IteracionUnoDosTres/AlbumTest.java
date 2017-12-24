package org.IteracionUnoDosTres;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Dominio.Album;
import Persistencia.GestorBD;
import junit.framework.TestCase;

public class AlbumTest  extends TestCase{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void testEliminarProductoExiste() {
		Album albm =new Album();
		albm.EliminarAlbum(1);
		assertTrue(albm.getExistir());
		
	}
	public void testEliminarProductoNoExiste() {
		Album albm =new Album();
		albm.EliminarAlbum(9);
		assertTrue(!albm.getExistir());
		
	}
}
