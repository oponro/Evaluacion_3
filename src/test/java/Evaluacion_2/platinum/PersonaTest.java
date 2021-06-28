package Evaluacion_2.platinum;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {
	
	public PersonaTest() {
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
	public void testPersona() {
		System.out.println("Persona");
		try {
			Persona instance = new Persona("");
						
			} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
}
