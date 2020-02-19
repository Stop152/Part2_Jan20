package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;
import jtm.activity08.SimpleCalcException;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
		sc = new SimpleCalc();
	}

	@Test
	public void testAddInRange() {
		// TODO test addition for case where both numbers and result is in allowed range
		int expected = 4;
		int actual = SimpleCalc.add(2, 2);
		assertEquals("2 + 2 should be 4", expected, actual);

		expected = 0;
		actual = SimpleCalc.add(-2, 2);
		assertEquals("-2 + 2 should be 0", expected, actual);

		expected = 10;
		actual = SimpleCalc.add(9, 1);
		assertEquals("9 + 1 should be 10", expected, actual);

	}

	@Test
	public void testAddOutOfRange() {
		// TODO test addition for cases where both numbers and result is out of allowed
		// range

		// String expected = null;
		Integer actual = SimpleCalc.add(-11, -12);
		assertNull("-11 and -12 are out of range", actual);

		actual = SimpleCalc.add(8, 3);
		assertNull("result of 8 add 3 is out of range", actual);

	}

	@Test
	public void testSubtractInRange() {
		// TODO
		int expected = 6;
		int actual = SimpleCalc.subtract(8, 2);
		assertEquals("8 - 2 should be 6", expected, actual);

	}

	@Test
	public void testSubtractOutOfRange() {
		Integer actual = SimpleCalc.subtract(20, 6);
		assertNull("20 - 6 = 14, the result is out of range", actual);

		// TODO
	}

	@Test
	public void testMultiplyInRange() {
		// TODO
		int expected = 6;
		int actual = SimpleCalc.multiply(2, 3);
		assertEquals("2*3 should be 6", expected, actual);

		expected = 6;
		actual = SimpleCalc.multiply(-2, -3);
		assertEquals("-2*-3 should be 6", expected, actual);

	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO
		Integer actual = SimpleCalc.multiply(10, 34);
		assertNull("10 * 34 = 340, the result is out of range", actual);
		
	}

	@Test
	public void testDivideInRange() {
		// TODO

		int expected = 3;
		int actual = SimpleCalc.divide(6,2);
		assertEquals("6/2 should be 3", expected, actual);

	}

	@Test
	public void testDivideOutOfRange() {
		// TODO
		Integer actual = SimpleCalc.divide(-12, 2);
		assertNull("-12 / 2 = -6, -12 is out of range", actual);
		
		actual = SimpleCalc.divide(8, 0);
		assertNull("Can not divide to 0", actual);

	}

}
