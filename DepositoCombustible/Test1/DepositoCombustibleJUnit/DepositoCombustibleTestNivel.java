package DepositoCombustibleJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		 DepositoCombustible tank = new DepositoCombustible(40.0,5.0);
		 
		 double nivel= tank.getDepositoNivel();
		 assertEquals(5.0,nivel);
		 
		//fail("Not yet implemented");
	}

}