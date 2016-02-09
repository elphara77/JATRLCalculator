import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.htrl.core.Engine;

public class EngineTest {

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
	public void testPlus1() {
		Engine.setA("1000");
		Engine.setB("1");
		Double actual = Engine.plus();
		Double expected = 1001.;
		assertTrue(expected.equals(actual));
	}

	@Test
	public void testPlus2() {
		Engine.setA("1.000");
		Engine.setB("1");
		Double actual = Engine.plus();
		Double expected = 2.;
		assertTrue(expected.equals(actual));
	}

}
