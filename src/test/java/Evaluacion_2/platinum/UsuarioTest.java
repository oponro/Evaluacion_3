package Evaluacion_2.platinum;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsuarioTest {
	
	public UsuarioTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void teraDown() {
	}
	
	@Test
	public void testUsuario() {
		System.out.println("Usuario");
		try {
			Usuario instance = new Usuario("");
						
			} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

}
