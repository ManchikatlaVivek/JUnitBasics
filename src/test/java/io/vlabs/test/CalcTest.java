package io.vlabs.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import io.vlabs.CalculatorTesting;

public class CalcTest {

	@Test
	public void checkAdd() {
		assertEquals(3, new CalculatorTesting().add(1, 2));
		
	}
	
//	@Test(expected=ArithmeticException.class)
//	public void testArithmeticException() {
//		new CalculatorTesting().mul(1, 0);
//	}
	
//	@Parameter
//	public void testParameterised() {
//		assertEquals(2, new CalculatorTesting().add(a, b));
//	}

}
