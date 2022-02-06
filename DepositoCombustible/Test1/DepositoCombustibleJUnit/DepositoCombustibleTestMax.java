package DepositoCombustibleJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTestMax {

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		Double max=tank.getDepositoMax();
		assertEquals(40.0,max);
		
		//fail("Not yet implemented");
	}

}