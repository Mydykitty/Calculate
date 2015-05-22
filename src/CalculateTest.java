import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlus() {
		assertEquals(1, Calculate.plus(-5,  6), 0);
	}

	@Test
	public void testMinus() {
		assertEquals(-11, Calculate.minus(-6,  5), 0);
	}

	@Test
	public void testTimes() {
		assertEquals(-30, Calculate.times(-5,  6), 0);
	}

	@Test
	public void testDivide() {
		assertEquals(5, Calculate.divide(-5,  -1), 0);
	}

}
