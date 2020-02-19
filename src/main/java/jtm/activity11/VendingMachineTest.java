package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	VendingMachine machine;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
		machine = new VendingMachine();
	}

	@Test
	public void testInitialBalance() {
		String result = machine.balance();
		assertEquals("Balance expected to be 0.00$", "0.00$", result);
	}

	@Test
	public void testDepositAndBalance() {
		machine.depositCoins(7.63);
		String result = machine.balance();
		assertEquals("Balance expected to be 7.63$", "7.63$", result);
	}

	@Test
	public void testEjectCoinsBack() {
		double result = machine.ejectCoinsBack();
		assertEquals(0.00, result, 0.01);
	}

	@Test
	public void testproductNotEnougthBalance() {
		machine.addProducts("snicker", 0.75);
		String result = machine.chooseProduct("snicker");
		assertEquals("Balance not enougth", result);
	}

	@Test
	public void testNonExistingProduct() {
		machine.addProducts("snicker", 0.75);
		machine.depositCoins(1000.0);
		String result = machine.chooseProduct("twix");
		assertNull(result);
	}

	@Test
	public void testNonCaseSensitive() {
		machine.addProducts("snicker", 0.75);
		machine.depositCoins(1.00);
		String result = machine.chooseProduct("SNICKER");
		assertEquals("snicker", result);
	}
}
