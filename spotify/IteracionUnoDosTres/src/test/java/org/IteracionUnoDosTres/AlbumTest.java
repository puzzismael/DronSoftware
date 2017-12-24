package org.IteracionUnoDosTres;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Dominio.Album;
import junit.framework.TestCase;

public class AlbumTest  {

	

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
