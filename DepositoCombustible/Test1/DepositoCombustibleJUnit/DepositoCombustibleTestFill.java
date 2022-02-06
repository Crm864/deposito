package DepositoCombustibleJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

	@RunWith(Parameterized.class)
	public class DepositoCombustibleTestFill {
		private double num1;
		private double res;
		
		public DepositoCombustibleTestFill(dobule n1, double r ) {
			num1=n1;
			res=r;
			
			
		}
		
		@Parameters
		public static Collection<Object[]> numeros(){
			return Arrays.asList(new Object [][]){
				{-10,30},{0,0},{45,85}
			}
			
		}
		
		@Test
		public void testFill() {
			DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
			tank.fill(num1);
			double resultado=tank.getDepositoNivel();
			assertEquals(res,resultado);
		}
		

	}
