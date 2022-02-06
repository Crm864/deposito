package DepositoCombustibleJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

class DepositoCombustibleTest {

	@Test
	void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,5.0);
		tank.consumir(5);
		boolean b=tank.estaVacio();
		assertEquals(true,b)
		fail("Not yet implemented");
	}

}
