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
	public void testAñadirBoletos4_3_50_10() {
		user.AñadirBoletos(4, 3, 50, 10);
		assertTrue(user.getBoletos()==7&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_3_50_11() {
		user.AñadirBoletos(4, 3, 50, 11);
		assertTrue(user.getBoletos()==8&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_3_51_10() {
		user.AñadirBoletos(4, 3, 51, 10);
		assertTrue(user.getBoletos()==8&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_3_51_11() {
		user.AñadirBoletos(4, 3, 51, 11);
		assertTrue(user.getBoletos()==9&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_4_50_10() {
		user.AñadirBoletos(4, 4, 50, 10);
		assertTrue(user.getBoletos()==6&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_4_50_11() {
		user.AñadirBoletos(4, 4, 50, 11);
		assertTrue(user.getBoletos()==7&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_4_51_10() {
		user.AñadirBoletos(4, 4, 51, 10);
		assertTrue(user.getBoletos()==7&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_4_51_11() {
		user.AñadirBoletos(4, 4, 51, 11);
		assertTrue(user.getBoletos()==8&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_10_50_10() {
		user.AñadirBoletos(4, 10, 50, 10);
		assertTrue(user.getBoletos()==6&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_10_50_11() {
		user.AñadirBoletos(4, 10, 50, 11);
		assertTrue(user.getBoletos()==7&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_10_51_10() {
		user.AñadirBoletos(4, 10, 51, 10);
		assertTrue(user.getBoletos()==7&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_10_51_11() {
		user.AñadirBoletos(4, 10, 51, 11);
		assertTrue(user.getBoletos()==8&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_11_50_10() {
		user.AñadirBoletos(4, 11, 50, 10);
		assertTrue(user.getBoletos()==9&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_11_50_11() {
		user.AñadirBoletos(4, 11, 50, 11);
		assertTrue(user.getBoletos()==10&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_11_51_10() {
		user.AñadirBoletos(4, 11, 51, 10);
		assertTrue(user.getBoletos()==10&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos4_11_51_11() {
		user.AñadirBoletos(4, 11, 51, 11);
		assertTrue(user.getBoletos()==6&&user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_3_50_10() {
		user.AñadirBoletos(5, 3, 50, 10);
		assertTrue(user.getBoletos()==7&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_3_50_11() {
		user.AñadirBoletos(5, 3, 50, 11);
		assertTrue(user.getBoletos()==8&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_3_51_10() {
		user.AñadirBoletos(5, 3, 51, 10);
		assertTrue(user.getBoletos()==8&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_3_51_11() {
		user.AñadirBoletos(5, 3, 51, 11);
		assertTrue(user.getBoletos()==9&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_4_50_10() {
		user.AñadirBoletos(5, 4, 50, 10);
		assertTrue(user.getBoletos()==6&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_4_50_11() {
		user.AñadirBoletos(5, 4, 50, 11);
		assertTrue(user.getBoletos()==7&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_4_51_10() {
		user.AñadirBoletos(5, 4, 51, 10);
		assertTrue(user.getBoletos()==7&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_4_51_11() {
		user.AñadirBoletos(5, 4, 51, 11);
		assertTrue(user.getBoletos()==8&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_10_50_10() {
		user.AñadirBoletos(5, 10, 50, 10);
		assertTrue(user.getBoletos()==6&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_10_50_11() {
		user.AñadirBoletos(5, 10, 50, 11);
		assertTrue(user.getBoletos()==7&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_10_51_10() {
		user.AñadirBoletos(5, 10, 51, 10);
		assertTrue(user.getBoletos()==7&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_10_51_11() {
		user.AñadirBoletos(5, 10, 51, 11);
		assertTrue(user.getBoletos()==8&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_11_50_10() {
		user.AñadirBoletos(5, 11, 50, 10);
		assertTrue(user.getBoletos()==9&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_11_50_11() {
		user.AñadirBoletos(5, 11, 50, 11);
		assertTrue(user.getBoletos()==10&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_11_51_10() {
		user.AñadirBoletos(5, 11, 51, 10);
		assertTrue(user.getBoletos()==10&&!user.getExiste());
	
		
	}
	@Test
	public void testAñadirBoletos5_11_51_11() {
		user.AñadirBoletos(5, 11, 51, 11);
		assertTrue(user.getBoletos()==6&&!user.getExiste());
	
		
	}
	public void testAñadirValoresNegativos()
	{
		user.AñadirBoletos(-1, -1, -1, -1);
		assertTrue(!user.getValido());
	}
	
	@Test
	public void testm1_1() {
		user.asignarid(-45,-8);
		assertTrue(user.asignarid(-45,-8)==-53);
	}
	@Test
	public void testm1_2() {
		user.asignarid(-45,0);
		assertTrue(user.asignarid(-45,0)==-45);
	}
	@Test
	public void testm1_3() {
		user.asignarid(-45,14);
		assertTrue(user.asignarid(-45,14)==-31);
	}
	@Test
	public void testm1_4() {
		user.asignarid(-45,6);
		assertTrue(user.asignarid(-45,6)==-39);
	}
	@Test
	public void testm1_5() {
		user.asignarid(-45,200);
		assertTrue(user.asignarid(-45,200)==245);
	}
	@Test
	public void testm1_6() {
		user.asignarid(0, -8);
		assertTrue(user.asignarid(0,-8)==-8);
	}
	@Test
	public void testm1_7() {
		user.asignarid(0,0);
		assertTrue(user.asignarid(0,0)==0);
	}
	@Test
	public void testm1_8() {
		user.asignarid(0,14);
		assertTrue(user.asignarid(0,14)==14);
	}
	@Test
	public void testm1_9() {
		user.asignarid(0,6);
		assertTrue(user.asignarid(0,6)==6);
	}
	@Test
	public void testm1_10() {
		user.asignarid(0,200);
		assertTrue(user.asignarid(0,200)==200);
	}
	@Test
	public void testm1_11() {
		user.asignarid(9,-8);
		assertTrue(user.asignarid(9,-8)==1);
	}
	@Test
	public void testm1_12() {
		user.asignarid(9, 0);
		assertTrue(user.asignarid(9, 0)==9);
	}
	@Test
	public void testm1_13() {
		user.asignarid(9,14);
		assertTrue(user.asignarid(9,14)==23);
	}
	@Test
	public void testm1_14() {
		user.asignarid(9,6);
		assertTrue(user.asignarid(9,6)==15);
	}
	@Test
	public void testm1_15() {
		user.asignarid(9,200);
		assertTrue(user.asignarid(9,200)==191);
	}
	@Test
	public void testm1_16() {
		
		assertTrue(user.asignarid(18,-8)==10);
	}
	@Test
	public void testm1_17() {
		
		assertTrue(user.asignarid(18,0)==18);
	}
	@Test
	public void testm1_18() {
		
		assertTrue(user.asignarid(18,14)==32);
	}
	@Test
	public void testm1_19() {
		user.asignarid(18,6);
	}
	/*@Test
	public void testm1_20() {
		prueba1.asignarid(18,200);
	}
	@Test
	public void testm1_21() {
		prueba1.asignarid(3,-8);
	}
	@Test
	public void testm1_22() {
		prueba1.asignarid(3,0);
	}
	@Test
	public void testm1_23() {
		prueba1.asignarid(3,14);
	}
	@Test
	public void testm1_24() {
		prueba1.asignarid(3, 6);
	}
	@Test
	public void testm1_25() {
		prueba1.asignarid(3,200);
	}
	@Test
	public void testm1_26() {
		prueba1.asignarid(14,-8);
	}
	@Test
	public void testm1_27() {
		prueba1.asignarid(14,0);
	}
	@Test
	public void testm1_28() {
		prueba1.asignarid(14,14);
	}
	@Test
	public void testm1_29() {
		prueba1.asignarid(14,6);
	}
	@Test
	public void testm1_30() {
		prueba1.asignarid(14, 200);
	}
	@Test
	public void testm1_31() {
		prueba1.asignarid(85,-8);
	}
	@Test
	public void testm1_32() {
		prueba1.asignarid(85,0);
	}
	@Test
	public void testm1_33() {
		prueba1.asignarid(85,14);
	}
	@Test
	public void testm1_34() {
		prueba1.asignarid(85,6);
	}
	@Test
	public void testm1_35() {
		prueba1.asignarid(85,200);
	
*/
}
