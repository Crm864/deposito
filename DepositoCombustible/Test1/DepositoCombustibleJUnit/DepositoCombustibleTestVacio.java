package DepositoCombustibleJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
