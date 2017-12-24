/**
 * 
 */
package org.IteracionCincoSiete;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dominioo.Usuario;
import junit.framework.TestCase;

/**
 * @author Carlos
 *
 */
public class UsuarioTest extends TestCase {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}
	Usuario user=new Usuario();
	@Test
	public void testAñadirVoletos4_3_50_10() {
		user.AñadirBoletos(4, 3, 50, 10);
		
		System.out.println(user.getBoletos());
		
	//	assertTrue(user.getBoletos()==7);
	
		
	}

}
