package MainPackage;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit extends MyClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testReturnTrue() {
		assertTrue("This should return as True",true); 
	}
	@Test 
	public final void testAddTwoNumbers() {
		
		assertEquals("The value returned should be equal to nbr1 plus nbr2", 11, AddTwoNumbers( 5, 6));}
}



