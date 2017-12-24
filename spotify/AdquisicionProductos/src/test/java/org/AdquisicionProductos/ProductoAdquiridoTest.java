package org.AdquisicionProductos;

import static org.junit.Assert.assertTrue;

import org.AdquisicionProductos.Dominio.ProductoAdquirido;
import org.junit.Before;
import org.junit.Test;



public class ProductoAdquiridoTest  {

	ProductoAdquirido pa;

	@Before
	public void setUp() throws Exception {
	 pa=new ProductoAdquirido();
	}

	

	
	
	@Test
public void testInsertarAdquisicion100_18_30_20_100() {
		
		
		pa.InsertarAdquisicion(100, 18, "123456789012345678901234567890", "12345678901234567890",100);
		assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==20&&pa.getIngreso().equals("correcto"));
		
	}
	@Test
public void testInsertarAdquisicion100_18_30_20_101() {
		
		
		pa.InsertarAdquisicion(100, 18, "123456789012345678901234567890", "12345678901234567890",101);
		assertTrue(pa.getDescuento()==0.1&&pa.getPrecio()==(101*0.1)&&pa.getIngreso().equals("correcto"));
		
	}
	@Test
public void testInsertarAdquisicion100_18_30_21_100() {
	
	
	pa.InsertarAdquisicion(100, 18, "123456789012345678901234567890", "123456789012345678901",100);

	assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==(20)&&pa.getIngreso().equals("error"));

	
}
	@Test
	public void testInsertarAdquisicion100_18_30_21_101() {
	
	
	pa.InsertarAdquisicion(100, 18, "123456789012345678901234567890", "123456789012345678901",101);
	
	assertTrue(pa.getDescuento()==0.1&&pa.getPrecio()==(101*0.1)&&pa.getIngreso().equals("error"));
	
}
	@Test
public void testInsertarAdquisicion100_18_31_20_100() {
		
		
		pa.InsertarAdquisicion(100, 18, "1234567890123456789012345678901", "12345678901234567890",100);
		assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==20&&pa.getIngreso().equals("error"));
		
	}
	@Test
public void testInsertarAdquisicion100_18_31_20_101() {
		
		
		pa.InsertarAdquisicion(100, 18, "1234567890123456789012345678901", "12345678901234567890",101);
		assertTrue(pa.getDescuento()==0.1&&pa.getPrecio()==(101*0.1)&&pa.getIngreso().equals("error"));
	
	}
	@Test
public void testInsertarAdquisicion100_18_31_21_100() {
	
	
	pa.InsertarAdquisicion(100, 18, "1234567890123456789012345678901", "123456789012345678901",100);

	assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==(20)&&pa.getIngreso().equals("error"));

	
}
	@Test
	public void testInsertarAdquisicion100_18_31_21_101() {
	
	
	pa.InsertarAdquisicion(100, 18, "1234567890123456789012345678901", "123456789012345678901",101);
	
	assertTrue(pa.getDescuento()==0.1&&pa.getPrecio()==(101*0.1)&&pa.getIngreso().equals("error"));
	
}
	
	@Test
public void testInsertarAdquisicion100_19_30_20_100() {
		
		
		pa.InsertarAdquisicion(100, 19, "123456789012345678901234567890", "12345678901234567890",100);
		assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==30&&pa.getIngreso().equals("correcto"));
		
	}
	@Test
public void testInsertarAdquisicion100_19_30_20_101() {
		
		
		pa.InsertarAdquisicion(100, 19, "123456789012345678901234567890", "12345678901234567890",101);
		assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("correcto"));
		
	}
	@Test
public void testInsertarAdquisicion100_19_30_21_100() {
	
	
	pa.InsertarAdquisicion(100, 19, "123456789012345678901234567890", "123456789012345678901",100);

	assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(30)&&pa.getIngreso().equals("error"));

	
}
	@Test
	public void testInsertarAdquisicion100_19_30_21_101() {
	
	
	pa.InsertarAdquisicion(100, 19, "123456789012345678901234567890", "123456789012345678901",101);
	
	assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("error"));
	
}
	@Test
public void testInsertarAdquisicion100_19_31_20_100() {
		
		
		pa.InsertarAdquisicion(100, 19, "1234567890123456789012345678901", "12345678901234567890",100);
		assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==30&&pa.getIngreso().equals("error"));
		
	}
	@Test
public void testInsertarAdquisicion100_19_31_20_101() {
		
		
		pa.InsertarAdquisicion(100, 19, "1234567890123456789012345678901", "12345678901234567890",101);
		assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("error"));
	
	}
	@Test
public void testInsertarAdquisicion100_19_31_21_100() {
	
	
	pa.InsertarAdquisicion(100, 19, "1234567890123456789012345678901", "123456789012345678901",100);

	assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(30)&&pa.getIngreso().equals("error"));

	
}
	@Test
	public void testInsertarAdquisicion100_19_31_21_101() {
	
	
	pa.InsertarAdquisicion(100, 19, "1234567890123456789012345678901", "123456789012345678901",101);
	
	assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("error"));
	
}
	@Test
public void testInsertarAdquisicion100_39_30_20_100() {
		
		
		pa.InsertarAdquisicion(100, 39, "123456789012345678901234567890", "12345678901234567890",100);
		assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==30&&pa.getIngreso().equals("correcto"));
		
	}
	@Test
public void testInsertarAdquisicion100_39_30_20_101() {
		
		
		pa.InsertarAdquisicion(100, 39, "123456789012345678901234567890", "12345678901234567890",101);
		assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("correcto"));
	
	}
	@Test
public void testInsertarAdquisicion100_39_30_21_100() {
	
	
	pa.InsertarAdquisicion(100, 39, "123456789012345678901234567890", "123456789012345678901",100);

	assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(30)&&pa.getIngreso().equals("error"));

	
}
	@Test
	public void testInsertarAdquisicion100_39_30_21_101() {
	
	
	pa.InsertarAdquisicion(100, 39, "123456789012345678901234567890", "123456789012345678901",101);
	
	assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("error"));
	
}
	@Test
public void testInsertarAdquisicion100_39_31_20_100() {
		
		
		pa.InsertarAdquisicion(100, 39, "1234567890123456789012345678901", "12345678901234567890",100);
		assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==30&&pa.getIngreso().equals("error"));
		
	}
	@Test
public void testInsertarAdquisicion100_39_31_20_101() {
		
		
		pa.InsertarAdquisicion(100, 39, "1234567890123456789012345678901", "12345678901234567890",101);
		assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("error"));
	
	}
	@Test
public void testInsertarAdquisicion100_39_31_21_100() {
	
	
	pa.InsertarAdquisicion(100, 39, "1234567890123456789012345678901", "123456789012345678901",100);

	assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(30)&&pa.getIngreso().equals("error"));

	
}
	@Test
	public void testInsertarAdquisicion100_39_31_21_101() {
	
	
	pa.InsertarAdquisicion(100, 39, "1234567890123456789012345678901", "123456789012345678901",101);
	
	assertTrue(pa.getDescuento()==0.15&&pa.getPrecio()==(101*0.15)&&pa.getIngreso().equals("error"));
	
}
	@Test
	public void testInsertarAdquisicion100_40_30_20_100() {
			
			
			pa.InsertarAdquisicion(100, 40, "123456789012345678901234567890", "12345678901234567890",100);
			assertTrue(pa.getDescuento()==0.4&&pa.getPrecio()==40&&pa.getIngreso().equals("correcto"));
			
		}
		@Test
	public void testInsertarAdquisicion100_40_30_20_101() {
			
			
			pa.InsertarAdquisicion(100, 40, "123456789012345678901234567890", "12345678901234567890",101);
			assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==(101*0.2)&&pa.getIngreso().equals("correcto"));
		
		}
		@Test
	public void testInsertarAdquisicion100_40_30_21_100() {
		
		
		pa.InsertarAdquisicion(100, 40, "123456789012345678901234567890", "123456789012345678901",100);

		assertTrue(pa.getDescuento()==0.4&&pa.getPrecio()==(40)&&pa.getIngreso().equals("error"));

		
	}
		@Test
		public void testInsertarAdquisicion100_40_30_21_101() {
		
		
		pa.InsertarAdquisicion(100, 40, "123456789012345678901234567890", "123456789012345678901",101);
		
		assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==(101*0.2)&&pa.getIngreso().equals("error"));
		
	}
		@Test
	public void testInsertarAdquisicion100_40_31_20_100() {
			
			
			pa.InsertarAdquisicion(100, 40, "1234567890123456789012345678901", "12345678901234567890",100);
			assertTrue(pa.getDescuento()==0.4&&pa.getPrecio()==40&&pa.getIngreso().equals("error"));
			
		}
		@Test
	public void testInsertarAdquisicion100_40_31_20_101() {
			
			
			pa.InsertarAdquisicion(100, 40, "1234567890123456789012345678901", "12345678901234567890",101);
			assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==(101*0.2)&&pa.getIngreso().equals("error"));
		
		}
		@Test
	public void testInsertarAdquisicion100_40_31_21_100() {
		
		
		pa.InsertarAdquisicion(100, 40, "1234567890123456789012345678901", "123456789012345678901",100);

		assertTrue(pa.getDescuento()==0.4&&pa.getPrecio()==(40)&&pa.getIngreso().equals("error"));

		
	}
		@Test
		public void testInsertarAdquisicion100_40_31_21_101() {
		
		
		pa.InsertarAdquisicion(100, 40, "1234567890123456789012345678901", "123456789012345678901",101);
		
		assertTrue(pa.getDescuento()==0.2&&pa.getPrecio()==(101*0.2)&&pa.getIngreso().equals("error"));
		
	}
		@Test
		public void testInsertarAdquisicion101_18_30_20_100() {
				
				
				pa.InsertarAdquisicion(101, 18, "123456789012345678901234567890", "12345678901234567890",100);
				assertTrue(pa.getDescuento()==0.5&&pa.getPrecio()==50&&pa.getIngreso().equals("correcto"));
				
			}
			@Test
		public void testInsertarAdquisicion101_18_30_20_101() {
				
				
				pa.InsertarAdquisicion(101, 18, "123456789012345678901234567890", "12345678901234567890",101);
				assertTrue(pa.getDescuento()==0.25&&pa.getPrecio()==(101*0.25)&&pa.getIngreso().equals("correcto"));
				
			}
			@Test
		public void testInsertarAdquisicion101_18_30_21_100() {
			
			
			pa.InsertarAdquisicion(101, 18, "123456789012345678901234567890", "123456789012345678901",100);

			assertTrue(pa.getDescuento()==0.5&&pa.getPrecio()==(50)&&pa.getIngreso().equals("error"));

			
		}
			@Test
			public void testInsertarAdquisicion101_18_30_21_101() {
			
			
			pa.InsertarAdquisicion(101, 18, "123456789012345678901234567890", "123456789012345678901",101);
			
			assertTrue(pa.getDescuento()==0.25&&pa.getPrecio()==(101*0.25)&&pa.getIngreso().equals("error"));
			
		}
			@Test
		public void testInsertarAdquisicion101_18_31_20_100() {
				
				
				pa.InsertarAdquisicion(101, 18, "1234567890123456789012345678901", "12345678901234567890",100);
				assertTrue(pa.getDescuento()==0.5&&pa.getPrecio()==50&&pa.getIngreso().equals("error"));
				
			}
			@Test
		public void testInsertarAdquisicion101_18_31_20_101() {
				
				
				pa.InsertarAdquisicion(101, 18, "1234567890123456789012345678901", "12345678901234567890",101);
				assertTrue(pa.getDescuento()==0.25&&pa.getPrecio()==(101*0.25)&&pa.getIngreso().equals("error"));
			
			}
			@Test
		public void testInsertarAdquisicion101_18_31_21_100() {
			
			
			pa.InsertarAdquisicion(101, 18, "1234567890123456789012345678901", "123456789012345678901",100);

			assertTrue(pa.getDescuento()==0.5&&pa.getPrecio()==(50)&&pa.getIngreso().equals("error"));

			
		}
			@Test
			public void testInsertarAdquisicion101_18_31_21_101() {
			
			
			pa.InsertarAdquisicion(101, 18, "1234567890123456789012345678901", "123456789012345678901",101);
			
			assertTrue(pa.getDescuento()==0.25&&pa.getPrecio()==(101*0.25)&&pa.getIngreso().equals("error"));
			
		}
			
			@Test
		public void testInsertarAdquisicion101_19_30_20_100() {
				
				
				pa.InsertarAdquisicion(101, 19, "123456789012345678901234567890", "12345678901234567890",100);
				assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==60&&pa.getIngreso().equals("correcto"));
				
			}
			@Test
		public void testInsertarAdquisicion101_19_30_20_101() {
				
				
				pa.InsertarAdquisicion(101, 19, "123456789012345678901234567890", "12345678901234567890",101);
				assertTrue(pa.getDescuento()==0.30&&pa.getPrecio()==(101*0.30)&&pa.getIngreso().equals("correcto"));
				
			}
			@Test
		public void testInsertarAdquisicion101_19_30_21_100() {
			
			
			pa.InsertarAdquisicion(101, 19, "123456789012345678901234567890", "123456789012345678901",100);

			assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==(60)&&pa.getIngreso().equals("error"));

			
		}
			@Test
			public void testInsertarAdquisicion101_19_30_21_101() {
			
			
			pa.InsertarAdquisicion(101, 19, "123456789012345678901234567890", "123456789012345678901",101);
			
			assertTrue(pa.getDescuento()==0.30&&pa.getPrecio()==(101*0.30)&&pa.getIngreso().equals("error"));
			
		}
			@Test
		public void testInsertarAdquisicion101_19_31_20_100() {
				
				
				pa.InsertarAdquisicion(101, 19, "1234567890123456789012345678901", "12345678901234567890",100);
				assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==60&&pa.getIngreso().equals("error"));
				
			}
			@Test
		public void testInsertarAdquisicion101_19_31_20_101() {
				
				
				pa.InsertarAdquisicion(101, 19, "1234567890123456789012345678901", "12345678901234567890",101);
				assertTrue(pa.getDescuento()==0.30&&pa.getPrecio()==(101*0.30)&&pa.getIngreso().equals("error"));
			
			}
			@Test
		public void testInsertarAdquisicion101_19_31_21_100() {
			
			
			pa.InsertarAdquisicion(101, 19, "1234567890123456789012345678901", "123456789012345678901",100);

			assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==(60)&&pa.getIngreso().equals("error"));

			
		}
			@Test
			public void testInsertarAdquisicion101_19_31_21_101() {
			
			
			pa.InsertarAdquisicion(101, 19, "1234567890123456789012345678901", "123456789012345678901",101);
			
			assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(101*0.3)&&pa.getIngreso().equals("error"));
			
		}
			@Test
		public void testInsertarAdquisicion101_39_30_20_100() {
				
				
				pa.InsertarAdquisicion(101, 39, "123456789012345678901234567890", "12345678901234567890",100);
				assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==60&&pa.getIngreso().equals("correcto"));
				
			}
			@Test
		public void testInsertarAdquisicion101_39_30_20_101() {
				
				
				pa.InsertarAdquisicion(101, 39, "123456789012345678901234567890", "12345678901234567890",101);
				assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(101*0.3)&&pa.getIngreso().equals("correcto"));
			
			}
			@Test
		public void testInsertarAdquisicion101_39_30_21_100() {
			
			
			pa.InsertarAdquisicion(101, 39, "123456789012345678901234567890", "123456789012345678901",100);

			assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==(60)&&pa.getIngreso().equals("error"));

			
		}
			@Test
			public void testInsertarAdquisicion101_39_30_21_101() {
			
			
			pa.InsertarAdquisicion(101, 39, "123456789012345678901234567890", "123456789012345678901",101);
			
			assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(101*0.3)&&pa.getIngreso().equals("error"));
			
		}
			@Test
		public void testInsertarAdquisicion101_39_31_20_100() {
				
				
				pa.InsertarAdquisicion(101, 39, "1234567890123456789012345678901", "12345678901234567890",100);
				assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==60&&pa.getIngreso().equals("error"));
				
			}
			@Test
		public void testInsertarAdquisicion101_39_31_20_101() {
				
				
				pa.InsertarAdquisicion(101, 39, "1234567890123456789012345678901", "12345678901234567890",101);
				assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(101*0.3)&&pa.getIngreso().equals("error"));
			
			}
			@Test
		public void testInsertarAdquisicion101_39_31_21_100() {
			
			
			pa.InsertarAdquisicion(101, 39, "1234567890123456789012345678901", "123456789012345678901",100);

			assertTrue(pa.getDescuento()==0.6&&pa.getPrecio()==(60)&&pa.getIngreso().equals("error"));

			
		}
			@Test
			public void testInsertarAdquisicion101_39_31_21_101() {
			
			
			pa.InsertarAdquisicion(101, 39, "1234567890123456789012345678901", "123456789012345678901",101);
			
			assertTrue(pa.getDescuento()==0.3&&pa.getPrecio()==(101*0.3)&&pa.getIngreso().equals("error"));
			
		}
			@Test
			public void testInsertarAdquisicion101_40_30_20_100() {
					
					
					pa.InsertarAdquisicion(101, 40, "123456789012345678901234567890", "12345678901234567890",100);
					assertTrue(pa.getDescuento()==0.7&&pa.getPrecio()==70&&pa.getIngreso().equals("correcto"));
					
				}
				@Test
			public void testInsertarAdquisicion101_40_30_20_101() {
					
					
					pa.InsertarAdquisicion(101, 40, "123456789012345678901234567890", "12345678901234567890",101);
					assertTrue(pa.getDescuento()==0.35&&pa.getPrecio()==(101*0.35)&&pa.getIngreso().equals("correcto"));
				
				}
				@Test
			public void testInsertarAdquisicion101_40_30_21_100() {
				
				
				pa.InsertarAdquisicion(101, 40, "123456789012345678901234567890", "123456789012345678901",100);

				assertTrue(pa.getDescuento()==0.7&&pa.getPrecio()==(70)&&pa.getIngreso().equals("error"));

				
			}
				@Test
				public void testInsertarAdquisicion101_40_30_21_101() {
				
				
				pa.InsertarAdquisicion(101, 40, "123456789012345678901234567890", "123456789012345678901",101);
				
				assertTrue(pa.getDescuento()==0.35&&pa.getPrecio()==(101*0.35)&&pa.getIngreso().equals("error"));
				
			}
				@Test
			public void testInsertarAdquisicion101_40_31_20_100() {
					
					
					pa.InsertarAdquisicion(101, 40, "1234567890123456789012345678901", "12345678901234567890",100);
					assertTrue(pa.getDescuento()==0.7&&pa.getPrecio()==70&&pa.getIngreso().equals("error"));
					
				}
				@Test
			public void testInsertarAdquisicion101_40_31_20_101() {
					
					
					pa.InsertarAdquisicion(101, 40, "1234567890123456789012345678901", "12345678901234567890",101);
					assertTrue(pa.getDescuento()==0.35&&pa.getPrecio()==(101*0.35)&&pa.getIngreso().equals("error"));
				
				}
				@Test
			public void testInsertarAdquisicion101_40_31_21_100() {
				
				
				pa.InsertarAdquisicion(101, 40, "1234567890123456789012345678901", "123456789012345678901",100);

				assertTrue(pa.getDescuento()==0.7&&pa.getPrecio()==(70)&&pa.getIngreso().equals("error"));

				
			}
				@Test
				public void testInsertarAdquisicion101_40_31_21_101() {
				
				
				pa.InsertarAdquisicion(101, 40, "1234567890123456789012345678901", "123456789012345678901",101);
				
				assertTrue(pa.getDescuento()==0.35&&pa.getPrecio()==(101*0.35)&&pa.getIngreso().equals("error"));
				
			}
				@Test
				public void testInsertarAdquisicionValoresNegativosYCeros() {
				
				
				pa.InsertarAdquisicion(-1, -1, "", "",-1);
				
				assertTrue(pa.getDescuento()==-1);
				
			}
}
