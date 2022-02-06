package DepositoCombustibleJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(40.0);
		boolean b=tank.estaLleno();
		
		assertEquals(true,b);
		//fail("Not yet implemented");
	}

}